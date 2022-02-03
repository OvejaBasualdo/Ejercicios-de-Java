/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ej5.cuenta.bancaria.serviciosCuenta;

import java.util.Scanner;
import main.ej5.cuenta.bancaria.Cuenta;

/**
 *
 * @author Diego
 */
public class servicioCuenta {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\n"); //al colocar "final", hago que leer sera una constante del tipo Scanner

    //al colocar STATIC, el método crearCuenta puede utilizarse sin realizar la creación de servicioCuenta sc = new servicioCuenta();
    public static Cuenta crearCuenta() {

        System.out.println("Ingrese el número de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese su saldo actual");
        double saldoActual = leer.nextDouble();

        return new Cuenta(numeroCuenta, dniCliente, saldoActual);
    }

    public void ingresar(Cuenta c1, double ingreso) {
        c1.setSaldoActual(c1.getSaldoActual() + ingreso);
        System.out.println("DEPÓSITO REALIZADO");
    }
}
