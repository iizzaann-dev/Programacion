/*
 * Descripción:
 * Autor: Izan Rico Blanco
 * Fecha: 01/10/2025
 */

package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
																//Se declaran las variables
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
																//Se piden los datos que van a ser almacenados en la variable
		System.out.println("Buenas, ingresa el valor de la variable num1: ");
		num1 = teclado.nextInt();
		
		System.out.println("De acuerdo, ahora ingresa el valor de la variable num2: ");
		num2 = teclado.nextInt();
																//Cambiamos los valores de las variables
		num3 = num1;
		num1 = num2;
		num2 = num3;
		
		
		System.out.println("De acuerdo, al cambiar las variables, estas han quedado de la siguiente manera: num1: " + num1 + " y num2: " + num2);
		
		
		

	}

}
