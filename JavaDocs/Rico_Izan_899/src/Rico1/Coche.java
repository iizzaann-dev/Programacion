package Rico1;

import java.time.LocalDate;

public class Coche extends Vehiculo {
	
	public final String combustible_default = "gasolina";
	
	public String combustible; //Aquí hay que hacer un enum
	public int cantidadDias;

	protected Coche(String id, String matricula, LocalDate fechaFabricacion, double precioDia, boolean alquilado,
			String tipoVehiculo, String combustible, int cantidadDias) throws IllegalArgumentException {
		super(id, matricula, fechaFabricacion, precioDia, alquilado, tipoVehiculo);
		
		
		if (alquilado = true) {
			throw new IllegalArgumentException("El vehiculo ya está alquilado.");
		}
		
		this.combustible = combustible;
		
		
	}
	
	
	public double calcularAlquiler (double precioDia, int cantidadDias) {
		double resultado = precioDia * cantidadDias;
		
		if (combustible.contains("electrico")) {
			resultado = resultado + (resultado + 1.05);
		}
		
		return resultado;
	}


	@Override
	public String toString() {
		return "Coche [combustible_default=" + combustible_default + ", combustible=" + combustible + ", cantidadDias="
				+ cantidadDias + "]";
	}
	
	

}
