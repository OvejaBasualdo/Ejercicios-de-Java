/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones_guia5;

import java.util.Scanner;

/**
 *23. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author Diego
 */
public class Ej23_guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector.");
        int n = leer.nextInt();
        int  [] vector = new int [n];
        String [] vectorL = new String[n];
        for (int i = 0; i < n; i++) {
            vector [i] = (int) (Math.random()*99999);
            //System.out.println(vector[i]);
        }
        System.out.println( buscar (vector,n));
    }
    public static String buscar (int [] vector, int n){
        String resultado = null;
        int c1 = 0;
        int  c2 = 0;
        int  c3 = 0;
        int  c4 = 0;
        int  c5 = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] > 0 && vector[i] <10 ){
                c1++;
            } else if (vector[i] >= 10 && vector[i] <100){
                c2++;
            } else if (vector[i] >= 100 && vector[i] <1000){
                c3++;
            } else if (vector[i] >= 1000 && vector[i] <10000){
                c4++;
            } else if (vector[i] >= 10000 && vector[i] <100000){
                c5++;
            }
            resultado = "La cantidad de números con 1 cifra es :" + c1 +"\n"
                    + "La cantidad de números con 2 cifra es :" + c2 +"\n"
                    + "La cantidad de números con 3 cifra es :" + c3 +"\n"
                    + "La cantidad de números con 4 cifra es :" + c4 +"\n"
                    + "La cantidad de números con 5 cifra es :" + c5 +"\n";
                      

        }
        return resultado;
    }
}
