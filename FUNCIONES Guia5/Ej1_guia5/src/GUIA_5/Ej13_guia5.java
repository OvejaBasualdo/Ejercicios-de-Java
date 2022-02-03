/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_5;

import java.util.Scanner;

/**
 *13. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
 * @author Diego
 */
public class Ej13_guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un valor para la sumatoria");
        int sumatoria = leer.nextInt();
        int suma = 0;
        do{
            System.out.println("Ingrese un valor para sumar");
            int num = leer.nextInt();
            suma = suma + num;
        } while(suma < sumatoria);
    }
    
}
