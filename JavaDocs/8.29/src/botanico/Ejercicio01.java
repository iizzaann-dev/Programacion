package botanico;

import java.util.LinkedHashSet;
import botanico.Utilidades;
/**
 * Ejercicio 1. Creando jardín botánico
 * @author Profesor
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables
        //----------------------------------------------

        // Constantes

        // Variables de entrada
        LinkedHashSet <String> listaEspecie = new LinkedHashSet <> (5);
        LinkedHashSet <String> listaEspecie2 = new LinkedHashSet<>(5);

        // Variables auxiliares

        // Variables de salida


        //----------------------------------------------
        //                Entrada de datos
        //----------------------------------------------

        // No hay, pues se usa un número fijo de elementos aleatorios
        System.out.println("");
        System.out.println("CONJUNTOS DE ESPECIES DE PLANTAS");
        System.out.println("--------------------------------");

        //----------------------------------------------
        //                  Procesamiento
        //----------------------------------------------

        // Rellenamos los conjuntos con especies de plantas aleatorias hasta que haya CANTIDAD_ESPECIES_PLANTAS

        while (listaEspecie.size() < 5){
            listaEspecie.add(Utilidades.especiePlantaAleatoria());
            listaEspecie2.add(Utilidades.especiePlantaAleatoria());
        }

        // Unión de los dos conjuntos
        LinkedHashSet <String> listaEspecie3 = new LinkedHashSet<>(listaEspecie);
        listaEspecie3.addAll(listaEspecie2);

        // Intersección de los conjuntos
        LinkedHashSet <String> listaEspecie4 = new LinkedHashSet<>(listaEspecie);
        listaEspecie4.retainAll(listaEspecie2);


        // Diferencia de los conjuntos


        //----------------------------------------------
        //              Salida de Resultados 
        //----------------------------------------------

        // Recorremos el conjunto y mostramos su contenido por pantalla

        System.out.println("La lista 1 contiene: " + listaEspecie);
        System.out.println("La lista 2 contiene : " + listaEspecie2);
        System.out.println("La lista 3 es: " + listaEspecie3);
        System.out.println("La lista 4 (intersenccion entre la lista 1 y la lista 2) es: " + listaEspecie4);

    }
}