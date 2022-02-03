
import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        ArrayList<Jugador> jugadores = new ArrayList();
        Juego j = new Juego();
        System.out.println("USTED ESTA POR JUGAR UNA RULETA RUSA DE AGUA.\n"
                + "Por favor, ingrese la cantidad de jugadores que participarán.");
        int cantidad = leer.nextInt();
        for (int i = 0; i < cantidad+1; i++) {
            Jugador a = new Jugador();
            a.setNombre("Jugador " + (i + 1));
            a.setId(i+1);
            a.setMojado(Boolean.FALSE);
            jugadores.add(a);
        }
        Revolver r = new Revolver();
        r.llenarRevolver();
        j.llenarJuego(jugadores, r);
        j.ronda();
    }

}
