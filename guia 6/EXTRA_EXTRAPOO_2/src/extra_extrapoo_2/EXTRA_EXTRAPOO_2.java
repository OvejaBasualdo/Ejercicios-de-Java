/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_extrapoo_2;

import extra_extrapoo_2.entidades.Tiempo;
import extra_extrapoo_2.servicios.servicio_tiempo;
import java.awt.AWTException;

/**
 *
 * @author Diego
 */
public class EXTRA_EXTRAPOO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException, InterruptedException {
        Tiempo t1 = servicio_tiempo.crearTiempo();
        servicio_tiempo.imprimirHoraCompleta(t1);
    }
    
}
