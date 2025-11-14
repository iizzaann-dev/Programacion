/*
 * Descripción: Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
 * positivo, negativo o cero. Implementa y utiliza la función:
 * int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
 * Autor: Izan Rico Blanco
 * Fecha: 13/11/2025 
 */

package Ejercicio4;

import biblioteca.*;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1 = 0;
		
		System.out.println("Por favor, ingresa un número: ");
		num1 = teclado.nextInt();
		
		if (matematicas.dimeSigno(num1) == 1) {
			System.out.println("El número es positivo.");
		}else if(matematicas.dimeSigno(num1) == 0) {
			System.out.println("El número es igual a 0.");
		}else {
			System.out.println("El número es negativo.");

		}

	}

}
