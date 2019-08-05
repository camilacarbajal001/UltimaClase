/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimaclase;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Punto Digital
 */
public class colegio {
  ArrayList<Curso> cursos;

    public colegio() {
    
    }

   int ObtenerCantidadAlumnos(string nombreCurso){
       int aux=0;
       for(curso i: cursos){
       aux= i.getNombreCurso().equals(nombreCurso)? i.getInscripcion().size():0;
       
       }
        return aux;
   
   
   
   }
   
   
  int EstudiantesAprobados(String nombrecurso){
      int contador=0;
    for(Curso i:cursos) {
    if(i.getNombreCurso().equals(nombrecurso)){
         
         for(Inscripcion j:i.getInscripcion ()){
             contador=(j.getNota()>=i.getnotaAprobacion())? contador+1 :contador+0;
         
         }
             }
    
    return contador;
    
    }
  
  
  
  } 
  
    
    
}
