/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class DivisionNumero {
    private Integer N1;
    private Integer N2;

    public DivisionNumero() {
    }

    public DivisionNumero(Integer N1, Integer N2) {
        this.N1 = N1;
        this.N2 = N2;
    }

    public Integer getN1() {
        return N1;
    }

    public void setN1(Integer N1) {
        this.N1 = N1;
    }

    public Integer getN2() {
        return N2;
    }

    public void setN2(Integer N2) {
        this.N2 = N2;
    }
    
    
    public static void ingresarNumero() {

        DivisionNumero n = new DivisionNumero();

        Scanner leer = new Scanner(System.in);

        try {
            System.out.println("Ingrese el primer numero");
            String num1 = leer.next();
            System.out.println("Ingrese el segundo numero");
            String num2 = leer.next();
            n.setN1(parseInt(num1));
            n.setN2(parseInt(num2));
            
            n.dividirNumeros();
        } catch (InputMismatchException e) {
            System.out.println("Debe introducir un numero.");
            ingresarNumero();
        } catch (NumberFormatException e) {
            System.out.println("El caracter no coincide con el tipo de dato");
            ingresarNumero();

        } catch (ArithmeticException e){
            System.out.println("No se puede dividir por cero");
            ingresarNumero();
        }
        
        
    }

    private void dividirNumeros() {
        Integer resultado = N1/N2;
        System.out.println("El numero resultante de " + N1 + "/" + N2 + " = " + resultado);
        
    }

}
