/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_5;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ej4_guia5 {

    /**
     4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la temperatura en grados centígrados");
        float grados = leer.nextFloat();
        float F = 32 + (9 * grados /5);
        System.out.println("La temperatura en grados Frenheit es :" + F);
    }
    
}
