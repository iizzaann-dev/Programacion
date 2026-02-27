package Mascotas_Aves;

import java.time.LocalDate;
import Mascotas.Mascotas;

abstract class Aves extends Mascotas {
	
	private boolean pico; 
	private boolean vuela;
	protected String respuestaPico; 
	protected String respuestaVuela;
	
	
	
	public Aves(String nombre, byte edad, boolean estado, LocalDate fechaNacimiento, boolean pico, boolean vuela) throws IllegalArgumentException {
		super(nombre, edad, estado, fechaNacimiento);
		
		if (pico == true) {
			respuestaPico = "Si";
		}else {
			respuestaPico = "No";
		}
		
		if (vuela == true) {
			respuestaVuela = "Si";
		}else {
			respuestaVuela = "No";
		}
		
		this.pico = pico;
		this.vuela = vuela;
		
	}
	
	public void volar () {
		System.out.println("El ave sale volando");
	}
	
	
}
