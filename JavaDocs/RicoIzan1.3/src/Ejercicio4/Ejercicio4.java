/*
 * Descripción:Se pide que se soliciten y almacenen datos al usuario, y que se le aplican ciertas funciones que después deberán ser explicadas
 * Autor: Izan Rico Blanco
 * Fecha: 01/10/2025
 */

package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {							//Declaramos las variables
		Scanner teclado = new Scanner(System.in);
		double datoUsuario;
		
		System.out.println("Ingresa un valor decimal: ");
		datoUsuario = teclado.nextDouble();
		double datoUsuario_floor = Math.floor(datoUsuario);
		double datoUsuario_ceil = Math.ceil(datoUsuario);
		long datoUsuario_round = Math.round(datoUsuario);
																		//Explicamos en que consiste cada operador
		System.out.println("El valor de " + datoUsuario + " según el operador floor es: " + datoUsuario_floor + ". Esto nos redondea hacia abajo.");
		System.out.println("El valor de " + datoUsuario + " según el operador ceil es: " + datoUsuario_ceil + ". Esto nos rendondea hacia arriba.");
		System.out.println("El valor de " + datoUsuario + " seguún el operador round es: " + datoUsuario_round + ". Esto nos redondea al número entero más cercano. ");

	}

}
