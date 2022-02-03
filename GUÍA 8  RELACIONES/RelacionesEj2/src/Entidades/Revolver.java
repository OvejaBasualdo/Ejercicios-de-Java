/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Diego
 */
public class Revolver {

    private Integer posicionActual;
    private Integer posicionAgua;

    public Revolver() {
    }

    public Revolver(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver está en la posición " + posicionActual + ", y el diparo de Agua está en la posición " + posicionAgua + '.';
    }

    public void llenarRevolver() {
        posicionActual = (int) (Math.random() * (7 - 1) + 1);
        posicionAgua = (int) (Math.random() * (7 - 1) + 1);
    }

    public Boolean mojar() {
        return (posicionActual == posicionAgua);
    }

    public void siguienteChorro() {
        if(posicionActual>=6){
            posicionActual = 1;
        }else{
            posicionActual=posicionActual+1;
        }
    }

}
