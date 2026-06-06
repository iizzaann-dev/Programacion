package ClasesConcretas;

public class Tratamiento implements Comparable <Tratamiento>{
	
	private String descripcion; 
	private int duracionDias;
	private double coste; 
	
	public Tratamiento(String descripcion, int duracionDias, double coste) {
		
		this.descripcion = descripcion;
		this.duracionDias = duracionDias;
		this.coste = coste;
		
	}
	
	public Tratamiento(Tratamiento t) {
		
		
		this.descripcion = t.descripcion;
		this.duracionDias = t.duracionDias;
		this.coste = t.coste;
	}

	@Override
	public String toString() {
		return "Tratamiento [descripcion=" + descripcion + ", duracionDias=" + duracionDias + ", coste=" + coste + "]";
	}

	@Override
	public int compareTo(Tratamiento t) {				//Si devuelve un numeroPositivo el primero es mayor que el segundo, si es 0 los dos objetos son negativos, 
		return Double.compare(this.coste, t.coste);		//si sale numeroNegativo el segundo es mayor que el primero
	}

		
	//Getters y setters
	
	public double getCoste() {
		return coste;
	}
	
}
