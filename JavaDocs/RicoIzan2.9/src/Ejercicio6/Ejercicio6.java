/*
 * Descripción: Escribir un programa Java que lea 100 números no nulos y luego muestre un mensaje de si ha leído algún número negativo o no
 * Autor: Izan Rico Blanco
 * Fecha: 21/10/2025
 */

package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
		int num1, contadorNegativos = 0;
		
		for (int contador = 0; contador < 5; contador++) {
			System.out.println("Ingresa un número (que no sea cero): ");
			num1 = teclado.nextInt();
			if (num1 == 0) {
				System.out.println("Has ingresado un 0, por favor ingresa otro número: ");
				contador--;
			}
			if (num1 < 0) {
				contadorNegativos++;
			}
			
		}
		System.out.print("Has introducido " + contadorNegativos + " números negativos.");
	}

}
