/*
 * Descripción: Escribe un programa Java que suma independientemente los pares y los impares de los números
 * comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.
 * Autor: Izan Rico Blanco
 * Fecha: 23/10/2025
 */

package Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		int sumaPares = 0, sumaImpares = 0, contadorImpares = 0;
/*		
		for (int contador = 102; contador < 200; contador = contador +2) {
			System.out.println(contador);
			sumaPares = sumaPares + contador;

		}
		
		System.out.println("Ahora empiezan los impares: ");

		
		for (int contador = 100; contador < 200; contador = contador + 2) {
			contadorImpares = contador + 1;
			System.out.println(contadorImpares);
			sumaImpares = sumaImpares + contadorImpares;
			
		}
		
		
		System.out.println(sumaPares);
		System.out.println(sumaImpares);

*/

		for(int contador = 101; contador < 200; contador++) {
			if (contador % 2 == 0) {
				System.out.println(contador);
				sumaPares = sumaPares + contador;
			}
		}
		
		System.out.println("Ahora empiezan los impares: ");

		
		for(int contador = 100; contador < 200; contador++) {
			if (contador % 2 != 0) {
				System.out.println(contador);
				sumaImpares = sumaImpares + contador;
			}
		}
		System.out.println("Suma pares: " + sumaPares);
		System.out.println("Suma impares: " + sumaImpares);


	}

}
