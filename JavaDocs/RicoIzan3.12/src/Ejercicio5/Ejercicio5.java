/*
 * Descripción: Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o
 * no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos que
 * el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un
 * palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda.
 * Autor: Izan Rico Blanco
 * Fecha: 10/11/2025
 */

package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cadena = "", cadenaInvertida = "";
		
		
		
		
		System.out.println("Ingresa una cadena de texto para averiguar si es palindromo o no: ");
		cadena = teclado.nextLine();
		cadena = cadena.toLowerCase();
		cadena = cadena.replace(" ", "");
		
		
		for(int contador = cadena.length() - 1; contador >= 0; contador--) { 
			cadenaInvertida = cadenaInvertida + cadena.charAt(contador);
			
		}
		
		if (cadenaInvertida.equalsIgnoreCase(cadena)) {
			System.out.println("La cadena de texto ingresada es un palíndromo.");

		}else {
			System.out.println("La cadena de texto ingresada no es un palíndromo.");

		}


	}

}
