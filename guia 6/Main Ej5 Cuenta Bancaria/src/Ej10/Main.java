/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej10;

import Ej10_servicios.serviceArreglo;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] a = new double  [50];
        double [] b = new double  [20];
        for (int i = 0; i < 50; i++) {
            a[i] = serviceArreglo.crearArreglo();
            System.out.println("["+a[i]+"]");
        }
        serviceArreglo.ordenar(a);
        serviceArreglo.llenar(a, b);
        System.out.println("-----------------------");
        for (int i = 0; i < 50; i++) {
            System.out.println("A["+i+"] = ["+a[i]+"]");
            if (i<20) {
                System.out.println("B["+i+"] = ["+b[i]+"]");
            }
            
        }
    }
    
}
