package Excepciones;

public class AnimalNoEncontradoException extends Exception {
	
	public AnimalNoEncontradoException(String nombre) {
		
		super("No se ha encontrado ningun animal con el nombre " + nombre + ".");
		
	}

}
