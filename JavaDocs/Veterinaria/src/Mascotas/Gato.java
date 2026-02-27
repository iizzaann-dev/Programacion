package Mascotas;

import java.time.LocalDate;

public class Gato extends Mascotas{

	private String color;
	private	boolean peloLargo; 
	private String respuesta;
	private String respuestaEstado;
	
	
	public Gato(String nombre, byte edad, boolean estado, LocalDate fechaNacimiento, String color, boolean peloLargo, String respuesta)
			throws IllegalArgumentException {
		
		super(nombre, edad, estado, fechaNacimiento);
		
		if (peloLargo == true) {
			respuesta = "Si";
		}else {
			respuesta = "No";
		}
		
		if (estado == true) {
			respuestaEstado = "Vivo";
		}else {
			respuestaEstado = "Muerto";
		}
		
		this.color = color; 
		this.peloLargo = peloLargo; 
		
		
	}
	
	@Override
	public void muestra () {
		String.format("Nombre: %s, Edad: %d, Estado : %s, Fecha de Nacimiento: %s, Color: %s, ¿Tiene el pelo largo?: %s .", nombre, edad, respuestaEstado, fechaNacimiento, color, respuesta);
	}
	
	@Override
	public void habla () {
		System.out.println("Miaauu");
	}

}
