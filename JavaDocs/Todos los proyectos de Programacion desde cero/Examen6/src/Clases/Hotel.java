package Clases;

import java.time.LocalDate;

public class Hotel extends Vivienda {
	
	public int estrellas;
	public int numeroHabitaciones; 
	public boolean spa;
	
	public Hotel(int estrellas, int numeroHabitaciones, boolean spa, String direccion, LocalDate fechaConstruccion, double precioNoche, boolean disponible) {
		super(direccion, fechaConstruccion, precioNoche, disponible);
		
		this.estrellas = estrellas;
		this.numeroHabitaciones = numeroHabitaciones;
		this.spa = spa;
		
		
	}
	
	
	@Override
	public double calcularPrecio(int numeroDias) {
		
		double precio = 0;
		
		if(estrellas >= 3) {
			precio = (super.precioNoche * numeroDias) + (0.05 *(super.precioNoche * numeroDias));
			
			if(spa == true) {
				precio = ((super.precioNoche * numeroDias) + (0.05 *(super.precioNoche * numeroDias))) + 30;
			}
		}else {
			precio = super.precioNoche * numeroDias;
			
			if(spa == true) {
				precio = (super.precioNoche * numeroDias) + 30; 
			}
		}

		return precio; 
	}
	
	public boolean esLujoso () {
		
		if(estrellas >= 5 && spa == true) {
			return true;
		}else {
			return false;
		}
	}


	@Override
	public String toString() {
		return "Hotel [estrellas=" + estrellas + ", numeroHabitaciones=" + numeroHabitaciones + ", spa=" + spa
				+ ", identificador=" + identificador + ", direccion=" + direccion + ", fechaConstruccion="
				+ fechaConstruccion + ", precioNoche=" + precioNoche + ", disponible=" + disponible + "]";
	}
	
	

}
