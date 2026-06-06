package Clases;

import java.time.LocalDate;

public class Apartamento extends Vivienda{

	
	public int numeroHabitaciones;
	public double distanciaCentro;
	public LocalDate ultimaReforma;
	
	
	//Valores por defecto
	private static final int numeroHabitacionesDefault = 10;
	private static final double distanciaCentroDefault = 10;
	private static final LocalDate ultimaReformaDefault = LocalDate.of(2000, 01, 01);
	
	public Apartamento() {
		this(numeroHabitacionesDefault, distanciaCentroDefault, ultimaReformaDefault,direccionDefault, fechaConstruccionDefault, precioNocheDefault, disponibleDefault);
	}
	
	public Apartamento(double precioNoche, double distanciaCentro) {
		this(numeroHabitacionesDefault, distanciaCentro, ultimaReformaDefault, direccionDefault, fechaConstruccionDefault, precioNoche, disponibleDefault); //Arreglar
	}
	
	public Apartamento(int numeroHabitaciones, double distanciaCentro, LocalDate ultimaReforma, String direccion, LocalDate fechaConstruccion, 
			double precioNoche, boolean disponible) throws IllegalArgumentException {
		super(direccion, fechaConstruccion, precioNoche, disponible);
		
		
		if (ultimaReforma.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de la última reforma no puede ser anterior a la actual.");
		}
		
		this.numeroHabitaciones = numeroHabitaciones; 
		this.distanciaCentro = distanciaCentro;
		this.ultimaReforma = ultimaReforma;
	
	}
	
	@Override
	public double calcularPrecio (int numeroDias) {
		
		double precio = super.calcularPrecio(numeroDias);
		
		if(distanciaCentro < 2 /*km*/) {
			precio = precio * 1.15;
		}

		return precio;
	}

	@Override
	public String toString() {
		return "Apartamento [numeroHabitaciones=" + numeroHabitaciones + ", distanciaCentro=" + distanciaCentro
				+ ", ultimaReforma=" + ultimaReforma + ", identificador=" + identificador + ", direccion=" + direccion
				+ ", fechaConstruccion=" + fechaConstruccion + ", precioNoche=" + precioNoche + ", disponible="
				+ disponible + "]";
	}
	
	

}
