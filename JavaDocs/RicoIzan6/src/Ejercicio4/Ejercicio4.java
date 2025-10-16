/*
 * Descripción: Se le pide al usuario valores hasta que, mediante un while se almacena la suma de todos los valores ingresados, además de mostrar cuantos números se han ingresado. Se termina el bucle cuando el
 * usuario ingrese un 0. Tras esto, se mostrará la cantidad de números mayores de cero y se motrará ña media de estos.
 * Autor: Izan Rico Blanco
 * Fecha: 15/10/2025
 *
 */

package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int num1, contador = 0, suma = 0;										//Declaramos las variables
		double media;
		System.out.println("Por favor, ingresa un número positivo: ");
		num1 = teclado.nextInt();												//Pedimos el número
		
		while(num1 != 0) {														//Realizamos las condiciones
			if (num1 < 0 ) {
				System.out.println("Por favor ingresa números positivos: ");
			}else {
				suma = suma + num1;
				contador++;
			}
			System.out.println("Por favor, ingresa otro número: ");
			num1 = teclado.nextInt();
		}																		//Realizamos las medias
		media = suma / contador;																		
		System.out.println("Has introducido " + contador + " números más grandes que 0, y la media de estos es: " + media);		//Mostramos en pentalla la media y la cantidad de números ingresados	
			

	}

}
