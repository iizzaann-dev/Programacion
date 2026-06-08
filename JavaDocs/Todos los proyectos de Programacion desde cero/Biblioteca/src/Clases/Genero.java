package Clases;

public enum Genero {

	FANTASIA("Libro de fantasia"), 
	CIENCIA("Libro de ciencia"), 
	HISTORIA("Libro de historia"),
	TECNOLOGIA("Libro de tecnologia"), 
	INFANTIL("Libro infantil");

	private String descripcion;

	Genero(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public static Genero convertidorGenero(String parte) {
		return Genero.valueOf(parte.toUpperCase());
	}
	
	

}
