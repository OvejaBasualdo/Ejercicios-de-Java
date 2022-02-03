
import Entidades.Perro;
import Entidades.Persona;
import Servicios.servicioAdopcion;
import java.util.Scanner;

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
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona[] p1 = new Persona[2];
        Perro[] m1 = new Perro[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Vamos a cargar los datos del perro " + i);
            m1[i] = servicioAdopcion.crearPerro();
            System.out.println("Vamos a cargar los datos del adoptante " + i);
            p1[i] = servicioAdopcion.crearPersona();
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Las mascotas a adoptar son : ");
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + " - " + m1[i]);
            System.out.println("");
        }
        System.out.println(p1[0].getNombreH() + " " + p1[0].getApellido() + ", INGRESE EL NUMERO DEL PERRO A ADOPTAR");
        int opcion = leer.nextInt();
        while (opcion != 1 && opcion != 2) {
            System.out.println("ERROR! " + p1[0].getNombreH() + " " + p1[0].getApellido() + ", INGRESE EL NÚMERO DEL PERRO A ADOPTAR");
            opcion = leer.nextInt();
        }
        if (opcion == 1) {
            p1[0].setPerroAdoptado(m1[0]);
            p1[1].setPerroAdoptado(m1[1]);
        } else {
            p1[1].setPerroAdoptado(m1[0]);
            p1[0].setPerroAdoptado(m1[1]);
        }
        System.out.println(p1[0]);
        System.out.println(p1[1]);
    }

}
