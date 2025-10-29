/* Descripción:
 * Programa que solicita una secuencia de notas del 0 al 10 hasta introducir -1,
 * y determina si se introdujo alguna nota con valor 10.
 * Autor: Izan Rico Blanco
 * Fecha: 18/10/25
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); // Se crea un objeto Scanner para leer datos del usuario
		
		int notas, acum10 = 0; // Variable para la nota actual y acumulador de dieces
		
		// Bucle do-while que solicita notas hasta introducir -1
		do {
			System.out.println("Introduce notas del 0 al 10, cuando acabes, introduce -1");
			notas = datos.nextInt(); // Nota introducida
			
			if (notas == 10) {
				acum10++; // Incrementa el contador si la nota es 10
			}
			
		}while (notas != -1); // Condición de parada
		
		// Muestra el resultado final
		if (acum10 > 0) {
			System.out.println("Has introducido " + acum10 + " dieces ");
		}else {
			System.out.println("No has introducido ningun 10");
		}
		
	}

}
