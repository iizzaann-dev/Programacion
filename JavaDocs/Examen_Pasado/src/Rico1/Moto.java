package Rico1;

import java.time.LocalDate;

import Rico1.Coche.tipoGasolina;

public class Moto extends Vehiculo{
	
	public int numeroDias; 

	
	protected Moto(tipoVehiculo tipo, LocalDate anioFabricacion, String matricula, double precioDia, boolean alquilado, int numeroDias)
			throws IllegalArgumentException {
		super(tipo, anioFabricacion, matricula, precioDia, alquilado);

	}
	
	

	@Override
	public double calcularPrecioTotal() {
		
		double precio = 0;
		
		
		if (alquilado == false) {
			
			if(anioFabricacion.isBefore(LocalDate.now().minusYears(5))) {
				precio = (numeroDias * 25) * 0.90; 
			}else {
				precio = numeroDias * 25;
			}
			
		}else {
			throw new IllegalArgumentException("No se puede calcular el precio total porque el vehículo está alquilado.");
		}
		
		
		return precio;
	}



	@Override
	public String toString() {
		return "Moto [numeroDias=" + numeroDias + ", anioFabricacion=" + anioFabricacion + ", matricula=" + matricula
				+ ", precioDia=" + precioDia + ", alquilado=" + alquilado + "]";
	}
	
	

}
