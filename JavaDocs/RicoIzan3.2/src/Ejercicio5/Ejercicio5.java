/*
 * Descripción: Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
 * empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la
 * información de N personas distintas (valor también introducido por teclado). Para cada
 * persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe
 * guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada
 * género.
 * Autor: Izan Rico Blanco
 * Fecha: 31/10/2025
 */


package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double brecha [][];
		int genero;
		double sueldo = 0;
		int n;
		System.out.println("Ingresa la cantidad de personas que van a completar la información del array: ");
		n = teclado.nextInt();
		
		brecha = new double [n][2];
		
		for (int filas = 0; filas < brecha.length; filas++) {
			for (int columnas = 0; columnas < brecha[filas].length; columnas++)
			System.out.println("Por favor, ingresa el genero del trabajador (0 para varón y 1 para mujer): ");
			genero = teclado.nextInt();
			System.out.println("De acuerdo, ahora ingresa lo que cobra el trabajador/a: ");
			

		}
		


	}

}
