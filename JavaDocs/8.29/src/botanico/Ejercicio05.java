package botanico;

import java.util.LinkedList;

/** Ejercicio 5. Ordenación de especies de plantas (por nombre y longitud)
 * @author Profesor
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        
        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        LinkedList  <String> lista1 = new LinkedList<>();
        int i = 0;
        // Variables de entrada
        
        // Variables auxiliares
        
        // Variables de salida

        
        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------




        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios




        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        while (lista1.size() < 5){
            String plantas = Utilidades.especiePlantaAleatoria();

            if (!lista1.contains(plantas)) {
                lista1.add(plantas);
            }
        }

        System.out.println("ORDENACIÓN DE ESPECIES DE PLANTAS");
        System.out.println("---------------------------------");

        lista1.sort(new ComparadorEspeciePlantaPorNombre());

        for (String j : lista1){
            System.out.println(j);
        }

        System.out.print("-----------------------------------\n");

        lista1.sort(new ComparadorEspeciePlantaPorLongitud());

        for (String j : lista1){
            System.out.println(j);
        }
        
    }
}