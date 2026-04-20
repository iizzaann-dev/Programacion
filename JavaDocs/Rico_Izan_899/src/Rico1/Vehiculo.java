/*
 *Descripción: Se crea la clase Vehiculo, que es la clase padre de Coche y Moto
 *Nombre: Izan Rico Blanco
 *Fecha: 15/04/2026
*/


package Rico1;

import java.time.LocalDate;

public class Vehiculo {
	
	
	//Atributos mutables de la clase
	protected static int contadorId;
	
	//Atributos inmutables de la clase
	protected static final String matricula_default = "000AAA";
	protected static final double precioDia_default = 100.00;
	protected static final LocalDate fechaFabricacion_default = LocalDate.of(2020, 1, 1);
	
	//Atributos mutables del objeto
	protected double precioDia;
	protected boolean alquilado;
	
	//Atributos inmutables del objeto
	protected final String matricula;
	protected LocalDate fechaFabricacion = null;
	protected final int digitosFabricacion = fechaFabricacion.getYear();
	protected final String id;
	protected final String tipoVehiculo;

	
	
	
	protected Vehiculo (String id, String matricula, LocalDate fechaFabricacion, double precioDia, boolean alquilado, String tipoVehiculo) throws IllegalArgumentException {
		
		if (fechaFabricacion.isBefore(LocalDate.of(2000, 1, 1))) {
			throw new IllegalArgumentException("La fecha de fabricación no puede ser anterior a 01/01/2000.");
		}
		
		if (fechaFabricacion.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de fabricación no puede ser posterior a la fecha actual.");
		}
		
		
		this.matricula = matricula;
		this.fechaFabricacion = fechaFabricacion;
		this.precioDia = precioDia;
		this.alquilado = alquilado;
		this.id = generarId(digitosFabricacion, tipoVehiculo, digitosFabricacion);
		this.tipoVehiculo = tipoVehiculo;
		
	}
	
	
	
	protected String generarId (int digitosFabricacion, String tipoVehiculo, int contadorID) {
	
		String resultado = String.format("%02d-%01d-%03d", digitosFabricacion, tipoVehiculo, contadorId);
		
		return resultado;
	}
	
}

