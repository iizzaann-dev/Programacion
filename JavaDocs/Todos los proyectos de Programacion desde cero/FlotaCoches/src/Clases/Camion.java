package Clases;

public class Camion extends Vehiculo {

	public Camion(String matricula, String marca, int anio, Combustible combustible, int datoEspecifico) {

		super(matricula, marca, anio, combustible, datoEspecifico);

	}

	@Override
	public double calcularCosteEstimado() {

		int base = 300;

		return base + (this.datoEspecifico * 0.5);
	}

	@Override
	public String toString() {
		return "Camion [matricula=" + matricula + ", marca=" + marca + ", anio=" + anio + ", combustible=" + combustible
				+ ", cargaMaxima=" + datoEspecifico + "]";
	}

}
