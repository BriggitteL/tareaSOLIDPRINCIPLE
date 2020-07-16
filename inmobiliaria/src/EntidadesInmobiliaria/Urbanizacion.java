/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesInmobiliaria;

import Persona.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author PC1
 */
public class  Urbanizacion{
    private int codigo;
    private Usuario usuario;
    private String nombreUrbanizacion;
    private String direccion;
    private Etapa etapa;
    private Modelo modelo;
    private static List<Modelo> modelos;
   private List<String> servicios;
    private List<Etapa> etapas;
    
    
    
    public Urbanizacion(Usuario usuario, String nombreUrbanizacion, 
            String direccion, Etapa etapa, Modelo modelo) {
        
        this.codigo = obtieneCodigo();
        this.usuario = usuario;
        this.nombreUrbanizacion = nombreUrbanizacion;
        this.direccion = direccion;
        this.etapa = etapa;
        this.modelo = modelo;
        modelos = new ArrayList<>();
        servicios = new ArrayList<>();
        
    }
//    public void presentarUrbanizacion(){
//            System.out.println("Nombre: "+this.nombre);
//            System.out.println("Direccion: "+this.direccion);
//            for (Modelo e:modeloss){
//                e.presentarModelo();
//            }
//    }
    
    
    
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
      
    public String getDireccion() {
        return direccion;
    }

    public String getNombreUrbanizacion() {
        return nombreUrbanizacion;
    }
    
    public void setNombreUrbanizacion(String nombreUrbanizacion) {
        this.nombreUrbanizacion = nombreUrbanizacion;
    }
    
    public Etapa getEtapa() {
        return etapa;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public void setEtapa(Etapa etapa) {
        this.etapa = etapa;
    }

    public static List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }

    public List<Etapa> getEtapas() {
        return etapas;
    }

    public void setEtapas(List<Etapa> etapas) {
        this.etapas = etapas;
    }
    
  public List<String> getServicios() {
        return servicios;
    }

    public void setServicios(List<String> servicios) {
        this.servicios = servicios;
    }

    /**
     * Metodo llamado desde el constructor para generar codigos a las Urbanizaciones ingresadas
     * @return Codigo entero aleatorio para las Urbanizaciones creadas
     */
    private int obtieneCodigo(){
        Random r = new Random();
        return r.nextInt(1500);
    }

    public Object stream() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "................................Urbanizaciones................................" + "\n"+ 
               "codigo: " + codigo + "\n"+ 
               "nombreUrbanizacion: " + nombreUrbanizacion + "\n"+
               "direccion: " + direccion + "\n" + 
                etapa  + "\n"+
                modelo + "\n";
               
    }
    
    //metodo para la consulta de etapas
    public void mostrarDatosEtapa(){
        int valor = 0;
        System.out.println("--------------------------Datos de la Urbanizacion " + this.getNombreUrbanizacion()+ "----------------------------");
        System.out.println("Direccion: " + this.direccion + " Codigo: " + this.codigo);

        
        List<Etapa> etapaunica = new ArrayList<>();
        for (Etapa e:this.getEtapas()){
            if(!etapaunica.isEmpty()) {
                for (Etapa etas : etapaunica) {
                    if (etas.getNombreEtapa().equals(e.getNombreEtapa())) {
                        valor += 1;
                    }
                }
                if (valor == 0) {
                    etapaunica.add(e);
                }
            }
            if (etapaunica.isEmpty()) {
                etapaunica.add(e);
            }
            valor = 0;
        }
        
        for (Etapa huu : etapaunica) {
            System.out.print(huu);
        }
        System.out.println("\n--------------------------------------------------------------------------------------");
}
    //metodo que muestre los datos de los modelos
        public void mostrarDatosModelo(){
            boolean opcion = false;
            int valor = 0;
            
            System.out.println("--------------------------Datos de la Urbanizacion " + this.getNombreUrbanizacion()+ "----------------------------");
            System.out.println("Direccion: " + this.direccion + " Codigo: " + this.codigo);

            List<Modelo> modelounico = new ArrayList<>();
            for (Modelo e: this.getModelos()){
                if(!modelounico.isEmpty()) {
                    for (Modelo etas : modelounico) {
                        if (etas.getNombre().equalsIgnoreCase(e.getNombre())) {
                            valor += 1;
                        }
                    }
                    if (valor == 0) {
                        modelounico.add(e);
                    }
                }
                if(modelounico.isEmpty()) {
                    modelounico.add(e);
                }
            valor = 0;
        }
        for (Modelo huu : modelounico) {
            System.out.print(huu);
        }
       System.out.println("\n--------------------------------------------------------------------------------------");        

        }
       

    //metodo que muestre los modelos disponibles
        public void mostrarModelosDisponibles(){
//            for(Modelo modelounic:this.getModelos()){
//                System.out.println(modelounic.getNombre());
//            }    
            int cantC = 0;
            int cantD = 0;
            for (Modelo m : this.getModelos()){
                if(m instanceof Casa){
                    cantC+=1;
                }
                if(m instanceof Departamento){
                    cantD+=1;
                }
            }            
            System.out.println("\"----------------------Modelos Disponibles--------------------");
            if (cantC !=0){
                System.out.println("Casas: " + cantC);
            }
            if(cantD != 0){
                System.out.println("Departamentos: " + cantD);
            }
            System.out.println("-----------------------------------------------------------------------------");
        }
        
        
}
