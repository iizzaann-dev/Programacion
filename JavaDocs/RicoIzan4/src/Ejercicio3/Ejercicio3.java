/*
 * Descripción: Se le pide al usuario que ingrese unos datos y si cumple una condicion se le piden más y se imprime un mensae en pantalla
 * Autor: Izan Rico Blanco
 * Fecha: 08/10/2025
 */

package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int edad;
		String nombre, apellidos;
		
		System.out.println("Buenas, ingresa tu edad: ");
		edad = teclado.nextInt();
		
		if (edad < 18) {
			System.out.println("No tiene la edad suficiente	para realizar los estudios.");
		}
		else if (edad < 18) {
			System.out.println("De acuerdo, ingresa tu nombre: ");
			nombre = teclado.nextLine();
			System.out.println("Ahora ingresa tus apellidos: ");
			apellidos = teclado.nextLine();
		}

	}

}
