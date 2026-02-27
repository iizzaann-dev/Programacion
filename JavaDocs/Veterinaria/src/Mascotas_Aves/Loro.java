package Mascotas_Aves;

import java.time.LocalDate;

public class Loro extends Aves {

	private String origen;
	private boolean habla;
	private String respuesta;
	
	
	public Loro(String nombre, byte edad, boolean estado, LocalDate fechaNacimiento, boolean pico, boolean vuela, String origen, boolean habla)
			throws IllegalArgumentException {
		
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		
		if (habla == true) {
			respuesta = "Si";
		}else {
			respuesta = "No";
		}
		
		this.origen = origen; 
		this.habla = habla;
		
	}
	
	public void muestra() {
		String.format("Nombre: %s, Edad: %d, Estado : %b, Fecha de Nacimiento: %s, Color: %s, ¿Tiene pico?: %s, ¿Puede volar?: %s, Origen: %s, ¿Puede hablar?: %s.", nombre, edad, super.respuestaEstado, fechaNacimiento, super.respuestaPico, super.respuestaVuela, origen, respuesta);
	}
	
	@Override
	public void volar () {
		System.out.println("El loro sale volando");
	}
	
	public void habla(String frase) {
		System.out.println("El loro repite: " + frase);

	}
}
