/*
 * Descripción: Escribir un programa que solicite al usuario un año que se encuentre entre 1801 y 2100 (incluyendolos). El programa termina cuando 
 * el usuario introduce un -1 o introduzca 3 valores no válidos de forma consecutiva.
 * Autor: Izan Rico Blanco
 * Fecha: 29/10/2025
 */


package RicoIzan;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double fecha;												//Declaramos las variables que vamos a utilizar
		int fechaActual = 2025;
		
		System.out.println("ANÁLISIS DEL AÑO");
		System.out.println("----------------");
		
		System.out.print("Introduzca un año entre (1801-2100): ");	//Le pedimos al usuario el la fecha 
		fecha = teclado.nextDouble();
		
		if (fecha > 1801 && fecha < 2100){							//Condición que se cumple si el usuario introduce una fecha válida
			System.out.println("");
			System.out.println("RESULTADO");
			System.out.println("---------");
			
			if (fecha < fechaActual ) {								//Condición que se cumple si la fecha introducida es menor a la actual
				fecha = fechaActual - fecha;
				System.out.println("El año introducido es anterior al actual. Han pasado " + (int)fecha + " años");		
				if (fecha < 1801) {
					System.out.println("El año pertenece al siglo XIX");	
				}
				else if (fecha < 1901) {
					System.out.println("El año pertenece al siglo XX");
				}
				else {
					System.out.println("El año pertenece al siglo XXI");
				}

			}else {													//Condición que se cumple si la fecha introducida es mayor a la actual
				fecha = fecha - fechaActual;
				System.out.println("El año introducido es posterior al actual. Han pasado " + (int)fecha + " años");
				System.out.println("El año pertenece al siglo XII");
			}
				

		}else if (fecha == -1) {									//Condición para acabar el programa
		System.out.println("Se termina el programa.");
		}
		
		else {														//Condición para pedir de nuevo un valor en caso de que el usuario haya introducido un
		for (int contador = 0; contador < 2; contador++) {			//valor no válido
			System.out.println("Valor inválido. Por favor, ingresa una fecha nueva: ");
			fecha = teclado.nextDouble();
			
			}
		}
		
	}	
}