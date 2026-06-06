package Clases;

import java.time.LocalDate;

public class Camion extends Vehiculos {

	public double capacidadCarga;
	
	
	public Camion(double capacidadCarga) {
		this(capacidadCarga, matriculaDefault, fechaMatriculacionDefault, ITVdefault, precioDiaDefault);	
	}
	
	public Camion(double capacidadCarga, String matricula, LocalDate fechaMatriculacion, boolean ITV,
			double precioDia) {
		super(matricula, fechaMatriculacion, ITV, precioDia);

		this.capacidadCarga = capacidadCarga;
	}
	

	public double calcularCoste(int numeroDias) throws IllegalStateException {

		if (ITV == false) {
			throw new IllegalStateException(
					"No se puede calcular el coste porque el camión no ha pasado la ITV correspondiente.");
		} else {

			if (capacidadCarga < 10) {
				return precioDia * numeroDias;

			} else {
				return (precioDia * numeroDias) * 1.20;
			}
		}
	}
	
	
	public void setITV(boolean iTV) {
		super.ITV = iTV;
	}
	
	
	@Override
	public String toString() {
		return "Camion [capacidadCarga=" + capacidadCarga + ", id=" + id + ", matricula=" + matricula
				+ ", fechaMatriculacion=" + fechaMatriculacion + ", ITV=" + ITV + ", precioDia=" + precioDia + "]";
	}
}
