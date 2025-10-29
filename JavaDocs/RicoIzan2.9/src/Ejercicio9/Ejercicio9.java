/*
 * Descripción: Escribe un programa Java que calcula y escribe la suma y el producto de los 10 primeros
 * números naturales.
 * Autor: Izan Rico Blanco
 * Fecha: 23/10/2025
 */

package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int suma = 0, multiplicacion = 1;
		
		for (int contador = 1; contador < 10; contador ++) {
			suma = suma + contador;
			multiplicacion = multiplicacion * contador;
			
		}
		System.out.println("La suma de los 10 primeros numeros naturales es: " + suma);
		System.out.println("La multiplicación de los 10 primeros numeros naturales es: " + multiplicacion);


		
		

	}

}
