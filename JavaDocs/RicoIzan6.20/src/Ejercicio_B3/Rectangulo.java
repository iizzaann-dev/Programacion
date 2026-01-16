package Ejercicio_B3;

public class Rectangulo {
	
	int x1;
	int y1;
	int x2;
	int y2;
	
	
	public Rectangulo (int x1, int y1, int x2, int y2) throws IllegalArgumentException { 
		
		if (x1 > x2 || y1 > y2) {
			if (x1 > x2) {
				throw new IllegalArgumentException("La coordenada x1 es mayor que la coordenada x2.");
				
			}else if (y1 > y2) {
				throw new IllegalArgumentException("La coordenada y1 es mayor que la coordenada y2.");
			}
		}
		
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
}
