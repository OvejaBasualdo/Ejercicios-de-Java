package ExpresionesLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ClaseMainLambda {

    public static void main(String[] args) {
      //PARA ORDENAR COLECCIONES
        //Declaro un Array. y le agrego elementos directo
        ArrayList<Integer> nuevaLista = new ArrayList() {
            {add(17);add(2);add(3);add(4);add(3);add(65);add(7);add(10);add(8);add(12);
            }
        };
        //Metodo de ordenar sin lambda
//        @Override
//        nuevaLista.sort(new Comparator<Integer>(){        
//            public int compare(Integer o1, Integer o2){
//                return -(o1.compareTo(o2));
//            }        
//    });
        //Metodo ordenar con lambda (el - hace que invierta el orden) - ORDEN DESCENDENTE
        System.out.println("♣♣♣♣♣♣♣♣LISTA DE NUMEROS ORDENADAS DESCENDENTE:♣♣♣♣♣♣♣♣");
        nuevaLista.sort((Integer o1, Integer o2) -> -(o1.compareTo(o2)));
        System.out.print(nuevaLista);
        System.out.println("");
        //Metodo ordenar con lambda ORDEN ASCENDENTE (Aca ni siquiera defino los datos,porq entiende q si la lsita es de un tipo
        //TAmien lo son sus objetos
        System.out.println("♣♣♣♣♣♣♣♣LISTA DE NUMEROS ORDENADAS ASCENDENTE:♣♣♣♣♣♣♣♣");
        nuevaLista.sort((o1, o2) -> (o1.compareTo(o2)));
        System.out.print(nuevaLista);
        System.out.println("");
        //Puedo utilizar funciones de STREAM que me permite filtrar rapidamente Segun parametro // Puedo concatenar cosas
        System.out.println("♣♣♣♣♣♣♣♣FILTRAR VALORES MAYORES O IGUAL A 8 :♣♣♣♣♣♣♣♣");
        nuevaLista
                .stream()
                .filter((x) -> x >= 8) //Aviso mayor a que numero quiero q filtre                  
                .forEach((n) -> System.out.print(n + "*"));
        System.out.println("");
        //Puedo sumar los componentes de la lista
        System.out.println("♣♣♣♣♣♣♣♣SUMA DE TODOS LOS VALORES DEL ARRAY:♣♣♣♣♣♣♣♣");
        int resultado = nuevaLista
                .stream()
                .mapToInt(v -> v) // Aviso que quiero el valor numerico 
                .sum();//Intruccion que suma todo
        System.out.println("La suma de todo es:" + resultado);
        
        //Aplicando a una coleccion de objetos
        PersonaEntidad persona1 = new PersonaEntidad(8, "Adri");
        PersonaEntidad persona2 = new PersonaEntidad(80, "Pedro");
        PersonaEntidad persona3 = new PersonaEntidad(15, "Jose");
        PersonaEntidad persona4 = new PersonaEntidad(9, "Mario");
        ArrayList<PersonaEntidad> nuevaListaPersonas = new ArrayList() {
            {add(persona1);add(persona2);add(persona3);add(persona4);
            }
        };
        System.out.println("♣♣♣♣♣♣♣♣TODAS LAS PERSONAS ORDENADAS ASCENDENTE:♣♣♣♣♣♣♣♣");
        nuevaListaPersonas.sort((o1, o2) -> (o1.getNombre().compareTo(o2.getNombre())));
        nuevaListaPersonas.forEach((n) -> System.out.print(n + "\n")); // Forma de imprimir rapido 
        System.out.println("");
        //Personas mayores a 10 años
        System.out.println("♣♣♣♣♣♣♣♣PERSONAS FILTRADAS POR EDAD:♣♣♣♣♣♣♣♣");
        nuevaListaPersonas
                .stream()
                .filter((x) -> x.getEdad() > 10)
                .forEach((n) -> System.out.println(n));
        System.out.println("");
        //Personas mayores a 10 años
       System.out.println("♣♣♣♣♣♣♣♣PERSONA DE MAYOR EDAD:♣♣♣♣♣♣♣♣");
        Optional<PersonaEntidad> masGrande= nuevaListaPersonas
                .stream()
                .max((o1, o2) -> (o1.getEdad().compareTo(o2.getEdad())));
                System.out.println(masGrande.get().getNombre());
        System.out.println("♣♣♣♣♣♣♣♣PERSONA elegida :♣♣♣♣♣♣♣♣");         
        lamasCercanaA(nuevaListaPersonas);
        
        Set paises = new HashSet();
        List ordena = new ArrayList(paises);
        Collections.sort(ordena);
    }
    
   public static void lamasCercanaA(ArrayList nuevaListaPersonas){
       PersonaEntidad maspeque=Collections.max(nuevaListaPersonas,
                 (PersonaEntidad objeto1, PersonaEntidad objeto2) -> objeto2.getNombre().compareTo(objeto1.getNombre()));
        System.out.println("La persona con el nombre mas cercano a la A es(Osea menor valor):  " + maspeque); 
    }
    
   
}
