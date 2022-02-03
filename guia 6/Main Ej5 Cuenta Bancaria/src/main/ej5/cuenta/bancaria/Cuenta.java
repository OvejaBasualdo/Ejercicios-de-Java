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
public class Cuenta {

    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;
    private double interes;

//    public Cuenta() {
//    }

    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n"); //al colocar "final", hago que leer sera una constante del tipo Scanner
    private final operaciones op = new operaciones();
    //con esta función agrego el monto al saldo actual

    public void ingresar(double ingreso) {
        this.saldoActual = op.ingresa(saldoActual, ingreso);
        System.out.println("DEPÓSITO REALIZADO");
    }

    //con esta función quito el monto al saldo actual
    public void retirar(double retiro) {
        this.saldoActual=op.retira(saldoActual, retiro);
        System.out.println("EXTRACCIÓN REALIZADA");
    }

    //con esta función se hace una extracción rapida al monto al saldo actual
    public void extraccionRapida(double rapido) {
        this.saldoActual=op.rapida(saldoActual, rapido);
        System.out.println("EXTRACCIÓN REALIZADA");
    }

    //se consulta los datos
//    public void consultaDatos(){
//        
//    }
    public void consultaDatos() {
        System.out.println("LOS DATOS DE SU CUENTA SON:\n"
                + "NumeroCuenta= " + numeroCuenta + "\n"
                + "DNI Cliente= " + dniCliente + "\n"
                + "Saldo Actual= $" + saldoActual + "\n");

    }

}
