/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones_guia5;

import java.util.Scanner;

/**
 * 22. Realizar un algoritmo que rellene un vector de tamaño N con valores
 * aleatorios y le pida al usuario un numero a buscar en el vector. El programa
 * mostrará donde se encuentra el numero y si se encuentra repetido
 *
 * @author Diego
 */
public class Ej21_guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 20);
        }
        int m;
        do{
        System.out.println("Ingrese el número a buscar en el arreglo, entre 1 al 20");
        m = leer.nextInt();
        }while(m>20 || m<0);
        buscar (vector,n,m);
    }
    public static void buscar (int[] vector,int n, int m){
        for (int i = 0; i < n; i++) {
            if (vector[i]==m){
                System.out.println("El número fue encontrado en la posición " + i);
            }
            
        }
    }}
