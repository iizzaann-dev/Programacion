/*
 * Descripción: Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
 * resultado de multiplicarlos. Implementa y utiliza la función:
 * double multiplica(double a, double b) // Devuelve la multiplicación de dos números
 * Autor: Izan Rico Blanco
 * Fecha: 13/11/2025
 */

package Ejercicio1;

import java.util.Scanner;

import biblioteca.matematicas;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num1 = 0, num2 = 0;											//Declaramos las variables
		
		System.out.println("Ingresa el valor del primer número: ");
		num1 = teclado.nextDouble();										//Pedimos el valor de la primera variable
		
		System.out.println("Ingresa el valor del segundo número: ");
		num2 = teclado.nextDouble();										//Pedimos el valor de la segunda variable
		
		System.out.printf("El valor de la multiplicación de %.0f y %.0f es: %.0f" ,num1, num2, matematicas.multiplica(num1, num2));
			//Usamos printf para que sea mas sencillo la impresion de datos

	}
	
}
