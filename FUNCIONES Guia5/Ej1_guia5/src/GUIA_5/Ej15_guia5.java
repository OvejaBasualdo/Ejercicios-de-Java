/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_5;

import java.util.Scanner;

/**
 * 15. Escriba un programa que lea 20 números. Si el número leído es igual a
 * cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero
 * cero". El programa deberá calcular y mostrar el resultado de la suma de los
 * números leídos, pero si el número es negativo no debe sumarse. Nota: recordar
 * el uso de la sentencia break.
 *
 * @author Diego
 */
public class Ej15_guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese números positivos para realizar la suma. El límite de números es de 20 \n"
                + "En caso de ingresar un 0, el programa detendra la suma");
        int num = leer.nextInt();
        int suma = 0;
        for (int i = 0; i < 20; i++) {
            if (num > 0) {
                suma = suma + num;
            }
            if (num < 0) {
                System.out.println("No se sumará este número por ser negativo.");
            } else if (num == 0) {
                System.out.println("Se capturó el numero cero.");
                break;
            } else if (i == 19) {
                break;
            }
            System.out.println("Ingrese otro número: \n"
                    + "El resultado provisorio es " + suma + "\n"
                    + "En caso de ingresar un 0, el programa detendra la suma");
            num = leer.nextInt();

        }
        System.out.println("EL RESULTADO FINAL ES " + suma);
    }
}
