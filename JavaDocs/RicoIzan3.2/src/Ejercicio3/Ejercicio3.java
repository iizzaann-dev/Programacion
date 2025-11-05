/*
 * Descripción: Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
 * introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
 * matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
 * menores que cero y cuántos son igual a cero.
 * Autor: Izan Rico Blanco
 * Fecha: 27/10/2025
 */

package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int [][] matriz;
		int filas = 0, columnas = 0, contenidoFilas = 0, contenidoColumnas = 0;
		int contadorMayores = 0, contadorMenores = 0, contadorCeros = 0;
		
		System.out.println("Ingresa la cantidad de filas que quieres que tenga la matriz: ");
		filas = teclado.nextInt();
		
		System.out.println("Ingresa la cantidad de columnas que quieres que tenga la matriz: ");
		columnas = teclado.nextInt();

		matriz = new int [filas][columnas];
		
		for (int posicionFilas = 0; posicionFilas < matriz.length; posicionFilas++) {
			
			for (int posicionColumnas = 0; posicionColumnas < matriz[posicionFilas].length; posicionColumnas++) {  //Se pone  matriz[posicionFilas] para saber en que posicion de la matriz estamos
				System.out.println("Ingresa el valor de la posición " + posicionFilas + "|" + posicionColumnas + ": "); //Si pusiesemos solo matriz[filas] no accederiamos a la posición porque es solo un índice
				matriz[posicionFilas][posicionColumnas] = teclado.nextInt();
				
				if (matriz[posicionFilas][posicionColumnas] > 0) {
					contadorMayores++;
				} else if (matriz[posicionFilas][posicionColumnas] < 0) {
					contadorMenores++;
				} else {
					contadorCeros++;
				}
				-
			}
			
		}
		
		System.out.println("La cantidad de números mayores que cero es: " + contadorMayores + ", la cantidad de números menores que cero es: " + contadorMenores + "\n "
		+ " y la cantidad de ceros es: " + contadorCeros );


		


	}

}
