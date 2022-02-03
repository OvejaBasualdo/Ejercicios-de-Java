/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_5;

import java.util.Scanner;

/**
 * 18. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo
 * siguiente: * * * * * * * * @author Diego
 */
public class Ej18_guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor para realizar el cuadrado");
        int cuad = leer.nextInt();
        for (int i = 0; i < cuad; i++) {
            for (int j = 0; j < cuad; j++) {
                if (i == 0 || i == cuad - 1) {
                    System.out.print("*");
                } else if (j == 0 || j == cuad - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
