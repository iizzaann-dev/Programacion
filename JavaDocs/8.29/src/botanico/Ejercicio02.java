package botanico;

import java.util.ArrayList;
import java.util.LinkedHashSet;

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

        System.out.println("Las plantas de la primera lista son: " + plantas);
        System.out.println("Las plantas de la segunda lista son: " + plantas2);
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

        for (int i = 0; i < plantas.size(); i++){
            if (plantas.get(i).equals(plantas2.get(i))){       //Plantas.get(i) funciona como el elemento que se va a comparar, no como la posicion
                plantasPopulares.add(plantas.get(i));          //Usamos plantas.get(i) en el add porque estamos añadiendo el objeto no la posicion
            }
        }

        if (plantasPopulares.isEmpty()){
            System.out.println("No hay plantas populares.");
        }else{
            System.out.println("Las plantas populares son: " + plantasPopulares);
        }

        // Recorremos a la vez las dos listas
        

        //----------------------------------------------
        //            Salida de resultados
        //----------------------------------------------
        

    }
}