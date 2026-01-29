/*
 *Descripción:  Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
 *empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la
 *información de N personas distintas (valor también introducido por teclado). Para cada
 *persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe
 *guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada
 *género.
 *Nombre: Izan Rico Blanco
 *Fecha: 17/12/2025
*/


package ArraysYmatrices;

import java.util.Scanner;

public class Ejercicio5_Matrices {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int [][] matriz;
		int cantidad = 0; 
		int genero = 0; 
		double salario = 0; 
		
		System.out.println("Cual es la cantidad de trabajadores que se van a incluir: ");
		cantidad = teclado.nextInt();

		matriz= new int [cantidad][2];
		
		for (int filas = 0; filas <= matriz.length; filas++) {
			for (int columnas = 0; columnas <= matriz[filas].length; columnas++) {
				
				System.out.println("Ingresa el genero del primer trabajador/a (recuerda que es 0 para varón y 1 para mujer): ");
				genero = teclado.nextInt();
				
				System.out.println("Ingresa el salario de cada trabajador/a: ");
				salario = teclado.nextDouble();
				

			}
		}
		

	}

}
