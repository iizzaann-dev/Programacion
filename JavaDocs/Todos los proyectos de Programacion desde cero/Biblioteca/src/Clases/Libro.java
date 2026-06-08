package Clases;

public class Libro extends Publicacion{

	public Libro(String ISBN, String titulo, String autor, int anio, Genero genero, double PRECIO_BASE,
			String dato_especifico) {
		super(ISBN, titulo, autor, anio, genero, PRECIO_BASE, dato_especifico);

		
	}

	@Override
	public double calcularTarifaPrestamo() {
		
		int numPaginas = getNumeroPaginas();
		
		if(numPaginas > 500) {
			return (this.PRECIO_BASE + (numPaginas * 0.02) * 0.9);
		}else {
			return this.PRECIO_BASE + (numPaginas * 0.02);
		}
	}
	
	public int getNumeroPaginas() {
		return Integer.valueOf(dato_especifico);
	}

}
