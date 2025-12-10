package Ejercicio2;

import java.util.Iterator;

import libtarea3.Dado;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String [] almacen = new String;
		
		System.out.printf("El número de dados que hay es: %s. \n", Dado.getNumeroDadosCreados());
		System.out.printf("La cantidad de tiradas totales es: %s.\n", Dado.getNumeroLanzamientosGlobal());
	 
		System.out.println("");

		for (int contador = 1; contador <= 4; contador++) {
			System.out.printf("El número de caras totales de %d es: %d. \n", contador, Dado.getNumeroVecesCaraGlobal(contador));
		}
		
		System.out.println("");

		Dado dado1; 
		
		for(int contador = 0; contador <= 10; contador++) {
			try {
				dado1 = new Dado ((int)(Math.random() * 9));
				System.out.printf("Correcto, se ha creado un dado de %d caras. \n\n", contador );
				for(int contador1 = 0; contador1 <= contador; contador1++) {
					almacen = dado1.lanzar();
					
				}
			} catch (IllegalArgumentException ex01) {
				System.out.printf("Error: %s. \n", ex01.getMessage());
				dado1 = new Dado();
				System.out.printf("Se ha creado un dado vacio. \n\n");
			}
			
		}

	}

}
