package Clases;

import java.time.LocalDate;

public class Vivienda {

	protected final String identificador;		//Formato: AA-999 	---> AA: año de construccion		---> 999: numero consecutivo a partir de 0 y no superior a 1000 
	//Ponemos el identificador final porque nos indican que no debe cambiar el identificador de un objeto una vez este sea creado.
	protected String direccion;
	protected LocalDate fechaConstruccion;
	protected double precioNoche;
	protected boolean disponible;
	private static int contador; 
	
	
	//Valores por defecto
	protected static final String direccionDefault = "Sin dirección";
	protected static final LocalDate fechaConstruccionDefault = LocalDate.of(2000, 01, 01);
	protected static final double precioNocheDefault = 0.0;
	protected static final boolean disponibleDefault = false;
	
	public Vivienda(String direccion, LocalDate fechaConstruccion, double precioNoche, boolean disponible) {
		
		this.direccion = direccion;
		this.fechaConstruccion = fechaConstruccion;
		this.precioNoche = precioNoche;
		this.disponible = disponible;
		this.identificador = generarIdentificador();
		contador++;
	}
	
	
	private String generarIdentificador() throws IllegalStateException {
		
		if(contador >= 1000) {
			throw new IllegalStateException("No se pueden crear más de 1000 viviendas.");
		}
		
		return String.format("%02d-%03d", (fechaConstruccion.getYear() % 100), (contador + 1));
	}
	
	public static int getNumeroViviendas() {
		return contador;
	}

	
	public double calcularPrecio(int numeroDias) {
		
		return this.precioNoche * numeroDias;
	}
	
	@Override
	public String toString() {
		return "Vivienda [identificador=" + identificador + ", direccion=" + direccion + ", fechaConstruccion="
				+ fechaConstruccion + ", precioNoche=" + precioNoche + ", disponible=" + disponible + "]";
	}
	
	
	
	 
}
