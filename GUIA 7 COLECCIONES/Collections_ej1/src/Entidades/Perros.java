/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Perros {
    private ArrayList<String> razas;

    public Perros() {
    }

    public Perros(ArrayList<String> razas) {
        this.razas = new ArrayList();
    }

    public ArrayList<String> getRazas() {
        return razas;
    }

    public void setRazas(ArrayList<String> razas) {
        this.razas = razas;
    }
    
    
}
