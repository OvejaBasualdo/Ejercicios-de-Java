/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej10_servicios;

/**
 *
 * @author Diego
 */
public class serviceArreglo {

    public static double crearArreglo() {
        return Math.random() * 10;
    }

    public static double[] ordenar(double[] a) {
        for (int i = 0; i < 50; i++) {
            double aux = 0;
            for (int j = i + 1; j < 50; j++) {
                if (a[i] > a[j]) {
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
        return a;
    }

    public static double[] llenar(double[] a, double[] b) {
        for (int i = 0; i < 20; i++) {
            if(i<=9){
            b[i]=a[i];
        }else{
                b[i]=0.5;
            }
    }
        return b;
    }
}
