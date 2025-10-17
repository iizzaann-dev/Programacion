/*
 * Descripción: Se le piden 10 números al usuario, se hace la media de los números positivos, la media de los números negativos y la cantidad de 0 ingresados.
 * Autor: Izan Rico Blanco
 * Fecha: 15/10/2025
 */

package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1, contadorCeros = 0, contadorPositivos = 0, contadorNegativos = 0, sumaPositivos = 0, sumaNegativos = 0; 
	    double mediaPositivos, mediaNegativos;
	    

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
		
		
		if (contadorPositivos == 0 && contadorNegativos != 0) {
			mediaNegativos = (double)sumaNegativos / contadorNegativos;
			System.out.println("De los 10 números ingresados, has ingresado " + contadorPositivos + " números positivos, " + contadorNegativos + " numeros negativos, y " + contadorCeros + " ceros.");
			System.out.println("La medía de los números positivos es 0 y la de los números negativos es " + mediaNegativos);
		}
		else if (contadorPositivos != 0 && contadorNegativos == 0) {
			mediaPositivos = (double)sumaPositivos / contadorPositivos;
			System.out.println("De los 10 números ingresados, has ingresado " + contadorPositivos + " números positivos, " + contadorNegativos + " numeros negativos, y " + contadorCeros + " ceros.");
			System.out.println("La medía de los números positivos es " + contadorPositivos + " y la de los números negativos es 0");
		}
		else if (contadorPositivos == 0 && contadorNegativos == 0) {
			System.out.println("De los 10 números ingresados, has ingresado " + contadorPositivos + " números positivos, " + contadorNegativos + " numeros negativos, y " + contadorCeros + " ceros.");
			System.out.println("La medía de los números positivos es 0 y la de los números negativos es 0");
		}
		else {
			mediaPositivos = (double)sumaPositivos / contadorPositivos;
			mediaNegativos = (double)sumaNegativos / contadorNegativos;
			System.out.println("De los 10 números ingresados, has ingresado " + contadorPositivos + " números positivos, " + contadorNegativos + " numeros negativos, y " + contadorCeros + " ceros.");
			System.out.println("La media de los números positivos ingresados es " + mediaPositivos + " y la de los números negativos es " + mediaNegativos);
		}
		
		
	}

}
