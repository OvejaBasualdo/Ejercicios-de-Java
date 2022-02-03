/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections_ej1;

import Entidades.Perros;
import Servicios.servicio_perros;

/**
 *
 * @author Diego
 */
public class Collections_ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perros prueba = new Perros();
        prueba.setRazas(servicio_perros.cargarRaza());
        servicio_perros.mostrarRaza(prueba);
        servicio_perros.removerRaza(prueba);
        servicio_perros.mostrarRaza(prueba);        
    }
    
}
