/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimaclase;

import java.util.ArrayList;

/**
 *
 * @author Punto Digital
 */
public class curso {
  String nombreCurso;
  int cupo;
  float notaAprobacion;
  
  ArrayList<inscripcion> inscripciones;

    public curso(int cupo, float notaAprobacion) {
        this.cupo = cupo;
        this.notaAprobacion = notaAprobacion;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
            
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public float getNotaAprobacion() {
        return notaAprobacion;
    }

    public void setNotaAprobacion(float notaAprobacion) {
        this.notaAprobacion = notaAprobacion;
    }

    public ArrayList<inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(ArrayList<inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }

    Object getInscripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
 
    
    
}
