/*
 * Descripción: Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta
 * a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al usuario los valores x, y, z. Se
 * deberá crear una función a la que se le pase x, y, z y devuelva si son iguales o no.
 * Por ejemplo: 3 ² + 4 ² = 5 ²
 * Autor: Izan Rico Blanco
 * Fecha: 24/11/2025 
 */

package Ejercicio19;

import biblioteca.*;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int x = 0, y = 0, z = 0;
		
		System.out.println("Ingresa el valor de x: ");
		x = teclado.nextInt();
		
		System.out.println("Ingresa el valor de y: ");
		y = teclado.nextInt();
		
		System.out.println("Ingresa el valor de z: ");
		z = teclado.nextInt();
		
		
		matematicas.comprobacionPitagoras(x, y, z);

	}

}
