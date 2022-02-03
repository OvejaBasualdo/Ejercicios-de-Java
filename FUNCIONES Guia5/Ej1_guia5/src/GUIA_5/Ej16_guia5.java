/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_5;

import java.util.Scanner;

/**
 * 16. Realizar un programa que simule el funcionamiento de un dispositivo
 * RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
 * cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5
 * caracteres de largo, el primer carácter tiene que ser X y el último tiene que
 * ser una O. Las secuencias leídas que respeten el formato se consideran
 * correctas, la secuencia especial “&&&&&” marca el final de los envíos
 * (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato
 * se considera incorrecta. Al finalizar el proceso, se imprime un informe
 * indicando la cantidad de lecturas correctas e incorrectas recibidas. Para
 * resolver el ejercicio deberá investigar cómo se utilizan las siguientes
 * funciones de Java Substring(), Length(), equals().
 *
 * @author Diego
 */
public class Ej16_guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cadena de caracteres que comience con X y termine con O\n"
                + "En caso que quiera finalizar los envíos, ingrese &&&&&");
        String frase = null;
        int positivo = 0;
        int negativo = 0;
        do {
            frase = leer.nextLine();
            while(frase.length()>5){
                System.out.println("ERROR EN LA CANTIDAD DE CARACTERES, Ingrese nuevamente");
                frase = leer.nextLine();
            }
            frase = frase.toUpperCase();
            if (frase.length() == 5 && frase.substring(0, 1).equals("X") && frase.substring(4, 5).equals("O")) {
                System.out.println("CORRECTO \n"
                        + "Ingrese otra frase");
                positivo++;
            } else {
                System.out.println("INCORRECTO \n"
                        + "Ingrese otra frase");
                negativo++;
            }
        } while (!frase.equals("&&&&&"));
        negativo = negativo - 1;
        System.out.println("Usted ha salido del programa\n"
                + "Ingresos positivos : " + positivo + "\n"
                + "Ingresos negativos : " + negativo);
    }
}
