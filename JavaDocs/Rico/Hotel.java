/*
 *Descripción: Clase hija que extiende de vivienda, posee toString, calculo de precio u lujosidad
 *Nombre: Izan Rico Blanco
 *Fecha: 18/02/2026
*/


package Rico;

import java.time.LocalDate;

public class Hotel extends Vivienda {

	//Atributos mutables del objeto
	private byte numEstrellas;
	private int numHabitaciones; 
	private boolean spa;
	
	public Hotel(LocalDate fechaConstruccion, String direccion, double precioNoche, boolean disponible, byte cantidadNoches, byte numEstrellas, int numHabitaciones, boolean spa) {
		super(fechaConstruccion, direccion, precioNoche, disponible, cantidadNoches);
		
		this.numEstrellas = numEstrellas;
		this.numHabitaciones = numHabitaciones;
		this.spa = spa;
		
		
	}

	public double precio () {
		
		double precio = 0;
		
		if(numEstrellas >= 3) {
			if(spa == true) {
				precio = ((super.precioNoche * super.cantidadNoches) * 1.05) + 30;
			}else if (spa == false) {
				precio = (super.precioNoche * super.cantidadNoches) * 1.05;
			}
		}else {
			precio = super.precioNoche * super.cantidadNoches;
		}
		
		return precio ;
	}
	
	public boolean lujosidad () {
		
		boolean solucion = false;
		
		if (numEstrellas == 5 && spa == true) {
			solucion = true;
		}
		
		return solucion;
	}
	
	@Override
	public String toString() {
		return String.format(super.toString(),"Numero de estrellas: %d, Numero de habitaciones: %d, Spa: %b", numEstrellas, numHabitaciones, spa);
	}
	
	
	
}
