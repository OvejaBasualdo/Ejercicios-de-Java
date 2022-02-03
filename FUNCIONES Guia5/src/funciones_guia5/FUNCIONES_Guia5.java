/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones_guia5;

/**
 * 21. Realizar un algoritmo que rellene un vector con los 100 primeros números
 * enteros y los muestre por pantalla en orden descendente.
 *
 * @author Diego
 */
public class FUNCIONES_Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
        }
        Print(vector);
    }

    public static int Print(int vector[]) {
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
        }
        return 0;

    }
}
