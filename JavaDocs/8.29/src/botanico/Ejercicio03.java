package botanico;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import botanico.Utilidades;

/** Ejercicio 3. Calendario de especies de plantas
 * @author Profesor
 */
public class Ejercicio03 {

    public static void main(String[] args) {



        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        TreeMap <LocalDate, String> plantas = new TreeMap <>();

        LocalDate fechaActual = LocalDate.now();

        DateTimeFormatter formato =  DateTimeFormatter.ofPattern("dd/MM/yy");


        //for (LocalDa)
        
        // Constantes
        
        // Variables de entrada
        
        // Variables auxiliares
        
        // Variables de salida


        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        
        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios
        
        System.out.println("CALENDARIO DE ESPECIES DE PLANTAS");

        for (int i = 0; i < 7; i++){
            LocalDate fechaActualizada = fechaActual.plusDays(i);

            String planta;
            do {
                planta = Utilidades.especiePlantaAleatoria();
            }while (plantas.containsValue(planta));

            plantas.put(fechaActualizada, planta);
        }


        for (Map.Entry <LocalDate, String> i : plantas.entrySet()){
            String fechaFormateada = i.getKey().format(formato);
            System.out.println(fechaFormateada + ": " + i .getValue());

        }

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