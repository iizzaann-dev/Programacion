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
		double suma = 0 , max = 0, min = 0, media;
		int numArray, contadorArriba = 0, contadorAbajo = 0, contador = 0;
		
		
		System.out.print("Por favor, dinos la cantidad de alturas que vas a ingresar: ");
		numArray = teclado.nextInt();
		alturas = new double [numArray];
		
		for (int posicion = 0; posicion < numArray; posicion++) {
			System.out.println("Ingresa un valor para la " + (posicion + 1) + "ª posicion (en metros): ");
			alturas[posicion] = teclado.nextDouble();
			suma = suma + alturas[posicion];
			contador++;
			

		}
		media = suma/contador;
		
		for (int i = 1; i < alturas.length; i++) {
					
			if (alturas[i] > max){
				max = alturas[i];
			}
					
			if (alturas[i] < min) {
				min = alturas[i];
			}
			
			if (alturas[i] > media){
				contadorArriba++;
			}
			
			if (alturas[i] < media) {
				contadorAbajo--;
			}
					
		}

		System.out.println("La altura media es: " + media + " metros");
		System.out.println("La altura máxima es: " + max + " metros");
		System.out.println("La altura mínima es: " + min + " metros");
		System.out.println("La cantidad de alturas por encima de la media es: " + contadorArriba);
		System.out.println("La cantidad de alturas por debajo de la media es: " + contadorAbajo);

		

	}
}