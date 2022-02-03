package ej2g9.entidades;

import java.util.Scanner;

public final class Lavadora extends Electrodomestico {

    private Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga, Double precio, String color, char consElect, Double peso) {
        super(precio, color, consElect, peso);
        this.carga = carga;
    }

    public void crearLavadora() {
        System.out.println("Ingrese datos de la nueva Lavadora: ");
        crearElectrodomestico();
        System.out.println("Ingrese capacidad de carga en KG: ");
        carga = leer.nextDouble();

    }
    
    
    public void precioFinalf()
    {
       
       precioFinal();
       
       if(carga> 30)
       {
           precio = precio + 500;
       }
           
    }
            

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsElect() {
        return consElect;
    }

    public void setConsElect(char consElect) {
        this.consElect = consElect;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "{" + "carga=" + carga + '}'+ "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consElect=" + consElect + ", peso=" + peso + '}';
    }

    
}
