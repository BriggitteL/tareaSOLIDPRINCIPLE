/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacion;

import EntidadesInmobiliaria.Etapa;
import EntidadesInmobiliaria.Inmobiliaria;
import EntidadesInmobiliaria.Lotes;
import EntidadesInmobiliaria.Urbanizacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bllv1
 */
public class ValidacionesInmobiliaria {
    public static List<Etapa> validaEtapaNombre(String nombre){
        List<Etapa> eta = new ArrayList<>();
        for ( Etapa e : Inmobiliaria.etapas){
            if(e.getNombreEtapa().equalsIgnoreCase(nombre)){
                eta.add(e);
            }
        
        }
        return eta;
    }
    
    public static List<Lotes> validaLoteCodigo(int codigo){
        List<Lotes> lot = new ArrayList<>();
        for ( Lotes l : Inmobiliaria.lotes){
            if(l.getCodigo()==codigo){
                lot.add(l);
            }
        }
        return lot;
    }
    
    public static List<Urbanizacion> validarUrba(String nombre){
        List<Urbanizacion> u = new ArrayList<>();
        for ( Urbanizacion ru : Inmobiliaria.urbanizaciones){
            if(ru.getNombreUrbanizacion().equalsIgnoreCase(nombre)){
                u.add(ru);
                
            }
        }
        return u;
    }
    
    public static void validaUrbani(String nombre){
        for(Urbanizacion ur: Inmobiliaria.urbanizaciones){
            if(ur.getNombreUrbanizacion().equalsIgnoreCase(nombre)){
                ur.mostrarDatosEtapa();
            } else{ System.out.println("No hay Urbanizaciones con ese Nombre");}
        }
    }
}
