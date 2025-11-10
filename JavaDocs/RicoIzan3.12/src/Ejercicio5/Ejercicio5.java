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
		
		String cadena = "";
		String [] cadenaInvertida;
		
		
		System.out.println("Ingresa una cadena de texto para averiguar si es palindromo o no: ");
		cadena = teclado.nextLine();
		
		
		for(int contador = 0; contador < cadenaInvertida.length; contador++) { //hay que hacer un vector para almacenar toda la cadena de texto
			// y poner el contador en la ultima posicion, he ir reduciendo el valor del contador para darle la vuelta al array y sacar si es un palindromo
			System.out.print(cadena.charAt(contador));

		}
		
		


	}

}
