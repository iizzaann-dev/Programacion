package Mobiliario.asiento;

import Mobiliario.Mueble;

public abstract class Asiento extends Mueble {
	
	//Atributos inmutables de la clase 
	public static final int min_plazas = 1;
	public static final int max_plazas = 9;
	
	//Atributos inmutables del objeto
	protected final int numPlazas;
	protected final String tapiceria;
	protected final String color;
	
	public Asiento(int numPlazas, String tapiceria, String color, String descripcion, double precio) throws IllegalArgumentException {
		super(descripcion, precio);
		
		if (numPlazas < min_plazas || numPlazas > max_plazas) {
			throw new IllegalArgumentException("El número de plazas no está en el rango permitido: " + numPlazas);
		}
		
		this.numPlazas = numPlazas;
		this.tapiceria = tapiceria;
		this.color = color;
		
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public String getTapiceria() {
		return tapiceria;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return String.format("%s, Número de plazas: %s, Tapicería: %s, Color: %s",super.toString(), getNumPlazas() , getTapiceria(), getColor());
	}
	
}
