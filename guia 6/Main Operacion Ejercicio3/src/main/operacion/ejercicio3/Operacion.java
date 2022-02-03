/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.operacion.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        System.out.println("Ingrese 2 números");
        Scanner leer = new Scanner(System.in);
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
        System.out.println(suma(numero1, numero2));
        System.out.println(resta(numero1, numero2));
        System.out.println(multiplicar(numero1, numero2));
        System.out.println(dividir(numero1, numero2));
    }

    public int suma(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }

    public int resta(int numero1, int numero2) {
        int resta = numero1 - numero2;
        return resta;
    }

    public int multiplicar(int numero1, int numero2) {
        int multiplicar = numero1 * numero2;
        if (multiplicar == 0) {
            System.out.println("Error porque ingreso un número 0");
        }
        return multiplicar;

    }

    public double dividir(int numero1, int numero2) {
        if (numero2 == 0) {
            System.out.println("ERROR, Ingresó un divisor igual a 0. No se puede realizar la operación");
            return 0;
        } else {
            double dividir = (double) numero1 / (double) numero2;
            return dividir;
        }

    }

}
