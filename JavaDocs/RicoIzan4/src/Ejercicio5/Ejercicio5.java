/*
 * Descripción: Se le pide al usuario cierta información para despues enseñar por pantalla una ficha con su información
 * Autor: Izan Rico Blanco
 * Fecha: 08/10/2025
 */

package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
																			//Declaramos variables
		String nombre, apellidos, cicloFormativo, notaCualitativa;
		int notaCuantitativa;
																			//Ingresamos datos
		System.out.println("Buenas, ingresa tu nombre: ");
		nombre = teclado.nextLine();
		System.out.println("De acuerdo " + nombre + ", ingresa tus apellidos: ");
		apellidos = teclado.nextLine();
		System.out.println("¿Qué ciclo formativo estás estudiando?: ");
		cicloFormativo = teclado.nextLine();
		System.out.println("Cual es tu nota: ");
		notaCuantitativa = teclado.nextInt();
		
		
																			//Enseñamos en pantalla los datos ingresados
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Ciclo Formativo: " + cicloFormativo);
																			//Hacemos la condición para saber la nota cualitativa
		if (notaCuantitativa < 5) {
			 notaCualitativa = "Insuficiente";
		 }else if (notaCuantitativa < 6) {
			 notaCualitativa = "Suficiente";
		 }else if (notaCuantitativa < 7) {
			 notaCualitativa ="Bien";
		 }else if (notaCuantitativa < 9) {
			 notaCualitativa ="Notable";
		 }else  {
			 notaCualitativa = "Sobresaliente";
		 }
		System.out.println("Nota académica: " + notaCuantitativa + " (" + notaCualitativa + ")");

	}

}
