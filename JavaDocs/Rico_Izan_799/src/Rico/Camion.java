/*
 *Descripción: Creamos la clase camion, que es hija de la clase vehiculo
 *Nombre: Izan Rico Blanco
 *Fecha: 25/03/2026
*/


package Rico;

import java.time.LocalDate;
import Rico.*;

public class Camion extends Vehiculos {
	
	//Atributos inmutables del objeto
	public final double CAPACIDAD_MIN = 0.5;
	public final int CAPACIDAD_MAX = 20;
	
	//Atributos mutables del objeto
	public double capacidad_maxima;
	
	public Camion(String identificador, String matricula, LocalDate fechaMatriculacion, boolean ITV, double precioDia, double capacidad_maxima) 
	throws IllegalArgumentException{
		
		super(identificador, matricula, fechaMatriculacion, ITV, precioDia);
		
		if (capacidad_maxima < CAPACIDAD_MIN) {
			throw new IllegalArgumentException("No se puede establecer una capacidad menor a 0.5 toneladas");
		}
		
		if (capacidad_maxima > CAPACIDAD_MAX) {
			throw new IllegalArgumentException("No se puede establecer una capacidad mayor a 20 toneladas");
		}
		
		this.capacidad_maxima = capacidad_maxima;
	}
	
	
	
	public Camion (double capacidad_maxima) {
		this(capacidad_maxima, identificador, matricula, fechaMatriculacionDefault, ITVDefault, precioDiaDefault);
	} 
	
	
	

	public double calcularPrecio (int numDias) throws IllegalArgumentException {
			
			double precio = 0;
			
			if(ITV == true) {
				if (capacidad_maxima > 10) {
					precio = (precioDia * numDias) * 1.20;

				}else {
					precio = precioDia * numDias;
				}
			}else {
				throw new IllegalArgumentException("No se puede calcular el precio por que no ha pasado la ITV");
			}
			
			
			return precio;
		}
	
	public void setITV() {
		
		if (ITV = true) {
			ITV = false;
		}else {
			ITV = true; 
		}
		
	}
		
}

