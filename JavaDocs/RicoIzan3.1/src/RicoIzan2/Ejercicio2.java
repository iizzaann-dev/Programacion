/*
 * Descipción: Crear un programa que pida diez números reales por teclado, los almacene en un array, luego muestre la suma de todos los valores.
 * Autor: Izan Rico Blanco
 * Fecha: 22/10/2025
 */

package RicoIzan2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double suma = 0;
		double [] numero;
		numero = new double[10];
		
		System.out.println("Ingresa un número: ");
		for(int posicion = 0; posicion < 10; posicion++) {
				numero[posicion] = teclado.nextInt();
				suma = suma +numero[posicion]; 
				
		}
		System.out.print(suma);
	}

}
