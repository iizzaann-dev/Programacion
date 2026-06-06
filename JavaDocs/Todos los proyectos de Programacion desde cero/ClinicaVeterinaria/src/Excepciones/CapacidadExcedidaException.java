package Excepciones;

public class CapacidadExcedidaException extends Exception{
	
	public CapacidadExcedidaException(String limite) {
		super("Se ha alcanzado el limite " + limite);
	}
	
}
