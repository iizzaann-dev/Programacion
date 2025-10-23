/*
 * Descripción: Escribir un programa Java que muestre los números pares comprendidos entre el 1 y el 200. Utilizando un contador sumando de 1 en 1.
 * Autor: Izan Rico Blanco
 * Fecha: 21/10/2025
 */

package Ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		for (int contador = 0; contador <= 201; contador ++) {
			if (contador % 2 == 0) {
				System.out.println(contador);
			}
			
		}

	}

}
