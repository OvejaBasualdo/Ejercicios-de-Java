/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import guia5.serviciosPersona.servicioPersonas;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona[] p = new Persona[4];
//        Persona p = null;
        int mayor = 0;
        int menor = 0;
        int bajo = 0;
        int ideal = 0;
        int sobrepeso = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("----------------------------------------------");
            p[i] = servicioPersonas.crearPersona();
            System.out.println(servicioPersonas.calcularIMC(p[i].getPeso(),p[i].getAltura()));
            System.out.println("¿Es mayor de edad?:" + servicioPersonas.esMayorDeEdad(p[i].getEdad()));
            if (p[i].getEdad() > 18) {
                mayor++;
            } else {
                menor++;
            }
            switch (servicioPersonas.calcularIMC(p[i].getPeso(), p[i].getAltura())) {
                case -1:
                    bajo++;
                    break;
                case 0:
                    ideal++;
                    break;
                default:
                    sobrepeso++;
                    break;
            }
        }

        System.out.println("De este estudio vemos que:\n"
                + "MAYORES DE EDAD: " + mayor * 100 / 4 + "%\n"
                + "MENORES DE EDAD: " + menor * 100 / 4 + "%\n"
                + "---------------------------------\n"
                + "POR DEBAJO DEL PESO IDEAL: " + bajo * 100 / 4 + "%\n"
                + "EN EL PESO IDEAL: " + ideal * 100 / 4 + "%\n"
                + "EN SOBREPESO: " + sobrepeso * 100 / 4 + "%\n"
                + "GRACIAS POR VER ESTE ESTUDIO");
    }
//        try{
//        servicioPersonas.esMayorDeEdad(p.getEdad());
//    }catch(Exception e){
//            System.out.println("El objeto esta nulo");
//    }
    }

