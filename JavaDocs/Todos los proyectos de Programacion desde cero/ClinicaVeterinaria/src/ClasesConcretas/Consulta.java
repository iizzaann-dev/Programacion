package ClasesConcretas;

import java.util.ArrayList;

import ClasesAbstractas.Animal;
import Excepciones.CapacidadExcedidaException;

public class Consulta {
	
	private String fecha;
	private Animal animal;
	private ArrayList <Tratamiento> tratamientos;
	
	public Consulta (String fecha, Animal animal, ArrayList <Tratamiento> tratamientos) throws CapacidadExcedidaException {
		
		if(tratamientos.size() > 5) {
			throw new CapacidadExcedidaException("5");
		}
		
		this.fecha = fecha;
		this.animal = animal;
		this.tratamientos = tratamientos;
		
	}
	
	public double calcularCosteTotal () {
		
		double resultado = 0;
		
		for(Tratamiento i : tratamientos) {
			
			resultado += i.getCoste();
		}
		
		return resultado;
	}
	
	//Getters y setters
	

	@Override
	public String toString() {
		return "Consulta [fecha=" + fecha + ", animal=" + animal + ", tratamientos=" + tratamientos + "]";
	}

	public Animal getAnimal() {
		return animal;
	}

	public ArrayList<Tratamiento> getTratamientos() {
		return tratamientos;
	}
	
	
	
}
