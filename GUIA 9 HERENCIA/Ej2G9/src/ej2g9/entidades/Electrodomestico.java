package ej2g9.entidades;

import ej2g9.enumeradores.Consumos;
import ej2g9.enumeradores.Colores;
import java.util.Arrays;
import java.util.Scanner;

public class Electrodomestico {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected Double precio;
    protected String color;
    protected char consElect;
    protected Double peso;

    public void crearElectrodomestico() {
        System.out.println("Ingrese el color: ");
        String colorin = leer.next();
        comprobarColor(colorin);
        System.out.println("Ingrese nivel de consumo enérgico, seleccione las siguientes opciones: ");
        System.out.println(Arrays.toString(Consumos.values()));
        char temp = leer.next().toUpperCase().charAt(0);
        comprobarConsumoEnergico(temp);
        System.out.println("Ingrese el peso: ");
        peso = leer.nextDouble();
        precio = 1000.00;

    }

    public void precioFinal() {
        switch (consElect) {
            case 'A':
                if (peso > 0 && peso < 20) {
                    precio = precio + 1100;
                } else if (peso > 19 && peso < 50) {
                    precio = precio + 1500;
                } else if (peso > 49 && peso < 80) {
                    precio = precio + 1800;
                } else if (peso > 79) {
                    precio = precio + 2000;
                }
                break;
            case 'B':
                if (peso > 0 && peso < 20) {
                    precio = precio + 900;
                } else if (peso > 19 && peso < 50) {
                    precio = precio + 1300;
                } else if (peso > 49 && peso < 80) {
                    precio = precio + 1600;
                } else if (peso > 79) {
                    precio = precio + 1800;
                }
                break;
            case 'C':
                if (peso > 0 && peso < 20) {
                    precio = precio + 700;
                } else if (peso > 19 && peso < 50) {
                    precio = precio + 1100;
                } else if (peso > 49 && peso < 80) {
                    precio = precio + 1400;
                } else if (peso > 79) {
                    precio = precio + 1600;
                }
                break;
            case 'D':
                if (peso > 0 && peso < 20) {
                    precio = precio + 600;
                } else if (peso > 19 && peso < 50) {
                    precio = precio + 1000;
                } else if (peso > 49 && peso < 80) {
                    precio = precio + 1300;
                } else if (peso > 79) {
                    precio = precio + 1500;
                }
                break;
            case 'E':
                if (peso > 0 && peso < 20) {
                    precio = precio + 400;
                } else if (peso > 19 && peso < 50) {
                    precio = precio + 800;
                } else if (peso > 49 && peso < 80) {
                    precio = precio + 1100;
                } else if (peso > 79) {
                    precio = precio + 1300;
                }
                break;
            case 'F':
                if (peso > 0 && peso < 20) {
                    precio = precio + 200;
                } else if (peso > 19 && peso < 50) {
                    precio = precio + 600;
                } else if (peso > 49 && peso < 80) {
                    precio = precio + 900;
                } else if (peso > 79) {
                    precio = precio + 1100;
                }
                break;
            default:
                throw new AssertionError();
        }

    }

    public void comprobarColor(String col) {
        for (Colores aux : Colores.values()) {

            if (col.equals(aux.toString())) {
                color = col;
                break;
            } else {
                color = Colores.BLANCO.toString();
            }
        }
    }

    public void comprobarConsumoEnergico(char c) {
        String ca = String.valueOf(c);

        for (Consumos aux : Consumos.values()) {

            if (ca.equals(aux.toString())) {
                consElect = ca.charAt(0);
                break;
            } else {
                consElect = 'F';
            }
        }

    }

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consElect, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consElect = consElect;
        this.peso = peso;
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
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consElect=" + consElect + ", peso=" + peso + '}';
    }

}
