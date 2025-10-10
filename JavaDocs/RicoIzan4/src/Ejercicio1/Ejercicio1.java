/*
 * Descripción: Pedirle al usuario dos valores y compararlas. Por último se pide que se le informe al usuario
 * Autor: Izan Rico Blanco
 * Fecha: 08/10/2025
 */

package Ejercicio1;

import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
																	//Declaramos variables
		double num1;
		double num2;
		
		System.out.println("Por favor, ingresa el primer valor: "); //Pedimos los valores de las variables
		num1 = teclado.nextDouble();
		System.out.println("Por favor, ingresa el segundo valor: ");
		num2 = teclado.nextDouble();
		
		if(num1 < num2) {
			System.out.println("El primer valor es más pequeño que el segundo.");//Mostramos en pantalla la comparación entre los valores ingresados
			
		}else if (num1 > num2){
			System.out.println("El primer valor es más grande que el segundo.");
		}else {
			System.out.println("Los valores ingresados son iguales.");
		}
	}

}
