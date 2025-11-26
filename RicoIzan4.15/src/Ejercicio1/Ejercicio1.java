/*
*Descripción: Crea un método llamado comparaNombres, el cual devolverá el booleano true en el caso de
*que los dos nombres introducidos como parámetros sean iguales y false en caso contrario.
*Nombre: Izan Rico Blanco
*Fecha: 26/11/2025
*/

package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		String nombre1 = "", nombre2 = "";
		
		System.out.println("Ingresa un nombre: ");
		nombre1 = teclado.nextLine();
		
		System.out.println("Ingresa otro nombre: ");
		nombre2 = teclado.nextLine();

		
		if(comparaNombres(nombre1, nombre2) == true) {
			System.out.println("Los nombres son iguales.");
		}else {
			System.out.println("Los nombres no son iguales.");
		}
	}

	
	public static boolean comparaNombres (String nombre1, String nombre2) {
		
		boolean iguales = false; 
		
		if (nombre1.equalsIgnoreCase(nombre2)) {
			iguales = true; 
		}else {
			iguales = false;
		}
		return iguales;
	}
}
