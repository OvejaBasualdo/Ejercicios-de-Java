/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_5;

import java.util.Scanner;

/**
 *12. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 * @author Diego
 */
public class Ej12_guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la nota del examen");
        int nota = leer.nextInt();
        while (nota < 0 || nota>10){
            System.out.println("ERROR EN LA NOTA, ingrese nuevamente la nota del examen");
            nota = leer.nextInt();
        }
    }
    
}
