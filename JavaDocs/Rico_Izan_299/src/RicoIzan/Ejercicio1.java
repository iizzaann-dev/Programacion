/*
 * Descripción: Crear un programa que solicite dos numeros enteros (N y M) y calcule los multiplos de 3 y 5 comprendidos entre ellos
 * Autor: Izan Rico Blanco
 * Fecha: 12/11/2025
 */

package RicoIzan;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int calculador [][];
		int almacen[];				
		
		int numeroN = 0, numeroM = 0;
		System.out.println("Por favor, ingresa un valor para el primer número: ");
		numeroN = teclado.nextInt();
		
		System.out.println("De acuerdo, ahora ingresa un valor para el segundo número (recuerda que debe de ser mayor al anteriror): ");
		numeroM = teclado.nextInt();
	
		calculador = new int [numeroN][numeroM];
		if (numeroN < numeroM) {
			for (int filas = 0; filas < calculador.length; filas++) {
				for(int columnas = 0; columnas < calculador[filas].length; columnas++) {
					if (calculador[filas][columnas] % 3 == 0 && calculador[filas][columnas] % 5 == 0) {
						almacen = new int [filas];
						almacen[filas] = filas;
						System.out.println("Los múltiplos de 3 y 5 comprendidos entre " + numeroN + " y " + numeroM + " son: " + almacen[filas]);
				}
				

				}
			}

		}else {
			System.out.println("El primer número es mayor o igual al segundo");

		}
		
		

/*
 * 
 */

	}

}



