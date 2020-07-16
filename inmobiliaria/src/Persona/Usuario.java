/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author Ronny Segura
 */
public abstract class Usuario {
    protected String nombre;
    protected String correoElectronico;
    protected String contrasena;
    protected String rol;
    /**
     * Construtor de la clase Usuario que recibe los siguientes parametros:
     *
     * @param nombre nombre
     * @param correoElectronico correoElectronico
     * @param contrasena contrasena
     * @param rol
     */
    public Usuario(String nombre, String correoElectronico, String contrasena, String rol) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

        
    
    @Override
    public String toString() {
        return "................................Datos de Usuario................................" + "\n"+
               "Nombre: " + nombre + "\n"+
               "Correo Electronico: " + correoElectronico + "\n"+
               "Contrasena=" + contrasena  + "\n";
    }
    
    
}
