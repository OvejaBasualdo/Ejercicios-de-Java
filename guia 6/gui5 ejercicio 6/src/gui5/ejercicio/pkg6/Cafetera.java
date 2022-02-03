/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui5.ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Cafetera {

    private double capacidadMaxima;
    private double cantidadActual;

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    private final Scanner leer = new Scanner(System.in);

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int taza) {
        if (cantidadActual >= taza) {
            cantidadActual -=taza;
            System.out.println("TAZA COMPLETADA");
        } else {
            System.out.println("TAZA INCOMPLETA. CANTIDAD SERVIDA: " + (cantidadActual) + "ml");
            cantidadActual = 0;
        }
    }

    public void vaciarCafetera() {
        System.out.println("Se ha vaciado la cafetera.");
        cantidadActual = 0;
    }

    public void agregarCafe(int cafe) {
        while ((cantidadActual + cafe) > capacidadMaxima) {
            System.out.println("ERROR. La cantidad que va a ingresar superará la capacidad Máxima. Ingrese una cantidad menor a " + (capacidadMaxima - cantidadActual));
            cafe = leer.nextInt();
        }
        cantidadActual += cafe;
    }

}
