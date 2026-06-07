package Clases;

import java.io.FileWriter;

public class Main {
	
	public static void main(String[] args) {
		
		GestorFlota flota = new GestorFlota();
		
		try {
			flota.rellenarArray();
			flota.mostrarArray();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			FileWriter escritor = new FileWriter("Salida.txt");
			
			for(Vehiculo i : flota.getFlota()) {
				//Matricula, marca, coste
				escritor.write("Matricula: " + i.getMatricula() + " " + "Marca: " + i.getMarca() + " " + "Coste: " + String.valueOf(i.calcularCosteEstimado()) + " \n");
				escritor.write(System.lineSeparator()); //Para hacer un salto de linea, al igual que el \n
			}
			
			escritor.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
