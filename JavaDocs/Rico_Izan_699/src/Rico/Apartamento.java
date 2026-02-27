/*
 *Descripción: Clase hija qeue extiende de vivienda, se calcula el precio y posee toString, no tiene constructor por defecto
 *Nombre: Izan Rico Blanco
 *Fecha: 18/02/2026
*/


package Rico;

import java.time.LocalDate;

public class Apartamento extends Vivienda{

	//Atributos inmutables del objeto
	private final double distanciaCentroCiudad; 

	//Atributos mutables del objeto
	private byte numHabitaciones;		//No es final porque puede haber una reforma
	private LocalDate fechaUltReforma;
	
	public Apartamento(LocalDate fechaConstruccion, String direccion, double precioNoche, boolean disponible, byte cantidadNoches, double distanciaCentroCiudad, byte numHabitaciones, 
			LocalDate fechaUltReforma) throws IllegalArgumentException{
			
		super(fechaConstruccion, direccion, precioNoche, disponible, cantidadNoches);
		
		
		if (fechaUltReforma.isBefore(LocalDate.now())){
			throw new IllegalArgumentException("La fecha de la última reforma debe ser anterior a la fecha actual: " + LocalDate.now());
		}
		
		this.distanciaCentroCiudad = distanciaCentroCiudad;
		this.numHabitaciones = numHabitaciones;
		this.fechaUltReforma = fechaUltReforma;
	}
	
	/*public Apartamento() {
		this(LocalDate.of(2000,01, 01), "Sin dirección", 150.50, true, 1, 5.05, 3,LocalDate.of(2000,01, 01));
	}*/
	
	@Override
	public String toString() {
		return String.format(super.toString(), " Distancia desde el centro de la ciudad: %.2f, Numero de habitaciones: %s, Fecha de la última reforma: %s", 
				distanciaCentroCiudad, numHabitaciones, fechaConstruccion);
	}
	
	public double calcularPrecio () {
		
		double precio = 0;
		
		if (distanciaCentroCiudad < 2) {
			precio = (super.precioNoche * super.cantidadNoches) * 1.15;
		}else {
			precio = super.precioNoche * super.cantidadNoches;
		}
		
		return precio;
	}
	
	
}
