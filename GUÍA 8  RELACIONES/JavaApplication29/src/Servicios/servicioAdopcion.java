/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class servicioAdopcion {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static Perro crearPerro() {
        System.out.println("Ingrese el nombre del perro");
        String nombreP = leer.next();
        System.out.println("Ingrese la raza del perro");
        String raza = leer.next();
        System.out.println("Ingrese la edad del perro.");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese el tamaño del perro.");
        String tamanio = leer.next();
        return new Perro(nombreP, raza, edad, tamanio);
    }

    public static Persona crearPersona() {
        System.out.println("Ingrese el nombre");
        String nombreH = leer.next();
        System.out.println("Ingrese el apellido");
        String apellido = leer.next();
        System.out.println("Ingrese la edad");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese el dni");
        String dni = leer.next();
        return new Persona(nombreH,apellido,edad,dni);
    }
}
