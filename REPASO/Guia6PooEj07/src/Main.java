
import Entidad.Persona;
import Servicios.serviciosPersona;
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
        Persona[] p = new Persona[4];
        Integer mayor = 0;
        Integer menor = 0;
        Integer pesoOk = 0;
        Integer pesoBajo = 0;
        Integer pesoAlto = 0;
        for (int i = 0; i < 4; i++) {
            p[i] = serviciosPersona.crearPersona();
            switch (serviciosPersona.calcularIMC(p[i].getPeso(), p[i].getAltura())) {
                case 1:
                    pesoAlto++;
                    break;
                case 0:
                    pesoOk++;
                    break;
                case -1:
                    pesoBajo++;
                    break;
            }
            if (serviciosPersona.esMayorDeEdad(p[i].getEdad())) {
                mayor++;
            } else {
                menor++;
            }
        }
        System.out.println("El porcentaje de personas con peso bajo es de " + pesoBajo * 100 / 4 + "%");
        System.out.println("El porcentaje de personas con peso alto es de " + pesoAlto * 100 / 4 + "%");
        System.out.println("El porcentaje de personas con peso ideal es de " + pesoOk * 100 / 4 + "%");
        System.out.println("El porcentaje de personas mayores de edad es de " + mayor * 100 / 4 + "%");
        System.out.println("El porcentaje de personas menores de edad es de " + menor * 100 / 4 + "%");
    }

}
