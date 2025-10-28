/*
 * Descripcion: Escribe un programa Java que lea 100 números no nulos y luego muestre un mensaje indicando
 * cuántos son positivos y cuantos negativos.
 * Autor: Izan Rico Blanco
 * Fecha: 19/10/2025
 */

package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
			
	int num1, contadorNegativos = 0,contadorPositivos = 0;
			
			for (int contador = 0; contador < 100; contador++) {
				System.out.println("Ingresa un número (que no sea cero): ");
				num1 = teclado.nextInt();
				if (num1 == 0) {
					System.out.println("Has ingresado un 0, por favor ingresa otro: ");
					contador--;
				}
				if (num1 < 0) {
					contadorNegativos++;
				}
				if (num1 > 0) {
					contadorPositivos++;
				}
				
			}
		System.out.print("Has introducido " + contadorNegativos + " números negativos y " + contadorPositivos + " números positivos.");

	}

}