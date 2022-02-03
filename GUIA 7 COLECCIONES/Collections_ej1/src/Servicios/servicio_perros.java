/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perros;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class servicio_perros {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static ArrayList<String> cargarRaza() {
        String opcion;
        ArrayList<String> raza = new ArrayList<String>();
        do {
            System.out.println("Ingresar una raza de perro");
            String laRaza = leer.next();
            raza.add(laRaza);
            System.out.println("Desea ingresar otra raza? S/N");
            opcion = leer.next();
            opcion = opcion.toUpperCase();
        } while (opcion.equals("S"));
        return raza;
    }

    public static void mostrarRaza(Perros p1) {
        int i = 1;
        for (String aux : p1.getRazas()) {
            System.out.println(i++ + " " + aux);
        }
        System.out.println("La cantidad de razas cargadas es " + p1.getRazas().size());
    }

    public static void removerRaza(Perros p1) {
        String opcion;
        do {
            System.out.println("Ingrese la raza a eliminar");
            String eliminar = leer.next();
            Iterator<String> lista = p1.getRazas().iterator();
            int band = 0;
            while (lista.hasNext()) {
                if (lista.next().equals(eliminar)) {
                    lista.remove();
                    band = 1;
                }
            }
            if (band == 1) {
                System.out.println("Raza eliminada");
            } else {
                System.out.println("No se eliminó la raza.");
            }
            int i = 1;
            for (String aux : p1.getRazas()) {
                System.out.println(i++ + " " + aux);
            }
            System.out.println("Desea eliminar otra raza? S/N");
            opcion = leer.next();
            opcion = opcion.toUpperCase();
        } while (opcion.equals("S"));

    }

}
