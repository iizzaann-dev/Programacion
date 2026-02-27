package Mascotas;

import java.time.LocalDate;

public class Perro extends Mascotas{
	
	private final String raza;
	private boolean pulgas;
	private String respuesta;
	private String respuestaEstado;

	
	public Perro (String nombre, byte edad, boolean estado, LocalDate fechaNacimiento, String raza, boolean pulgas) {
		
		super(nombre, edad, estado, fechaNacimiento);
		
		if (pulgas == true) {
			respuesta = "Si";
		}else {
			respuesta = "No";
		}
		
		if (estado == true) {
			respuestaEstado = "Vivo";
		}else {
			respuestaEstado = "Muerto";
		}
		
		this.raza = raza;
		this.pulgas = pulgas; 
	}
	
	@Override
	public void muestra () {
		String.format("Nombre: %s, Edad: %d, Estado : %s, Fecha de Nacimiento: %s, Raza: %s, ¿Tiene pulgas?: %b .", nombre, edad, respuestaEstado, fechaNacimiento, raza, respuesta);
	}
	
	@Override
	public void habla () {
		System.out.println("Woff, Woff");
	}
}
