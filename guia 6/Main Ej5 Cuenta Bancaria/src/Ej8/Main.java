/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej8;

import Ej8_servicios.cadena_servicios;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena c1 = new Cadena();
        System.out.println("Ingrese la palabra o frase.");
        c1.setFrase(leer.next());
        c1.setLongitud(c1.getFrase().length());
        System.out.println("----------------------------------");
        System.out.println("La cantidad de vocales que tiene esta frase/palabra es de: " + cadena_servicios.mostrarVocales(c1));
        System.out.println(cadena_servicios.invertirFrase(c1));
        System.out.println("----------------------------------");
        System.out.println("Ingrese la letra a contabilizar las veces repetidas.");
        String repe = leer.next();
        System.out.println(repe + " se repite " + cadena_servicios.vecesRepetido(c1,repe) + " veces.");
        System.out.println("----------------------------------");
        System.out.println("Ingrese la frase para comparar longitud.");
        String frase2 = leer.next();
        System.out.println("¿La frases tienen la misma longitud? : " + cadena_servicios.compararFrase(c1, frase2));
        System.out.println("----------------------------------");
        System.out.println("Ingrese la frase a concatenar.");
        String frase3 = leer.next();
        System.out.println("LA FRASE RESULTANTE ES:\n"
                + cadena_servicios.unirFrases(c1, frase3));
        System.out.println("----------------------------------");
        System.out.println("Ingrese el caracter por el cual quiere reemplazar las letras A de la frase.");
        String cambio = leer.next();
        System.out.println("LA FRASE RESULTANTE ES:\n"
                + cadena_servicios.reemplazar(c1, cambio));
        System.out.println("----------------------------------");
        System.out.println("Ingrese el caracter que quiere saber si está en la frase.");
        String letra= leer.next();
        System.out.println("¿La frase contiene la letra " + letra + "? : " + cadena_servicios.contiene(c1, letra));
        
    }
    
}
