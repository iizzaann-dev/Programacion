/*
 * Descripción: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un úmero negativo.
 * Autor: Izan Rico Blanco
 * Fecha: 20/10/2025
 */


package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1 = 1, potencia = 0;																	//Declaramos las variables
		
		System.out.println("Ingresa un número: ");
		num1 = teclado.nextInt();																	//Pedimos el número

		while ( num1 >= 0) {																		//Realizamos el bucle en caso de que no sea negativo
			System.out.println("La potencia es: " + num1*num1);
			System.out.println("Ingresa otro número:");
			num1 = teclado.nextInt();
		}
		System.out.println("Has introducido un número negativo");
	}

}
