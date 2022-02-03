/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras2;

import extras2.servicioPunto.servicioPunto;

/**
 *
 * @author Diego
 */
public class EXTRA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puntos p = new Puntos();
        p = servicioPunto.crearPuntos();
        System.out.println("La distancia entre los puntos es " + servicioPunto.distanciaPuntos(p));
    }

}
