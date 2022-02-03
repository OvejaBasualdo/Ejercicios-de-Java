/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ej5.cuenta.bancaria;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class operaciones {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n"); //al colocar "final", hago que leer sera una constante del tipo Scanner

    // creo el objeto a través de esta funcion
    public Cuenta crearCuenta() {

        System.out.println("Ingrese el número de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese su saldo actual");
        double saldoActual = leer.nextDouble();

        return new Cuenta(numeroCuenta, dniCliente, saldoActual);
    }

    //con esta función agrego el monto al saldo actual
    public double ingresa(double saldo, double ingreso) {
        saldo+=ingreso;
        return saldo;
    }

    //con esta función quito el monto al saldo actual
    public double retira(double saldo, double retiro) {
        if (saldo < retiro) {
            saldo = 0;
        } else {
            saldo -= retiro;
        }
        return saldo;
    }

    public double rapida(double saldo, double retiro) {
        while (retiro > (saldo * .2)) {
            System.out.println("ERROR. Ingrese el monto que desea extraer (MÁXIMO PERMITIDO: 20% de su saldo)");
            retiro = leer.nextDouble();
        }
        saldo -= retiro;
        return saldo;
    }
    
}
