/*
 * Descripción: Crear un programa que pida veinte números reales por teclado, los almacene en un array y 
 * luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
 * Autor: Izan Rico Blanco
 * Fecha: 22/10/2025  
 */

package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
Scanner teclado = new Scanner(System.in);
		
		double suma = 0, contador = 0;
		double media;
		double [] numero;
		numero = new double[20];
		
		System.out.println("Ingresa un número: ");
		for(int posicion = 0; posicion < 10; posicion++) {
				numero[posicion] = teclado.nextInt();
				suma = suma + numero[posicion];
				contador ++;
		}
		media = suma / contador;
		System.out.print("La media es: " + media);

	}

}
