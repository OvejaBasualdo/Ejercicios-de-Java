/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver arma;

    static Scanner leer = new Scanner(System.in);

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver arma) {
        this.jugadores = new ArrayList();
        this.arma = arma;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getArma() {
        return arma;
    }

    public void setArma(Revolver arma) {
        this.arma = arma;
    }

    public void llenarJuego(ArrayList<Jugador> players, Revolver r) {
        jugadores = players;
        arma = r;
    }

    public void ronda() {
        Boolean salida = null;
        do {
            for (Jugador aux : jugadores) {
                System.out.println(arma.toString());
                System.out.println("El " + aux.getNombre() + " hará el disparo \n"
                        + "En breve se sabrá que pasará.");
                aux.disparo(arma);
                salida = aux.mojado;
                System.out.println(aux.toString());

                if (salida) {
                    System.out.println("ALGUIEN YA SE HA MOJADO, Y ES EL JUGADOR " + aux.getNombre());
                    break;
                }
            }
        } while (!salida);

    }
}
