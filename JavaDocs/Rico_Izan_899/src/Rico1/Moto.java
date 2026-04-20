package Rico1;

import java.time.LocalDate;

public class Moto extends Vehiculo {
	
	public int anyoFechaFabricacion = fechaFabricacion.getYear();
	public int anyoFechaActual = LocalDate.now().getYear();
	
	protected Moto(String id, String matricula, LocalDate fechaFabricacion, double precioDia, boolean alquilado,
			String tipoVehiculo) throws IllegalArgumentException {
		super(id, matricula, fechaFabricacion, precioDia, alquilado, tipoVehiculo);
		this.precioDia = 25;
			
	}
	
	public double calcularAlquiler (double precioDia, int cantidadDias, int anyoFechaFabricacion) {
		double resultado = precioDia * cantidadDias;
		
		/*if (anyoFechaActual.minus(anyoFechaFabricacion) < 5) {
			resultado = resultado + (resultado + 1.05);
		}
		*/
		return resultado;
	}

	@Override
	public String toString() {
		return "Moto [anyoFechaFabricacion=" + anyoFechaFabricacion + ", anyoFechaActual=" + anyoFechaActual + "]";
	}
	
	

}
