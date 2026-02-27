/*
 *Descripción: Clase padre, tiene como hija a apartamento, casa rural y hotel
 *Nombre: Izan Rico Blanco
 *Fecha: 18/02/2026
*/


package Rico;

import java.time.LocalDate;
import Rico.Entrada;

public abstract class Vivienda {
	
	//Atributos inmutables del objeto
	protected final String identificador; 
	protected final LocalDate fechaConstruccion; 
	protected final String direccion;
	
	//Atributos mutables del objeto
	protected double precioNoche;
	protected boolean disponible;
	protected int cantidadNoches;
	
	//Variable necesaria
	private int contador; 
	
	public Vivienda (LocalDate fechaConstruccion, String direccion, double precioNoche, boolean disponible, byte cantidadNoches) {
		
		this.identificador = generarIdentificacion();
		this.fechaConstruccion = fechaConstruccion;
		this.direccion = direccion;
		this.precioNoche = precioNoche;
		this.disponible = disponible;
		this.cantidadNoches = cantidadNoches;
	}
	
	public String generarIdentificacion() {		//Generamos el identificador
		
		contador = 0; 
		
		for (int i = 0; i < 1000; i++) {
			contador++;
		}
		
		return String.format("%d-%03d",fechaConstruccion.getYear(), contador);
	}
	
	
	public String contadorViviendas() {
		
		return String.format("Hay %d viviendas turísticas", contador);
	}

	@Override
	public String toString() {
		return String.format("Identificador: %s, Fecha de la construccion: %s, Direccion %s, precioNoche: %.2f, Disponible: %b, Cantidad de noches en hospedaje: %d",
				identificador, fechaConstruccion, direccion, precioNoche, disponible, cantidadNoches);
	}
	
	
}
