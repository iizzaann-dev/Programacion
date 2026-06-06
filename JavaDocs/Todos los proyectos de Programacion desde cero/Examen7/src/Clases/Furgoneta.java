package Clases;

import java.time.LocalDate;

public class Furgoneta extends Vehiculos{

	public double volumenMaximo;
	public boolean sistemaRefrigeracion;
	
	
	public Furgoneta(double volumenMaximo, boolean sistemaRefrigeracion) {
		this(volumenMaximo, sistemaRefrigeracion, matriculaDefault, fechaMatriculacionDefault, ITVdefault,precioDiaDefault);
	}
	
	public Furgoneta(double volumenMaximo, boolean sistemaRefrigeracion, String matricula, LocalDate fechaMatriculacion, boolean ITV, double precioDia) {
		super(matricula, fechaMatriculacion, ITV, precioDia);
		
		this.volumenMaximo = volumenMaximo;
		this.sistemaRefrigeracion = sistemaRefrigeracion;
	
	}

	public void setPrecioDia(double precio) {
		super.precioDia = precio;
	}
	
	
	
	
	public boolean getSistemaRefrigeracion() {
		return sistemaRefrigeracion;
	}

	public double calcularCoste(int numeroDias) throws IllegalStateException {

		if (ITV == false) {
			throw new IllegalStateException(
					"No se puede calcular el coste porque el camión no ha pasado la ITV correspondiente.");
		} else {
			
			if(sistemaRefrigeracion == false) {
				return precioDia * numeroDias;
				
			}else {
				return (precioDia * numeroDias) + 25;
			}
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Furgoneta [volumenMaximo=" + volumenMaximo + ", sistemaRefrigeracion=" + sistemaRefrigeracion + ", id="
				+ id + ", matricula=" + matricula + ", fechaMatriculacion=" + fechaMatriculacion + ", ITV=" + ITV
				+ ", precioDia=" + precioDia + "]";
	}
}
