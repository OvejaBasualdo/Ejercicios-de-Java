package manejoexcepcionesclase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo03NoVerificadas {

    // Ejemplos con clase que captura excepciones PROPIA!
    public static void main(String[] args) {
        crearPersona();
    }

    // Metodo para crear personas
    public static void crearPersona() {
        
        try {

            ingresarDatos();

        } catch (ExcepcionPropia | InputMismatchException ex) { // Recordar que en el mismo bloque puedo concatenar varias clases

            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
            crearPersona();

        }
    }

    public static void ingresarDatos() throws ExcepcionPropia, InputMismatchException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        
        if (nombre.length() < 2) { // Valido el nombre (validación inventada)
             // Si se cumple la condición lanzo una excepción con mensaje de error personalizado
            throw new ExcepcionPropia("No ingreso un nombre valido - Vas a tener q reingresar el dato");
        }

        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
        
        if (edad < 0) { // Valido la edad.
            // Si se cumple la condición lanzo una excepción con mensaje de error personalizado
            throw new ExcepcionPropia("Como vas a tener menos que 0 años.....");
        }

        System.out.println("LOS DATOS INGRESADOS SON: "
                + "\n Nombre: " + nombre.toUpperCase()
                + "\n Edad: " + edad);
    }

}
