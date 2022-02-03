/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej9.MathService;

/**
 *
 * @author Diego
 */
public class serviceMath {

    public static double devolverMayor(double n1, double n2) {
        return Math.max(n1, n2);
    }

    public static double calcularPotencia(double n1, double n2) {
        return Math.pow(n1, n2);
    }

    public static double calcularRaiz(double n1, double n2) {
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        if(n2==0){
            n2 = 0.1;
        }
        return Math.pow(n1, 1/n2);
    }
}
