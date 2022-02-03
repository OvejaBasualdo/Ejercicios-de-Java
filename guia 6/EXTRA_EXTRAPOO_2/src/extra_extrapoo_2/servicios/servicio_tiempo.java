/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_extrapoo_2.servicios;

import extra_extrapoo_2.entidades.Tiempo;
import java.awt.AWTException;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class servicio_tiempo {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static Tiempo crearTiempo() {
        System.out.println("Para arrancar el reloj, ingrese el tiempo en horas, minutos y segundos.");
        int hora, minutos, segundos;
        do {
            System.out.println("Ingrese la hora");
            hora = leer.nextInt();
        } while (hora < 0 || hora > 23);
        do {
            System.out.println("Ingrese los minutos");
            minutos = leer.nextInt();
        } while (minutos < 0 || minutos > 59);
        do {
            System.out.println("Ingrese la segundos");
            segundos = leer.nextInt();
        } while (segundos < 0 || segundos > 59);
        return new Tiempo(hora, minutos, segundos);
    }

    public static void imprimirHoraCompleta(Tiempo t1) throws AWTException, InterruptedException {
        int hora, minutos, segundos;
        
        
        
        for (hora = t1.getHora(); hora < 24; hora++) {
            for (minutos = t1.getMinutos(); minutos < 60; minutos++) {

                for (segundos = t1.getSegundos(); segundos < 60; segundos++) {
                    System.out.println(hora + ":" + minutos + ":" + segundos);
                    Thread.sleep(1000);
                    servicio_Robot.limpiarpantalla();
                }
                if (segundos == 60) {
                    t1.setSegundos (0);
                    t1.setMinutos(t1.getMinutos() + 1);
                }
            }
            if (minutos == 60) {
                t1.setMinutos(0);
                t1.setHora(t1.getHora() + 1);
            }
        }
        if (hora == 24) {
            t1.setHora(0);
        }
    }

}
