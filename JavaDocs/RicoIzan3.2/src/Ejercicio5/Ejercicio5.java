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
		
		int n, contadorHombres = 0, contadorMujeres = 0;
		
		double sumaHombres = 0, sumaMujeres = 0; 
		double mediaHombres = 0, mediaMujeres = 0;
		
		System.out.println("Ingresa la cantidad de personas que van a completar la información del array: ");
		n = teclado.nextInt();
		
		brecha = new double [n][2];
		
		for (int filas = 0; filas < brecha.length; filas++) {
			System.out.println("Por favor, ingresa el genero del trabajador (0 para varón y 1 para mujer): ");
			brecha[filas][0] = teclado.nextInt();
			System.out.println("De acuerdo, ahora ingresa lo que cobra el trabajador/a: ");
			brecha[filas][1] = teclado.nextDouble();
			
			if (brecha[filas][0] == 0) {
				sumaHombres = sumaHombres + brecha[filas][1];
				contadorHombres++;
			}
			if (brecha[filas][0] == 1) {
				sumaMujeres = sumaMujeres + brecha[filas][1];
				contadorMujeres++;
			}
		}//Asopla
		mediaHombres = sumaHombres / contadorHombres;
		mediaMujeres = sumaMujeres / contadorMujeres;

		System.out.println("El sueldo medio de las mujeres es: " + mediaMujeres + " y el de los hombres es: " + mediaHombres);
	}

}
