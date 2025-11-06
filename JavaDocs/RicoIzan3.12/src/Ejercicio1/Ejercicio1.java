/*
 * Descripción: Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra
 * de la cadena en una línea distinta
 * Autor: Izan Rico Blanco
 * Fecha: 03/11/2025
 */


package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Ingresa una cadena de carácteres: ");

		String cadena = teclado.nextLine();
		
		for (int contador = 0; contador < cadena.length(); contador++) {
			char letras = cadena.charAt(contador);
			System.out.println(letras);

		}
		
	}

}
