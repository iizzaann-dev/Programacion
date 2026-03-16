package Usando_HarshSet;

import java.util.HashSet;
import java.util.Scanner;

public class HarshSet {

	public static void main(String[] args) {
		
		//Ejercicio 1
		
		Scanner teclado = new Scanner(System.in);
		
		int hashsetAleatorio = 50 + (int)(Math.random() * 51);
		HashSet<Integer> conjunto=new HashSet<Integer>(hashsetAleatorio);
		
		for (int contador = 0; contador < hashsetAleatorio; contador++) {
			int numeroAleatorio = 1 + (int)(Math.random() * 100);
			conjunto.add(numeroAleatorio);

		}
		
		System.out.println("Los valores del hashset son: " + conjunto);
		/*
		//Ejercicio 2
		System.out.println("Ingresa el numero que quieras comprobar para ver si estas en la lista.");

		int numUsuario = teclado.nextInt();
		if (conjunto.contains(numUsuario)) {
			System.out.printf("El numero %d se encuentra en la lista.%n", numUsuario);
		}else {
			System.out.printf("El numero %d no se encuentra en la lista.%n", numUsuario);

		}
		
		//Ejercicio 3
		System.out.println("Ingresa el numero que quieras eliminar de la lista.");
		numUsuario = teclado.nextInt();
		if (conjunto.contains(numUsuario)) {
			conjunto.remove(numUsuario);
			System.out.println("Se ha eliminado el numero " + numUsuario);
		}else {
			System.out.println("No se ha podido eliminar el numero " + numUsuario + " porque no se encuentra en la lista");
			
		}
		*/
		
		//Ejercicio 4
		HashSet<Integer> conjunto2 = new HashSet<Integer>(hashsetAleatorio);
		for (int contador = 0; contador < hashsetAleatorio; contador++) {
			int numeroAleatorio = 1 + (int)(Math.random() * 100);
			conjunto2.add(numeroAleatorio);

		}
		

		
		try {
			System.out.println("El tamaño del conjunto 2 es: " + conjunto2.size());
			conjunto2.addAll(conjunto);
			System.out.printf("El contenido del conjunto 2 es:  %s \n", conjunto2);
		} catch (IllegalArgumentException e1) {
			System.out.println(e1.getMessage());
		} catch (ClassCastException e2) {
			System.out.println(e2.getMessage()	);

		}
		
		System.out.println("El tamaño del conjunto 1 es: " + conjunto.size());
		System.out.println("El tamaño del conjunto 2 es: " + conjunto2.size());
		
		
		

	}

}
