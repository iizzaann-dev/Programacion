package Ejercicio1;

import java.util.Objects;

public class Libro {
    private String isbn; // identificador único
    private String titulo;
    private String autor;
    private float precio;

    public Libro(String isbn, String titulo, String autor, float precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}

	public String getIsbn() {
		return isbn;
	}

    
    
    
    
}
