
/*
 * Descripción: Escribe un programa Java que lea una secuencia de números no nulos hasta que se introduzca
 * un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos negativos.
 * Autor: Izan Rico Blanco
 * Fecha: 19/10/2025
 */

package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int num, contadorPositivos = 0, contadorNegativos = 0;
		
		do {
			System.out.println("Ingresa un número (ingresa 0 para terminar el programa): ");
			num = teclado.nextInt();
			
			if (num > 0) {
				contadorPositivos++;
			}
			else if (num < 0) {
				contadorNegativos++;
			}
		}while(num != 0);
		
		
		System.out.println("Has ingresado " + contadorPositivos + " números positivos y " + contadorNegativos + " numeros negativos.");

		
		



	}

}
