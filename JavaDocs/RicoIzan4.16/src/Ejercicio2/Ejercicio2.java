package Ejercicio2;

import libtarea3.Dado;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		System.out.printf("El número de dados que hay es: %s. \n", Dado.getNumeroDadosCreados());
		System.out.printf("La cantidad de tiradas totales es: %s.\n", Dado.getNumeroLanzamientosGlobal());
	 
		
		for (int contador = 1; contador <= 4; contador++) {
			System.out.printf("El número de caras totales de %d es: %d. \n", contador, Dado.getNumeroVecesCaraGlobal(contador));
		}
		Dado dado1; 
		for(int contador = 0; contador <= 10; contador++) {
			try {
				dado1 = new Dado ((int)(Math.random() * 9));
			} catch (IllegalArgumentException ex01) {
				System.out.printf("Error: %s. \n", ex01.getMessage());
				dado1 = new Dado();
				System.out.printf("Se ha creado un dado vacio. \n"
						+ "");
			}
			
		}

	}

}
