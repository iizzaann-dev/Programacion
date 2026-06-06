package ClasesConcretas;

import ClasesAbstractas.Animal;

public class AnimalExotico extends Animal {
	
	private String paisOrigen; 
	
	public AnimalExotico(String nombre, String especie, int edadAnios, String paisOrigen) {
		super(nombre, especie, edadAnios);
		
		this.paisOrigen = paisOrigen;
	}

	public AnimalExotico(Animal a) {
		super(a);

	}

	@Override
	public String sonido() {

		return null;
	}
	
	@Override
	public String toString() {
		
		return String.format(super.toString() + ", pais de origen = " + paisOrigen);
	}

}
