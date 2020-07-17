/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacion;

import EntidadesInmobiliaria.Inmobiliaria;
import Persona.Usuario;
import static Validacion.Validaciones.sc;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bllv1
 */
public class ValidarPersona {
     public static List<Usuario> validarNombreUsuario(String nombreUsuario) {
        nombreUsuario = nombreUsuario.toUpperCase();
        List<Usuario> lu = new ArrayList<>();
        boolean opcion = false;
        do {
            nombreUsuario = nombreUsuario.toUpperCase();
            for (Usuario us : Inmobiliaria.usuarios) {
                if (us.getNombre().equals(nombreUsuario)) {
                    lu.add(us);
                }
            }
            if (lu.isEmpty()) {
                System.out.println("Usted mo esta registrado en el sistenma");
                System.out.println("Ingrese un usuario valido");
                nombreUsuario = sc.nextLine();
            } else {
                opcion = true;
                return lu;
            }

        } while (opcion == false);

        return null;
    }
    public static Usuario validarContrasenaUsuario(List<Usuario> lu, String contrasena) {
        boolean opcion = false;
        do {
            for (Usuario u : lu) {
                if (u.getContrasena().equals(contrasena)) {
                    opcion = true;
                    return u;
                } else {
                    System.out.println("Contrasena incorrecta!\nIngrese otra vez su contraseña: ");
                    contrasena = sc.nextLine();
                }
            }
        } while (opcion == false);

        return null;
    }
    
    public static Usuario pedirleInformacionUsuario() {
        System.out.println("Ingrese su nombre: ");
        String nombreUsuario = sc.nextLine();
        List<Usuario> lu = validarNombreUsuario(nombreUsuario);
        System.out.println("Ingrese su contrasena: ");
        String contrasena = sc.nextLine();
        Usuario u = validarContrasenaUsuario(lu, contrasena);
        return u;
    }
}
