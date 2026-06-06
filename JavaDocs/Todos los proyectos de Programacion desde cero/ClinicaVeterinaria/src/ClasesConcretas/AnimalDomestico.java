package ClasesConcretas;

import ClasesAbstractas.*;

public class AnimalDomestico extends Animal{
	
	private String duenio;
	
	public AnimalDomestico(String nombre, String especie, int edadAnios, String duenio) {
		super(nombre, especie, edadAnios);

		this.duenio = duenio;
	}
	
		
	public AnimalDomestico(AnimalDomestico a) {
		super(a);
		
		this.duenio = a.duenio;
		
	}

	@Override
	public String sonido() {
		return null;
	}

	@Override
	public String toString() {
		
		return String.format(super.toString() + ", dueño = " + duenio);
	}
	
	

}
