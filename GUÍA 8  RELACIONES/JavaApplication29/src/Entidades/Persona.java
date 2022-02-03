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
public class Persona {
    String nombreH;
    String apellido;
    Integer edad;
    String dni;
    Perro perroAdoptado;

    public Persona() {
    }

    public Persona(String nombreH, String apellido, Integer edad, String dni, Perro perroAdoptado) {
        this.nombreH = nombreH;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perroAdoptado = perroAdoptado;
    }

    public Persona(String nombreH, String apellido, Integer edad, String dni) {
        this.nombreH = nombreH;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombreH() {
        return nombreH;
    }

    public void setNombreH(String nombreH) {
        this.nombreH = nombreH;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Perro getPerroAdoptado() {
        return perroAdoptado;
    }

    public void setPerroAdoptado(Perro perroAdoptado) {
        this.perroAdoptado = perroAdoptado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombreH=" + nombreH + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", perroAdoptado=" + perroAdoptado + '}';
    }
    
}
