/*
 * Descripción: Escribir un programa Java que muestre los números desde el 1 hasta un número N que se introducirá por teclado.
 * Autor: Izan Rico Blanco
 * Fecha: 21/10/2025
 */

package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero_entrada;
		System.out.println("Ingresa un número para saber todos los números entre el 1 y él: ");
		numero_entrada = teclado.nextInt();
		System.out.println("Los números del 1 al " + numero_entrada + " son: ");
		
		for(int contador = 1; contador <= numero_entrada; contador++) {
			System.out.println(contador);
		}

	}

}
