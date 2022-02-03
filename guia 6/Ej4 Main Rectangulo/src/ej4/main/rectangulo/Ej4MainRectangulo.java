/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4.main.rectangulo;

/**
 *
 * @author Diego
 */
public class Ej4MainRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo R1 = new Rectangulo();
        R1.crearRectangulo();
        System.out.println("El área del rectángulo es "+R1.area());
        System.out.println("El perímetro del rectangulo es " +R1.perimetro());
        R1.dibujo();
    }
    
}
