/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

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
        HashMap<String, Double> tienda = new HashMap();
        String opcion = "";
        String nombre;
        Double precio;
        do {
            System.out.println("Ingrese el nombre del producto del negocio");
            nombre = leer.next().toUpperCase();
            System.out.println("Ingrese el precio separado con ,");
            precio = leer.nextDouble();
            tienda.put(nombre, precio);
            do {
                System.out.println("Desea ingresar otro producto? S/N");
                opcion = leer.next();
                opcion = opcion.toUpperCase();
            } while (!opcion.equals("S") && !opcion.equals("N"));
        } while (opcion.equals("S"));
        for (Map.Entry<String, Double> aux : tienda.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            System.out.println("Nombre = " + key + " Precio = $" + value);
        }
        Iterator<Map.Entry<String,Double>> lista = tienda.entrySet().iterator();
        System.out.println("Que producto desea eliminar?");
        String prod_elim = leer.next().toUpperCase();
        while(lista.hasNext()){
            String producto_eliminar = lista.next().getKey();
            if(producto_eliminar.equalsIgnoreCase(prod_elim)){
                lista.remove();
            }
        }
        for (Map.Entry<String, Double> aux : tienda.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            System.out.println("Nombre = " + key + " Precio = $" + value);
        }
                
        
    }
}
