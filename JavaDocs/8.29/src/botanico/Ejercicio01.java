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

        System.out.println("CONJUNTOS DE ESPECIES DE PLANTAS");
        System.out.println("--------------------------------");

        //----------------------------------------------
        //                  Procesamiento
        //----------------------------------------------

        // Rellenamos los conjuntos con especies de plantas aleatorias hasta que haya CANTIDAD_ESPECIES_PLANTAS

        while (listaEspecie.size() < 5){
            listaEspecie.add(Utilidades.especiePlantaAleatoria());
        }

        System.out.println("La lista 1 contiene: " + listaEspecie);
        // Unión de los dos conjuntos


        // Intersección de los conjuntos


        // Diferencia de los conjuntos


        //----------------------------------------------
        //              Salida de Resultados 
        //----------------------------------------------

        // Recorremos el conjunto y mostramos su contenido por pantalla

    }
}