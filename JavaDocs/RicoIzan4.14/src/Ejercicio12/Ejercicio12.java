/*
 * Descripción: Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El programa debe
 * tener una función que reciba como parámetro una cantidad en kilómetros y nos la devuelva en
 * millas.
 * Autor: Izan Rico Blanco
 * Fecha: 17/11/2025 
 */

package Ejercicio12;

import java.util.Scanner;

import biblioteca.matematicas;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double kilometros = 0; 
		System.out.println("Ingresa una distancia en kilometros:");
		
		kilometros = teclado.nextDouble();
		
		System.out.printf("La distancia en millas de %.0f kilometros son: %.4f millas", kilometros, matematicas.kilometros_a_millas(kilometros));

	}

}
