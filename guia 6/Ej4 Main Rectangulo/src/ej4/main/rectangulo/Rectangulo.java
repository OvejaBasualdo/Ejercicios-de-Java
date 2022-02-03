/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4.main.rectangulo;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores de base y altura");
        base = leer.nextInt();
        altura = leer.nextInt();
    }

    public int area() {
        int area = base * altura;
        return area;
    }

    public int perimetro() {
        int perimetro = base * 2 + altura * 2;
        return perimetro;
    }
    
    public void dibujo () {
        for (int i = 0; i < altura ; i++) {
            for (int j = 0; j < base; j++) {
                    System.out.print("*");
            }
            System.out.println("");
        }
}
}
