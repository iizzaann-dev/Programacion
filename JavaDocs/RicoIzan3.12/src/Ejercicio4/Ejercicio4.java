/*
 * Descripción: Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
 * cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
 * mayúsculas y minúsculas.
 * Autor: Izan Rico Blanco
 * Fecha: 10/11/2025
 */

package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
		String cadena = "";
		
		System.out.println("Ingresa una cadena de texto: ");
		cadena = teclado.nextLine();
		
		cadena = cadena.toLowerCase();
		
		for (int contador = 0; contador < cadena.length(); contador ++) {
			switch (cadena.charAt(contador)) {
			case 'a':
				contadorA++;
				break;
				
			case 'e':
				contadorE++;
				break;
				
			case 'i':
				contadorI++;
				break;
				
			case 'o':
				contadorO++;
				break;
				
			case 'u':
				contadorU++;
				break;
			
				default:
			}
		}
		System.out.println("La cadena de texto " + cadena + " contiene: ");
		System.out.println("Contador de A: " + contadorA);
		System.out.println("Contador de E: " + contadorE);
		System.out.println("Contador de I: " + contadorI);
		System.out.println("Contador de O: " + contadorO);
		System.out.println("Contador de U: " + contadorU);

	}

	
	
}
