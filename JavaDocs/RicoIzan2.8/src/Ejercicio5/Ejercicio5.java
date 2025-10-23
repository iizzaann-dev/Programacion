/*
 * Descripción: Se le piden 10 números al usuario, se hace la media de los números positivos, la media de los números negativos y la cantidad de 0 ingresados.
 * Autor: Izan Rico Blanco
 * Fecha: 15/10/2025
 */

package Ejercicio5;

import java.util.Scanner;																										//Importamos la variable escaner

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
																																//Declaramos todas las variables
		int num1, contadorCeros = 0, contadorPositivos = 0, contadorNegativos = 0, sumaPositivos = 0, sumaNegativos = 0; 
	    double mediaPositivos, mediaNegativos;
	    																														//Realizamos las condiciones y bucles

		for (int contador = 0; contador <10; contador = contador +1) {
			System.out.println("Por favor, ingresa el un número: ");
			num1 = teclado.nextInt();
			
			if (num1 > 0) {
				contadorPositivos++;
				sumaPositivos = sumaPositivos + num1;
			}else if (num1 < 0) {
				contadorNegativos++;
				sumaNegativos = sumaNegativos + num1;
			}else {
				contadorCeros++;
			}
		}
		
																																//Calculamos las medias dependiendo de las condiciones que nos de.
		
		if (contadorPositivos > 0) {
			mediaPositivos = (double)sumaPositivos / contadorPositivos;
			System.out.println("Has ingresado " + contadorPositivos + " números positivos y su media es: " + mediaPositivos);
		}else {
			System.out.println("No se han ingresado números positivos, por lo que no se puede calcular la media.");
		}
		
		if (contadorNegativos > 0) {
			mediaNegativos = (double)sumaNegativos / contadorNegativos;
			System.out.println("Has ingresado " + contadorNegativos + " números negativos y su media es: " + mediaNegativos);
		}else {
			System.out.println("No se han ingresado números negativos, por lo que no se puede calcular la media.");
		}
		
		System.out.println("Has ingresado " + contadorCeros + " ceros.");
	}
		
		
}


