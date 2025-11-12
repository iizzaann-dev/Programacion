/*
 * Descripcion: Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
 * enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
 * mostrará en qué posiciones del array aparece N.
 * Autor: Izan Rico Blanco
 * Fecha: 23/10/2025
 */

package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int [] numero;
		numero = new int [100];
		int numUsuario;
		
		System.out.println("Ingresa un número entero para saber en que posiciones del array aparece: ");
		numUsuario = teclado.nextInt();
		
		for (int posicion = 0; posicion < numero.length; posicion++) {
			numero[posicion] = (int) (1+ Math.random() * 10);
			if (numero[posicion] == numUsuario){
				System.out.println("El número " + numUsuario + " aparece en la posicion " + posicion + " del array.");
			}
		}
	}
}
