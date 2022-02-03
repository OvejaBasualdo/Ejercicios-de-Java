/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_extrapoo_1.servicios;

import extra_extrapoo_1.entidades.Fraccion;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class servicio_fraccion {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static Fraccion crear() {
        System.out.println("Ingrese el numerador y denominador de la primer fracción");
        int numerador_1 = leer.nextInt();
        int denominador_1 = leer.nextInt();
        System.out.println("Ingrese el numerador y denominador de la segunda fracción");
        int numerador_2 = leer.nextInt();
        int denominador_2 = leer.nextInt();
        return new Fraccion(numerador_1, denominador_1, numerador_2, denominador_2);
    }

    public static void suma(Fraccion f1) {
        int n1 = f1.getNumerador1();
        int n2 = f1.getNumerador2();
        int d1 = f1.getDenominador1();
        int d2 = f1.getDenominador2();
        int n3 = 0;
        int d3 = 0;
        if (d1 == d2) {
            n3 = n1 + n2;
            d3 = d2;
        } else {
            d3 = d1 * d2;
            n3 = (d2 * n1) + (d1 * n2);
        }

        System.out.println("A continuación haremos la suma de fracciones: \n"
                + n1 + "   " + n2 + "     " + n3 + "\n"
                + "-" + " + " + "-  =  - \n"
                + d1 + "   " + d2 + "     " + d3);
    }

    public static void resta (Fraccion f1) {
        int n1 = f1.getNumerador1();
        int n2 = f1.getNumerador2();
        int d1 = f1.getDenominador1();
        int d2 = f1.getDenominador2();
        int n3 = 0;
        int d3 = 0;
        if (d1 == d2) {
            n3 = n1 - n2;
            d3 = d2;
        } else {
            d3 = d1 * d2;
            n3 = (d2 * n1) - (d1 * n2);
        }

        System.out.println("A continuación haremos la suma de fracciones: \n"
                + n1 + "   " + n2 + "     " + n3 + "\n"
                + "-" + " - " + "-  =  - \n"
                + d1 + "   " + d2 + "     " + d3);
    }
    public static void producto(Fraccion f1) {
        int n1 = f1.getNumerador1();
        int n2 = f1.getNumerador2();
        int d1 = f1.getDenominador1();
        int d2 = f1.getDenominador2();
        int n3 = n1*n2;
        int d3 = d1*d2;
        

        System.out.println("A continuación haremos la suma de fracciones: \n"
                + n1 + "   " + n2 + "     " + n3 + "\n"
                + "-" + " x " + "-  =  - \n"
                + d1 + "   " + d2 + "     " + d3);
    }
    public static void division(Fraccion f1) {
        int n1 = f1.getNumerador1();
        int n2 = f1.getNumerador2();
        int d1 = f1.getDenominador1();
        int d2 = f1.getDenominador2();
        int n3 = n1*d2;
        int d3 = d1*n2;
        

        System.out.println("A continuación haremos la suma de fracciones: \n"
                + n1 + "   " + n2 + "     " + n3 + "\n"
                + "-" + " ÷ " + "-  =  - \n"
                + d1 + "   " + d2 + "     " + d3);
    }
}
