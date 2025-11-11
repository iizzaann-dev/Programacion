/*
 * Descripción: Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos.
 * Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de
 * las tres primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
 * “Alcocer” mostrará “LIOTARALC”.
 * Autor: Izan Rico Blanco
 * Fecha: 07/11/2025
 */

package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		
		String cadena1, cadena2, cadena3, nombre, apellido1, apellido2;					//Inicializamos las variables
		
		System.out.println("Por favor, ingresa tu nombre: ");							//  |-----> 
		nombre = teclado.nextLine();													//  |
																						//	|	
		System.out.println("Por favor, ingresa tu primer apellido: ");					//  |		Pedimos al usuario las variables
		apellido1 = teclado.nextLine();													//  |
																						//	|
		System.out.println("Por favor, ingresa tu segundo apellido: ");					//  |
		apellido2 = teclado.nextLine();													//  |----->
			
		cadena1 = extraerLetras(nombre);												//  |-----> 
		cadena2 = extraerLetras(apellido1);												//  |		Usamos los métodos para el ahorrarnos repetir código
		cadena3 = extraerLetras(apellido2);												//  |----->
		
		System.out.println("Tu codigo de usuario es: " + cadena1 + cadena2 + cadena3);



	}

	public static String extraerLetras (String letras) {
		String letra = "";
		letra = letras.substring(0,3);
		letra = letra.toUpperCase();
		

		return letra;
	}
}


