package ClaseTicket;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {

    // ATRIBUTOS DE CLASE
    // ------------------
    // Atributos de clase constantes
    private static int MAX_SEQUENCE = 99_999_999;  // Máximo número de secuencia en id

    // Atributos de clase variables 
    private static short lastYear = (short) LocalDate.now().getYear();  // Año actual
    private static int lastSequence = 0;  // Inicio de secuencia

    // ATRIBUTOS DE OBJETO
    // -------------------
    // Atributos de objeto inmutables
    private final LocalDate fecha;  // Fecha para usar el ticket
    private final String id;        // Id del ticket

    // Atributos de objeto variables (estado)
    private LocalTime usado;  // Momento de uso del ticket
    
    public Ticket() throws IllegalArgumentException{
    	
    }
}
