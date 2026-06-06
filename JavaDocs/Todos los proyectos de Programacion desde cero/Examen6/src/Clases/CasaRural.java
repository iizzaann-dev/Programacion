package Clases;

import java.time.LocalDate;

public class CasaRural extends Vivienda{
	
	public double metrosCuadrados;
	public boolean mascotas;
	
	
	//Valores por defecto: 
	private static final double metrosCuadradosDefault = 50;
	private static final boolean mascotasDefault = false;
	
	public CasaRural(double metrosCuadrados, boolean mascotas, String direccion, LocalDate fechaConstruccion, double precioNoche, boolean disponible) {
		super(direccion, fechaConstruccion, precioNoche, disponible);
		
		if(metrosCuadrados < 0) {
			throw new IllegalArgumentException("Los metros cuadrados no pueden tener un valor negativo.");
		}
		
		this.metrosCuadrados = metrosCuadrados;
		this.mascotas = mascotas;
	}
	
	public CasaRural(double precioNoche) {
		this(metrosCuadradosDefault, mascotasDefault, direccionDefault, fechaConstruccionDefault, precioNoche, disponibleDefault);
	}
	
	public CasaRural() {
		this(metrosCuadradosDefault, mascotasDefault, direccionDefault, fechaConstruccionDefault, precioNocheDefault, disponibleDefault);
	}
	
	@Override
	public double calcularPrecio (int numeroDias) {
		
		double precio = 0; 
		
		if(mascotas = true) {
			precio = (super.precioNoche * numeroDias) + 20;
		}else {
			precio = super.precioNoche * numeroDias; 
		}
		
		return precio;
	}
	
	public boolean esPetFriendly() {
		if(metrosCuadrados > 100 && mascotas == true) {
			return true;
		}else {
			return false;
		}
			
	}

	@Override
	public String toString() {
		return "CasaRural [metrosCuadrados=" + metrosCuadrados + ", mascotas=" + mascotas + ", identificador="
				+ identificador + ", direccion=" + direccion + ", fechaConstruccion=" + fechaConstruccion
				+ ", precioNoche=" + precioNoche + ", disponible=" + disponible + "]";
	}
	
	
}
