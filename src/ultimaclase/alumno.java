/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimaclase;

import java.util.Objects;

/**
 *
 * @author Punto Digital
 */
public class alumno {

    int dni;
    String nombre;
    String apellido;
    int edad;

    public alumno(int dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    
    public boolean equals(alumno a) {
        if (this.nombre == a.nombre) {
            return true;

        }
        return false;
    }
}
