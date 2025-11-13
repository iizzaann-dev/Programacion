/*
 * Descripción: Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
 * o no. Implementa y utiliza la función:
 * boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
 * Autor: Izan Rico Blanco
 * Fecha: 13/11/2025
 */

package Ejercicio2;

import java.util.Scanner;

import biblioteca.matematicas;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int edad = 0;										//Declaramos la variable que vamos a usar
		
		System.out.println("Buenas, ingrese su edad: ");	
		edad = teclado.nextInt();							//Pedimos el valor de la variable
			
		if (matematicas.esMayorEdad(edad) == true) {					//Realizamos la condicion para imprimir un mensaje u otro
			System.out.println("Eres mayor de edad.");
		}else {
			System.out.println("No eres mayor de edad.");
		}
	}

	
	
}
