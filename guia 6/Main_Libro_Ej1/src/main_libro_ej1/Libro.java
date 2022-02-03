/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_libro_ej1;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Libro {

    public String isbn;
    public String titulo;
    public String autor;
    public String NumPag;

    public Libro(String isbn, String titulo, String autor, String NumPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.NumPag = NumPag;
    }

    public Libro() {
    }

    public void fabricarLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro L1 = new Libro();
        do {
            System.out.println("Ingrese el Título del libro");
            this.titulo = leer.next();
        } while (this.titulo.equals(""));
        do {
            System.out.println("Ingrese cantidad de páginas");
            this.NumPag = leer.next();
        } while (this.NumPag.equals(""));
        do{
        System.out.println("Ingrese el autor");
        this.autor = leer.next();
        }while(this.autor.equals(""));
        do{
        System.out.println("Ingrese el ISBN");
        this.isbn = leer.next();
        }while(this.isbn.equals(""));
    }

    public void mostrarLibro() {
        System.out.println("Título: " + this.titulo + "\n"
                + "Autor: " + this.autor + "\n"
                + "Número de Página: " + this.NumPag + "\n"
                + "ISBN: " + this.isbn);

    }
}
