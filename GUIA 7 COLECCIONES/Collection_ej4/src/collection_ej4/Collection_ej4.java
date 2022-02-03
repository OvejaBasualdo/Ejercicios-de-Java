/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_ej4;

import Entidades.Pelicula;
import Servicios.Comparators;
import Servicios.MovieService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Collection_ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Pelicula> listado = new ArrayList();
        String opcion = "";
        do {
            listado.add(MovieService.crearPeli());
            do {
                System.out.println("Desea cargar otra película? S/N");
                opcion = leer.next().toUpperCase();
            } while (!opcion.equals("S") && !opcion.equals("N"));
        } while (opcion.equals("S"));
        MovieService.mostrarPeli(listado);
        System.out.println("===================================");
        MovieService.unaHoraOMas(listado);
        Collections.sort(listado, Comparators.duracionDescendente);
        System.out.println("===================================");
        for (Pelicula pelis : listado) {
            System.out.println(pelis);
        }
        System.out.println("===================================");
        Collections.sort(listado, Collections.reverseOrder(Comparators.duracionDescendente));
        for (Pelicula pelis : listado) {
            System.out.println(pelis);
        }
        System.out.println("===================================");
        Collections.sort(listado, Comparators.tituloAlfabetico);
        for (Pelicula pelis : listado) {
            System.out.println(pelis);
        }
        System.out.println("===================================");
        Collections.sort(listado, Comparators.directorAlfabetico);
        for (Pelicula pelis : listado) {
            System.out.println(pelis);
        }
    }

}
