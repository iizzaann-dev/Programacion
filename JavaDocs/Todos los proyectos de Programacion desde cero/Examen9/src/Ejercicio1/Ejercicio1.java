package Ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		File libro = new File ("src/Ejercicio1/libros.txt");
		Scanner teclado = new Scanner(libro);
		HashSet <Libro> lista1 = new HashSet<>();
		
		
		//Apartado 1
		
		int contador = 0;
		
		System.out.println("Apartado 1: ");

		while(teclado.hasNextLine()) {
			String linea = teclado.nextLine();
			
			lista1.add(formateo(linea));
			
			contador++;
			System.out.println(linea);

		}
		
		System.out.println("");

		
		//Apartado 2
		System.out.println("Apartado 2:");
		
		Libro libro2 = new Libro ("978-84-206-9999-0", "Alicia en el pais de las maravillas", "Lewis Carrol", 9.90f);
		lista1.add(libro2);
		contador++;
		
		System.out.println("Libro2: " + libro2);
		System.out.println("");

		System.out.println("Lista 1 " + lista1);
		System.out.println("");
		
		System.out.println("Hay " + contador + " objetos en la lista.");


		//Apartado 3
		System.out.println("Apartado 3:");
		
		
		Libro libro3 = new Libro("978-84-975-9220-8", "1984", "George Orwell", 12.00f);
		lista1.add(libro3);
		contador++;
		
		System.out.println("Libro3: " + libro3);
		System.out.println("");

		System.out.println("Lista 1 " + lista1);
		System.out.println("");
		
		System.out.println("Hay " + contador + " objetos en la lista.");
		
		
		
		//Apartado 4 
		System.out.println("Apartado 4:");
		
		boolean encontrado = false;
		for(Libro i : lista1) {
			
			if(i.getIsbn().equals("978-84-975-9220-8")) {
				encontrado = true; 
			}else {
				encontrado = false;

			}
		}
		
		if(encontrado == true) {
			System.out.println("El libro con el ISBN 978-84-975-9220-8 si se encuentra en la lista.");
		}else {
			System.out.println("El libro con el ISBN ingresado no se encuentra en la lista.");

		}
		
		
		teclado.close();
	}
	
		
	
	
	public static Libro formateo (String linea) {
		
		
		
		String [] partes = linea.split(";");
		
		String ISBN = partes[0];
		String titulo = partes[1];
		String autor = partes[2];
		String precioString = partes[3];
		
		float precio = Float.parseFloat(precioString);
		
		Libro libro1 = new Libro(ISBN, titulo, autor, precio);
		
		return libro1;
	}
}
