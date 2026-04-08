package botanico;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

/** Ejercicio 3. Calendario de especies de plantas
 * @author Profesor
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        
        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------

        Map <LocalDate, String>mapa = new HashMap();
        LocalDate fechaActual = LocalDate.now ();

        // Constantes
        
        // Variables de entrada
        
        // Variables auxiliares
        
        // Variables de salida
        

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------

        mapa.put(fechaActual, Utilidades.especiePlantaAleatoria());

        for (int i = 1; i < 7; i++){
            fechaActual = fechaActual.plus(1, ChronoUnit.DAYS);
            mapa.put(fechaActual, Utilidades.especiePlantaAleatoria());
        }

        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios
        
        System.out.println("CALENDARIO DE ESPECIES DE PLANTAS");
        System.out.println("---------------------------------");
        
        //----------------------------------------------
        //                  Procesamiento
        //----------------------------------------------
        
   
        //----------------------------------------------
        //           Salida de resultados
        //----------------------------------------------
        
 
    }
}