package linea;

public class Punto {
	
	int x;
	int y;

	public Punto (int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	
	public void moverDerecha(double distancia) {
	
		this.x += distancia;
		
		}
	
	public void moverIzquierda(double distancia) {
		
		this.x -= distancia;
		
		}

	public void moverArriba(double distancia) {
		
		this.y += distancia;
		
		}
	
	public void moverAbajo(double distancia) {
		
		this.y -= distancia;
		
		}
	
	@Override
	public String toString() {
	    return "(" + x + ", " + y + ")";
	}

}

