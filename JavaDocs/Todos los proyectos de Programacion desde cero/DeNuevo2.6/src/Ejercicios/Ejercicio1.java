/*
 *Descripción: Realizar un programa en Java que solicite al usuario dos números, num1 y num2.
 *Comprobar si num1 es mayor que num2, si es al revés o si son iguales.
 *Mostrar por pantalla al usuario un mensaje informando del resultado.
 *Nombre: Izan Rico Blanco
 *Fecha: 04/05/2026
*/


package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		double num1 = 0, num2 = 0;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Ingresa el valor para el primer numero: ");
		num1 = teclado.nextInt();
		
		System.out.println("Ingresa el valor para el segundo numero: ");
		num2 = teclado.nextInt();

		
		if (num1 > num2) {
			System.out.printf("El numero %.2f es mas grande que el numero %.2f.\n", num1, num2);

		}else if (num1 < num2) {
			System.out.printf("El numero %.2f es mas grande que el numero %.2f.\n", num2, num1);
			
		}else {
			System.out.println("Los dos numeros son iguales.");

		}

	}

}
