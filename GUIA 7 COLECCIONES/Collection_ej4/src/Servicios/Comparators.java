/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Diego
 */
public class Comparators {
    public static Comparator<Pelicula> duracionDescendente = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
        
    };
    public static Comparator<Pelicula> tituloAlfabetico = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }        
    };
    public static Comparator<Pelicula> directorAlfabetico = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
        return t.getDirector().compareTo(t1.getDirector());
        }
        
    };
    
}
