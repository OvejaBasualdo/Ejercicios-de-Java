/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra6.servicio;

import extra6.Ahorcado;
import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class servicio_ahorcado {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra para el juego.");
        String pal_juego = leer.next();
        int palabra_long = pal_juego.length();
        String palabra[] = new String[palabra_long];
        String [] palabra_parcial = new String [palabra_long];
        System.out.println("Ingrese la cantidad de intentos para esta palabra");
        int jugadas_max = leer.nextInt();
        for (int i = 0; i < palabra.length; i++) {
            palabra[i] = pal_juego.substring(i, i + 1);
            palabra_parcial[i]="-";
        }
        return new Ahorcado(palabra, 0, jugadas_max,palabra_parcial);
    }
    
    
    
    public static int longitud(Ahorcado juego) {
        return Array.getLength(juego.getPalabra());
    }

    public static void buscar(String letra, Ahorcado juego) {
        String[] palabra = juego.getPalabra();
        boolean encontro = false;
        for (int i = 0; i < servicio_ahorcado.longitud(juego); i++) {
            if (palabra[i].equals(letra)) {
                encontro = true;
            }
        }
        if (encontro) {
            System.out.println("La letra se ha encontrado");
        } else {
            System.out.println("La letra no se ha encontrado");
        }
    }

    public static boolean encontrada(String letra, Ahorcado juego) {
        String[] palabra = juego.getPalabra();
        String [] palabra_parcial = juego.getPalabra_parcial();
        int cantidad = 0;
        int conta_guion = 0;
        int conta_ok = 0;
        boolean encontro = false;
        for (int i = 0; i < servicio_ahorcado.longitud(juego); i++) {
            if (palabra[i].equals(letra)) {
                cantidad++;
                Array.set(palabra_parcial, i, letra);
            }
            if (palabra_parcial[i].equals("-")){
                conta_guion++;
            }else{
                conta_ok++;
            }
            System.out.print(palabra_parcial[i]);
        }
        System.out.println("");
        juego.setEncontradas(cantidad);
        if (cantidad > 0) {
            encontro = true;
        }
        return encontro;
    }

    public static int intentos(Ahorcado juego, boolean encontro) {
        int intentos_restantes = 0;
        if (!encontro) {
            juego.setJugadas_max(juego.getJugadas_max() - 1);
            intentos_restantes = juego.getJugadas_max();
        }
        return intentos_restantes;
    }

    public static void juego() {
        Ahorcado juego = servicio_ahorcado.crearJuego();
        
        do {
            System.out.println("Ingrese la letra a buscar.");
            String letra = leer.next();
            servicio_ahorcado.buscar(letra, juego);
            boolean encontro = servicio_ahorcado.encontrada(letra, juego);
            if(!encontro){
                 servicio_ahorcado.intentos(juego, encontro);
            }
        } while (juego.getJugadas_max() > 0);
    }
}
