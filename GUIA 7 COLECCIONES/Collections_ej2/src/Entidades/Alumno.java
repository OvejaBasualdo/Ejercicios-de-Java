/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Diego
 */
public class Alumno {

    private String alumno;

    private ArrayList<Integer> nota = new ArrayList();

    public Alumno() {
    }

    public Alumno(String alumno) {
        this.alumno = alumno;
    }

    public Alumno(ArrayList<Integer> nota) {
        this.nota = new ArrayList();
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "alumno = " + alumno + ", nota = " + nota + '}';
    }

    public Double notaFinal(ArrayList<Alumno> a1, int i) {
        Double suma = 0.00; //inicializo una variable donde suma va a guardarse
        System.out.println(a1);
        int j=0; // lo uso para recorrer cada nota del arreglo
        for (Integer test : a1.get(i).nota) { // con este for each, recorro el arreglo de las notas SOLAMENTE
            System.out.println(test);
            suma += test;
            j++;
        }
        Double promedio = suma / 3;
        return promedio;
    }

}
