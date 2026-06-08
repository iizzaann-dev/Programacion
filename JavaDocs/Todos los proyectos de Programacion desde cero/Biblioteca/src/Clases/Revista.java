package Clases;

public class Revista extends Publicacion{

	public Revista(String ISBN, String titulo, String autor, int anio, Genero genero, double PRECIO_BASE,
			String dato_especifico) {
		super(ISBN, titulo, autor, anio, genero, PRECIO_BASE, dato_especifico);
		
	}			

	
	public Periocidad getPeriocidad() {
		return Periocidad.valueOf(dato_especifico);
	}

	@Override
	public double calcularTarifaPrestamo() {
		
		Periocidad p = getPeriocidad();		
		
		if(p == Periocidad.SEMANAL) {
			return (PRECIO_BASE * p.getNumerosAnuales()) + 5;
		}else {
			return PRECIO_BASE * p.getNumerosAnuales();
		}
	}

}
