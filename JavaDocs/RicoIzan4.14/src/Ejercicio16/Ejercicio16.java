/*
 * Descripción: Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene con
 * valores aleatorios (utiliza Math.random()). Implementa la función que rellena un array con
 * valores aleatorios.
 * Autor: Izan Rico Blanco
 * Fecha: 20/11/2025
 */

package Ejercicio16;

import java.util.Scanner;

import biblioteca.*;

public class Ejercicio16 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int tamanio = 0;
		int vector [];
		
		System.out.println("Ingresa el tamaño que quieres que tenga el array: ");
		tamanio = teclado.nextInt();
		
		vector = new int [tamanio];
		
		System.out.println("Los valores aleatorios del array son: ");
		matematicas.vectorConAleatorios(vector);

	}

}
