/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras3_servicio;

import extras3.Raices;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Raices_servicio {

    private static final Scanner leer = new Scanner(System.in);

    public static Raices crearFuncion() {
        System.out.println("Siendo una ecuación de segundo grado del tipo ax²+bx+c\n"
                + "Ingrese el valor del coeficiente a");
        double a = leer.nextDouble();
        System.out.println("Ingrese el valor del coeficiente b");
        double b = leer.nextDouble();
        System.out.println("Ingrese el valor del coeficiente c");
        double c = leer.nextDouble();
        return new Raices(a, b, c);
    }

    public static double discriminante(Raices r) {

        double a = r.getA(); //llamo desde el metodo discriminante al método crear funcion y 
        double b = r.getB();//asi tomo con GET los valores de los coeficientes
        double c = r.getC();
        double discri = Math.pow(b, 2) - (4 * a * c);
        return discri;
    }

    public static boolean tieneRaices(Raices r) {
        return (Raices_servicio.discriminante(r) > 0);
    }

    public static boolean tieneRaiz(Raices r) {
        return (Raices_servicio.discriminante(r) == 0);
    }
    //(-b±√((b^2)-(4*a*c)))/(2*a)
    // funcion para obtener raices

    public static void obtenerRaices(Raices r) {
        if (Raices_servicio.tieneRaices(r)) {
            double a = r.getA();
            double b = r.getB();
            double discriminante = Raices_servicio.discriminante(r);
            double r1 = (((-b) + Math.pow(discriminante, 0.5))) / 2 * a;//sqrt...no olvidar
            double r2 = (((-b) - Math.pow(discriminante, 0.5))) / 2 * a;
            System.out.println("Las 2 raíces son: " + r1 + " ; " + r2);
        }
    }

    public static void obtenerRaiz(Raices r) {
        if (Raices_servicio.tieneRaiz(r)) {
            double a = r.getA();
            double b = r.getB();
            double discriminante = Raices_servicio.discriminante(r);
            double r1 = ((-b) + Math.pow(discriminante, 0.5)) / 2 * a;
            System.out.println("La única raíz encontrada es : " + r1);
        }
    }

    public static void calcular(Raices r) {
        if (Raices_servicio.tieneRaices(r)) {
            Raices_servicio.obtenerRaices(r);
        } else if (Raices_servicio.tieneRaiz(r)) {
            Raices_servicio.obtenerRaiz(r);
        } else {
            System.out.println("Esta ecuación no tiene raíces reales.");
        }
    }
}
