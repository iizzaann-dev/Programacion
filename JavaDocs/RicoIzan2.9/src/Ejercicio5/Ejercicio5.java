/*
 * Descripción: Escribir un programa Java que lea un número positivo N y calcule y visualice su factorial N!
 * Autor: Izan Rico Blanco
 * Fecha: 21/10/2025
 * */

package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int num_factorial, factorial = 1;
		
		System.out.println("Introduce un número: ");
		num_factorial = teclado.nextInt();
		
		for (int contador = 1; contador <= num_factorial; contador++) {
			factorial = factorial * contador;
			
		}
		System.out.println("El factorial de " + num_factorial + " es: " + factorial);
	}

}
