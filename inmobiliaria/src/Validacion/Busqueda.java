/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacion;

import Edificio.Casa;
import Edificio.Departamento;
import Edificio.Modelo;
import EntidadesInmobiliaria.Inmobiliaria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bllv1
 */
public class Busqueda {
      public static List<Modelo> busquedaPorNombre(String nombre) {
        List<Modelo> ti = new ArrayList<>();
        for (Modelo u :Inmobiliaria.modelos) {
            if (u instanceof Casa) {
                Casa c = (Casa) u;
                if (c.getNombre().equalsIgnoreCase(nombre)) {
                    ti.add(c);
                }
            }
            else if( u instanceof Departamento ){
                    Departamento d =(Departamento)u;
                    if(d.getNombre().equalsIgnoreCase(nombre)){
                        ti.add(d);
                }
            }
        }
        return ti;
    }
    
  
    
    public static List<Modelo> busquedaPorDepartamento(String nombre){
         List<Modelo> ti = new ArrayList<>();
        for (Modelo u :Inmobiliaria.modelos) {
            if (u instanceof Departamento) {
                Departamento d = (Departamento) u;
                if (d.getNombre().equalsIgnoreCase(nombre)) {
                    ti.add(d);
                }
            }
        }   return ti; 
    }
    public static List<Modelo> buscarCa(String detalle,int planta,int cuarto,int baño){
        List<Modelo> opciones = new ArrayList<>();
        for (Modelo m :Inmobiliaria.modelos) {
            if (m instanceof Casa) {
                Casa d = (Casa) m;
                if (d.getNombre().equalsIgnoreCase(detalle)) {                    
                    if (d.getNumeroPlantas() == planta || d.getNumeroCuarto()==cuarto || d.getNumeroBaños()== baño){
                        for(Modelo op: opciones){
                            if  (!(op.getNombre()).equals(d.getNombre()))
                                opciones.add(m);
                        }
                        
                    }
                    
                }    
            }
        }
        return opciones;
    }
    

     public static List<Modelo> buscarDe(String detalle,int cuarto,int baño){
        List<Modelo> opciones = new ArrayList<>();
         for (Modelo m :Inmobiliaria.modelos) {
            if (m instanceof Departamento) {
                Departamento d = (Departamento) m;
                if (d.getNombre().equalsIgnoreCase(detalle)) {                    
                    if ( d.getNumeroCuarto()==cuarto || d.getNumeroBaños()== baño){
                        for(Modelo op: opciones){
                            if  (!(op.getNombre()).equals(d.getNombre()))
                                opciones.add(m);
                        }
                        
                    }
                    
                }    
            }
        }
        return opciones;
    }
}
