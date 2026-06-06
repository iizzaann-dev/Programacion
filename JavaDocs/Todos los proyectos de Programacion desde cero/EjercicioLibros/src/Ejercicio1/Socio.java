package Ejercicio1;

import java.util.ArrayList;

public class Socio {
	
	
	private String nombre;
	private int numeroSocio;
	private String email;
	private ArrayList <Libro> librosPrestamo;
	
	
	public Socio(String nombre, int numeroSocio, String email, ArrayList<Libro> librosPrestamo) {
		super();
		this.nombre = nombre;
		this.numeroSocio = numeroSocio;
		this.email = email;
		this.librosPrestamo = librosPrestamo;
	}

	public int getNumeroSocio() {
		return numeroSocio;
	}


	public String getNombre() {
		return nombre;
	}

	public ArrayList<Libro> getLibrosPrestamo() {
		return librosPrestamo;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", numeroSocio=" + numeroSocio + ", email=" + email + ", librosPrestamo="
				+ librosPrestamo + "]";
	}
	
	
}	
