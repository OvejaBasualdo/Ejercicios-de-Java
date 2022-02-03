/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections_ej2;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> a1 = new ArrayList(); // hago una lista del tipo Alumno para guardar los alumnos y las notas allí
        String opcion;
        do {
            Alumno estudiante = new Alumno(); //hago un objeto tipo alumno para almacenar lo que cargue
            ArrayList<Integer> califica = new ArrayList(); // hago una lista del tipo Integer para guardar las notas 1,2 y 3
            System.out.println("Ingrese el nombre del alumno.");
            estudiante.setAlumno(leer.next()); // guardo el nombre del alumno en el atributo alumno(seteo)
            System.out.println("Ingrese la nota 1");
            califica.add(leer.nextInt()); // guardo cada una de las notas
            System.out.println("Ingrese la nota 2");
            califica.add(leer.nextInt());
            System.out.println("Ingrese la nota 3");
            califica.add(leer.nextInt());
            estudiante.setNota(califica); // seteo el atributo arraylist de notas con lo que guarde en califica
            a1.add(estudiante); //sumo este estudiante a la lista a1
            do {
                System.out.println("Desea ingresar otro alumno? S/N");
                opcion = leer.next();
                opcion = opcion.toUpperCase();
            } while (!opcion.equals("S") && !opcion.equals("N"));
        } while (opcion.equals("S"));
        for (Alumno aux : a1) { // con este for each recorro el listado para mostrar los alumnos
            System.out.println(aux);
        }
        System.out.println("Ingrese el nombre del alumno para calcular el promedio.");
        String nombre1 = leer.next();
        int i = 0;
        for (Alumno alumno : a1) { // con este for each, recorro los alumnos del arraylist
            if (alumno.getAlumno().equalsIgnoreCase(nombre1)) { //el if sirve para comparar el nombre a buscar con el del listado
                System.out.println("el promedio es " + alumno.notaFinal(a1, i)); //aqui llamo al método para calcular el promedio con parametros alumno e "i"
            }
            i++;
        }
    }
} // hacerlo  oon el arraylist, el error estaba en el objeto creado posteriormente
