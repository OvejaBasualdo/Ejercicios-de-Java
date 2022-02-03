/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej12_servicios;

import Ej12.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class servicioPersona {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static Persona crearPersona() {
        System.out.println("¿Cuál es su nombre?");
        String nombre = leer.next();
        System.out.println("Ingrese el año de nacimiento");
        int anio = leer.nextInt();
        int mes, dia;
        do {
            System.out.println("Ingrese el mes de nacimiento");
            mes = leer.nextInt();
        } while (mes < 1 || mes > 12);
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            do {
                System.out.println("Ingrese el dia de nacimiento");
                dia = leer.nextInt();
            } while (dia < 1 || dia > 31);
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            do {
                System.out.println("Ingrese el día de nacimiento");
                dia = leer.nextInt();
            } while (dia < 1 || dia > 30);
        } else if (mes == 2 && anio % 4 == 0) {
            do {
                System.out.println("Ingrese el día de nacimiento");
                dia = leer.nextInt();
            } while (dia < 1 || dia > 29);
        } else {
            do {
                System.out.println("Ingrese el día de nacimiento");
                dia = leer.nextInt();
            } while (dia < 1 || dia > 28);
        }
        Date fechaNac = new Date(anio - 1900, mes - 1, dia);
        return new Persona(nombre, fechaNac);
    }

    public static int calcularEdad(Persona p1) {
        long fechaNacimiento = p1.getFechaNac().getTime();
        Date fechaActual = new Date();
        long fechaHoy = fechaActual.getTime();
        long edad = fechaHoy - fechaNacimiento;
        double Edad1 = edad / 1000 / 60 / 60 / 24 / 365;
        int Edad = (int) Edad1;
        return Edad;
    }

    public static boolean menorQue(int edad, int edadP1) {
        return (edad < edadP1);
    }

    public static void humano(Persona p1) {
        System.out.println("Nombre: " + p1.getNombre() + "\n"
                + "Fecha de Nacimiento: " + p1.getFechaNac());
    }
}
