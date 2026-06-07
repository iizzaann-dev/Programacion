package Clases;

public class Furgoneta extends Vehiculo {

	public Furgoneta(String matricula, String marca, int anio, Combustible combustible, int datoEspecifico) {
		
		super(matricula, marca, anio, combustible, datoEspecifico);

	}

	@Override
	public double calcularCosteEstimado() {
		
		int base = 150;
		
		return base + (10 * this.datoEspecifico);
	}

	@Override
	public String toString() {
		return "Furgoneta [matricula=" + matricula + ", marca=" + marca + ", anio=" + anio + ", combustible="
				+ combustible + ", Numero de plazas=" + datoEspecifico + "]";
	}
	
	
	
}
