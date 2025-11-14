/*
 * Descripción: Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
 * Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
 * double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
 * Autor: Izan Rico Blanco
 * Fecha: 14/11/2025 
 */

package Ejercicio5;

import biblioteca.*;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int millas = 0;
		
		System.out.println("Ingresa la distancia en millas: ");
		millas = teclado.nextInt();
		
		System.out.println(millas + " millas son " + matematicas.millas_a_kilometros(millas) + " kilometros.");
	}

}
