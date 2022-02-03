/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Paises.Paises;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ServicioPaises {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static Paises crearPais() {
        System.out.println("Ingrese el nombre de un país.");
        String nombre = leer.next();
        nombre = nombre.toUpperCase();
        return new Paises(nombre);
    }
}
