/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui5.ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Gui5Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera c1 = new Cafetera();
        int opcion;
        do {
            System.out.println("Ingrese el modelo de la cafetera\n"
                    + "1- Nespresso A10 - 1000 ml\n"
                    + "2- Nespresso A15 - 1500 ml\n"
                    + "3- Nespresso A20 - 1700 ml\n"
                    + "4- Nespresso Premium - 2500 ml\n"
            );
            opcion = leer.nextInt();
        } while (opcion < 1 && opcion > 5);
        switch (opcion) {
            case 1:
                c1.setCapacidadMaxima(1000);
                break;
            case 2:
                c1.setCapacidadMaxima(1500);
                break;
            case 3:
                c1.setCapacidadMaxima(1700);
                break;
            case 4:
                c1.setCapacidadMaxima(2500);
                break;
        }
        c1.llenarCafetera();
        do {
            do {
                System.out.println("¿Que desea hacer?\n"
                        + "1- Servir una taza de cafe\n"
                        + "2- Vaciar Cafetera\n"
                        + "3- Agregar Café\n"
                        + "4- Salir\n"
                );
                opcion = leer.nextInt();
            } while (opcion < 1 && opcion > 5);
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la capacidad de la taza en ml");
                    c1.servirTaza(leer.nextInt());
                    break;
                case 2:
                    c1.vaciarCafetera();
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de café a agregar en ml");
                    c1.agregarCafe(leer.nextInt());
                    break;
                case 4:
                    System.out.println("Muchas gracias por utilizar nuestra cafetera. Esperamos que haya disfrutado del mejor CAFÉ.");
                    break;
            }
        } while (opcion > 0 && opcion <= 3);

    }
}
