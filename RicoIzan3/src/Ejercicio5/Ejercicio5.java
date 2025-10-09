/*
 * Descripción: 
 * Autor: Izan Rico Blanco
 * Fecha: 01/10/2025
 */

package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
															//Definimos las variables
		double num1;
		double num2;
		double exp_num;
		double raiz_num;
		double min_num;
		double max_num;
		double num_aleatorio;
															//Pedimos al usuario los valores de las variables principales
		System.out.println("Buenas, por favor ingresa un valor para la primera variable: ");
		num1 = teclado.nextDouble();
		System.out.println("De acuerdo, ahora ingresa un valor para la segunda variable: ");
		num2 = teclado.nextDouble();
															/*Calculamos: número mínimo, el primer valor elevado al segundo, la raiz del primero y 
															 * un valor aleatorio entre los dos valores
															 */
		min_num = Math.min(num1, num2);
		exp_num = Math.pow(num1, num2);
		raiz_num = Math.sqrt(num1);
		max_num = Math.max(num1, num2);
		num_aleatorio = Math.random() * (max_num - min_num) + min_num;
		
		System.out.println("El número más pequeño entre las dos variables es: " + min_num);
		System.out.println("El primer número elevado al segundo es: " + exp_num);
		System.out.println("La raíz cuadrada del primer número es: " + raiz_num);
		System.out.println("Un valor aleatorio entre " + num1 + " y " + num2 + " es: " + num_aleatorio);
		
	}

}
