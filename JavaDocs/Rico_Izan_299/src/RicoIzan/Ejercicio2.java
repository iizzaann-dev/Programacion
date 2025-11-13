/*
 * Descripción: Escribir un programa que genere 40 números aleatorios entre el 0 y el 50  y que muestre por consola, 
 * 20 números por linea y alineado por columnas
 * Autor: Izan Rico Blanco
 * Fecha: 
 */

package RicoIzan;

public class Ejercicio2 {

	public static void main(String[] args) {
		
	int acumulador = 0;			
	int aleatorio = 0;
		for(int contador = 0; contador < 40; contador++) {		//Realizamos un bucle for para crear numeros aleatorios
			aleatorio = (int)(Math.random() * 50); 				//Creamos los numeros aleatorios
			System.out.print(" " + contador + " ");				//Se alinean
			acumulador = acumulador + 1;						//

			if(acumulador == 20) {								//A partir de 20 salto de linea
				System.out.println("");

			}
			
		}
		//Habia que usar el \t
		
		
		}
		
		
		

	}


