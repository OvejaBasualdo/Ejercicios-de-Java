/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones_guia5;

import java.util.Scanner;

/**
 * 26. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al
 * 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 * @author Diego
 */
public class Ej26_guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] vector = new int[8];
        int fila = 0;
        int col = 0;
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un número (entre 1 y 9) para el elemento [" + i + "][" + j + "]");
                matriz[i][j] = leer.nextInt();
                while (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.println("ERROR, INGRESE EL ELEMENTO [" + i + "][" + j + "] NUEVAMENTE");
                    matriz[i][j] = leer.nextInt();
                }
                fila = fila + matriz[i][j];
                col = col + matriz[j][i];
                if (i == j) {
                    d1 = d1 + matriz[i][j];
                } else if (i + j == 3) {
                    d2 = d2 + matriz[i][j];
                }
            }
            vector[i] = fila;
            vector[i + 3] = col;
            fila = 0;
            col = 0;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        vector[6] = d1;
        vector[7] = d2;
        boolean t = true;
        for (int i = 1; i < 8; i++) {
            if (vector[0] != vector[i]) {
                t = false;
                break;
            }
        }
        if (t = true) {
            System.out.println("LA MATRIZ ES UN CUADRADO MÁGICO CUYA SUMA ES " + vector[0]);
        } else {
            System.out.println("LA MATRIZ NO ES UN CUADRADO MÁGICO");
        }
    }
}
