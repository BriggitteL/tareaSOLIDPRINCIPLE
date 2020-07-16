/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmobiliaria;

import Persona.Administrador;
import EntidadesInmobiliaria.Casa;
import EntidadesInmobiliaria.Departamento;
import EntidadesInmobiliaria.Etapa;
import EntidadesInmobiliaria.Inmobiliaria;
import EntidadesInmobiliaria.Lotes;
import EntidadesInmobiliaria.Modelo;
import EntidadesInmobiliaria.Urbanizacion;
import Persona.Usuario;
import EntidadesInmobiliaria.Validaciones;
import Persona.Vendedor;
import java.util.List;
import java.util.Scanner;
import javafx.scene.image.ImageView;

/**
 *
 * @author Ronny Segura
 */
public class menu {

    private ImageView imgcasa;
    public static Scanner sc = new Scanner(System.in);
    public static menu main = new menu();
    Inmobiliaria aplicacion = new Inmobiliaria();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Usuario g = new Usuario("ronny", "hugomerchan4@gmail.com", "pepe1993","Vendedor");
//        Casa c = new Casa ("/Imagen/modelosDepartamentos.jpg","SIMPLE", 1, 3,"NO","SI",3, 75.000,15.0,);
//        Departamento d= new Departamento("NO","NO","NO","MIXTO",2, 2, "SI","NO",2, 150.000,25.10,);
//        Etapa etap = new Etapa("Mucho Lote","NO", 2);
//  
//        Urbanizacion u = new Urbanizacion(g, "Bella","Samanes",etap, c);
//        Lotes l = new Lotes(150.0, 2);
//        Inmobiliaria.usuarios.add(g);
//        Inmobiliaria.modelos.add(c);
//        Inmobiliaria.modelos.add(d);
//        Inmobiliaria.etapas.add(etap);
//        Inmobiliaria.lotes.add(l);
//        Inmobiliaria.urbanizaciones.add(u);
//        System.out.println(Inmobiliaria.urbanizaciones);
//        System.out.println(Inmobiliaria.etapas);
//        System.out.println(Inmobiliaria.usuarios);
//        System.out.println(Inmobiliaria.lotes);
//        System.out.println(Inmobiliaria.modelos);
        
        // TODO code application logic here
        main.menu();
    }
    public void menu() {
        //boolean opcionV=false;
        String opcion = "";
        while (!opcion.equals("3")) {
            System.out.println("╔              Menu                ╗");
            System.out.println("║ 1. Cotizar Casas                 ║");
            System.out.println("║ 2. Entrar SistemaInmobiliaria    ║");
            System.out.println("║ 3. Registrar Usuario             ║");
            System.out.println("║ 4. Salir                         ║");
            System.out.println("╚                                  ╝");
            System.out.println("Ingrese opcion: ");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    //Validaciones.buscarPorPrecioMenu();
                    main.cotizarCasa();
                    break;
                case "2":
                    main.sistemaInmobiliario();
                    break;
                case "3":
                    main.rUsuario();
                    break;
                case "4":
//                    main.salirSistema();
                    //opcionV=true;
                    break;
                default:
                    System.out.println("Opcion No valida!!");
            } // Fin del Switch
        }
    }

    public void sistemaInmobiliario() {
        Usuario u;
        System.out.println("Ingrese su nombre: ");
        String nombreUsuario = sc.nextLine();
        
         u = aplicacion.consultarUsuario(nombreUsuario);
        if (u==null){
            System.out.println("Usted no esta Registrado");
            main.registrarUsuario();
            
        }else{
             System.out.println("Ya esta en el sistema");    
        }
            String modo = "";
            String opcion2 = "";

            while (!(opcion2.equals("1") | opcion2.equals("2") | opcion2.equals("3"))) {
            System.out.println("╔    Tipo de Consulta  ╗");
            System.out.println("║ 1. Crear             ║");
            System.out.println("║ 2. Consultar         ║");
            System.out.println("║ 3. Eliminar          ║");
            System.out.println("╚                      ╝");
            System.out.println("Ingrese un tipo de Consulta: ");
            opcion2 = sc.nextLine().toUpperCase();
                switch (opcion2) {
                    case "1":
                        modo = "CREAR";
                        break;
                    case "2":
                        modo = "CONSULTAR";
                        break;
                    case "3":
                        modo = "ELIMINAR";
                        break;
                    default:
                        System.out.println("Opcion No valida!!");
                }
            }
            
        if (modo.equals("CREAR")) {
            String tipo = "";
            String opcion3 = "";
            while (!(opcion3.equals("1") | opcion3.equals("2") | opcion3.equals("3") | opcion3.equals("4") | opcion3.equals("5"))) {
                System.out.println("╔    Tipo de Inmobiliaria      ╗");
                System.out.println("║ 1. Etapas                    ║");
                System.out.println("║ 2. Lotes                     ║");
                System.out.println("║ 3. casas                     ║");
                System.out.println("║ 4. Departamentos             ║");
                System.out.println("║ 5. Urbanizaciones            ║");
                System.out.println("╚                              ╝");
                System.out.println("Ingrese un tipo de Inmobiliaria que desea Crear: ");
                opcion3 = sc.nextLine().toUpperCase();
                switch (opcion3) {
                    case "1":
                        tipo = "ETAPAS";
                        break;
                    case "2":
                        tipo = "LOTES";
                        break;
                    case "3":
                        tipo = "CASAS";
                        break;
                    case "4":
                        tipo = "DEPARTAMENTOS";
                        break;
                    case "5":
                        tipo = "URBANIZACIONES";
                        break;    
                    default:
                        System.out.println("Opcion No valida!!");
                }
            }   
            if (tipo.equals("ETAPAS")){
//                System.out.println("Nombre de la Etapa: ");
//                String noEtapa = sc.nextLine();
//                Etapa eta = Inmobiliaria.consultarEtapa(noEtapa);
//                if(eta==null){
//                    System.out.println("Ingrese nueva Etapa");
//                    System.out.println("Nombre de la Etapa: ");                    
//                    System.out.println("Esta Vendido S/N : ");
//                    String vend = sc.nextLine();
//                    System.out.println("Numero de Manzana: ");
//                    int  nManzana= sc.nextInt();
//                    sc.nextLine();
//                    Etapa e = new Etapa(noEtapa,vend,nManzana);
//                    aplicacion.añadirEtapa(e);
//                    Inmobiliaria.archivoEtapa(noEtapa, vend, nManzana);
//                }else{ System.out.println("Etapa ya Registrada");}
                main.crearEtapa();
                
            }
            if (tipo.equals("LOTES")){
                System.out.println("Tamaño del Lote: ");
                String noLote = sc.nextLine();
                
                System.out.println("Asigne una Manzana: ");
                int eLote = sc.nextInt();
                sc.nextLine();             
                Lotes t = new Lotes(Validaciones.validarDouble(noLote),eLote);
                aplicacion.anadirLotes(t);
                System.out.println("Este es su codigo de lote: "+t.getCodigo());
                Inmobiliaria.archivoLote(noLote, eLote, t.getCodigo());
            }
            if (tipo.equals("CASAS")){
//                System.out.println("Ruta de la imagen: ");
//                String img = sc.nextLine();
//                System.out.println("Nombre del modelo: ");
//                String mCasa = sc.nextLine();
//                System.out.println("Numero de plantas: ");
//                int npCasa = sc.nextInt();
//                sc.nextLine();
//                System.out.println("Numero de cuartos: ");
//                int ncuCasa = sc.nextInt();
//                sc.nextLine();
//                System.out.println("Tiene Cocina S/N: ");
//                String ncoCasa = sc.nextLine();
//                System.out.println("Tiene Cuartos de servicios S/N: ");
//                String nseCasa = sc.nextLine();
//                System.out.println("Numero de baños: ");
//                int nbaCasa = sc.nextInt();
//                sc.nextLine();
//                System.out.println("Metros de construcción: ");
//                double meCasa = sc.nextDouble();
//                System.out.println("Precio casa: ");
//                double preCasa = sc.nextDouble();
//                Casa c = new Casa(img,mCasa,npCasa,ncuCasa,ncoCasa,nseCasa,nbaCasa,preCasa,meCasa);
//                aplicacion.agregarModelo(c);
//                Inmobiliaria.archivoCasa(img, mCasa, npCasa, ncuCasa, ncoCasa, nseCasa, nbaCasa, preCasa, meCasa);
                  main.crearCasa();
            }
            if (tipo.equals("DEPARTAMENTOS")){
//                System.out.println("Nombre del modelo: ");
//                String mDepa = sc.nextLine();
//                System.out.println("Numero de plantas: ");
//                int npDepa = sc.nextInt();
//                sc.nextLine();
//                System.out.println("Numero de casas: ");
//                int ncuDepa = sc.nextInt();
//                System.out.println("Tiene Cocina S/N: ");
//                String ncoDepa = sc.nextLine();
//                System.out.println("Tiene Cuartos de servicios S/N: ");
//                String nseDepa = sc.nextLine();
//                System.out.println("Numero de baños: ");
//                int nbaDepa = sc.nextInt();
//                sc.nextLine();
//                System.out.println("Metros de construcción: ");
//                double meDepa = sc.nextInt();
//                sc.nextLine();
//                System.out.println("Precio casa: ");
//                double preDepa = sc.nextInt();
//                sc.nextLine();
//                System.out.println("Tiene de parqueadero: ");
//                String parDepa = sc.nextLine();
//                System.out.println("Tien de lavanderia: ");
//                String lavDepa = sc.nextLine();
//                System.out.println("Tiene de Ascensor: ");
//                String ascDepa = sc.nextLine();
//                Departamento dep = new Departamento(parDepa,lavDepa,ascDepa,mDepa, npDepa,ncuDepa,ncoDepa,nseDepa,nbaDepa,preDepa,meDepa);
//                aplicacion.agregarModelo(dep);
//                Inmobiliaria.archivoDepartamento(parDepa, lavDepa, ascDepa, mDepa,npDepa , ncuDepa, ncoDepa, nseDepa, nbaDepa, preDepa, meDepa);
                  main.crearDepartamento();
            }
            if (tipo.equals("URBANIZACIONES")){
                main.crearUrbanizacion();
        }
        
        
        if (modo.equals("CONSULTAR")) {
            String tipo5 = "";
            String opcion5 = "";
            while (!(opcion5.equals("1") | opcion5.equals("2") | opcion5.equals("3") | opcion5.equals("4") | opcion5.equals("5"))) {
                System.out.println("╔    Tipo de Inmobiliaria      ╗");
                System.out.println("║ 1. Etapas                    ║");
                System.out.println("║ 2. Lotes                     ║");
                System.out.println("║ 3. casas                     ║");
                System.out.println("║ 4. Departamentos             ║");
                System.out.println("║ 5. Urbanizaciones            ║");
                System.out.println("╚                              ╝");
                System.out.println("Ingrese un tipo de Inmobiliaria: ");
                opcion5 = sc.nextLine().toUpperCase();
                switch (opcion5) {
                    case "1":
                        tipo5 = "ETAPAS";
                        break;
                    case "2":
                        tipo5 = "LOTES";
                        break;
                    case "3":
                        tipo5 = "CASAS";
                        break;
                    case "4":
                        tipo5 = "DEPARTAMENTOS";
                        break;
                    case "5":
                        tipo5 = "URBANIZACIONES";
                        break;    
                    default:
                        System.out.println("Opcion No valida!!");
                }
            }
            if (tipo.equals("ETAPAS")){
                main.consultarEtapa();
        }
            if (tipo.equals("LOTES")){
                
                main.consultarLote();
            }
            if (tipo.equals("CASAS")){
                main.consultarCasaMenu();
            }
            if (tipo.equals("DEPARTAMENTOS")){
               main.consultaDepartamemtoMenu();
            }
            if (tipo.equals("URBANIZACIONES")){
               main.consultarUrbanizacion();
            }
        }    
        if (modo.equals("ELIMINAR")) {
            String tipo1 = "";
            String opcion4 = "";
            while (!(opcion4.equals("1") | opcion4.equals("2") | opcion4.equals("3") | opcion4.equals("4") | opcion4.equals("5"))) {
                System.out.println("╔    Tipo de Inmobiliaria      ╗");
                System.out.println("║ 1. Etapas                    ║");
                System.out.println("║ 2. Lotes                     ║");
                System.out.println("║ 3. casas                     ║");
                System.out.println("║ 4. Departamentos             ║");
                System.out.println("║ 5. Urbanizaciones            ║");
                System.out.println("╚                              ╝");
                System.out.println("Ingrese un tipo de Inmobiliaria: ");
                opcion4 = sc.nextLine().toUpperCase();
                switch (opcion4) {
                    case "1":
                        tipo1 = "ETAPAS";
                        break;
                    case "2":
                        tipo1 = "LOTES";
                        break;
                    case "3":
                        tipo1 = "CASAS";
                        break;
                    case "4":
                        tipo = "DEPARTAMENTOS";
                        break;
                    case "5":
                        tipo1 = "URBANIZACIONES";
                        break;
                    default:
                        System.out.println("Opcion No valida!!");
                }
            }
        if (tipo1.equals("ETAPAS")){
                System.out.println("Nombre de la Etapa: ");
                String etapa = sc.nextLine();
                Inmobiliaria.eliminarEtapa(etapa);
        }
            if (tipo1.equals("LOTES")){
                System.out.println("escriba el codigo del lote: : ");
                int codigo = sc.nextInt();
                Inmobiliaria.eliminarLote(codigo);
            }
            if (tipo1.equals("CASAS")){
                System.out.println("Nombre de la casa: ");
                String casa = sc.nextLine();
                Inmobiliaria.eliminarModelo(casa);
            }
            if (tipo1.equals("DEPARTAMENTOS")){
                System.out.println("Nombre de departamento: ");
                String depar = sc.nextLine();
                Inmobiliaria.eliminarModelo(depar);
            }
            if (tipo1.equals("URBANIZACIONES")){
                System.out.println("Nombre de la Urbanizacion: ");
                String ur = sc.nextLine();
                Inmobiliaria.eliminarUrbanizacion(ur);
            }
        
        }
                
    }}
    public void cotizarCasa() {
        Usuario u;
        
        System.out.println("¿Soy el cotizador en línea me llamo Bob, puedes darme tu nombre?");
        String usuario= sc.nextLine();
        System.out.println("Hola! "+ usuario + " me puedes dar una dirección de correo donde enviaremos información?");
        String correo = sc.nextLine();
        String valcorreo = Validaciones.validarCorreo(correo);
        System.out.println("Listo! ¿Buscas casa o departamento?");
        String detalle = sc.nextLine();
        if (detalle.equals("casa")){
                System.out.println("¿De cuántas plantas? Puedes escribir “omitir” en caso de no tener preferencia");
                String planta = sc.nextLine();
                System.out.println("¿Número mínimo de Cuartos? Puedes escribir “omitir” en caso de no tener preferencia");
                String cuartos = sc.nextLine();
                System.out.println("¿Número mínimo de baños? Puedes escribir “omitir” en caso de no tener preferencia");
                String baños = sc.nextLine();
                System.out.println("Sector donde se encuentra la vivienda. Puedes escribir “omitir” en caso de no tener preferencia: ");
                String sector = sc.nextLine();
                System.out.println("¿Cual es su sueldo o ingresos Neto?, si es casado ingrese su sueldo en conjunto");
                double sueldo = sc.nextInt();
                System.out.println("¿Cuanto dispone para la entrada?");
                double entrada = sc.nextInt();
                if (!planta.equals("omitir") || !cuartos.equals("omitir") || !baños.equals("omitir") ){
                    int num1 = Integer.parseInt(planta);
                    int num2 = Integer.parseInt(cuartos);
                    int num3= Integer.parseInt(baños);
                    List<Modelo> casas = Validaciones.buscarCa(detalle, num1, num2, num3);
                    for (Modelo m: casas){
                        System.out.println(m);
                    }
                    System.out.println("hola");
                }
                
        }
        else{
            System.out.println("¿Número mínimo de Cuartos? Puedes escribir “omitir” en caso de no tener preferencia");
            String cuartos = sc.nextLine();
            System.out.println("¿Número mínimo de baños? Puedes escribir “omitir” en caso de no tener preferencia");
            String baños = sc.nextLine();
            System.out.println("Sector donde se encuentra la vivienda. Puedes escribir “omitir” en caso de no tener preferencia: ");
            String sector = sc.nextLine();
            System.out.println("¿Cual es su sueldo o ingresos Neto?, si es casado ingrese su sueldo en conjunto");
            double sueldo = sc.nextInt();
            System.out.println("¿Cuanto dispone para la entrada?");
            double entrada = sc.nextInt();
        }
    }
    
    
    public void rUsuario(){
        Usuario a = Validaciones.pedirleInformacionUsuario();
        if (a instanceof Vendedor){
            System.out.println("Usted no puede ingresar a esta opcion!");
            main.menu();
        }
        if(a instanceof Administrador){
            main.registrarUsuario();
        }
    }
    public void registrarUsuario(){
        System.out.println("Ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese correo electrónico: ");
        String correo = sc.nextLine();
        correo = Validaciones.validarCorreo(correo);
        System.out.println("Ingrese contraseña: ");
        String contrasena = sc.nextLine();
        contrasena = Validaciones.validarContrasena(contrasena);
        System.out.println("Indique el Rol");
        String rol=sc.nextLine();
        rol = Validaciones.validarString(rol);
//        String mensaje = "Su registro ha sido éxitoso. " + nombre.toUpperCase();
//        correo = Validaciones.enviarCorreo(correo, mensaje);
//        Usuario u = new Usuario(nombre.toUpperCase(), correo, contrasena, rol);
//        aplicacion.agregarUsuario(u);
//        aplicacion.guardarUsuario(u);
//        System.out.println("Su registro ha sido exitoso.. Se le ha enviado un mensaje a su correo");
        String usuario = "";
        String opcion2 = "";
        while (!(opcion2.equals("1") | opcion2.equals("2") )) {
            System.out.println("╔    Tipo de Usuario   ╗");
            System.out.println("║ 1. Administrador     ║");
            System.out.println("║ 2. Vendedor          ║");
            System.out.println("╚                      ╝");
            System.out.println("Ingrese un tipo de usuario: ");
            opcion2 = sc.nextLine();
            switch (opcion2) {
                case "1":
                    usuario = "ADMINISTRADOR";
                    break;
                case "2":
                    usuario = "VENDEDOR";
                    break;
                default:
                    System.out.println("Opcion No valida!!");
            }
        }
        if (usuario.equals("ADMINISTRADOR")) {
            String mensaje1 = "Su registro ha sido éxitoso. " + nombre.toUpperCase() + " eres un usuario aDMINISTRADOR  de nuestra aplicacion INMOBILIARIA, el cual te permite CREAR USUARIOS Y TENER ACCEDO A TODO EL SISTEMA";
            correo = Validaciones.enviarCorreo(correo, mensaje1);
            Usuario u = new Administrador(nombre.toUpperCase(), correo, contrasena,rol);
            aplicacion.agregarUsuario(u);
            aplicacion.guardarUsuario(u);
            System.out.println("Su registro ha sido exitoso. Usted es un usuario Administrador. Se le ha enviado un mensaje a su correo");
        }
        if (usuario.equals("VENDEDOR")) {
            Urbanizacion ur ;
            System.out.println("Indique para que Urbanizcion Trabaja: ");
            String tra = sc.nextLine();
            ur = aplicacion.consultarUrbanizacion(tra);
            
            String mensaje2 = "Su registro ha sido éxitoso. " + nombre.toUpperCase() + " eres un usuario VENDEDOR de nuestra aplicacion INMOBILIARIA, el cual te permite cotizar e ingresar Urbanizaciones. ";
            correo = Validaciones.enviarCorreo(correo, mensaje2);

            Usuario u = new Vendedor(ur, nombre.toUpperCase(), correo, contrasena, rol);
            aplicacion.agregarUsuario(u);
            aplicacion.guardarUsuario(u);
            System.out.println("Su registro ha sido exitoso. Usted es un usuario VENDEDOR. Se le ha enviado un mensaje a su correo");
        }
        
        
        
        
        
    }
    
    
    //metodo para consultar los modelos por nombre(tipo)
    public void consultarCasaMenu() {
        List<Modelo> d;    
        System.out.println("Ingrese el Nombre o (tipo) de Casa: ");
        String codigo2 = sc.nextLine();
        //codigo2 = Validaciones.validarNombreCasa(codigo2);
        d = Validaciones.busquedaPorNombre(codigo2);
         if (d != null){
            System.out.println(d);
        }else{System.out.println("No hay Casas con ese Nombre");}
    }         
    
    public void consultaDepartamemtoMenu(){
        List<Modelo> d;
        System.out.println("Ingrese el Nombre o (tipo) de Departarmento: ");
        String nombre = sc.nextLine();
        String nombre2 = Validaciones.validarNombreDepartamento(nombre);
        d = Validaciones.busquedaPorNombre(nombre2);
        if (d != null){
            System.out.println(d);
        }else{System.out.println("No hay Departamento con ese Nombre");}
    }
    
    public void consultarModel(){
        List<Modelo> m;
        System.out.println("ingrese el tipo de modelo");
        String mo = sc.nextLine();
        mo =  Validaciones.validaNombreModelo(mo);
        
    }
    
    public void consultarEtapa(){
        List<Etapa> p;
            System.out.println("Ingrese el Nombre de la Etapa: ");
            String nombre = sc.nextLine();
            p = Validaciones.validaEtapaNombre(nombre);
            if (p != null){
                System.out.println(p);
            } else{ System.out.println("No hay etapa con ese nombre");}
    }
    
    public void consultarLote(){
        List<Lotes> L;

            System.out.println("Ingrese el codigo del Lote: ");

            System.out.println("Ingrese el codigo del lote: ");
            String nombre = sc.nextLine();
            int nombre1 = Validaciones.validarEntero(nombre);
            L = Validaciones.validaLoteCodigo(nombre1);
            if (L != null){
                System.out.println(L);
            } else{ System.out.println("No hay Lotes con ese nombre");}
    }
    
    public void consultarUrbanizacion(){
        List<Urbanizacion> urb;
        System.out.println("Ingrese el nombre de la Urbanizacion");
        String urbaniza = sc.nextLine();
        urbaniza = Validaciones.validarString(urbaniza);
        urb = Validaciones.validarUrba(urbaniza);
        if (urb != null){
            System.out.println(urb);
        }else{ System.out.println("No hay Urbanizaciones con ese nombre");}
    }
    
    public void crearEtapa(){
        System.out.println("Nombre de la Etapa: ");
        String noEtapa = sc.nextLine();
        noEtapa=Validaciones.validarString(noEtapa);
        Etapa eta = Inmobiliaria.consultarEtapa(noEtapa);
                if(eta==null){
                    System.out.println("-------------Ingrese nueva Etapa-------------");
//                    System.out.println("~Nombre de la Etapa: ");                    
                    System.out.println("~Esta Vendido S/N : ");
                    String vend = sc.nextLine();
                    System.out.println("~Numero de Manzana: ");
                    int  nManzana= sc.nextInt();
                    sc.nextLine();
                    Etapa e = new Etapa(noEtapa,vend,nManzana);
                    aplicacion.añadirEtapa(e);
                    Inmobiliaria.archivoEtapa(noEtapa, vend, nManzana);
                }else{ System.out.println("Etapa ya Registrada");}
    }
    
    public void validacionCrearCasas(){
        Usuario u = Validaciones.pedirleInformacionUsuario();
        if(u instanceof Administrador){
            main.crearCasa();
        }
        if ( u instanceof Vendedor){
            Urbanizacion p;
            System.out.println("A que Urbanizacion Pertenece este Modelo");
            String per = sc.nextLine();
            p= aplicacion.consultarUrbanizacion(per);
            if (p==null){
                System.out.println("no hay Urbanizaciones con ese nombre"); 
                main.crearUrbanizacion();
            }else{System.out.println("YA esta creada la Urbanizacion");
                main.crearCasa();
            }
        }
    }
    
    public void crearCasa(){
            Urbanizacion p;
            System.out.println("A que Urbanizacion Pertenece este Modelo");
            String per = sc.nextLine();
            p= aplicacion.consultarUrbanizacion(per);
                System.out.println("Ruta de la imagen: ");
                String img = sc.nextLine();
                System.out.println("Nombre del modelo: ");
                String mCasa = sc.nextLine();
                System.out.println("Numero de plantas: ");
                int npCasa = sc.nextInt();
                sc.nextLine();
                System.out.println("Numero de cuartos: ");
                int ncuCasa = sc.nextInt();
                sc.nextLine();
                System.out.println("Tiene Cocina S/N: ");
                String ncoCasa = sc.nextLine();
                System.out.println("Tiene Cuartos de servicios S/N: ");
                String nseCasa = sc.nextLine();
                System.out.println("Numero de baños: ");
                int nbaCasa = sc.nextInt();
                sc.nextLine();
                System.out.println("Metros de construcción: ");
                double meCasa = sc.nextDouble();
                System.out.println("Precio casa: ");
                double preCasa = sc.nextDouble();
                if (p==null){
                    System.out.println("Cree una Urbanizacion ");
                    //main.cr
                }
                
                Casa c = new Casa(img,mCasa,npCasa,ncuCasa,ncoCasa,nseCasa,nbaCasa,preCasa,meCasa,p);
                aplicacion.agregarModelo(c);
                Inmobiliaria.archivoCasa(img, mCasa, npCasa, ncuCasa, ncoCasa, nseCasa, nbaCasa, preCasa, meCasa);
    
    }
    public void crearDepartamento(){
          Urbanizacion p;
            System.out.println("A que Urbanizacion Pertenece este Modelo");
            String per = sc.nextLine();
            p= aplicacion.consultarUrbanizacion(per);
        System.out.println("Nombre del modelo: ");
                String mDepa = sc.nextLine();
                System.out.println("Numero de plantas: ");
                int npDepa = sc.nextInt();
                sc.nextLine();
                System.out.println("Numero de casas: ");
                int ncuDepa = sc.nextInt();
                System.out.println("Tiene Cocina S/N: ");
                String ncoDepa = sc.nextLine();
                System.out.println("Tiene Cuartos de servicios S/N: ");
                String nseDepa = sc.nextLine();
                System.out.println("Numero de baños: ");
                int nbaDepa = sc.nextInt();
                sc.nextLine();
                System.out.println("Metros de construcción: ");
                double meDepa = sc.nextInt();
                sc.nextLine();
                System.out.println("Precio casa: ");
                double preDepa = sc.nextInt();
                sc.nextLine();
                System.out.println("Tiene de parqueadero: ");
                String parDepa = sc.nextLine();
                System.out.println("Tien de lavanderia: ");
                String lavDepa = sc.nextLine();
                System.out.println("Tiene de Ascensor: ");
                String ascDepa = sc.nextLine();
                if (p==null){
                    System.out.println("Cree una Urbanizacion ");
                    //main.cr
                }
                Departamento dep = new Departamento(parDepa,lavDepa,ascDepa,mDepa, npDepa,ncuDepa,ncoDepa,nseDepa,nbaDepa,preDepa,meDepa,p);
                aplicacion.agregarModelo(dep);
                Inmobiliaria.archivoDepartamento(parDepa, lavDepa, ascDepa, mDepa,npDepa , ncuDepa, ncoDepa, nseDepa, nbaDepa, preDepa, meDepa);
    }
    
    public void crearUrbanizacion(){
        Usuario sr = Validaciones.pedirleInformacionUsuario();
                if(sr instanceof Administrador){
                Etapa e;
                Modelo m;
                System.out.println("Nombre de Urbanizacion");
                String nombree = sc.nextLine();
                nombree = Validaciones.validarString(nombree);
                System.out.println("Direccion de la Urbanizaciones");
                String direccion = sc.nextLine();
                System.out.println("Ingrese el nombre de la Etapa a que pertenece esta Urbanizacion: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el Tipo de Modelo de la Urbanizacion: ");
                String nomMo = sc.nextLine();
                m = aplicacion.consultarModelo(nomMo);
                e = aplicacion.consultarEtapa(nombre);
                if (e==null){
                    System.out.println("Usted no tiene Registradouna Etapa");
                    main.crearEtapa();

                }else{
                     System.out.println("Ya esta en el sistema");    
                }
                if(m == null){
                    System.out.println("Usted no tiene un Modelo Registrado");
                    main.crearModelo();
                }
                else{
                     System.out.println("Ya esta en el sistema");    
                }
                m = aplicacion.consultarModelo(nomMo);
                e = aplicacion.consultarEtapa(nombre);
                Urbanizacion ur = new Urbanizacion(sr,nombree,direccion,e, m);
                aplicacion.agregarUrbanizacion(ur);
                Inmobiliaria.archivoUrban(nombre, ur.getCodigo(), direccion);
                }if (sr instanceof Vendedor){ System.out.println("Usted no puede crear Urbanizaciones");
                
                
            }
    }
    public void crearModelo(){
        System.out.println("Ingrese el tipo de Modelo que posee: ");
        String mo = sc.nextLine();
        mo = Validaciones.validaNombreModelo(mo);
        Modelo mod = Inmobiliaria.consultarModelo(mo);
        if (mod == null && mo.equalsIgnoreCase("CASA") ){
            main.crearCasa();
        }
        if (mod == null && mo.equalsIgnoreCase("DEPARTAMENTO")){
            main.crearDepartamento();
        }
    }
//    public void cotizarValor(double sueldo,double entrada,String modelo){
//        //String modelon = main.cotizarCasa();
//        double precio = entrada;
//        double mensualidad = sueldo*0.4;
//    }
}
