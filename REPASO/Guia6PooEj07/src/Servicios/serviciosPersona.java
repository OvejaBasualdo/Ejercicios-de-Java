/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class serviciosPersona {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese la edad");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese el sexo de la persona");
        Character sexo = leer.next().charAt(0);
        System.out.println("Ingrese el peso de la persona (en KG y separado con punto)");
        Double peso = leer.nextDouble();
        System.out.println("Ingrese la altura de la persona (en Mts y separado con punto)");
        Double altura = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public static Integer calcularIMC(Double peso, Double altura) {
        Double IMC = peso / Math.pow(altura, 2);
        if (IMC > 25) {
            return 1;
        } else if (IMC < 20) {
            return -1;
        } else {
            return 0;
        }

    }

    public static Boolean esMayorDeEdad(Integer edad) {
        Boolean mayor = (edad > 18) ? true : false;
        return mayor;
    }

}
