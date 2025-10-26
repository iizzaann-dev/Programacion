/*
 * Descripción: Crea un programa que pida veinte números enteros por teclado, los almacene en un array y 
 * luego muestre por separado la suma de todos los valores positivos y negativos.
 * Autor:Izan Rico Blanco
 * Fecha: 23/10/2025
 */

package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double sumaPositivo = 0;
		double sumaNegativo = 0;
		double [] numero;
		numero = new double[10];
		
		System.out.println("Ingresa un número: ");
		for(int posicion = 0; posicion < 10; posicion++) {
				numero[posicion] = teclado.nextInt();
				if (numero[posicion] > 0) {
					sumaPositivo = sumaPositivo + numero[posicion]; 
				}
				else {
					sumaNegativo = sumaNegativo + numero[posicion];
				}
				
				
		}
		System.out.print("La suma de números positivos es: " + sumaPositivo + " y la suma de números negativos es: "+ sumaNegativo);
	}

}
