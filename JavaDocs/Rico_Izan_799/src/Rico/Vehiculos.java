/*
 *Descripción: Creamos la clase vehiculo, que tendra como hijas a la clase camion y a la clase furgoneta
 *Nombre: Izan Rico Blanco
 *Fecha: 25/03/2026
*/


package Rico;

import java.time.LocalDate;

public class Vehiculos {
	
	//Atributos inmutables de la clase
	public final static String matriculaDefault = "AAA0000";
	public final static LocalDate fechaMatriculacionDefault = LocalDate.of(2010, 1, 1);
	public final static boolean ITVDefault = true;
	public final static double precioDiaDefault = 100;
	
	
	//Atributos mutables de la clase
	public static LocalDate fechaMatriculacion;

	//Atributos inmutables del objeto
	public final static String identificador = generarIdentificador();
	
	//Atributos mutables del objeto
	public String matricula;
	public boolean ITV;
	public double precioDia; 
	
	public Vehiculos (String identificador, String matricula, LocalDate fechaMatriculacion, boolean ITV, double precioDia) 
		throws IllegalArgumentException{
		
		
		if (fechaMatriculacion.isBefore(LocalDate.of(2010, 1, 1))) {
			throw new IllegalArgumentException("La fecha no puede ser anterior a 1/2010");
		}
		
		this.matricula = matricula;
		this.fechaMatriculacion = fechaMatriculacion;
		this.ITV = ITV;
		this.precioDia = precioDia;
	}
	
	public static String generarIdentificador() {
		String id = "";
		int contador = 0;
		
		try {
			id = String.format("%02d%-%03d", fechaMatriculacion.getYear(), contador);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}
	
	
}
