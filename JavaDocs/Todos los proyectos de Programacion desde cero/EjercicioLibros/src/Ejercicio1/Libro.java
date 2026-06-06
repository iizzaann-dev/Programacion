package Ejercicio1;

import java.time.LocalDate;

public class Libro {
	
	private String titulo;
	private String autor;
	private String ISBN;
	private LocalDate fechaPublicacion;
	private boolean disponible;

	public Libro(String titulo, String autor, String ISBN, LocalDate fechaPublicacion) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.fechaPublicacion = fechaPublicacion;
		this.disponible = true;
	}

	
	public String getISBN() {
		return ISBN;
	}
	
	
	public boolean isDisponible() {
		return disponible;
	}
	
	

	public String getTitulo() {
		return titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", fechaPublicacion="
				+ fechaPublicacion + ", disponible=" + disponible + "]";
	}	

	
}