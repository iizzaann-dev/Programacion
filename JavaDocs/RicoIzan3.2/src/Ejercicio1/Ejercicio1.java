
/*
 * Descripción: Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
 * y luego muestre la matriz por pantalla.
 * Autor: Izan Rico Blanco
 * Fecha: 27/10/2025 
 */
package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int [][] numeros;
		int contador = 0;
		
		numeros = new int [5][5];
		
		
		for (int filas = 0; filas < numeros.length; filas++) {
			for (int columnas = 0; columnas < numeros[filas].length; columnas++) {
				contador++;
				numeros [filas][columnas] = contador;
				System.out.println(numeros[filas][columnas]);
			}
		}
	}
}
