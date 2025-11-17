/*
 * Descripción: Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
 * Para ello implementa una función que reciba como parámetro un número entero y muestre por
 * pantalla la tabla de multiplicar de dicho número
 * Autor: Izan Rico Blanco
 * Fecha: 17/11/2025
 */

package Ejercicio11;

import biblioteca.*;
import java.util.Scanner;

import biblioteca.matematicas;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("Ingresa un número para ver su tabla de multiplicar: ");
		n = teclado.nextInt();
		
		matematicas.tablaMultiplicar(n);
	}

}
