/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivo;

import Edificio.Modelo;
import EntidadesInmobiliaria.Urbanizacion;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class CArcgivo {

     public static List<Modelo> modelos = new ArrayList<>();
     /**
     * Muestra las todos los modelos  por las Urbanizaciones
     *
     * @param urbanizacion urbanizacion
     */
    public static void agregarServicios(Urbanizacion urbanizacion) {
        String txtFile = "Datos/servicios.txt";
        BufferedReader br = null;
        String line = "";
        //Se define separador ","
        //String cvsSplitBy = ",";
        try {
            br = new BufferedReader(new FileReader(txtFile));
            while ((line = br.readLine()) != null) {
                //String[]linea=line.split(line);
                urbanizacion.getServicios().add(line);
//                for(Establecimiento e:Reservalo.establecimientos){
//                    e.getServicios().add(line);
//                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
