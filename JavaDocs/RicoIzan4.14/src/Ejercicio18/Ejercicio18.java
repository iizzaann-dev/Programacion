/*
 * Descripción: El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se divide el número de DNI
 * entre 23 y el resto es codificado por una letra según la siguiente equivalencia:
 * 0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N",
 * 13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".
 * Autor: Izan Rico Blanco
 * Fecha: 24/11/2025
 */

package Ejercicio18;

import biblioteca.*;
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int dni = 0; 
		System.out.println("Ingresa los dígitos de tu DNI para averiguar tu NIF: ");
		
		dni = teclado.nextInt();
		
		System.out.println("El NIF de tu DNI es: " + matematicas.calculoNIF(dni));


	}

}
