/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej8_servicios;

import Ej8.Cadena;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class cadena_servicios {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static int mostrarVocales(Cadena objeto) {
        int vocal = 0;
        for (int i = 0; i < objeto.getLongitud(); i++) {
            if (objeto.getFrase().substring(i, i + 1).toUpperCase().equals("A") || objeto.getFrase().substring(i, i + 1).toUpperCase().equals("E") || objeto.getFrase().substring(i, i + 1).toUpperCase().equals("I") || objeto.getFrase().substring(i, i + 1).toUpperCase().equals("O") || objeto.getFrase().substring(i, i + 1).toUpperCase().equals("U")) {
                vocal++;
            }
        }
        return vocal;
    }

    public static String invertirFrase(Cadena objeto) {
        String invertida = objeto.getFrase();
        for (int i = 0; i < objeto.getLongitud(); i++) {
            if (i == 0) {
                invertida = objeto.getFrase().substring(objeto.getLongitud() - 1 - i, objeto.getLongitud() - i);
            } else {
                invertida = invertida + objeto.getFrase().substring(objeto.getLongitud() - 1 - i, objeto.getLongitud() - i);
            }
        }
//         Otra forma de hacerlo es con la clase StringBuilder, que contiene el metodo reverse        
//        StringBuilder st = new StringBuilder();
//        st.append(objeto.getFrase()).reverse();
        return invertida;
    }

    public static int vecesRepetido(Cadena objeto, String repe) {
        if (repe.length() != 1) {
            System.out.println("ERROR! Ingrese un solo caracter.");
            repe = leer.next();
        }
        int repetido = 0;
        for (int i = 0; i < objeto.getLongitud(); i++) {
            if (repe.equals(objeto.getFrase().substring(i, i + 1))) {
                repetido++;
            }
        }
        return repetido;
    }

    public static boolean compararFrase(Cadena objeto, String frase) {
        return (objeto.getFrase().length() == frase.length());
    }

    public static String unirFrases(Cadena objeto, String frase) {
        String resultante;
        return resultante = objeto.getFrase() + frase;
    }

    public static String reemplazar(Cadena objeto, String letra) {
        String cambio = null;
        //verificar como hacerlo con el "replace"
        //System.out.println(cad1.getFrase().replace("a", letra));
        cambio = objeto.getFrase().replace("a", letra);
        return cambio;
    }

    public static boolean contiene(Cadena objeto, String letra) {
        boolean respuesta = false;
        for (int i = 0; i < objeto.getLongitud(); i++) {
            if (objeto.getFrase().substring(i, i + 1).equals(letra)) {
                respuesta = true;
                break;
            }
        }
        return respuesta;
    }

}
