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
		
		
		
		vector = new int [100];
		vectorInvertido = new int [100];
		
		for (int contador = 0; contador < vector.length; contador++) {
			vector[contador] = contador + 1;
			
		}
		
		
		for (int contador = 0; contador < vector.length; contador++) {
			vectorInvertido[contador] = vector[vector.length - 1 - contador];
		}
		
		for(int contador = 0; contador < vector.length; contador++) {
			System.out.println(vector[contador]);
		}
		
		System.out.println("");

		
		for (int contador = 0; contador < vector.length; contador++) {
			System.out.println(vectorInvertido[contador]);

		}
		
		//La formula es: vectorInvertido[i] = vector[vector.length - 1 - i];
		/*
		 * Tambien se puede hacer lo siguiente:
		 * for (int i = vector.length - 1; i >= 0; i--) {
    	   		System.out.println(vector[i]);
			}
		 */
		
		/*
		 * En una matriz hay varios casos:
		 * 		Las ultimas filas se vuelven las primeras: 
		 * 	int filas = matriz.length;
			int columnas = matriz[0].length;
			int[][] invertida = new int[filas][columnas];

			for (int i = 0; i < filas; i++) {						|		
			    for (int j = 0; j < columnas; j++) {				|
			        invertida[i][j] = matriz[filas - 1 - i][j];		|
			     }
			}	
			        
		 		Las ultimas columnas se vuelven las primeras:
		 		for (int i = 0; i < filas; i++) {							|
				    for (int j = 0; j < columnas; j++) {					|
				        invertida[i][j] = matriz[i][columnas - 1 - j];		|
				   	}
				}
				        
				        
				Las ultimas filas y columnas se vuelven las primeras:
				for (int i = 0; i < filas; i++) {
				    for (int j = 0; j < columnas; j++) {
				        invertida[i][j] = matriz[filas - 1 - i][columnas - 1 - j];
    					}	
				}

				Si lo que hay que hacer es transponerla hay que hacer si o si a no ser q sea cuadrada (4x4, 3x3, 5x5):
				
				matriz1 [n][m] = matriz2 [m][n]



		 */
		
	}

}
