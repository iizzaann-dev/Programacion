package Clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorFlota {
	
	ArrayList <Vehiculo> flota;
	
	public GestorFlota () {
		
		this.flota = new ArrayList <> ();
	}
	
	public void rellenarArray() throws FileNotFoundException{
		
		try {
			File archivo = new File("./Coches.txt");
			
			Scanner teclado = new Scanner(archivo);
			
			while(teclado.hasNextLine()) {
				
				String entrada = teclado.nextLine();
				
				String [] partes = entrada.split(";");
				
				
				Vehiculo v = null;
				
				if(partes[0].equalsIgnoreCase("Camion")) {
					
					v = new Camion (partes[1], partes[2], Integer.parseInt(partes[3]), convertirCombustible(partes[4]), Integer.parseInt(partes[5]));
					
				}else {
					
					v = new Furgoneta (partes[1], partes[2], Integer.parseInt(partes[3]), convertirCombustible(partes[4]), Integer.parseInt(partes[5]));
				}
				
				flota.add(v);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo.");

		}	
	}
	
	
	public Combustible convertirCombustible (String sinConvertir) {
		
		Combustible c;
		
		if(sinConvertir.equalsIgnoreCase("Gasolina")) {
			c = Combustible.GASOLINA;
			
		}else if (sinConvertir.equalsIgnoreCase("Diesel")) {
			c = Combustible.DIESEL;
			
		}else if (sinConvertir.equalsIgnoreCase("Electrico")) {
			c = Combustible.ELECTRICO;
			
		}else {
			c = Combustible.HIBRIDO;
		}
		
		return c;
	}
	
	public void mostrarArray() {
		
		for(Vehiculo i : flota) {
			
			System.out.println(i.toString());

		}
	}
	
	
	
	public ArrayList<Vehiculo> getFlota() {
		return flota;
	}

	public void obetenerCombustible(String combustible) {
		
		for(Vehiculo i : flota) {
			
			if(i.getCombustible() == convertirCombustible(combustible)) {
				System.out.println(i);

			}
		}
	}
	
	//Calcular el coste total de revisiones anuales de toda la flota.
	public double costeRevisiones () {
		
		double coste = 0; 
		
		for(Vehiculo i : flota) {
			coste += i.calcularCosteEstimado();
		}
		
		return coste;
	}
	
	//Obtener el vehículo más antiguo de la flota
	public Vehiculo vehiculoMasAntiguo() {
		
		int min = 20000000;
		Vehiculo v = null;
		
		for(Vehiculo i : flota) {
			
			if(i.getAnio() < min) {
				min = i.getAnio();
				v = i;
			}
		}
		
		return v;
	}
	
	//Contar cuantas furgonetas tienen mas de 5 plazas
	public int cantidadFurgonetasMayoresA5Plazas() {
		
		int contador = 0;
		
		for(Vehiculo i : flota) {
			if(i.getDatoEspecifico() > 5 && i.getDatoEspecifico() < 10) {
				contador++;
			}
		}
		
		return contador;
	}
}
