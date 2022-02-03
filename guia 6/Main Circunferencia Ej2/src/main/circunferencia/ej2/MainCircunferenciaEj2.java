/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.circunferencia.ej2;

/**
 *
 * @author Diego
 */
public class MainCircunferenciaEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia C1 = new Circunferencia();
        C1.crearCircunferencia();
        System.out.println("El área de la circunferencia es : " + C1.area());
        C1.perimetro();
        
    }
    
}
