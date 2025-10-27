/*
 * Descripción: Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
 * utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
 * cuántos valores del array son igual o superiores a R.
 * Autor: Izan Rico Blanco
 * Fecha: 23/10/2025
 */

package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double [] numero;
		numero = new double [100];
		double numUsuario;
		
		for (int posicion = 0; posicion < numero.length; posicion++) {
			numero[posicion] = Math.random();
		}
		System.out.println("Ingresa un número para saber cuantos valores son superiores o iguales dentro del array: ");
		numUsuario = teclado.nextDouble();
		
		for (int posicion = 0; posicion < numero.length; posicion++) {
			if (numero[posicion] == numUsuario || numero[posicion] >= numUsuario) {
				double suma = 0; 
				suma =  suma + numero[posicion];
				System.out.println("Los números iguales o superiores a " + numUsuario + " son: " + suma);
			}
		}
	}
}
