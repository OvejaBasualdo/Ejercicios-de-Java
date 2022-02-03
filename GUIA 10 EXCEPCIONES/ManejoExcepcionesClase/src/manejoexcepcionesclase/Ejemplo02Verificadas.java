package manejoexcepcionesclase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejemplo02Verificadas {

    //CUANDO NO QUIERO HACER NADA, SOLO EL throws / PORQUE NO QUIERO TRATARLA ACA 
    // (Las verficadas JAVA me obliga a declarar)
    
    public static void main(String[] args)  { 
        try {
        // IOException es la clase madre de FileNotFoundException
            leerArchivo();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    //  OPCION A PARA LEER UN ARCHIVO TEXTO - Sin manejar la Excepción, solo lanzándola (con throws)
//    public static void leerArchivo() throws FileNotFoundException  {
//        // Borrar el throws y ver que pasa
//        File archivo = new File("C:\\Users\\gisele\\Desktop\\PROBANDO55555.txt");
//        Scanner leer = new Scanner(archivo);
//        leer.useDelimiter("\\Z"); // Z Lee todo el archivo , z lee hasta 1021 caracteres
//        System.out.println(leer.next());
//        System.out.println("FIN PROGRAMA");
//    }

    //  OPCION B - Trato de manejarla con una de las clases en el try & catch, sino puedo manejarla la lanzo
    public static void leerArchivo() throws IOException {
        
        try {
            
            // TODAS LAS INSTRUCCIONES QUE QUIERO QUE INTENTE REALIZAR
            File archivo = new File("C:\\Users\\gisele\\Desktop\\PROBANDO.txt");
            Scanner leer = new Scanner(archivo);
            leer.useDelimiter("\\Z"); // \Z Lee todo el archivo , \z lee hasta 1021 caracteres
            System.out.println(leer.next());
            
        } catch (FileNotFoundException y) { // Declaro la Clase a la que creo que podria pertenecer el error
            
            System.out.println("OUCH QUE CAGADA, NO ENCONTRE EL TXT");
            System.out.println(y.toString());
            
        }
    }
}
