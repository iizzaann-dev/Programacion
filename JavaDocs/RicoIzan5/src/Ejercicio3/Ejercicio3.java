/*
 * Descripción: Con el uso de switch case se le pide al usuario que ingrese su nota (para saberla en forma cualitativa), si no se ingresa un dato correcto se indica que es una nota no valida
 * Autor: Izan Rico Blanco
 * Fecha: 08/10/2025
 */

package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int nota;												//Declaramos las variables
																//Le pedimos la nota al usuario
		System.out.println("Buenas, ingresa tu nota: ");
		nota = teclado.nextInt();
																//Realizamos las conidiciones
		switch (nota) {
		
		case 0:
			System.out.println("Insuficiente");
			break;
			
		case 1:
			System.out.println("Insuficiente");
			break;
			
		case 2:
			System.out.println("Insuficiente");
			break;
			
		case 3:
			System.out.println("Insuficiente");
			break;
			
		case 4:
			System.out.println("Insuficiente");
			break;
			
		case 5:
			System.out.println("Suficiente");
			break;
			
		case 6:
			System.out.println("Bien");
			break;
			
		case 7:
			System.out.println("Notable");
			break;
			
		case 8:
			System.out.println("Notable");
			break;
			
		case 9:
			System.out.println("Sobresaliente");
			break;
			
		case 10:
			System.out.println("Sobresaliente");
			break;
			
		default:
			System.out.println("Has ingresado una nota no válida.");
		}
		
		

	}

}
