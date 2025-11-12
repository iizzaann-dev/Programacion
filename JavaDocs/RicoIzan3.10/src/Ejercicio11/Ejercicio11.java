/*
 *  Descripción: Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
    primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
    primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
    Nombre: Izan Rico Blanco
    Fecha: 
 */

package Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int [] vector;
		int [] vectorInvertido;
		int suma = 0; 
		int todo = 0;
		
		vector = new int [100];
		vectorInvertido = new int [100];
		
		for (int contador = 0; contador < vector.length; contador++) {
			vector[contador] = suma++ + 1;
			
			if (vector[contador] == 4) {
				todo = vector[contador];
			}
			
			System.out.println(vector[contador]);
		}
		
		System.out.println(todo);

	}

}
