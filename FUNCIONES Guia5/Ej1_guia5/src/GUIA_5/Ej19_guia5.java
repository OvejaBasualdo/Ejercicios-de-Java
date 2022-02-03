/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_5;

import java.util.Scanner;

/**
 * 19. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e
 * imprima el número ingresado seguido de tantos asteriscos como indique su
 * valor. Por ejemplo: 5 ***** 3 *** 11 *********** 2
 *
 **
 * @author Diego
 */
public class Ej19_guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor, ingrese 4 números para realizar la impresión de asteriscos \n"
                + "Recuerde que los números deben ser entre 1 y 20");
        for (int i = 0; i < 4; i++) {
            int num = leer.nextInt();
            while (num < 1 || num > 20) {
                System.out.println("ERROR!!! Por favor, ingrese 4 números para realizar la impresión de asteriscos \n"
                        + "Recuerde que los números deben ser entre 1 y 20");
                num = leer.nextInt();
            }
            System.out.print(num + " ");
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
