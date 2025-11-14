/*
 * Descripción:  Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
 * productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones:
 * int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
 * int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
 * double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
 * Autor: Izan Rico Blanco
 * Fecha: 14/11/2025	
 */

package Ejercicio8;

import java.util.Scanner;

import biblioteca.matematicas;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("Ingresa el valor de n: ");
		n = teclado.nextInt();
		
		System.out.println("El sumatorio de todos los numeros del 1 al " + n + " es: " + matematicas.suma1aN(n));
		System.out.println("El productorio de todos los números del 1 al " + n + " es: " + matematicas.producto1aN(n));
		System.out.println("El valor intermedio entre el 1 y el " + n + " es: " + matematicas.intermedio1aN(n));
	}

}
