/*
 * Descripción: Realiza un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos,
 * para cada número introducido si es primo o no. Hay que recordar que un número es primo si es
 * divisible por si mismo y por 1. El 1 no es primo por convenio. Se debe crear una función que
 * pasándole un número entero devuelva si es primo o no.
 * Autor: Izan Rico Blanco
 * Fecha: 21/11/2025
 */

package Ejercicio17;

import biblioteca.*;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int entrada = 0;
		
		do {
			
			System.out.println("Ingresa un número por teclado: ");
			entrada = teclado.nextInt();
			matematicas.verificadorPrimo(entrada);
			
		}while (entrada != 0);
		


	}

}
