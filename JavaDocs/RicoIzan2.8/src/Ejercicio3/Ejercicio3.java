/*
 * Descripción: Realizar un programa que cuente del 100 al 1 mediante un do-while
 * Autor: Izan Rico Blanco
 * Fecha: 15/10/2025
 */

package Ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int contador = 100;								//Declaramos variables
		
		do {											//Realizamos la condición
			System.out.println(contador);
			contador--;
			
		}while(contador >= 1);

	}

}
