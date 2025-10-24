/*
 * Descripción: Crear un programa que pida diez números reales por teclado, los almacene en un array, y luego que muestre todos sus valores.
 * Autor: Izan Rico Blanco
 * Fecha: 22/10/2025
 */

package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double [] numero;
		numero = new double [10];
		
		System.out.println("Ingresa un número: ");
		for(int posicion = 0; posicion < 10; posicion++) {
				numero[posicion] = teclado.nextInt();
				
		}
		
		System.out.println("Los valores del array son: ");
		
		for(int posicion = 0; posicion < 10; posicion++) {
			System.out.print(" " + numero[posicion]);
		}
		
	}

}
