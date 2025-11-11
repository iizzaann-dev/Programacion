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
		cadena = teclado.nextLine();													//Pedimos la cadena de texto
		cadena = cadena.toLowerCase();													//Ponemos la cadena de texto en minuscula
		cadena = cadena.replace(" ", "|");												//Reemplazamos los espacios por |
													
		
		
		for(int contador = cadena.length() - 1; contador >= 0; contador--) { 			//Realizamos el bucle para invertir la palabra
			cadenaInvertida = cadenaInvertida + cadena.charAt(contador);				//Invertimos la palabra
			
		}
		
		if (cadenaInvertida.equalsIgnoreCase(cadena)) {									//Condición para ver si es palindromo o no
			System.out.println("La cadena de texto ingresada es un palíndromo.");
			
			System.out.println("La cadena de texto invertida es: " + cadenaInvertida);	//Mostramos en pantalla la cadena de texto invertida


		}else {
			System.out.println("La cadena de texto ingresada no es un palíndromo.");
			System.out.println("La cadena de texto invertida es: " + cadenaInvertida);

		}


	}

}
