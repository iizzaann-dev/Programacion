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

		if (posicion < min_posicion){
			throw new IllegalArgumentException("La posición del respaldo no puede ser menor de " + min_posicion);
		}

		if(posicion > max_posicion){
			throw new IllegalArgumentException("La posición del respaldo no puede ser mayor de " + max_posicion);
		}
	}

	@Override
	public int obtenerPosicion() {
		return posicion;
	}

	@Override
	public void subirPosicion(int nuenvaPosicion) throws IllegalArgumentException {
		int posicionActual = posicion;
		if (nuenvaPosicion < MIN_POSICION){
			throw new IllegalArgumentException("Solo se puede subir la posición del respaldo con un máximo de valor de: " + MAX_POSICION);
		}
		posicion = nuenvaPosicion;
		if(posicion > MAX_POSICION){
			posicion = MAX_POSICION;
			throw new IllegalArgumentException("Solo se puede subir la posición del respaldo con un máximo de valor de: " + MAX_POSICION);
		}


	}
}