/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesInmobiliaria;

import java.util.Random;

/**
 *
 * @author Ronny Segura
 */
public class Lotes {
   
     double tamano;
     int codigo;
     int manzana;

    public Lotes(double tamano, int manzana) {
        this.tamano = tamano;
        this.codigo = obtieneCodigo();
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getManzana() {
        return manzana;
    }

    public void setManzana(int manzana) {
        this.manzana = manzana;
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

    @Override
    public String toString() {
        return "................................Datos de Etapas................................" + "\n"+
               "Codigo=" + codigo + "\n"+
               "Tamaño del lote: " + tamano +"\n";
    }
    
    
}
