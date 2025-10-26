/*
 * Descripción: Crear un programa que pida dos valores enteros N y M, luego cree un array de tamaño N, 
 * escriba M en todas sus posiciones y lo muestre por pantalla.
 * Autor: Izan Rico Blanco
 * Fecha: 23/10/2025
 */

package Ejercicio6;

import java.util.Scanner; 

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int N, M;
		int [] numero;
		
		System.out.println("Por favor, ingresa el tamaño que quieres que tenga el array: ");
		N = teclado.nextInt();
		
		System.out.println("Por favor, ingresa el valor que quieres que tengan todas las posiciones del array: ");
		M = teclado.nextInt();
		
		numero = new int[N];
		
		for (int posicion = 0; posicion < N; posicion++) {
			numero[posicion] = M;
			System.out.println(numero[posicion]);
		}

	}

}
