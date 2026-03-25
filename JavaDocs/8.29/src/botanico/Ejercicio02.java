package botanico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/** Ejercicio 2. Búsqueda de especies de plantas populares
 * @author Profesor
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        
        // Constantes
        
        // Variables de entrada
        ArrayList <String> plantas = new ArrayList<>(10);
        ArrayList <String> plantas2 = new ArrayList<>(10);
        LinkedHashSet<String> plantasPopulares = new LinkedHashSet<>(10);
        Map <String, ArrayList<Integer>> posicionesPopulares = new HashMap<>();

        // Variables auxiliares

        // Variables de salida


        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        
        System.out.println("BÚSQUEDA DE ESPECIES DE PLANTAS POPULARES");
        System.out.println("-----------------------------------------");
        
        
        // No hay, pues se usa un número fijo de elementos aleatorios

        // Rellenamos la lista con aleatorios hasta que haya CANTIDAD_ESPECIES_PLANTAS
        while (plantas.size() < 10){
            plantas.add(Utilidades.especiePlantaAleatoria());
            plantas2.add(Utilidades.especiePlantaAleatoria());
        }


        /* También lo podemos hacer asi
        for (int i = 0; i < 10; i++) {
            lista1.add(Utilidades.especiePlantaAleatoria());
        }
        */
        //----------------------------------------------
        //               Procesamiento
        //----------------------------------------------
        /*
        for (String i : plantas ){
            if (plantas2.contains(i) && !plantasPopulares.contains(i)){
                plantasPopulares.add(i);
            }
        }
        */

        /* System.out.println("Las plantas populares son: " + plantasPopulares);
        plantasPopulares.clear(); */


        /*No funcionaria como queremos porque el indexOf busca la primera aparicion del elemento
        for (String i : plantas){
            if (plantas.indexOf(i) == plantas2.indexOf(i)){
                plantasPopulares.add(i);
            }
        }*/

        for (int i = 0; i < plantas.size(); i++) {
            String planta = plantas.get(i);

            if (plantas.get(i).equals(plantas2.get(i))) {       //Plantas.get(i) funciona como el elemento que se va a comparar, no como la posicion
                plantasPopulares.add(plantas.get(i));          //Usamos plantas.get(i) en el add porque estamos añadiendo el objeto no la posicion

                posicionesPopulares.putIfAbsent(planta, new ArrayList<>());
                posicionesPopulares.get(planta).add(i);
            }
        }


        // Recorremos a la vez las dos listas
        

        //----------------------------------------------
        //            Salida de resultados
        //----------------------------------------------


        if (plantasPopulares.isEmpty()){
            System.out.println("No hay plantas populares.");
            System.out.println("No hay posiciones populares.");

        }else {

            System.out.print("[");
            for (int i = 0; i < plantas.size(); i++){
                String planta = plantas.get(i);

                if (plantasPopulares.contains(planta)){
                    System.out.printf("*%s*", planta);
                }else{
                    System.out.print(planta);
                }

                if (i < plantas.size() - 1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");

            System.out.println("");

            System.out.print("[");
            for (int i = 0; i < plantas2.size(); i++){
                String planta = plantas2.get(i);

                if (plantasPopulares.contains(planta)){
                    System.out.printf("*%s*", planta);
                }else {
                    System.out.print(planta);
                }

                if (i < plantas2.size() - 1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");

            System.out.println("");
            /*
            System.out.println("Las plantas populares son: " + plantasPopulares);

            for (String i : plantas){
                if (plantasPopulares.contains(i)){
                    System.out.printf("*%s* \n", i);
                }else{
                    System.out.println("Las plantas de la primera lista son: " + plantas);
                }
            }

            for (String i : plantas2){
                if (plantasPopulares.contains(i)){
                    System.out.printf("*%s*\n", i);
                }else{
                    System.out.println("Las plantas de la segunda lista son: " + plantas2);
                }
            }

            */

            System.out.println("Las posiciones populares son: " + posicionesPopulares);
        }

    }
}