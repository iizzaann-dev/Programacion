/*
 * Descripción: Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga
 * si la fecha es correcta o no. Se debe crear una función donde le pasemos los datos y devuelva si
 * es correcta o no
 * Autor: Izan Rico Blanco
 * Fecha: 14/11/2025 
 */

package Ejercicio10;

import biblioteca.*;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int dia = 0, mes = 0, anio = 0;
		
		System.out.println("Ingresa un día: ");
		dia = teclado.nextInt();
		
		System.out.println("Ingresa un mes: ");
		mes = teclado.nextInt();
		
		System.out.println("Ingresa un año: ");
		anio = teclado.nextInt();
		
		if (matematicas.comprobacionFecha(dia, mes, anio) == true) {
			System.out.println("La fecha introducida es correcta.");

		}else {
			System.out.println("La fecha intrudica es incorrecta.");

		}

		


	}

}
