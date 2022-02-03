/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones_guia5;

import java.util.Scanner;

/**
 *25. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
 * @author Diego
 */
public class Ej25_guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int[3][3];
        int conta=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un número para el elemento ["+i+"]["+j+"]");
             matriz[i][j]=leer.nextInt();
            }            
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] +"]");
             if(i!=j && matriz[i][j]== (-matriz[j][i])){
                 conta++;                 
             }
            }
             System.out.println("");  
        }
        if (conta==6){
            System.out.println("Es una matriz antisimétrica");
        }else{
            System.out.println("No es una matriz antisimétrica");
        }
    }
    
}
