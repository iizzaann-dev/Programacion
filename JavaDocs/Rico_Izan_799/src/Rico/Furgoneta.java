/*
 *Descripción: Creamos la clase furgoneta, que es hija de la clase vehiculo
 *Nombre: Izan Rico Blanco
 *Fecha: 25/03/2026
*/


package Rico;

import java.time.LocalDate;

public class Furgoneta extends Vehiculos{
	
	//Atributos inmutables de la clase
	public static final int volumen_maxDefault = 2000;
	
	//Atributos inmutables del objeto
	public final double volumen_max;
	
	//Atributos mutables del objeto
	public boolean sistemaRefigeracion;
	
	public Furgoneta(String identificador, String matricula, LocalDate fechaMatriculacion, boolean ITV,
			double precioDia, boolean sistemaRefigeracion, double volumen_max) {
		super(identificador, matricula, fechaMatriculacion, ITV, precioDia);
		
		this.volumen_max = volumen_max;
	
	}
	
	public Furgoneta (double volumen_max, boolean sistemaRefrigeracion) {
		this(volumen_max, sistemaRefrigeracion, super(identificador, matriculaDefault, fechaMatriculacionDefault, ITVDefault, precioDiaDefault));
	}
	
	public double calcularPrecio (int numDias) throws IllegalArgumentException {
		
		double precio = 0;
		
		if(ITV == true) {
			if (sistemaRefigeracion == true) {
				precio = (precioDia * numDias) + 25;

			}else {
				precio = precioDia * numDias;
			}
		}else {
			throw new IllegalArgumentException("No se puede calcular el precio por que no ha pasado la ITV");
		}
		
		
		return precio;
	}
	
	public boolean getRefrigeracion () {
		
		boolean resultado = false;
		
		if (sistemaRefigeracion == true){
			resultado = true;
		}else {
			resultado = false;
		}
		return resultado; 
	}
	
	public void setPrecioDia (double entrada) {
		precioDia = entrada; 
	}

}
