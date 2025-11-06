/*
 * Descripción:  Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
 * además de si son iguales sin diferenciar entre mayúsculas y minúsculas
 * Autor: Izan Rico Blanco
 * Fecha: 03/11/2025
 */

package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String cadena1, cadena2;
		
		System.out.println("Por favor, ingresa una cadena de caracteres: ");
		cadena1 = teclado.nextLine();
		
		System.out.println("De acuerdo, ahora ingresa otra cadena de caracteres: ");
		cadena2 = teclado.nextLine();
		
		if (cadena1.equalsIgnoreCase(cadena2) == true) {
			
		}
		


	}

}
