package botanico;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/** Ejercicio 4. Clasificación de especies de plantas coincidentes
 * (con el mismo nombre y en la misma posición)
 * @author Profesor
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------

        ArrayList<String> lista1 = new ArrayList <> (20);
        ArrayList<String> lista2  = new ArrayList <> (20);
        HashMap<String, List<Integer>> mapa = new HashMap <>();

        // Constantes
        
        // Variables de entrada
        
        // Variables auxiliares
        
        // Variables de salida

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------

        for (int i = 0; i < 20; i++){
            lista1.add(Utilidades.especiePlantaAleatoria());
            lista2.add(Utilidades.especiePlantaAleatoria());
        }

        for (int i = 0; i < lista1.size(); i++) {
            String planta = lista1.get(i);

            if (planta.equals(lista2.get(i))) {

                mapa.putIfAbsent(planta, new ArrayList<>());
                mapa.get(planta).add(i);
            }
        }


        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios


        System.out.println("CLASIFICACIÓN DE COINCIDENTES");
        System.out.println("-----------------------------");

        // Mostrar listas
        System.out.println("\nLista 1:");
        System.out.println(lista1);

        System.out.println("\nLista 2:");
        System.out.println(lista2);

        // Mostrar mapa
        if (mapa.isEmpty()) {
            System.out.println("\nNo hay plantas coincidentes.");
            System.out.println("No hay posiciones coincidentes.");

        } else {
            System.out.println("\nCoincidencias:");

            for (String planta : mapa.keySet()) {
                System.out.println(planta + " == " + mapa.get(planta));
            }
        }
        //----------------------------------------------
        //                 Procesamiento
        //----------------------------------------------
        

        //----------------------------------------------
        //            Salida de resultados
        //----------------------------------------------
        

    }
}

