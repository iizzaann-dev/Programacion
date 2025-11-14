/*
 * Descripción: Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y
 * su perímetro. Implementa y utiliza las funciones:
 * double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
 * double areaRectangulo(double ancho, double alto) // Devuelve el área
 * Autor: Izan Rico Blanco
 * Fecha: 14/11/2025 
 */

package Ejercicio7;

import java.util.Scanner;

import biblioteca.matematicas;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double ancho = 0, alto = 0;
		
		System.out.println("Ingresa el ancho del rectángulo: ");
		ancho = teclado.nextDouble();
		
		System.out.println("Igresa el alto del rectángulo: ");
		alto = teclado.nextDouble();
		
		System.out.println("El perímetro del rectangulo con las dimensiones introducidos es: " + matematicas.perimetro(ancho, alto) + ""
				+ " y el area es: " + matematicas.area(ancho, alto));
	}

}
