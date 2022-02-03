/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ej5.cuenta.bancaria;

import java.util.Scanner;
import main.ej5.cuenta.bancaria.serviciosCuenta.servicioCuenta;

/**
 *
 * @author Diego
 */
public class MainEj5CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        operaciones op = new operaciones();
        servicioCuenta sc = new servicioCuenta();
        Cuenta c1 = servicioCuenta.crearCuenta();
        int opcion;
        do{
        do {
            System.out.println("Ingrese la opción que quiere realizar\n"
                    + "1-DEPÓSITO\n"
                    + "2-EXTRACCIÓN\n"
                    + "3-EXTRACCIÓN RÁPIDA\n"
                    + "4-CONSULTA DE SALDO\n"
                    + "5-CONSULTAR DATOS\n"
                    + "6-SALIR");
            opcion = leer.nextInt();
        } while (opcion < 1 || opcion > 6);
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el monto depositado o ingresado a su cuenta");
                double ingreso = leer.nextDouble();
                sc.ingresar(c1, ingreso);
                break;
            case 2:
                System.out.println("Ingrese el monto que desea extraer.");
                double retiro = leer.nextDouble();
                c1.retirar(retiro);
                break;
            case 3:
                System.out.println("Ingrese el monto que desea extraer (MÁXIMO PERMITIDO: 20% de su saldo)");
                double rapido = leer.nextDouble();
                c1.extraccionRapida(rapido);
                break;
            case 4:
                System.out.println("Su saldo actual es: $" + c1.getSaldoActual());
                break;
            case 5:
                c1.consultaDatos();
                break;
            case 6:
                System.out.println("MUCHAS GRACIAS POR UTILIZAR NUESTROS SERVICIOS");
                break;
                
        }
        }while(opcion >0 && opcion < 6);
    }

}
