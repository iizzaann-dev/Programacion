/*
 * Descripción: Escribe un programa Java que calcule el valor A elevado a B (A^B) sin hacer uso del operador de
 * potencia (^), siendo A y B valores introducidos por teclado, y luego muestre el resultado por
 * pantalla.
 * Autor: Izan Rico Blanco
 * Fecha: 23/10/2025
 */

package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int base, exponente;
		double potencia = 1;
		System.out.println("Ingresa la base de la potencia: ");
		base = teclado.nextInt();
		
		System.out.println("Ingresa el exponente de la potencia: ");
		exponente = teclado.nextInt();
		
		
		if(exponente != 0) {
			if (exponente > 0) {
				for(int contador = 0; contador < exponente ; contador++) {
					potencia = potencia * base;
				}
				System.out.println(potencia);
				
			}else if (exponente < 0) {
				exponente = exponente * (-1);
				for(int contador = 0; contador < exponente ; contador++) {
					potencia = potencia * base;
			}
				System.out.println("1/" + (int)(potencia) + " ó " + (1/potencia));
		}else {
			System.out.println("El resultado de la potencia es 1");
			}
	
		}

	}

}
