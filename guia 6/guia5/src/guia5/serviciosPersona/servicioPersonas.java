/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.serviciosPersona;

import guia5.Persona;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class servicioPersonas {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static Persona crearPersona() {

        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese edad de la persona");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo de la persona (H = HOMBRE , M = MUJER , O = OTRO)");
        String sexo = leer.next();
        sexo = sexo.toUpperCase();
        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
            System.out.println("ERROR! Ingrese el sexo de la persona (H = HOMBRE , M = MUJER , O = OTRO)");
            sexo = leer.next();
        }
        System.out.println("Ingrese peso de la persona (en Kg)");
        double peso = leer.nextDouble();

        System.out.println("Ingrese altura de la persona (en metros)");
        double altura = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public static int calcularIMC(double peso,double altura) {
        double IMC = peso/ Math.pow(altura, 2);
        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean esMayorDeEdad(int edad) {
        return edad > 18;
    }

}


