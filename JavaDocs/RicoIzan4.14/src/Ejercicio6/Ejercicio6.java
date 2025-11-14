/*
 * Descripción: Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
 * uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
 * double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
 * Autor: Izan Rico Blanco
 * Fecha: 14/11/2025
 */

package Ejercicio6;

import java.util.Scanner;

import biblioteca.matematicas;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double precio = 0; 
		
		for(int contador = 1; contador < 6; contador++) {
			System.out.println("Ingresa el precio del producto nº " + contador + ": ");
			precio = teclado.nextDouble();
			System.out.println("El precio del producto nº " + contador + " es: " + matematicas.precioConIva(precio));


		}

	}

}
