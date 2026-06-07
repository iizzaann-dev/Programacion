package Clases;

public abstract class Vehiculo {

	protected final String matricula;
	protected final String marca;
	protected final int anio;
	protected final Combustible combustible;
	protected final int datoEspecifico;

	public Vehiculo(String matricula, String marca, int anio, Combustible combustible, int datoEspecifico) {

		this.matricula = matricula;
		this.marca = marca;
		this.anio = anio;
		this.combustible = combustible;
		this.datoEspecifico = datoEspecifico;

	}

	public abstract double calcularCosteEstimado();
	
	
	public int getAnio() {
		return anio;
	}
	
	
		
	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public int getDatoEspecifico() {
		return datoEspecifico;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", anio=" + anio + ", combustible=" + combustible
				+ ", datoEspecifico=" + datoEspecifico + "]";
	}

}
