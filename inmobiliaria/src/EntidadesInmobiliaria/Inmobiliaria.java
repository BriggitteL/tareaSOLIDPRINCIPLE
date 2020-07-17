/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesInmobiliaria;
import Edificio.Departamento;
import Edificio.Casa;
import Edificio.Modelo;
import Persona.Usuario;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Inmobiliaria {
    public static List<Usuario> usuarios = new ArrayList<>();
   
    public static List<Urbanizacion> urbanizaciones = new ArrayList<>();
    
    public static List<Modelo> modelos = new ArrayList<>();
    
    public static List<Lotes> lotes = new ArrayList<>();
    
    public static List<Etapa> etapas = new ArrayList<>();

    public static void añadirEtapa(Etapa etapa){
        etapas.add(etapa);
    }
    
     public static Etapa consultarEtapa(String nombre){
        for (Etapa a : etapas) {
            if (a.getNombreEtapa().equalsIgnoreCase(nombre)) {
                return a;
            }
        }
        return null;
    }
    
    public static void anadirLotes(Lotes lote){
        lotes.add(lote);
    }
    public static void eliminarEtapa(String nombre){
        Etapa etapa = null;
        for (Etapa e:etapas){
            if (e.getNombreEtapa().equalsIgnoreCase(nombre))
                etapa = e;
            
        }
        if (etapa != null){
            etapas.remove(etapa);
        }
        
    }
    
    
        
    public static void eliminarLote(int codigo){
        Lotes lote = null;
        for (Lotes e:lotes){
            if (e.getCodigo() == codigo)
                lote = e;
            
        }
        if (lote != null){
            lotes.remove(lote);
            System.out.println("Lote eliminada");
        }
        
    }
        
    public static void eliminarModelo(String nombre){
        Modelo modelo = null;
        for (Modelo e:modelos){
            if (e instanceof Casa ){
                if (e.getNombre().equalsIgnoreCase(nombre))
                    modelo = e;
            }else {
                if (e instanceof Departamento){
                    if (e.getNombre().equalsIgnoreCase(nombre)){
                        modelo = e;
                    }
                }
            }
            
        }
            
        if (modelo != null){
            modelos.remove(modelo);
            System.out.println("Modelo eliminado");
        }
        
    }
    
    public static Lotes consultarLote(int codigo){
        for (Lotes l:lotes){
            if (l.getCodigo()==(codigo)){
                return l;
            }
        }
        return null;
    }
    
    public static void agregarModelo(Modelo modelo){
        modelos.add(modelo);
    }
   
    public static Modelo consultarModelo(String nombre){
        for (Modelo mod : modelos){
            if ( mod instanceof Casa){
                Casa c = (Casa)mod;
                if(c.getNombre().equalsIgnoreCase(nombre)){
                return c;
                }
            }
            if (mod instanceof Departamento){
                Departamento d = (Departamento)mod;
                if(d.getNombre().equalsIgnoreCase(nombre)){
                    return d;
                }
            }
        }
        return null;
    }
    public void agregarUrbanizacion (Urbanizacion urbanizacion){
        urbanizaciones.add (urbanizacion);
    }
    public Urbanizacion consultarUrbanizacion(String nombre){
        for (Urbanizacion a : urbanizaciones) {
            if (a.getNombreUrbanizacion().equalsIgnoreCase(nombre)) {
                return a;
            }
        }
        return null;
    }
    public static void eliminarUrbanizacion(String nombreUrb){
        Urbanizacion urb = null;
        for (Urbanizacion e:urbanizaciones){
            if (e.getNombreUrbanizacion().equalsIgnoreCase(nombreUrb)){
                urb = e;
//                urbanizaciones.remove(urb);
//                System.out.println("Urbanizacion eliminada");
            }
        }
            
        
        if (urb != null){
            urbanizaciones.remove(urb);
            System.out.println("Urbanizacion eliminada");
        }
        
    }
    
    //public static List<Habitacion> habitaciones=new ArrayList<>();
    /**
     * Metodo que agrega un nuevo usuario a la lista de usuarios
     *
     * @param usuario usuario
     */
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public Usuario consultarUsuario(String nombre){
    for(Usuario d:usuarios){
        if (d.getNombre().equals(nombre)) 
            return d;
    }
    return null;
}
    /**
     * Metodo que agrega una nueva urbanizacion a la lista de urbanizaciones
     *
     * @param urbanizacion urbanizacion
     */
    
    /**
     * Metodo que retorna una Urbanizacion de acuerdo al codigo de la urbanizacion
     *
     * @param codigo codigo
     * @return Reserva
     */
    public Urbanizacion consultarReserva(int codigo) {
        for (Urbanizacion ur : urbanizaciones) {
            if (ur.getCodigo() == codigo) {
                return ur;
            }
        }
        return null;
    }
    
    /**
     * Metodo que guarda los usuarios Genius y Regular en registroUsuarios.txt y
     * a los establecimientos en RegistroEstablecimiento.txt
     *
     * @param usu usuario
     */
    public void guardarUsuario(Usuario usu) {
//        String linea="";
        for(Usuario us : usuarios){
            String linea = usu.getNombre() + "|" + usu.getCorreoElectronico() + "|" + usu.getCorreoElectronico() + "\r\n";
            try {

                FileWriter f = new FileWriter("Datos/registroUsuarios.txt", true);

                f.write(linea);
                f.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//        if (usu instanceof Urbanizacion) {
//            String linea = usu.getNombre() + "|" + usu.getCorreoElectronico() + "|" + usu.getContrasena() + "|" + ((Urbanizacion) usu).getCodigo() + "|" + ((Urbanizacion) usu).getNombreUrbanizacion() + 
//                    "|" + ((Urbanizacion) usu).getDireccion() + "|" + ((Urbanizacion) usu).getModelos() + "\r\n";
//            try {
//
//                FileWriter f = new FileWriter("Datos/registroEstablecimientos.txt", true);
//                f.write(linea);
//                f.close();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }    
    }
    
    public static void archivoEtapa(String nombre,String vendido, int manzana){
        File file = new File ("Etapa.csv");
        FileWriter escribir;
        PrintWriter linea;
        if (!file.exists()){
            try{
                file.createNewFile();
                System.out.println(file.getName()+ "    Ha sido creado");
                
            }catch(IOException ex){ex.printStackTrace();}
        }
        
            try{
                escribir = new FileWriter(file,true);
                linea = new PrintWriter(escribir); 
                linea.println("Etapa: "+nombre + "      En venta: "+vendido + "     No de manzana: "+manzana);
                escribir.close();
            } catch (Exception e){e.printStackTrace();}
            
        
    }
    public static void archivoLote(String noLote,int codigo, int manzana){
        File file = new File ("Lote.csv");
        FileWriter escribir;
        PrintWriter linea;
        if (!file.exists()){
            try{
                file.createNewFile();
                System.out.println(file.getName()+ "    Ha sido creado");
                
            }catch(IOException ex){ex.printStackTrace();}
        }
        
            try{
                escribir = new FileWriter(file,true);
                linea = new PrintWriter(escribir); 
                linea.println("Codigo: "+codigo + "      No de lote: "+noLote + "     No de manzana: "+manzana);
                escribir.close();
            } catch (Exception e){e.printStackTrace();}
            
        
    }
    public static void archivoCasa(String img,String nombre, int numPlanta,int ncuCasa,String ncoCasa,String nseCasa,int nbaCasa,double preCasa,double meCasa){
        File file = new File ("Casa.csv");
        FileWriter escribir;
        PrintWriter linea;
        if (!file.exists()){
            try{
                file.createNewFile();
                System.out.println(file.getName()+ "    Ha sido creado");
                
            }catch(IOException ex){ex.printStackTrace();}
        }
        
            try{
                escribir = new FileWriter(file,true);
                linea = new PrintWriter(escribir); 
                linea.println("Ruta de imagen: "+img + "      Numero de Plantas: "+numPlanta  + "      Nombre de casa: "+nombre + "     No de cuarto: "+ncuCasa+ "       "
                        + "No de Cocina: " + ncoCasa + "        No de cuartos de servicio: " +nseCasa+ "        No de baños: " +nbaCasa+
                        "       Precio Casa: "+preCasa+"        Metro Casa: "+ meCasa);
                escribir.close();
            } catch (Exception e){e.printStackTrace();}
            
        
    }
    
    public static void archivoVendedor(Urbanizacion urbanizacion, String nombre, String correoElectronico, String contrasena, String rol){
        File file = new File ("Departamento.csv");
        FileWriter escribir;
        PrintWriter linea;
        if (!file.exists()){
            try{
                file.createNewFile();
                System.out.println(file.getName()+ "    Ha sido creado");
                
            }catch(IOException ex){ex.printStackTrace();}
        }
        
            try{
                escribir = new FileWriter(file,true);
                linea = new PrintWriter(escribir); 
                linea.println("Nombre de casa: "+nombre +"|"+ " Nombre de Rbanizacion: "+urbanizacion);
                escribir.close();
            } catch (Exception e){e.printStackTrace();}
    
    }
    public static void archivoDepartamento(String parDepa,String lavDepa,String ascDepa,String nombre,int npDepar,int ncuCasa,String ncoCasa,String nseCasa,int nbaCasa,double preCasa,double meCasa){
        File file = new File ("Departamento.csv");
        FileWriter escribir;
        PrintWriter linea;
        if (!file.exists()){
            try{
                file.createNewFile();
                System.out.println(file.getName()+ "    Ha sido creado");
                
            }catch(IOException ex){ex.printStackTrace();}
        }
        
            try{
                escribir = new FileWriter(file,true);
                linea = new PrintWriter(escribir); 
                linea.println("Nombre de casa: "+nombre + "      Nombre de planta: "+npDepar +"     No de cuarto: "+ncuCasa+ "       "
                        + "No de Cocina: " + ncoCasa + "        No de cuartos de servicio: " +nseCasa+ "        No de baños: " +nbaCasa+
                        "       Precio Departamento: "+preCasa+"        Metro de construcción: "+ meCasa + "        Parqueadero: "+ parDepa+ 
                        "       Lavanderia: "+lavDepa+ "       Ascensor: "+ascDepa);
                escribir.close();
            } catch (Exception e){e.printStackTrace();}
            
        
    }
    public static void archivoUrban(String nombre,int codigo, String direccion){
        File file = new File ("Urbanizacion.csv");
        FileWriter escribir;
        PrintWriter linea;
        if (!file.exists()){
            try{
                file.createNewFile();
                System.out.println(file.getName()+ "    Ha sido creado");
                
            }catch(IOException ex){ex.printStackTrace();}
        }
        
            try{
                escribir = new FileWriter(file,true);
                linea = new PrintWriter(escribir); 
                linea.println("Codigo: "+codigo + "      Nombre de Urbanizacion: "+nombre + "     Direccion: "+direccion);
                escribir.close();
            } catch (Exception e){e.printStackTrace();}
            
        
    }
}


