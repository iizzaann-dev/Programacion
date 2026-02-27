package Mobiliario.asiento;

import Mobiliario.*;

public class Silla extends Asiento implements Ajustable {
	
	//Atributos inmutables de la clase
	public static final int min_posicion = 1;
	public static final int max_posicion = 4;
	
	//Atributos mutables del objeto
	private int num_posicion;
		
	public Silla(int numPlazas, String tapiceria, String color, String descripcion, double precio)
			throws IllegalArgumentException {
		
		super(numPlazas, tapiceria, color, descripcion, precio);
		
		this.numPlazas = Asiento.min_plazas;
	}
}
