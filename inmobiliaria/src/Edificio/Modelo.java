/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio;

//import javafx.scene.image.Image;

import EntidadesInmobiliaria.Urbanizacion;


/**
 *
 * @author Ronny Segura
 */
public class Modelo {
    protected String nombre;
    protected int numeroPlantas;
    protected int numeroCuarto;
    protected String cocina;
    protected String cuartoServicio;
    protected int numeroBaños;
    protected double precioCasa;
    protected double metConstruccion;
    protected Urbanizacion urbanizacion;
    //protected Image plano; 

    public Modelo(String nombre,int numeroPlantas, int numeroCuarto, String cocina, String cuartoServicio, int numeroBaños, double precioCasa, double metConstruccion, Urbanizacion urbanizacion) {
        this.nombre = nombre;
        this.numeroCuarto = numeroCuarto;
        this.cocina = cocina;
        this.cuartoServicio = cuartoServicio;
        this.numeroBaños = numeroBaños;
        this.precioCasa = precioCasa;
        this.metConstruccion = metConstruccion;
        this.numeroPlantas = numeroPlantas;
        this.urbanizacion=urbanizacion;
    }
//    public void presentarModelo(){
//            System.out.println("Nombre: "+this.nombre);
//            System.out.println("Numero de plantas: "+this.numeroPlantas);
//            System.out.println("Numero de cuartos: "+this.numeroCuarto);
//            System.out.println("Numero de baños: "+this.numeroBaños);
//    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPlantas() {
        return numeroPlantas;
    }

    public void setNumeroPlantas(int numeroPlantas) {
        this.numeroPlantas = numeroPlantas;
    }

    public int getNumeroCuarto() {
        return numeroCuarto;
    }

    public void setNumeroCuarto(int numeroCuarto) {
        this.numeroCuarto = numeroCuarto;
    }

    public String getCocina() {
        return cocina;
    }

    public void setCocina(String cocina) {
        this.cocina = cocina;
    }

    public String getCuartoServicio() {
        return cuartoServicio;
    }

    public void setCuartoServicio(String CuartoServicio) {
        this.cuartoServicio = CuartoServicio;
    }

    public int getNumeroBaños() {
        return numeroBaños;
    }

    public void setNumeroBaños(int numeroBaños) {
        this.numeroBaños = numeroBaños;
    }

    public double getPrecioCasa() {
        return precioCasa;
    }

    public void setPrecioCasa(double PrecioCasa) {
        this.precioCasa = PrecioCasa;
    }

    public double getMetConstruccion() {
        return metConstruccion;
    }

    public void setMetConstruccion(double metConstruccion) {
        this.metConstruccion = metConstruccion;
    }

    public Urbanizacion getUrbanizacion() {
        return urbanizacion;
    }

    public void setUrbanizacion(Urbanizacion urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    @Override
    public String toString() {
        return "................................Datos de Modelos................................" + "\n"+
               "Nombre: " + nombre +"\n"+
               "Numero de Planta: " + numeroPlantas + "\n"+
               "Numero de Cuartos: " + numeroCuarto + " cocina " + cocina + "\n"+
               "Tiene Cuarto de Servicio: " + cuartoServicio + "\n"+
               "Numero de Baños: " + numeroBaños + "\n"+
               "Precio de la Casa: " + precioCasa + "\n"+
               "Metros de Construccion: " + metConstruccion + "\n"+
               "Pertenece a la Urbanizacion: " + urbanizacion;
    }
    
    
 
    
}
