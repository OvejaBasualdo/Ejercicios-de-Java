/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej9;

import Ej9.MathService.serviceMath;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica m1 = new Matematica();
        m1.setNum1(Math.random() * (20-(-10)) - 10);
        System.out.println(m1.getNum1());
        m1.setNum2(Math.random() * 20 - 10);
        System.out.println(m1.getNum2());
        System.out.println("El número mayor de los dos aleatorios es: " + serviceMath.devolverMayor(m1.getNum1(), m1.getNum2()));
        System.out.println("--------------------------------------------------");
        double n1 = Math.round(m1.getNum1());
        double n2 = Math.round(m1.getNum2());
        System.out.println("La POTENCIACIÓN de los números aleatorios será " + Math.max(n2, n1) + "^" + Math.min(n2, n1) +" = " + serviceMath.calcularPotencia(Math.max(n2, n1), Math.min(n2, n1)));
        System.out.println("--------------------------------------------------");
        System.out.println("La RAÍZ de los números aleatorios será " + Math.abs(Math.max(n2, n1)) + "√" + Math.abs(Math.min(n2, n1)) + " = " + serviceMath.calcularRaiz(Math.min(n2, n1), Math.max(n2, n1)));
                
    }

}
