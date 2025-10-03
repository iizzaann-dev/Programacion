/*
 * Descripción: Se pide cierta información para después devolverla por pantalla de una forma con más estilo
 * Autor: Izan Rico Blanco 
 * Fecha: 31/09/2025
 */
package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nombreEquipo;
		System.out.println("Ingresa el nombre del equipo: ");
		nombreEquipo = teclado.nextLine();
		
		int fundacion;
		System.out.println("Ingresa el año de fundación del equipo: ");
		fundacion = teclado.nextInt();
		
		String nombreEstadio;
		System.out.println("Ingresa el nombre del estadio: ");
		nombreEstadio = teclado.nextLine();
		
		String nombreCapitan; 
		System.out.println("Ingresa el nombre del capitán del equipo");
		nombreCapitan = teclado.nextLine();
		
		
		

	}

}
