/*
 * Descripción:  Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
 * pequeño. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no
 * tres) y nos devuelva el mínimo de los dos valores.
 * Autor: Izan Rico Blanco
 * Fecha: 14/11/2025
 */

package Ejercicio9;

import java.util.Scanner;

import biblioteca.matematicas;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a = 0, b = 0, c = 0, primerMinimo = 0, segundoMinimo = 0;
		
		System.out.println("Ingresa el valor del numero a: ");
		a = teclado.nextInt();
		
		System.out.println("Ingresa el valor del numero b: ");
		b = teclado.nextInt();
		
		System.out.println("Ingresa el valor del numero c: ");
		c = teclado.nextInt();
		
		primerMinimo = matematicas.minimo(a, b);
		segundoMinimo = matematicas.minimo(primerMinimo, c);
		
		System.out.println("El mínimo entre los tres numeros es: " + segundoMinimo);
	}

}
