/*
 * Descripción: Escribe un programa que imprima las tablas de multiplicar del 1 al 10. Implementa una función
 * que reciba un número entero como parámetro e imprima su tabla de multiplicar.
 * Autor: Izan Rico Blanco
 * Fecha: 24/11/2025 
 */

package Ejercicio20;

import biblioteca.*;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int num = 0; 
		
		System.out.println("Ingresa el número del que quieras saber su tabla de multiplicar: ");
		num = teclado.nextInt();
		
		matematicas.tablaMultiplicar(num);


	}

}
