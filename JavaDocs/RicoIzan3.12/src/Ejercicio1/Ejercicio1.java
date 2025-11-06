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
																			
		String cadena = teclado.nextLine();							//Pedimos la cadena de caracteres
		
		String [] palabras = cadena.split(" ");						//Separamos la cadena de caracteres en palabras mediante el delimitador (espacios)
			
		
		for(String palabra : palabras) {							//Bucle que muestra las palabras separadas por espacios en una linea nueva
			System.out.println(palabra);

		}
		
		}
		
	}


