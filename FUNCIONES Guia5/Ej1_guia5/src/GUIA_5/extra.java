/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones_guia5;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] vectorSopa = new String[20][20];
        String[] palabra = new String[5];

        //LLENADO DE VECTOR 5 PALABRAS
        for (int i = 0; i < palabra.length; i++) {
            System.out.println("Ingrese palabras entre 3 y 5 caracteres");
            palabra[i] = leer.next();
            while (palabra[i].length() < 3 || palabra[i].length() > 5) {
                System.out.println("La palabra no tiene el tamaño necesario, ingrese nuevamente");
                palabra[i] = leer.next();
            }
        }

        // INTRODUCCION ALEATORIA DE ESE VECTOR EN EL VECTOR MAS GRANDE
        int x, y;
        boolean bandera = true;
        for (int i = 0; i < palabra.length; i++) {
            int tamanio = palabra[i].length();

            x = (int) (Math.random() * 20); //0 - 19
            y = (int) (Math.random() * (20 - tamanio)); //0 - 14 

            //CHEQUEO COLUMNAS Y FILAS VACIAS
            for (int j = 0; j < tamanio; j++) {
                if (vectorSopa[x][y + j] == null) {
                    bandera = true;
                } else {
                    bandera = false;
                    break;
                }
            }
            if (bandera) {
            for (int j = 0; j < tamanio; j++) {
                vectorSopa[x][y + j] = palabra[i].substring(j, j + 1).toUpperCase();
              }
            } else {
              i--;
            }
        }

        //LLENAMOS MATRIZ DE NUMEROS ALEATORIOS
        for (int i = 0; i < vectorSopa.length; i++) {
            for (int j = 0; j < vectorSopa.length; j++) {
                if (vectorSopa[i][j] == null) {
                    vectorSopa[i][j] = String.valueOf((int) (Math.random() * 10));
                }
            }
        }

        // IMPRESION FINAL 
        for (int i = 0; i < vectorSopa.length; i++) {
            for (int j = 0; j < vectorSopa.length; j++) {
                System.out.print(" " + vectorSopa[i][j] + " ");
            }
            System.out.println("");
        }
    }
}