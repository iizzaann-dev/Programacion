/*
 * Descripción: Se le pide al usuario que ingrese la nota media de 4 asignaturas, y se le mostraran cierta información u otra en función de si cumple o no ciertas condiciones.
 * Autor: Izan Rico Blanco
 * Fecha: 08/10/2025
 */

package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4;												//Declaramos las variables
		double notaMedia, notaMediafloor, notaMediaceil;		
																						//Le pedimos al usuario las variables
		System.out.println("Buenas, ingresa la nota de la primera asignatura: ");
		nota1 = teclado.nextDouble();
		
		System.out.println("Buenas, ingresa la nota de la segunda asignatura: ");
		nota2 = teclado.nextDouble();
		
		System.out.println("Buenas, ingresa la nota de la tercera asignatura: ");
		nota3 = teclado.nextDouble();
		
		System.out.println("Buenas, ingresa la nota de la cuarta asignatura: ");
		nota4 = teclado.nextDouble();
																						//Calculamos las medias	
		notaMedia = (nota1 + nota2 + nota3 + nota4) / 4;
		notaMediafloor = Math.floor(notaMedia);
		notaMediaceil = Math.ceil(notaMedia);
																						//Mostramos en pantalla las medias calculadas
		System.out.println("Tu nota media es: " + notaMedia);
		System.out.println("Tu nota media redondeada hacia abajo es: " + notaMediafloor);
		System.out.println("Tu nota media redondeada hacia arriba es: " + notaMediaceil);
																						//Hacemos la condición
		if(notaMedia > 8) {				
			System.out.println("Enhorabuena, usted puede cursar estudios superiores.");
		}else {
			System.out.println("Lo sentimos, usted no puede cursar estudios superiores.");
		}
	}

}
