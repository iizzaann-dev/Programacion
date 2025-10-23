/*
 * Descripción: Escribir un programa Java que muestre los números pares comprendidos entre el 1 y el 200. Para ello se utiliza un contador y suma de 2 en 2.
 * Autor: Izan Rico Blanco
 * Fecha: 21/10/2025
 */

package Ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		System.out.println("Todos los números pares del 1 al 100");
		
		for (int contador = 2; contador <= 101; contador = contador + 2) {
			System.out.println(contador);
		}

	}

}
