/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import Persona.Usuario;

/**
 *
 * @author Estudiante
 */
public class Administrador extends Usuario{

    // Constructor que extiende de Usuario
    public Administrador(String nombre, String correoElectronico, String contrasena, String rol) {
        super(nombre, correoElectronico, contrasena, rol);
    }
    
}
