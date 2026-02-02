package Cancion;

public class Cancion {
	
	public static final String TITULO_PREDETERMINADO = "Nínguno";
	public static final String AUTOR_PREDETERMINADO = "Anónimo";
	
	private String titulo; 
	private String autor;
	
	public Cancion(String titulo, String autor) throws IllegalArgumentException {
		
		if(titulo.isEmpty()) {
			throw new IllegalArgumentException("No se puede dejar el campo \"Título\" vacio.");
		}
		
		if (titulo.isBlank()) {
			throw new IllegalArgumentException("No se puede dejar el campo \"Título\" sin rellenar.");
		}
		
		if (autor.isEmpty()) {
			throw new IllegalArgumentException("No se puede dejar el campo \"Autor\" vacio.");
		}
		
		if(autor.isBlank()) {
			throw new IllegalArgumentException("No se puede dejar el campo \"Autor\" sin rellenar.");
		}
		
		
		this.titulo = titulo;
		this.autor = autor; 
		
	}
	
	public Cancion () {
		this(TITULO_PREDETERMINADO, AUTOR_PREDETERMINADO);
	}
	
	public Cancion(Cancion otra) {
		this(otra.titulo, otra.autor);
	}

	
	public String dameTitulo() {
		return this.titulo;
	}
	
	public String dameAutor() {
		return this.autor;
	}
	
	public void ponTitulo (String nombre) {
		this.titulo = nombre;
	}
	
	public void ponAutor (String nombre) {
		this.autor = nombre;
	}
	@Override
	public String toString() {
		return "Cancion [Título: " + titulo + ", Autor: " + autor + "]";
	}
	
	//Asopla 
}
