/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8_3.entidades;

import java.util.ArrayList;

/**
 *
 * @author maylenhaagrosbaco
 */
public class Alumno {
    
    //Crear una clase llamada Alumno que mantenga información sobre las notas de distintos alumnos.
    //La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer con sus 3 notas.
    
    private String nombre;
    

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public void notaFinal(ArrayList notasArrayList, ArrayList alumnoArrayList, String nombreAlumno){
        
        for (int i = 0; i < alumnoArrayList.size(); i++) {
            
            if(nombreAlumno.equals(alumnoArrayList.get(i))){
                
                System.out.println("El alumno " + nombreAlumno + " tiene de nota final: " + notasArrayList.get(i));
                
            }
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
