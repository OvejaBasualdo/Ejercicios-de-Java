package ej2g9;

import ej2g9.entidades.Electrodomestico;
import ej2g9.entidades.Lavadora;
import ej2g9.entidades.Televisor;
import java.util.*;

public class Ej2G9 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Seleccione 1 para crear lavadora ");
        System.out.println("Seleccione 2 para crear televisor ");

        int choise = leer.nextInt();

        switch (choise) {
            case 1:
                Lavadora lav = new Lavadora();
                lav.crearLavadora();
                lav.precioFinal();
                System.out.println(lav.toString());
                break;
            case 2:
                Televisor tv = new Televisor();
                tv.crearTelevisor();
                tv.precioFinal();
                System.out.println(tv.toString());
                
                break;

        }

    }

}
