package Mascotas;

import java.time.LocalDate;

public abstract class Mascotas {
	
	protected String nombre;
	protected byte edad; 
	protected boolean estado;
	protected  final LocalDate fechaNacimiento;
	protected String respuestaEstado;

	public Mascotas (String nombre, byte edad, boolean estado, LocalDate fechaNacimiento)  throws IllegalArgumentException{
		
		this.edad = edad;
		this.nombre = nombre;
		this.estado = estado; 
		this.fechaNacimiento = fechaNacimiento;
		
		if (estado == true) {
			respuestaEstado = "Vivo";
		}else {
			respuestaEstado = "Muerto";
		}
		
	}
	
	public Mascotas (Mascotas copia) {
		this.nombre = copia.nombre;
		this.edad = copia.edad;
		this.estado = copia.estado;
		this.fechaNacimiento = copia.fechaNacimiento;
	}
	
	public void cumpleaños () {
		
	}
	
	public void morir () {
		
	}
	
	public void habla () {
			
		}
	
	/*
	// Eliminar animal
		public void eliminarAnimal(String nombre) {
		    for (int posicion = 0; posicion < contador; posicion++) {
		        if (animales[posicion].nombre.equalsIgnoreCase(nombre)) {

		            for (int j = posicion; j < contador - 1; j++) {
		                animales[j] = animales[j + 1];
		            }

		            animales[contador - 1] = null;
		            contador--;

		            System.out.println("Animal eliminado.");
		            return;
		        }
		    }
		    System.out.println("Animal no encontrado.");
		}
		*/
		
	public String muestra () {
	    return String.format("Nombre: %s , Edad: %d , Estado : %S , Fecha de Nacimiento: %s.", 
	        nombre, edad, respuestaEstado, fechaNacimiento );
	}

	
	public String getNombre() {
		return nombre;
	}
}
