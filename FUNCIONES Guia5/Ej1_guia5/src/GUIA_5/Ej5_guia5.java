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
public class Ej5_guia5 {

    /**
     *5. Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un número");
        float num = leer.nextFloat();
        System.out.println("El doble del valor ingresado es " + (num*2) );
        System.out.println("El triple del valor ingresado es " + (num*3) );
        System.out.println("La raíz cuadrada del valor ingresado es " + Math.sqrt(num) );                
    }
    
}
