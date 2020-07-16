/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesInmobiliaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author PC1
 */
public class Etapa {
    String NombreEtapa;
    private String estadoVendido;
    private List<String> servicio;
    private int manzana;
    private Urbanizacion urbanizacion;
    protected List<Lotes> lotes1 = new ArrayList<>();

    private int codigo;
    private int numero = 0;
    public Etapa(String NombreEtapa, String estadoVendido, int manzana) {
        this.NombreEtapa = NombreEtapa;
        this.estadoVendido = estadoVendido;
        this.manzana = manzana;
        this.codigo = obtieneCodigo();
        this.estadoVendido = "En VENTA";
        servicio = new ArrayList<>();
    }

    public String getNombreEtapa() {
        return NombreEtapa;
    }

    public void setNombreEtapa(String NombreEtapa) {
        this.NombreEtapa = NombreEtapa;
    }

    public int getManzana() {
        return manzana;
    }

    public void setManzana(int manzana) {
        this.manzana = manzana;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

//    public String getEstadoVendido() {
//        return estadoVendido;
//    }
//
//    public void setEstadoVendido(String estadoVendido) {
//        this.estadoVendido = estadoVendido;
    

    public List<String> getServicio() {
        return servicio;
    }

    public void setServicio(List<String> servicio) {
        this.servicio = servicio;
    }

    public boolean estaVendido(){
        if(estadoVendido.equalsIgnoreCase("ESTA VENDIDO")){
            return true;
        }else{ 
          return false; }
    }

     /**
     *Obtiene la urbanizacion de la etapa
     * @return la urbanizacion de la Etapa
     */
     public Urbanizacion getUrbanizacion() {
        return urbanizacion;
    }

     /**
     *Coloca el establecimiento de la habitacion
     * @param urbanizacion el establecimiento de la habitacion
     * 
     */
    public void setUrbanizacion(Urbanizacion urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    /**
     * Metodo llamado desde el constructor para generar codigos a las etapas ingresadas
     * @return Codigo entero aleatorio para las etapas creadas
     */
    private int obtieneCodigo(){
        Random r = new Random();
        return r.nextInt(1500);
    }

    public Object stream() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void AgregarLotes (Lotes lotes){
        lotes1.add (lotes);
    }
    public int consultarLotesporManzana(int manzana){
        
        for (Lotes l1 : lotes1) {
            if (l1.getManzana()==(manzana)) {
                return numero+=numero;
            }else{
                System.out.println("Numero de manzana Incorrecto");
            }
        }
        return 0;  
    }
   
    // metodo que devuelva el valor de los departamentos
    
    @Override
    public String toString() {
        return "................................Datos de Etapas................................" + "\n"+
               "codigo: " + codigo +"\n"+
               "NombreEtapa: " + NombreEtapa +"\n"+ 
               "EstadoVendido=" + estadoVendido +"\n"+
               "Manzana=" + manzana  +"\n"+
               "Numero de lotes por manzana: " + numero +"\n";
    }
      
    
}
