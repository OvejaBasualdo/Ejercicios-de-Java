/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_5;

import java.util.Scanner;

/**
 * 17. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
 * números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca
 * un 3 lo sustituya por una E. Ejemplo: 0-0-0 0-0-1 0-0-2 0-0-E 0-0-4 . . 0-1-2
 * 0-1-E Nota: investigar función equals() y como convertir números a String.
 *
 * @author Diego
 */
public class Ej17_guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    String letraI = String.valueOf(i);
                    String letraJ = String.valueOf(j);
                    String letraK = String.valueOf(k);
                    if (letraI.equals("3")){
                        letraI = "E";
                    }
                    if (letraJ.equals("3")) {
                        letraJ = "E";
                    }
                    if (letraK.equals("3")) {
                        letraK = "E";
                    }
                    System.out.println(letraI + "-" + letraJ + "-" + letraK);

                }
            }
        }

    }
}
