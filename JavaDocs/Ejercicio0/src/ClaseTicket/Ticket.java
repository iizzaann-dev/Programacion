package ClaseTicket;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {

    // Atributos de clase constantes
	public static final int MAXIMO_DIGITO = 99999999;  

    // Atributos de clase variables 
    private static short lastYear = (short) LocalDate.now().getYear();  
    private static int ultimoDigito = 0;  

    // Atributos de objeto inmutables
    private final LocalDate fecha;  
    private final String id;       

    // Atributos de objeto variables 
    private LocalTime usado; 
    
    
    public Ticket(LocalDate fecha) throws IllegalStateException, IllegalArgumentException{
    	  LocalDate hoy = LocalDate.now();
    	  if (fecha == null) {
    		  throw new IllegalArgumentException ("La fecha es invalida (es null).");
    	  }
    	  
    	  if (fecha.isBefore(hoy)) {
    		  throw new IllegalArgumentException("El uso del ticket es anterior a hoy (" + hoy + ")");
    	  }
    	  
    	  if (fecha.getYear() > hoy.getYear()) {
    		  throw new IllegalArgumentException ("El uso del ticker es posteriror al año actual" + fecha);
    	  }
    	  
    	  if (Ticket.lastYear != (short)hoy.getYear()) {
    		  Ticket.ultimoDigito = 0; 
    		  Ticket.lastYear++;
    	  }
    	  
    	  if (Ticket.ultimoDigito == Ticket.MAXIMO_DIGITO) {
    		  throw new IllegalStateException("Se han alcanzado la cantidad total de tickets");
    	  }
    	  this.fecha = fecha;
    	  this.id = generarId();
    	  this.usado = null;
    }
    
    
	public Ticket() throws IllegalStateException {
    	  this(LocalDate.now());
    	}
	
    //Métodos
	private String generarId() {
		
		String identificador = "";
		Ticket.ultimoDigito++;
		
		identificador = String.format("%04d-%08d", this.fecha.getYear(), Ticket.ultimoDigito);
		
		return identificador;
	}
	
	private boolean isUsado() {
		if (this.usado == null) {
			return false;
		}else {
			return true;
		}
	}
	
	
	//Getters
	public LocalDate getFecha() {
	    return this.fecha;
	}
	
	//ToString
	@Override
	public String toString() {
			
		return null;
	  }

}
