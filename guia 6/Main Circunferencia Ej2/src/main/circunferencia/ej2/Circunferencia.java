/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.circunferencia.ej2;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia.");
        radio = leer.nextDouble();

    }

    public double area() {
        double area;
        return area = PI * Math.pow(this.radio, 2);
    }
    
    public void perimetro (){
        double perimetro = 2 * PI * this.radio;
        System.out.println("El perímetro es: " + perimetro);
        
    }
}
