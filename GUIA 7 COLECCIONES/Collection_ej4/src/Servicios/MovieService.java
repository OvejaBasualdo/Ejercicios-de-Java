/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class MovieService {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static Pelicula crearPeli(){
        System.out.println("Ingrese el título de la película.");
        String titulo = leer.next().toUpperCase();
        System.out.println("Ingrese el nombre del director de la película.");
        String director = leer.next().toUpperCase();
        System.out.println("Ingrese la duración de la película");
        Double duracion = leer.nextDouble();
        return new Pelicula(titulo,director,duracion);
    }
    
    public static void mostrarPeli (ArrayList<Pelicula> listado){
        for (Pelicula aux : listado) {
            System.out.println(aux);
        }
    }
    
    public static void unaHoraOMas (ArrayList<Pelicula> listado){
        System.out.println("LAS PELÍCULAS QUE DURAN MAS DE UNA HORA SON:");
        for (Pelicula aux : listado) {
            if(aux.getDuracion()>1){
                System.out.println(aux);
            }
        }
    }
}
