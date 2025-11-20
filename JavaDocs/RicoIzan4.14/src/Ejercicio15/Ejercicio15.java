/*
 * Descripción: Escribe un programa que cree un array de tamaño 50 con los números naturales comprendidos
 * entre 50 y 99. Luego muestra la suma total y la media. Implementa una función que calcule la
 * suma de un array y otra que calcule la media de un array.
 * Autor: Izan Rico Blanco
 * Fecha: 20/22/2025
 */
package Ejercicio15;

import biblioteca.*;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		int acumulador = 0; 
		int enteros [];
		
		enteros = new int [50];
		
		for (int contador = 0; contador < enteros.length; contador++) {
			enteros[contador] = 50 + contador;
			acumulador++;
		}
		
		System.out.println("La suma de los valores dentro del array comprendido entre el 50 y el 99 es: " + matematicas.sumaValoresArray(enteros));
		
		System.out.println("La media de los valores dentro del array comprendido entre el 50 y el 99 es: " + matematicas.mediaValoresArray(enteros, acumulador));



	}

}
