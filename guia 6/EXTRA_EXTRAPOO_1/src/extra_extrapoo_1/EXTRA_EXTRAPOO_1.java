/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_extrapoo_1;

import extra_extrapoo_1.entidades.Fraccion;
import extra_extrapoo_1.servicios.servicio_fraccion;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class EXTRA_EXTRAPOO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("BIENVENIDO A NUESTRO CALCULADOR DE FRACCIONES");
        Fraccion a1 = servicio_fraccion.crear();
        int opcion = 0;
        do{
        do {
            System.out.println("Indique lo que quiere realizar.\n"
                    + "1 - SUMA \n"
                    + "2 - RESTA \n"
                    + "3 - MULTIPLICACIÓN\n"
                    + "4 - DIVISIÓN \n"
                    + "5 - SALIR");
            opcion = leer.nextInt();
        } while (opcion < 0 || opcion > 5);
        switch (opcion) {
            case 1:
                servicio_fraccion.suma(a1);
                break;
            case 2:
                servicio_fraccion.resta(a1);
                break;
            case 3:
                servicio_fraccion.producto(a1);
                break;
            case 4:
                servicio_fraccion.division(a1);
                break;
        }
        }while (opcion != 5);
    }

}
