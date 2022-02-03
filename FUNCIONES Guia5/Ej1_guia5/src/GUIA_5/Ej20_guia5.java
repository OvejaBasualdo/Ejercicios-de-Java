/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_5;

import java.util.Scanner;

/**
 * 20. Crea una aplicación que a través de una función nos convierta una
 * cantidad de euros introducida por teclado a otra moneda, estas pueden ser a
 * dólares, yenes o libras. La función tendrá como parámetros, la cantidad de
 * euros y la moneda a converir que será una cadena, este no devolverá ningún
 * valor y mostrará un mensaje indicando el cambio (void). El cambio de divisas
 * es: 0.86 libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es un 1 €
 *
 * @author Diego
 */
public class Ej20_guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir.");
        double euro = leer.nextDouble();
        System.out.println("Ingrese a que moneda quiere cambiar: LIBRAS, DÓLARES O YENES");
        String moneda = leer.next();
        moneda = moneda.toUpperCase();
        while (!moneda.equals("LIBRAS") && !moneda.equals("DÓLARES") && !moneda.equals("YENES")) {
            System.out.println("ERROR DE TIPEO: Ingrese a que moneda quiere cambiar: LIBRAS, DÓLARES O YENES");
            moneda = leer.next();
            moneda = moneda.toUpperCase();
        }
        cambio (euro,moneda);
    }

    public static void cambio(double euro,String moneda){
        switch (moneda){
            case "YENES":
                System.out.println("El cambio es: " + euro + " Euros = " + euro*129.852 + " YENES");
                break;
            case "LIBRAS":
                System.out.println("El cambio es: " + euro + " Euros = " + euro* 0.86 + " LIBRAS");
                break;
            case "DÓLARES":
                System.out.println("El cambio es: " + euro + " Euros = " + euro*1.28611 + " DÓLARES");
                break;
        
        }
                
    }
}
