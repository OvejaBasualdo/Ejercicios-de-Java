package manejoexcepcionesclase;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ejemplo01NoVerificadas {

    // CASO A - Exception o RuntimeException no manejada
//    public static void main(String[] args) {
//        int numero1 = 10;
//        int numero2 = 0; // Modificar el valor de `numero2` a 0 (cero) y ver lo que pasa, se rompe :(:(:(:(
//        int resultado = numero1 / numero2;
//        System.out.println("La division es: " + resultado);//
//        System.out.println("ya termino todo");
//    }

    // CASO B - Preveo lo que puede pasar, es decir dejo previsto que puede existir una excepcion arimética 
    // y además, por las dudas capturo cualquier otra con la clase madre Exception. 
//    public static void main(String[] args) {
//        int numero1 = 10;
//        int numero2 = 0; // Modificar el valor de `numero2` a 0 (cero) y ver lo que pasa
//        
//        try {
//            
//            int resultado = numero1 / numero2;
//            System.out.println("La division es: " + resultado);
//            
////        } catch (ArithmeticException ex) {
////            
////            System.out.println("NO SE PUEDE DIVIDIR POR CERO, este mensaje es personalizado");
////            System.out.println(ex.getMessage());
////            
//        } catch (Exception ex) { // Para disparar esta excepción se puede probar cambiando el tipo de dato de `numero2` a String
//            // Y correr el programa aunque Netbeans nos indique que hay un error
//    
//            System.out.println("Ocurrió un error: " + ex.getMessage());
//
//        } finally {  // TODO  que este dentro de `finally` SIEMPRE va a ocurrir (exista o no una excepcion)     
//            
//            System.out.println("FIN DEL PROGRAMA");
//        }
//    }
    
//    //CASO C - Manejo de excepcion cuando se ingresa una cadena y se esperaba un numero
//    public static void main(String[] args) {
//        
//        Scanner leer = new Scanner(System.in);
//         int numero1 = 10;
//        System.out.println("Ingrese un numero entero para dividir el 10");
//
//        try {
//            
//            int numero = leer.nextInt();
//            
//            int resultado = numero1 / numero;
//            
//            System.out.println("La division es: " + resultado);
////            System.out.println("El numero ingresado es: " + numero);
//            
//        } catch (ArithmeticException e) { // Clase para el manejo de excepciones cuando no coincide 
//                                                                                                        // el tipo de dato esperado con el recibido
//            
//            System.out.println(e.toString() + " " + e.getMessage()+ " Ups! Ingresaste un cero!");
//            
//        } catch (InputMismatchException e) { 
//            
//            System.out.println(e.toString() + " " + e.getMessage()+ " ups! Ingresaste otro tipo de dato en vez de un entero");
//        
//        }
//        
//        System.out.println("ya termino todo");
//    }
}
