package Clases;

public abstract class Publicacion {
	
	protected final String ISBN; 
	protected final String titulo;
	protected final String autor;
	protected final int anio;
	protected Genero genero;
	protected double PRECIO_BASE;
	protected String dato_especifico;
	
	public Publicacion(String ISBN, String titulo, String autor, int anio, Genero genero, double PRECIO_BASE, String dato_especifico) {
		
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.anio = anio;
		this.genero = genero;
		this.PRECIO_BASE = PRECIO_BASE;
		this.dato_especifico = dato_especifico;
	}
	
	public abstract double calcularTarifaPrestamo();
	
	public void aplicarDescuento(double porcentaje) throws IllegalArgumentException{
		
		if(porcentaje < 0 || porcentaje > 100) {
			throw new IllegalArgumentException("El porcentaje indicado no es valido.");
		}
		
		this.PRECIO_BASE = this.PRECIO_BASE * (1 - (porcentaje / 100));
		
	}

	public int getAnio() {
		return anio;
	}
	
	
}
