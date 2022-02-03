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
public class Ej6_guia5 {

    /**
     * 6. Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese 2 números para compararlos");
        float n1 = leer.nextFloat();
        float n2 = leer.nextFloat();
        if (n1>n2){
            System.out.println("El número " + n1 + " es mayor a " + n2);
        }else if (n2>n1){
            System.out.println("El número " + n2 + " es mayor a " + n1);
        }else {
            System.out.println("Los números " + n1 + " y " + n2 + " son iguales");
        }
    }
    
}
