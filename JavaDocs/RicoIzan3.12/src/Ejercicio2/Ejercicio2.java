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
		
		System.out.println("Por favor, ingresa una cadena de caracteres: ");		//Pedimos la primera cadena de texto
		cadena1 = teclado.nextLine();
		
		System.out.println("De acuerdo, ahora ingresa otra cadena de caracteres: ");//Pedimos la segunda cadena de texto
		cadena2 = teclado.nextLine();
		
		if (cadena1.equalsIgnoreCase(cadena2)) {									//Si son iguales sin importar las mayus o minus
			System.out.println("Son iguales sin diferenciar entre mayúsculas y minúscualas.");
			
			if(cadena1.equals(cadena2)) {											//Si son iguales teniendo en cuenta las mayúsculas y minúsculas
				System.out.println("Son iguales diferenciando entre mayúsculas y minúscualas.");
			}

		}else {																		//Si no son iguales desde un inicio
			System.out.println("No son iguales, ni diferenciando ni sin diferenciar entre mayúsculas y minúsculas.");

		}
		


	}

}
