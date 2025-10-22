/*
 * Descripción:
 * Autor: Izan Rico Blanco
 * Fecha: 20/10/2025
 */

package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int edad, numRutas, numParticipantes;
		String nombre, apellidos, ciudad;
		double distanciaUltRuta, distancia;
		
		 System.out.println("Por favor, ingresa tu nombre: ");
		 nombre = teclado.nextLine();
		 System.out.println("Por favor, ingresa tus apellidos: ");
		 apellidos = teclado.nextLine();
		 
		 while (edad < 17 && edad > 45) {
			 System.out.println("Esa edad no es correcta, por favor, ingresa otra edad: ");	
		 }
		 	 
		 

	}

}
