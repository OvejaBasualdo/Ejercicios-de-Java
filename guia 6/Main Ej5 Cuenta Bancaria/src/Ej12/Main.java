/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej12;

import Ej12_servicios.servicioPersona;
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
        Scanner leer = new Scanner(System.in);
        Persona p1 = servicioPersona.crearPersona();
        System.out.println("A continuación calcularemos la edad.");
        System.out.println("Ud tiene " + servicioPersona.calcularEdad(p1) + " años");
        System.out.println("Ingrese la edad a comparar");
        int edad = leer.nextInt();
        System.out.println("Es menor que la edad de la persona? " + servicioPersona.menorQue(edad, servicioPersona.calcularEdad(p1)));
        servicioPersona.humano(p1);
//        System.out.println(p1);

    }

}
