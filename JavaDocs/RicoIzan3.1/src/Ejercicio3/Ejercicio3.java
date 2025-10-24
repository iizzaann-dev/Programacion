/* Descripción: Crear un programa que pida diez números reales por teclado, los almacene en un array, 
 * luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
 * Autor: Izan Rico Blanco
 * Fecha: 22/10/2025
 */

package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

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
