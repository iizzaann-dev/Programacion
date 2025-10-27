/*
 * Descripcion: Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
 * Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
 * mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
 * por debajo de la media.
 * Autor: Izan Rico Blanco
 * Fecha: 23/10/2025
 */

package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double [] alturas;
		double numUsuario, suma = 0 , max, min;
		int numArray, contadorArriba, contadorAbajo;
		
		
		System.out.print("Por favor, dinos la cantidad de alturas que vas a ingresar: ");
		numArray = teclado.nextInt();
		alturas = new double [numArray];
		
		for (int posicion = 0; posicion < numArray; posicion++) {
			System.out.println("Ingresa un valor para la " + (posicion + 1) + "ª posicion (en metros): ");
			alturas[posicion] = teclado.nextDouble();
			suma = suma + alturas[posicion];
			

		}

	}

}
