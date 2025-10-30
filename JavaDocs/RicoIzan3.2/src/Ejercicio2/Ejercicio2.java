/*
 * Descripción: Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
 * multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
 * Autor: Izan Rico Blanco
 * Fecha: 27/10/2025 
 */

package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int [][] tablas;
		int contador = 0, numeros = 0;
		
		tablas = new int [10][10];
		
		for (int filas = 0; filas < tablas.length; filas++) {
			for (int columnas = 0; columnas < tablas[filas].length; columnas++) {
				numeros = numeros + 10;
				contador++;
				do {
					if(contador == 1) {
						numeros = 0;
					}
				}while (contador < 10);
				tablas [filas][columnas] = contador;
				System.out.println(tablas[filas][columnas]);
				System.out.println("La tabla del " + contador + " es: ");

			}
		}
	}

}
