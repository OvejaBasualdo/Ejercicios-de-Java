/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra6;

/**
 *
 * @author Diego
 */
public class Ahorcado {
    
    private String [] palabra;
    private int encontradas;
    private int jugadas_max;
    private String [] palabra_parcial;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int encontradas, int jugadas_max, String[] palabra_parcial) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.jugadas_max = jugadas_max;
        this.palabra_parcial = palabra_parcial;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra_parcial=" + palabra_parcial + '}';
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadas_max() {
        return jugadas_max;
    }

    public void setJugadas_max(int jugadas_max) {
        this.jugadas_max = jugadas_max;
    }

    public String[] getPalabra_parcial() {
        return palabra_parcial;
    }

    public void setPalabra_parcial(String[] palabra_parcial) {
        this.palabra_parcial = palabra_parcial;
    }
    
}
