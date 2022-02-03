/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14_guia5;

import java.util.Scanner;

/**
 * 14. Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú: MENU 1. Sumar 2. Restar 3.
 * Multiplicar 4. Dividir 5. Salir Elija opción: El usuario deberá elegir una
 * opción y el programa deberá mostrar el resultado por pantalla y luego volver
 * al menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener
 * en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
 * programa directamente, se debe mostrar el siguiente mensaje de confirmación:
 * ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
 * menú.
 *
 * @author Diego
 */
public class Ej14_guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos números para realizar las operaciones matemáticas");
        double num1 = leer.nextFloat();
        double num2 = leer.nextFloat();
        String salir = "N";
        int opcion = 0;
        do {
            do {
                if (opcion == 4 && num2 == 0) {
                    System.out.println("ERROR: INGRESO COMO DIVISOR EL NÚMERO 0. Ingrese nuevamente los números");
                    num1 = leer.nextInt();
                    num2 = leer.nextInt();
                    break;
                }
                System.out.println("Ingrese el número para la opción que quiere realizar\n"
                        + "MENU\n"
                        + "1. Sumar\n"
                        + "2. Restar\n"
                        + "3. Multiplicar\n"
                        + "4. Dividir\n"
                        + "5. Salir");
                opcion = leer.nextInt();
            } while (opcion == 4 && num2 == 0);
            double resultado = 0;
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println(num1 + "+" + num2 + "=" + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println(num1 + "-" + num2 + "=" + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println(num1 + "*" + num2 + "=" + resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println(num1 + "/" + num2 + "=" + resultado);
                    break;
                case 5:
                    do {
                        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                        salir = leer.next();
                        salir = salir.toUpperCase();
                    } while (!salir.equals("S") && !salir.equals("N"));
                    break;
            }
        } while (opcion != 5 || salir.equals("N"));
    }
}
