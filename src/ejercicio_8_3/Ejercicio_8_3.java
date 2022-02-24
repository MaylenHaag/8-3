/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8_3;

import ejercicio_8_3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author maylenhaagrosbaco
 */
public class Ejercicio_8_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear una clase llamada Alumno que mantenga información sobre las notas de distintos alumnos.
        La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer con sus 3 notas.
        En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno
        y se le pregunta al usuario si quiere crear otro Alumno o no.
        Después de ese bluce tendremos el siguiente método en la clase Alumno:
        Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo busca en la lista de Alumnos. Si está en la lista,
        se llama al método. Dentro del método se usará la lista notas para calcular el promedio final de alumno. 
        Siendo este promedio final, devuelto por el método y mostrado en el main.
         */
        
        Scanner leer = new Scanner(System.in);

        //En el main deberemos tener un bucle que crea un objeto Alumno.
        int aux = 0;
        
        ArrayList<Integer> notasArrayList = new ArrayList();
        ArrayList<String> alumnoArrayList = new ArrayList();
        
        Alumno Alumno = new Alumno();
        
        do {

            //Se pide toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
            System.out.println("");
            System.out.println("Ingrese el nombre del alumno");
            
            Alumno.setNombre(leer.next());
            
            alumnoArrayList.add(Alumno.getNombre());
            
            System.out.println("");
            
            System.out.println("Ingrese la nota 1");
            int nota1 = leer.nextInt();
            System.out.println("");
            
            System.out.println("Ingrese la nota 2");
            int nota2 = leer.nextInt();
            System.out.println("");
            
            System.out.println("Ingrese la nota 3");
            int nota3 = leer.nextInt();
            
            notasArrayList.add((nota1 + nota2 + nota3) / 3);
            
            System.out.println("");
            System.out.println("Desea crear otro alumno? Ingrese s (si) o n (no)");
            String resp = leer.next();
            
            if (resp.equals("s")) {
                
                aux = 1;
                
            } else if (resp.equals("n")) {
                
                aux = 0;
                
            }
            
        } while (aux == 1);

        //Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo busca en la lista de Alumnos. Si está en la lista,
        //se llama al método. Dentro del método se usará la lista notas para calcular el promedio final de alumno. 
        //Siendo este promedio final, devuelto por el método y mostrado en el main.
        System.out.println("Ingrese el nombre del alumno que desea saber su nota final");
        String nombreAlumno = leer.next();
        
        Iterator<String> it = alumnoArrayList.iterator();
        
        while (it.hasNext()) {
            
            if (it.next().equals(nombreAlumno)) {                
                
                Alumno.notaFinal(notasArrayList, alumnoArrayList, nombreAlumno);
                
            }
            
        }
        
    }
    
}
