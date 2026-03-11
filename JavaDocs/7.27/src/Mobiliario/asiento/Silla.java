package Mobiliario.asiento;

import Mobiliario.Ajustable;

public class Silla extends Asiento implements Ajustable {
	
	
	//Atributos mutables del objeto
	private int posicion;
		
	public Silla(int numPlazas, String tapiceria, String color, String descripcion, double precio)
			throws IllegalArgumentException {
		
		super(Asiento.min_plazas, tapiceria, color, descripcion, precio);

		
		this.posicion = MIN_POSICION;
	}

	@Override
	public int obtenerPosicion() {
		return posicion;
	}


	@Override
	public void subirPosicion(int nuevaPosicion) throws IllegalArgumentException {

	    if (posicion + nuevaPosicion > MAX_POSICION) {
	        throw new IllegalArgumentException(
	            "No se puede subir tanto el respaldo. Máximo: " + MAX_POSICION);
	    }

	    posicion = posicion + nuevaPosicion;
	}
	
	@Override
	public void bajarPosicion(int nuevaPosicion) throws IllegalArgumentException {

	    if (posicion - nuevaPosicion < MIN_POSICION) {
	        throw new IllegalArgumentException(
	            "No se puede bajar tanto el respaldo. Mínimo: " + MIN_POSICION);
	    }

	    posicion = posicion - nuevaPosicion;
	}

	@Override
	public String toString() {
		return super.toString() + "Posicion =" + posicion;
	}
	
	
}