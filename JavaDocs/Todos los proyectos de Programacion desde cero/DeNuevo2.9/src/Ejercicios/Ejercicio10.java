/*
 *Descripción: Escribe un programa Java que lee una secuencia de notas (con valores que van de 0 a 10) que
 *termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
 *Nombre: Izan Rico Blanco
 *Fecha: 05/05/2026
*/


package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int entrada = 0, contador = 0;
		boolean condicion = false;
				
		
		
		do {
			
			System.out.println("Ingresa un numero del 0 al 10 o -1 para terminar el programa.");
			entrada = teclado.nextInt();
			
			if (entrada == 10) {
				condicion = true;
			}
			
			if (entrada != -1 && (entrada < 0 || entrada > 10)) {
				System.out.println("El número que ha introducido no es válido.");

			}
			
		}while (entrada != -1);
		
		if (condicion == true) {
			System.out.println("Al menos una vez se ingreso un 10.");

		}else {
			System.out.println("No se ha ingresado ningun 10.");

		}
		
	}

}
