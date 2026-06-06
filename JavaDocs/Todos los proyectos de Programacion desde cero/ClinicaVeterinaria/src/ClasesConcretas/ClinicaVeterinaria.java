package ClasesConcretas;

import java.util.ArrayList;
import java.util.Collections;

import ClasesAbstractas.Animal;
import Excepciones.AnimalNoEncontradoException;
import Excepciones.CapacidadExcedidaException;

public class ClinicaVeterinaria {
	
	private String nombre;
	private int capacidadMaxima;
	private ArrayList <Consulta> consultas;
	
	public ClinicaVeterinaria (String nombre, int capacidadMaxima, ArrayList <Consulta> consultas) {
		
		this.nombre = nombre;
		this.capacidadMaxima = capacidadMaxima;
		this.consultas = consultas;
		
	}
	
	public void registrarConsulta (Consulta c) throws CapacidadExcedidaException {
		
		if(consultas.size() >= capacidadMaxima) {
			throw new CapacidadExcedidaException(String.format("%d", capacidadMaxima));
		}
		
		consultas.add(c);
		
	}
	
	public Animal buscarAnimalPorNombre (String nombre) throws AnimalNoEncontradoException{
		
		Animal a = null;
		boolean encontrado = false;
		
		for(Consulta i : consultas) {
			
			if(i.getAnimal().getNombre().equalsIgnoreCase(nombre)) {
				
				a = i.getAnimal();
				encontrado = true;
				
			}
		}
		
		if(encontrado == false) {
			throw new AnimalNoEncontradoException(nombre);
		}
		
		return a;
	}
	
	public ArrayList<Animal> listarAnimalesOrdenados(){
		
		ArrayList<Animal> lista1 = new ArrayList<>();
		
		for(Consulta i : consultas) {
			
			lista1.add(i.getAnimal());
		}
		
		Collections.sort(lista1);
		
		return lista1;
	}
	
	
	public Consulta consultaMasCara() {
		
		Consulta c = null;
		double maximo = 0;
		
		for(Consulta i : consultas) {
			
			for(Tratamiento j : i.getTratamientos()) {
								
				if(j.getCoste() > maximo) {
					
					maximo = j.getCoste();
					c = i;
				}
			}
		}
		
		return c;
	}
}
