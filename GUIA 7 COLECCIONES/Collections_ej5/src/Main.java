
import Paises.Paises;
import Servicios.ServicioPaises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

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
        HashSet<Paises> mundo = new HashSet();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opcion = "";
        do {
            mundo.add(ServicioPaises.crearPais());
            do {
                System.out.println("Desea cargar otra país? S/N");
                opcion = leer.next().toUpperCase();
            } while (!opcion.equals("S") && !opcion.equals("N"));
        } while (opcion.equals("S"));
        System.out.println("===================================");
        ArrayList<Paises> listaPais = new ArrayList(mundo);
        Collections.sort(listaPais);
        for (Paises aux : listaPais) {
            System.out.println(aux);
        }
        System.out.println("Indique el país a eliminar del conjunto");
        String buscar = leer.next().toUpperCase();
        Iterator<Paises> iterador = listaPais.iterator();
        while (iterador.hasNext()) {
            Paises next = iterador.next();//la variable tipo Paises "next" va a tomar el objeto Paises del iterador
            if (buscar.equals(next.getNombre())) {//comparo si el String buscar de la línea 43 es igual al atributo "nombre" del objeto que se tomo en "next"
                iterador.remove();
            }else{
                System.out.println("no entro");
            }
        }
        for (Paises aux : listaPais) {
            System.out.println(aux);
        }
    }

}
