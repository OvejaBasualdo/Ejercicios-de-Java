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
public class Ej2_guia5 {

    /*
     2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("A continuación, el nombre que escribió: " + nombre);    
                 }
    
}
