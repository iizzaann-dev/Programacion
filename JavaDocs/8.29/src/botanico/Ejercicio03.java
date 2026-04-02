package botanico;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.HashMap;
import java.util.Map;
import java.time.format.DateTimeFormatter;

/** Ejercicio 3. Calendario de especies de plantas
 * @author Profesor
 */
public class Ejercicio03 {

    public static void main(String[] args) {



        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        Map <LocalDate, String> plantas = new HashMap <>();

        LocalDate fechaActual = LocalDate.now();

        DateTimeFormatter formato = new DateTimeFormatter.("dd/MM/yy");

        for (Map.Entry <LocalDate, String> i : plantas.entrySet()){

            System.out.println(i.getKey() + "" + i .getValue());
        }
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