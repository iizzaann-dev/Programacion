package cafetera;

public class Cafetera {
	
	//Atributos de objeto mutables
	private double cantidadActual;
	private double capacidadMaxima;

	
	
	public Cafetera (double cantidadActual, double capacidadMaxima) throws IllegalArgumentException {		//Constructor al que le pedimos parametros  y comparamos las cantidades
		this.capacidadMaxima = capacidadMaxima;

		if(cantidadActual > capacidadMaxima) {
			double sobrante = cantidadActual - capacidadMaxima;
			this.cantidadActual = capacidadMaxima;
			cantidadActual = capacidadMaxima;
			throw new IllegalArgumentException( "Sobra " + sobrante + " c.c. de café");
		}
		
		this.cantidadActual = cantidadActual;
	}
	
	public Cafetera (double capacidadMaxima) {		//Constructor con la capacidad actual al maximo
		this(capacidadMaxima, capacidadMaxima);
	}
	
	public Cafetera () {					//Constructor predeterminado, no pedimos parametros pero le establecemos unos valores predeterminados
		this(0, 1000);
	}
	
	public void llenarCafetera(double cantidad) { 									//Metodo en donde llenamos la cafetera
		
		if (cantidad < 0) { 														//Si la cantidad es negativa, lanzamos un error
			throw new IllegalArgumentException("La cantidad no puede ser negativa."); 
		} 
		
		if (cantidadActual + cantidad > capacidadMaxima) { 						//Si la cantidad es mayor a la capacidad maxima, la llenamos y lanzamos excepcion
			throw new IllegalArgumentException("La cantidad supera la capacidad máxima."); 
		} 
		
		cantidadActual += cantidad; 												//Si la capacidad es menor, la llenamos con la cantidad indicada
		
	}
	public void servirTaza (int cantidad)throws IllegalArgumentException {				//Metodo que nos permite servir cafe en una taza
		
		if (cantidad > cantidadActual) {												//Si la cantidad es mayor a la capacidad actual, echamos todo lo que haya en la
			double servido = cantidadActual;
			cantidadActual = 0;										//cafetera y lanzamos una excepcion avisando de ello
			throw new  IllegalArgumentException("No hay suficiente cafe en la cafetera, se ha servido la cantidad restante de café en el recipiente: " + servido + " c.c.");
			
		}else {
			cantidadActual -= cantidad;
		}
	}
	
	public void vaciarCafetera() {
		this.cantidadActual = 0;
	}

	public double getCapacidadActual() {
		return cantidadActual;
	}

	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadActual(double capacidadActual) {
		this.cantidadActual = capacidadActual;
	}

	public void setCapacidadMaxima(double capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	@Override
	public String toString() {
		return "Cafetera [capacidadActual=" + cantidadActual + ", capacidadMaxima=" + capacidadMaxima + "]";
	}
	
	
}
