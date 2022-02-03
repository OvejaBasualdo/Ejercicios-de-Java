/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras3;

import extras3_servicio.Raices_servicio;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Raices r = Raices_servicio.crearFuncion();
        Raices_servicio.calcular(r);
    }
    
}
