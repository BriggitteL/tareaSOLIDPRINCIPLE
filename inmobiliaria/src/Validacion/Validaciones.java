/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacion;

import Edificio.Departamento;
import Edificio.Casa;
import Edificio.Modelo;
import EntidadesInmobiliaria.Etapa;
import EntidadesInmobiliaria.Inmobiliaria;
import EntidadesInmobiliaria.Lotes;
import EntidadesInmobiliaria.Urbanizacion;
import Persona.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Usuario
 */
public class Validaciones {
    public static Scanner sc = new Scanner(System.in);
    public static String username = "hugomerchan4@gmail.com";
    public static String password = "rohusemer";
    public static String subject = "Bienvenido a nuetra aplicación Inmobiliaria";
    private static List<Etapa> etapas = new ArrayList<>();
    private static List<Lotes> lotes = new ArrayList<>();
    
    private static List<Modelo> modelos = new ArrayList<>();
   
    //Variables estaticas para la cotizacion
    public static double plazo = 15;
    public static double interes = 7.9;
    /**
     * Valida que la palabra ingresada contenga solo letras y no numeros
     *
     * @param palabra palabra
     * @return String palabra
     */
    public static String validarString(String palabra) {
        boolean opcion = false;
        do {
            if (palabra.matches("([a-z]|[A-Z]|\\s)+")) {
                opcion = true;

            } else {
                System.out.println("Ingrese una opcion válida: ");
                palabra = sc.nextLine();
            }
        } while (opcion == false);
        return palabra;
    }
    
    /**
     * Valida que la palabra ingresada contenga numeros y no letras
     *
     * @param palabra palabra
     * @return int numero
     */
    public static int validarEntero(String palabra) {
        boolean opcion = false;

        do {
            if (palabra.matches("([0-9])+")) {
                int numero = Integer.parseInt(palabra);
                opcion = true;
                return numero;

            } else {
                System.out.println("Ingrese una opcion válida: ");
                palabra = sc.nextLine();

            }
        } while (opcion == false);
        return 0;
    }
    
    /**
     * Valida que la palabra ingresada contenga numeros y no letras y ademas sea
     * de tipo double
     *
     * @param palabra palabra
     * @return double numeroDecimal
     */
    public static double validarDouble(String palabra) {
        boolean opcion = false;
        do {
            if (palabra.matches("([0-9]|\\.|\\-)+")) {
                double numeroDecimal = Double.parseDouble(palabra);
                opcion = true;
                return numeroDecimal;

            } else {
                System.out.println("Ingrese una opcion válida: ");
                palabra = sc.nextLine();
            }
        } while (opcion == false);
        return 0;
    }
    
    /**
     * Valida si el correo ingresado es un correo valido
     *
     * @param correo correo
     * @return String correo
     */
    public static String validarCorreo(String correo) {
        boolean opcion = false;

        do {
            Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,3})$");
            //Pattern pattern= Pattern.compile("([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))+");

            Matcher mather = pattern.matcher(correo);
            if (mather.find() == true) {

                opcion = true;
                return correo;

            } else {

                System.out.println("Ingrese una opcion válida: ");
                correo = sc.nextLine();
            }
        } while (opcion == false);
        return null;
    }
    
    /**
     * Valida si la contrasena ingresada tenga mínimo de 6 caracteres, sin
     * caracteres especiales, al menos un número
     *
     * @param contrasena contrasena
     * @return String contrasena
     */
    public static String validarContrasena(String contrasena) {
        boolean opcion = false;
        do {
            if (contrasena.length() > 5 && contrasena.matches("([a-z]|[A-Z]|[0-9])+")) {
                opcion = true;

            } else {
                System.out.println("La contraseña debe tener minimo 6 caracteres, sin caracteres especiales y al menos un número");
                System.out.println("Ingrese una opcion válida: ");
                contrasena = sc.nextLine();
            }
        } while (opcion == false);
        return contrasena;
    }
    
    /**
     * Valida que los datos del archivo csv tenga datos double y sino retorna un
     * 0 decimal
     *
     * @param palabra palabra
     * @return double numeroDecimal
     */
    public static double validarDoubleArchivo(String palabra) {
        boolean opcion = false;
        //String o=""casa"";

        if (palabra.matches("([0-9]|\\.|\\-)+")) {
            double numeroDecimal = Double.parseDouble(palabra);
            opcion = true;
            return numeroDecimal;

        }

        return 0;
    }
    
    /**
     * Metodo que valida si el usuario existe en el sistema
     *
     * @param nombreUsuario nombreUsuario
     * @return lista de usuarios
     */
   
    
    /**
     * Metodo que enviar un correo al usuario registrado
     *
     * @param correoReceptor correoReceptor
     * @param mensaje  mensaje
     * @return String correoReceptor
     */
    public static String enviarCorreo(String correoReceptor, String mensaje) {

        boolean opcion = false;
        do {
            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");

            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

            try {

                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(username));
                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(correoReceptor));
                message.setSubject(subject);
                message.setText(mensaje);

                Transport.send(message);
                opcion = true;
                return correoReceptor;

                //JOptionPane.showMessageDialog(this , "Su mensaje ha sido enviado");
            } catch (MessagingException e) {
                //throw new RuntimeException(e);
                System.out.println("Usted no esta conectado al internet para enviar el mensaje.");
                String op = sc.nextLine();
                //System.out.println("El correo electronico no existe!\nIngrese uno válido: ");
                //correoReceptor= sc.nextLine();
            }
        } while (opcion == false);

        return null;
    }
    

  
    public static double cotizarPorPreccio(double mensualidad){
        double plazo1= plazo*12;
        double interes1 =  interes/1200; 
        
        double cuotaMensual = mensualidad*0.4;
    
        double prestamo1 = (interes1)*Math.pow((1+interes1),plazo1);
        double numerador = (Math.pow((1+interes1),plazo1) - 1);
       double valorMaxPrestamo = cuotaMensual * (numerador/prestamo1);
       return valorMaxPrestamo;
    }
//    public static List<Modelo> busquedaPrecio(String modelo){
//        List<Modelo> ti = new ArrayList<>();
//        for (Modelo u :Inmobiliaria.modelos) {
//            if(u.getModelo().getNombre().equalsIgnoreCase(modelo)){
//                ti.add(u);
//            }
//        }
//        return ti;
//    }
//     public static void buscarPorPrecioMenu() {
//        System.out.println("¿Soy el cotizador en línea me llamo Bob, puedes darme tu nombre?");
//        String usuario= sc.nextLine();
//        System.out.println("Hola! "+ usuario + " me puedes dar una dirección de correo donde enviaremos información?");
//        String correo = sc.nextLine();
//        correo = Validaciones.validarCorreo(correo);
//        System.out.println("Listo! ¿Buscas casa o departamento?");
//        String detalle = sc.nextLine();
//        List<Urbanizacion> u = Validaciones.busquedaPrecio(detalle);
//        if (detalle.equals("casa") || detalle.equals("CASA")){
//                System.out.println("¿De cuántas plantas? Puedes escribir “omitir” en caso de no tener preferencia");
//                String planta = sc.nextLine();
//                System.out.println("¿Número mínimo de Cuartos? Puedes escribir “omitir” en caso de no tener preferencia");
//                String cuartos = sc.nextLine();
//                System.out.println("¿Número mínimo de baños? Puedes escribir “omitir” en caso de no tener preferencia");
//                String baños = sc.nextLine();
//                System.out.println("Sector donde se encuentra la vivienda. Puedes escribir “omitir” en caso de no tener preferencia: ");
//                String sector = sc.nextLine();
//                System.out.println("...........Consultando");
//                if((planta.equalsIgnoreCase("omitir") && cuartos.equalsIgnoreCase("omitir") && baños.equalsIgnoreCase("omitir") && sector.equalsIgnoreCase("omitir"))){
//                    System.out.println("Segun tus respuestas Tenemos estos modelos");
//                    for(Urbanizacion ur: u){
//                        ur.mostrarDatosModelo();
//                        System.out.println("Estas interesado en algun modelo S/N?");
//                        String op = sc.nextLine();
//                        if (op.equalsIgnoreCase("S")){
//                            System.out.println("¿Cual es su sueldo o ingresos Neto?, si es casado ingrese su sueldo en conjunto");
//                            double sueldo = sc.nextInt();
//                            System.out.println("¿Cuanto dispone para la entrada?");
//                            double entrada = sc.nextInt();
//                            double valor = Validaciones.cotizarPorPreccio(sueldo);
//                            if(valor >= entrada){
//                                for(Modelo m :Inmobiliaria.modelos){
//                                    System.out.println("Segun tu Presuúesto tenemos estas opciones");
//                                    
//                                }
//                            }
//                        }
//                    }}
//                
//        }
//        else{
//            System.out.println("¿Número mínimo de Cuartos? Puedes escribir “omitir” en caso de no tener preferencia");
//            String cuartos = sc.nextLine();
//            System.out.println("¿Número mínimo de baños? Puedes escribir “omitir” en caso de no tener preferencia");
//            String baños = sc.nextLine();
//            System.out.println("Sector donde se encuentra la vivienda. Puedes escribir “omitir” en caso de no tener preferencia: ");
//            String sector = sc.nextLine();
//            System.out.println("¿Cual es su sueldo o ingresos Neto?, si es casado ingrese su sueldo en conjunto");
//            double sueldo = sc.nextInt();
//            System.out.println("¿Cuanto dispone para la entrada?");
//            double entrada = sc.nextInt();
//        }
//        
//     }  
}
