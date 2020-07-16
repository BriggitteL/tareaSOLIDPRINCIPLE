/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesInmobiliaria;

/**
 *
 * @author Ronny Segura
 */
public class Casa extends Modelo{
    public String imagenRuta;

    
    /**
     * Construtor de la clase casa que recibe los siguientes parametros:
     *
     * @param imagenRuta
     * @param nombre nombre
     * @param numeroPlantas
     * @param numeroCuarto
     * @param cuartoServicio cuartoServicio
     * @param cocina si tiene cocina o no
     * @param precioCasa precioCasa
     * @param metConstruccion metConstruccion
     * @param numeroBaños cantidad de baños que posee la casa
     */
   

    public Casa(String imagenRuta, String nombre, int numeroPlantas, int numeroCuarto, String cocina, String cuartoServicio, int numeroBaños, double precioCasa, double metConstruccion, Urbanizacion urbanizacion) {
        super(nombre, numeroPlantas, numeroCuarto, cocina, cuartoServicio, numeroBaños, precioCasa, metConstruccion, urbanizacion);
        this.imagenRuta = imagenRuta;
    }

    
    
    public String getImagenRuta() {
        return imagenRuta;
    }

    public void setImagenRuta(String imagenRuta) {
        this.imagenRuta = imagenRuta;
    }

   
    
    
    
    
    
}
