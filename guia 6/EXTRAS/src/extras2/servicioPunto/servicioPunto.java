/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras2.servicioPunto;

import extras2.Puntos;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class servicioPunto {

    private static final Scanner leer = new Scanner(System.in);

    public static Puntos crearPuntos() {
        int x1, x2, y1, y2;
        System.out.println("Ingrese la coordenadas del Punto 1(x1,y1)");
        x1 = leer.nextInt();
        y1 = leer.nextInt();
        System.out.println("Ingrese la coordenadas del Punto 2(x2,y2)");
        x2 = leer.nextInt();
        y2 = leer.nextInt();
        return new Puntos(x1, y1, x2, y2);
    }

    public static double distanciaPuntos(Puntos p) {
        double distanciaX2 = Math.pow((p.getX2() - p.getX1()), 2);
        double distanciaY2 = Math.pow((p.getY2() - p.getY1()), 2);
        double distancias = distanciaX2+distanciaY2;
        double distancia = Math.pow(distancias, 0.5);
        return distancia;
    }

}
