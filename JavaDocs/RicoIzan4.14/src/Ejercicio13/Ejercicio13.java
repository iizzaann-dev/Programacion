/*
 * Descripción: Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo.
 * Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado. Se debe
 * crear una función a la que le pasemos ambos valores y nos devuelva el descuento (en %).
 * Autor: Izan Rico Blanco
 * Fecha: 17/11/2025
 */

package Ejercicio13;

import java.util.Scanner;

import biblioteca.matematicas;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double con_descuento = 0, sin_descuento = 0;
		
		System.out.println("Ingresa el valor del producto sin descuento: ");
		sin_descuento = teclado.nextDouble();
		
		System.out.println("Ingresa el valor del producto con descuento: ");
		con_descuento = teclado.nextDouble();
		
		System.out.printf("El descuento es de un %.0f%%", matematicas.averiguarDescuento(sin_descuento, con_descuento));


	}

}
