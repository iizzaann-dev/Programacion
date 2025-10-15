/*
 * Descripción: Realizar un programa que cuente del 1 al 100 mediante un do-while
 * Autor: Izan Rico Blanco
 * Fecha: 15/10/2025
 */

package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int contador = 1;								//Declaramos variables
		
		do {											//Realizamos la condición
			System.out.println(contador);
			contador++;
			
		}while(contador <= 100);
		

	}

}
