/*
 * Descripción: Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el
 * mínimo. Implementa y utiliza la función:
 * int minimo(int a, int b) // Devuelve el menor entre a y b
 * Autor: Izan Rico Blanco
 * Fecha: 13/11/2025
 */

package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);	
		
		int num1 = 0, num2 = 0;																//Declaramos las variables
		
		System.out.println("Ingresa el valor del primer número: ");
		num1 = teclado.nextInt();															//Pedimos el valor de las variables
		
		System.out.println("Ingresa el valor del segundo número: ");
		num2 = teclado.nextInt();
		
		System.out.println("El mínimo entre los dos números es: " + minimo(num1, num2));	//Usamos un metodo para calcular el minimo
			

	}

	
	public static int minimo(int a, int b) {												//Usamos un metodo para calcular el minimo
		int min = 0;
		
		if (a > b) {
			min = b;
			
		}else {
			min = a;
		}
		return min;
	}
}
