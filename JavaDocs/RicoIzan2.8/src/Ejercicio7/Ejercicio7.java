/*
 * Descripción: Se calcula un número aleatorio entre 0 y 50 y se le pide al usuario que ingrese números hasta que lo acierte.
 * Autor: Izan Rico Blanco
 * Fecha: 20/10/2025
 */

package Ejercicio7;

import java.util.Scanner;


public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int numRandom, entradaUsuario;					//Declaración de variables
		
		numRandom = (int)(Math.random() * 50);			//Creamos un número entre el 0 y el 50
		System.out.println("Ingresa un número: ");
		entradaUsuario = teclado.nextInt();
		
														//Realizamos las condiciones
		while (entradaUsuario != numRandom) {
			if (entradaUsuario < numRandom) {
				System.out.println("Ingresa un número más alto");
				entradaUsuario = teclado.nextInt();
				
			}else {
				System.out.println("Ingresa un número más pequeño");
				entradaUsuario = teclado.nextInt();
			}
		}
		System.out.println("¡Correcto!");

	}

}
