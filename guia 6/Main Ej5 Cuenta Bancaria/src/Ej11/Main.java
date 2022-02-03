/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Date fechaActual = new Date();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        int mes, dia;
        do {
            System.out.println("Ingrese el mes");
            mes = leer.nextInt();
        } while (mes < 1 || mes > 12);
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            do {
                System.out.println("Ingrese el dia");
                dia = leer.nextInt();
            } while (dia < 1 || dia > 31);
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            do {
                System.out.println("Ingrese el día");
                dia = leer.nextInt();
            } while (dia < 1 || dia > 30);
        } else if (mes == 2 && anio % 4 == 0) {
            do {
                System.out.println("Ingrese el día");
                dia = leer.nextInt();
            } while (dia < 1 || dia > 29);
        } else {
            do {
                System.out.println("Ingrese el día");
                dia = leer.nextInt();
            } while (dia < 1 || dia > 28);
        }

        Date fechaUser = new Date(anio - 1900, mes - 1, dia);
        long fUser = fechaUser.getTime();
        long fActual = fechaActual.getTime();
        long diferencia = fActual - fUser;
        System.out.println("La fecha ingresada es :" + fechaUser + "\n"
                + "La fecha actual es :" + fechaActual + "\n"
                + "La diferencia entre las fechas es: " + (diferencia / 1000 / 60 / 60 / 24 / 365) + " años.");
    // este calculo es para pasar el long a años , * 1000 porque hay esa cantidad en un segundo, * 60 = cant.seg en un minuto,
    // * 60 = cant.min en una hora , * 24 = cant.hs en un dia, *365 = cant de días en un año

    }

}
