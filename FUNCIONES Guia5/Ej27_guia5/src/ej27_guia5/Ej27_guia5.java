/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej27_guia5;

import java.util.Scanner;

/**
 * 27. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y
 * la matriz P de 3x3, se solicita escribir un programa en el cual se compruebe
 * si la matriz P está contenida dentro de la matriz M. Para ello se debe
 * verificar si entre todas las submatrices de 3x3 que se pueden formar en la
 * matriz M, desplazándose por filas o columnas, existe al menos una que
 * coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
 * columna de la matriz M en la cual empieza el primer elemento de la submatriz
 * P.
 *
 * @author Diego
 */
public class Ej27_guia5 {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] BigMatriz = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                BigMatriz[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + BigMatriz[i][j] + "]");
            }
            System.out.println("");
        }
        devolverVector(BigMatriz);

    }

    public static void devolverVector(int[][] BigMatriz) {
        int[][] matriz = new int[3][3];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un número para el elemento [" + i + "][" + j + "]");
                matriz[i][j] = leer.nextInt();
            }
        }
        int cont = 0;
        int fila = 0;
        int col = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                cont = 0;
                if (BigMatriz[i][j] == matriz[0][0]) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (BigMatriz[i + k][j + l] == matriz[k][l]) {
                                cont++;
                                if (cont == 9) {
                                    fila = i;
                                    col = j;
                                    i = j = 10;
                                }
                            }
                        }
                    }
                }
            }
        }
        String coord = "[" + fila + "]" + "[" + col + "]";
        System.out.println("las coordenadas de inicio de matriz son " + coord);
    }
}
