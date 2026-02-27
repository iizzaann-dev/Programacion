/*
 *Descripción: Clase hija que extiende de vivienda, calculamos precio y pet friendly, ademas del toString, no tiene constructor por defecto
 *Nombre: Izan Rico Blanco
 *Fecha: 18/02/2026
*/


package Rico;

import java.time.LocalDate;

public class CasaRural extends Vivienda{
	
	
	//Atributos mutables del objeto
	private double metrosCuadrados; 
	private boolean mascotas; 
	
	public CasaRural(LocalDate fechaConstruccion, String direccion, double precioNoche, boolean disponible, byte cantidadNoches, double metrosCuadrados, boolean mascotas) 
			throws IllegalArgumentException{
		super(fechaConstruccion, direccion, precioNoche, disponible, cantidadNoches);
		
		if (metrosCuadrados < 0) {
			throw new IllegalArgumentException("Los metros cuadrados no pueden ser negativos");
		}
		
		this.metrosCuadrados = metrosCuadrados; 
		this.mascotas = mascotas; 
	}

	@Override
	public String toString() {
		return String.format(super.toString() ," Metros cuadrados: %.2f, Mascotas: 5b", metrosCuadrados,  mascotas);
	}
	
	public double calcularPrecio () {
		
		double precio = 0; 
		
		if (mascotas == true) {
			precio = (super.precioNoche * super.cantidadNoches) + 20;
		}else {
			precio = (super.precioNoche * super.cantidadNoches);
		}
		
		return precio;
	}
	
	public boolean petFriendly () {
		
		boolean solucion = false;
		
		if (metrosCuadrados > 100 && mascotas == true) {
			solucion = true;
		}
		
		return solucion;
	}
}
