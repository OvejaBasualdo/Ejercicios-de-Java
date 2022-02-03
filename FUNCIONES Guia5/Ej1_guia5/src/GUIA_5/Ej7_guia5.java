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
public class Ej7_guia5 {

    /**
     * @param args the command line arguments
     * 7. Crear un programa que dado un numero determine si es par o impar.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese  un número, nosotros le diremos si es par o impar.");
        int num = leer.nextInt();
        if (num != 0 && num%2==0){
            System.out.println("El número " + num + " es de tipo PAR.");
        }else if (num !=0 && num%2==1){
            System.out.println("El número " + num + " es de tipo IMPAR.");
        }else {
            System.out.println("EL NÚMERO INGRESADO ES 0.");}
                
    }
    
}
