package Rico1;

import java.time.LocalDate;
import java.util.HashMap;

public abstract class Vehiculo {
	
	//Atributos inmutables de la clase
	protected static final String matricula_default = "0000 AAA";
	protected static final LocalDate anioFabricacion_default = LocalDate.of(2020, 01, 01);
	protected static final double precioDia_default = 100;
	protected static final boolean alquilado_default = false;
	
	//Atributos mutables de la clase
	protected static HashMap <tipoVehiculo, Integer> contadores = new HashMap<> ();
	protected static String id;
	
	
	//Atributos inmutables del objeto
	
	
	//Atributos mutables del objeto
	protected LocalDate anioFabricacion;
	protected String matricula;
	protected double precioDia;
	protected boolean alquilado;
	
	
	
	protected Vehiculo (tipoVehiculo tipo, LocalDate anioFabricacion, String matricula, double precioDia, boolean alquilado) throws IllegalArgumentException {
		
		
		if (anioFabricacion.isBefore(LocalDate.of(2000, 01, 01)) || anioFabricacion.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de matriculacion es incorrecta.");
		}
		
		this.id = generarID(tipo, anioFabricacion);
		this.matricula = matricula;
		this.precioDia = precioDia;
		this.alquilado = alquilado;
		
		
	}
	
	protected String generarID (tipoVehiculo tipo, LocalDate anioFabricacion) {
		
		int ultimosDigitos = anioFabricacion.getYear() % 100;
		int contador = contadores.getOrDefault(tipo, 0);
		
		contadores.put(tipo, contador + 1);
		
		String resultado = String.format("%02d-%c-%03d", ultimosDigitos, tipo.name().charAt(0), contador);
		
		return resultado;
	}
	
	public enum tipoVehiculo{
		COCHE, MOTO
	}
	
	public abstract double calcularPrecioTotal();

	@Override
	public String toString() {
		return "Vehiculo [anioFabricacion=" + anioFabricacion + ", matricula=" + matricula + ", precioDia=" + precioDia
				+ ", alquilado=" + alquilado + "]";
	}
	
	
}
