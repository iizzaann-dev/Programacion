package ClasesAbstractas;

public abstract class Animal implements Comparable <Animal> {
	
	private String nombre;
	private String especie;
	private int edadAnios;
	
	public Animal (String nombre, String especie, int edadAnios) {
		
		this.nombre = nombre;
		this.especie = especie;
		this.edadAnios = edadAnios;
		
	}
	
	public Animal(Animal a) {
		
		this.nombre = a.nombre;
		this.especie = a.especie;
		this.edadAnios = a.edadAnios;
		
	}
	
	
	//Metodos
	public abstract String sonido ();
	
	//Getters y setters
	
	

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", especie=" + especie + ", edadAnios=" + edadAnios + " años";
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int compareTo(Animal o) {	
		
		return Integer.compare(this.edadAnios, o.edadAnios); //Esta en orden ascendente, si lo queremos en forma descendente se pone -Integer
	}
	
	
	
}
