/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import EntidadesInmobiliaria.Urbanizacion;
import Persona.Usuario;

/**
 *
 * @author Estudiante
 */
public class Vendedor extends Usuario{
private Urbanizacion urbanizacion;
    //Constructor qeu llama al constructor de la clase padre

    public Vendedor(Urbanizacion urbanizacion, String nombre, String correoElectronico, String contrasena, String rol) {
        super(nombre, correoElectronico, contrasena, rol);
        this.urbanizacion = urbanizacion;
    }

    public Urbanizacion getUrbanizacion() {
        return urbanizacion;
    }

    public void setUrbanizacion(Urbanizacion urbanizacion) {
        this.urbanizacion = urbanizacion;
    }
    
    
}
