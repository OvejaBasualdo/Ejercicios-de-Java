/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_5;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ej1_guia5 {

    /**
     * 1. Escribir un programa que pida dos números enteros por teclado y
     * calcule la suma de los dos. El programa deberá después mostrar el
     * resultado de la suma
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los números a sumar");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();

        int resultado = n1 + n2;
        System.out.println("El resultado de la suma es: " + n1 + "+" + n2 + "=" + resultado);

    }

}
