package Clases;

import java.time.LocalDate;

abstract class Vehiculos {

	protected String id;
	protected String matricula;
	protected LocalDate fechaMatriculacion;
	protected boolean ITV;
	protected double precioDia;
	protected static int contador;
	
	//Atributos por defecto
	protected static final String matriculaDefault = "0000 AAA";
	protected static final LocalDate fechaMatriculacionDefault = LocalDate.of(2000, 01, 01);
	protected static final boolean ITVdefault = true;
	protected static final double precioDiaDefault = 50;

	public Vehiculos(String matricula, LocalDate fechaMatriculacion, boolean ITV, double precioDia) {

		this.matricula = matricula;
		this.fechaMatriculacion = fechaMatriculacion;
		this.ITV = ITV;
		this.precioDia = precioDia;
		this.id = generarId();
		contador++;
	}

	public String generarId() {

		String id = "";

		id = String.format("%02d-%03d", (fechaMatriculacion.getYear() % 100), (contador + 1));

		return id;
	}

	public static int getNumeroVehiculos() {
		return contador;
	}
	
	

	@Override
	public String toString() {
		return "Vehiculos [id=" + id + ", matricula=" + matricula + ", fechaMatriculacion=" + fechaMatriculacion
				+ ", ITV=" + ITV + ", precioDia=" + precioDia + "]";
	}
	
	

}
