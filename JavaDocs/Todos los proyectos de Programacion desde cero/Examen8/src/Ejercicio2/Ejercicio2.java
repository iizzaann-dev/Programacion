package Ejercicio2;

import java.util.LinkedList;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Apartado1

		LinkedList<Empleado> lista1 = new LinkedList<>();

		for (int i = 0; i < 10; i++) {
			lista1.add(Empleado.generarAleatorio());
		}

		// Apartado2

		Empleado empleado1 = Empleado.generarAleatorio();
		int mitad = lista1.size() / 2;

		lista1.add(mitad, empleado1);

		for (int i = 0; i < lista1.size(); i++) {
			System.out.println(lista1.get(i));

		}

		// Apartado3

		lista1.sort((a, b) -> b.getDni().compareTo(a.getDni())); // Expresion lambda Ascendente: .sort((a,b)-> a-b)
																	// Descendente: .sort((a,b)-> b-a) Comparamos
																	// mediante el identificador
		// En las expresiones lambda se usa el operador menos cuando son numeros, y
		// comprateTo(el otro elemento) para los Strings

		System.out.println("El empleado nuevo es: " + empleado1);

		for (int i = 0; i < lista1.size(); i++) {
			System.out.println(lista1.get(i));

		}

		// Apartado4
		boolean encontrado = false;

		for (Empleado e : lista1) { // Nunca usar contains con Strings

			if (e.getDni().equals("101010101Z")) {
				System.out.println("La informacion del empleado es: " + e);
				encontrado = true;
			}
		}

		if (encontrado == false) {
			System.out.println("No se ha encontrado al empleado con el DNI 101010101Z.");

		}

		// Apartado5
		encontrado = false;
		int cantidad = 0;
		
		for (Empleado e : lista1) { // Nunca usar contains con Strings

			if (e.getNombre().equalsIgnoreCase("Ana")) {
				System.out.println("La informacion del empleado es: " + e);
				cantidad++;
				encontrado = true;

			}
		}
		
		if (encontrado == false) {
			System.out.println("No se ha encontrado al empleado con el DNI 101010101Z.");

		}else {
			System.out.println("La cantidad de empleados llamados Ana es: " + cantidad);

		}
		
		
		//Apartado 6
		encontrado = false;
		
		while(encontrado == false) {
			for(int i = 0; i < lista1.size(); i++) {
				
				if(lista1.get(i).getNombre().equalsIgnoreCase("Luis")) {
					System.out.println("El objeto a eliminar es: " + lista1.get(i));
					lista1.remove(i);
					encontrado = true; 
				}
			}
		}
		
		System.out.println("Quedan " + lista1.size() + " elementos dentro de la lista.");

	}
}