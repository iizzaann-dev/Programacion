/*
 *Descripción: Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros
 *aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado un valor N y se
 *mostrará por pantalla si N existe en el array, además de cuantas veces.
 *Nombre: Izan Rico Blanco
 *Fecha: 17/12/2025
*/



package ArraysYmatrices;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Creamos un array de tamaño 1000
		
		int [] contenedor = new int [1000];
		int numero; 
		boolean validar = false;
		int comprobador = 0; 
		
		System.out.println("Ingresa un número para comprobar si esta dentro del array.");
		numero = teclado.nextInt();
		
		for (int contador = 0; contador < contenedor.length; contador++) {
			contenedor[contador] = (int) (Math.random() * 100); 
			
			if (contenedor[contador] == numero) {
				validar = true; 
				comprobador++;
			}
		}

		if (validar == true) {
			System.out.printf("El número %d aparece %d veces.", numero, comprobador);
			
		}else {
			System.out.println("No existe ese número en el array.");

		}
		
	}

}
