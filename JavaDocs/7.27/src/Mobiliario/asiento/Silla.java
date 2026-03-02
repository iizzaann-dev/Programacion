package Mobiliario.asiento;

import Mobiliario.Ajustable;

public class Silla extends Asiento implements Ajustable {
	
	//Atributos inmutables de la clase
	public static final int min_posicion = 1;
	public static final int max_posicion = 4;
	public static final int default_posicion_porDefecto = 0;
	
	//Atributos mutables del objeto
	private int num_posicion_respaldo;
	private int posicion;
		
	public Silla(int numPlazas, String tapiceria, String color, String descripcion, double precio)
			throws IllegalArgumentException {
		
		super(Asiento.min_plazas, tapiceria, color, descripcion, precio);
	}

	@Override
	public int obtenerPosicion() throws IllegalStateException {
		if (posicion < MIN_POSICION) {
			posicion = this.default_posicion_porDefecto;
			throw new IllegalStateException("La posición actual es menor que la posición mínima permitida: " + posicion 
			+ "Establecimiento de la posición a posición por defecto: " + default_posicion_porDefecto);
		}

		if (posicion > MAX_POSICION){
			posicion = this.default_posicion_porDefecto;
			throw new IllegalStateException("La posición actual es mayor que la posición máxima permitida: " + posicion 
			+ "Establecimiento de la posición a posición por defecto: " + default_posicion_porDefecto);
		}
		
		return posicion;
	}
}
