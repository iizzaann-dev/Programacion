package CD;

import Cancion.Cancion;

public class CD {
	
	private Cancion [] canciones = new Cancion[100];
	private int contador;
	
	public CD() {
		this.canciones = canciones;
		
	}
	
	public int numeroCanciones(Cancion [] canciones) {
		
		int cantidad = 0;
		int minimo = 0;
		
		for (int fila = 0; fila < canciones.length; fila++) {
			if (fila[canciones] < minimo) {
				minimo = canciones[fila];
			}
		}
		
		return contador;
	}
	
	
}
