/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacion;

import static Validacion.Validaciones.sc;

/**
 *
 * @author bllv1
 */
public class ValidacionesEdificio {
    
    public static String validaNombreModelo(String palabra) {
        palabra = palabra.toUpperCase();
        while (!(palabra.equals("CASA") | palabra.equals("DEPARTAMENTO"))) {
            System.out.println("Ingrese una opcion válida");
            palabra = sc.next();
            palabra = palabra.toUpperCase();

        }
        return palabra;
    } 
    
    public static String validarNombreCasa(String tipo){
        tipo = tipo.toUpperCase();
        while (!(tipo.equals("SIMPLE") | tipo.equals("DOBLE"))) {
            System.out.println("Ingrese una opcion válida");
            tipo = sc.next();
            tipo = tipo.toUpperCase();

        }
        return tipo;
    } 
    
    public static String validarNombreDepartamento(String tipo2){
        tipo2 = tipo2.toUpperCase();
        while (!(tipo2.equals("MIXTO") | tipo2.equals("RESIDENCIALES"))) {
            System.out.println("Ingrese una opcion válida");
            tipo2 = sc.next();
            tipo2 = tipo2.toUpperCase();

        }
        return tipo2;
    }
    
}
