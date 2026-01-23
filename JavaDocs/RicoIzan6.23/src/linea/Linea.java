package linea;

public class Linea {
	
	private Punto puntoA;
	private Punto puntoB;
	
	public Linea(Punto puntoA, Punto puntoB) {
		
		this.puntoA = puntoA;
		this.puntoB = puntoB;
		
	}
	public Linea() {
		this.puntoA = new Punto (0, 0);
		this.puntoB = new Punto (0, 0);
	}
	
	 public void moverDerecha(double distancia) {
	        puntoA.moverDerecha(distancia);
	        puntoB.moverDerecha(distancia);
	    }

	    public void moverIzquierda(double distancia) {
	        puntoA.moverIzquierda(distancia);
	        puntoB.moverIzquierda(distancia);
	    }

	    public void moverArriba(double distancia) {
	        puntoA.moverArriba(distancia);
	        puntoB.moverArriba(distancia);
	    }

	    public void moverAbajo(double distancia) {
	        puntoA.moverAbajo(distancia);
	        puntoB.moverAbajo(distancia);
	    }
	
	 // Getters y setters
    public Punto getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(Punto puntoA) {
        this.puntoA = puntoA;
    }

    public Punto getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(Punto puntoB) {
        this.puntoB = puntoB;
    }

    // Método para mostrar la información de la línea
    public String mostrarLinea() {
        return "[" + puntoA + "," + puntoB + "]";
    }

    @Override
    public String toString() {
        return mostrarLinea();
    }
	
}
