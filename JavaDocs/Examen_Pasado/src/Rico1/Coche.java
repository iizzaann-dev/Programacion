package Rico1;

import java.time.LocalDate;

public class Coche extends Vehiculo {
	
	public tipoGasolina tipoCombustible;
	public int numeroDias; 
	
	public Coche (tipoVehiculo tipo, LocalDate anioFabricacion, String matricula, double precioDia, boolean alquilado, tipoGasolina tipoCombustible, int numeroDias) {
		super(tipo, anioFabricacion, matricula, precioDia, alquilado);
		this.tipoCombustible = tipoCombustible;
		this.numeroDias = numeroDias;
	}
		
	public Coche () {
		super(tipoVehiculo.COCHE, anioFabricacion_default, matricula_default, precioDia_default, alquilado_default);
	}
	public enum tipoGasolina {
		
		Gasolina, Gasoil, Electrico
	}
	
	@Override
	public double calcularPrecioTotal() {
		double precio = 0;
		
		
		if (alquilado == false) {
			if(tipoCombustible == tipoGasolina.Electrico) {
				precio = (precioDia * numeroDias) * 1.05;
				
			}else {
				precio = precioDia * numeroDias;
			}
			
		}else {
			throw new IllegalArgumentException("No se puede calcular el precio total porque el vehículo está alquilado.");
		}
		
		
		return precio;

	}
	
	public double getPrecioTotal() {
        return calcularPrecioTotal();
    }

	@Override
	public String toString() {
		return "Coche [tipoVehiculo=" + tipoVehiculo.COCHE + ", numeroDias=" + numeroDias + ", anioFabricacion="
				+ anioFabricacion + ", matricula=" + matricula + ", precioDia=" + precioDia + ", alquilado=" + alquilado
				+ "]";
	}
	
	
}
