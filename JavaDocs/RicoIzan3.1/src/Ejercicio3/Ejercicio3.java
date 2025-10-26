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
		
		
		double [] numero;
		numero = new double[10];
		
		System.out.println("Ingresa un número: ");
		for(int posicion = 0; posicion < 10; posicion++) {
				numero[posicion] = teclado.nextInt();
				
		}
		double maximo = numero[0];
		double minimo = numero[0];		
		
		for (int contador = 1; contador < numero.length; contador++) {
			
			if (numero[contador] > maximo){
				maximo = numero[contador];
			}
			
			if (numero[contador] < minimo) {
				minimo = numero[contador];
			}
		}
		System.out.println("El número más grande de todos los introducidos es: " + maximo + " y el número más pequeño es: " + minimo);
	}

}
