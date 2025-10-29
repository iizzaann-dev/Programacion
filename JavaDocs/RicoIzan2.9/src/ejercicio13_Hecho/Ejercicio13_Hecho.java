/* Descripción:
 * Programa donde el usuario piensa un número del 1 al 100 y el ordenador intenta adivinarlo,
 * recibiendo indicaciones de "mayor", "menor" o "igual" para ajustar su propuesta.
 * Autor: Izan Rico Blanco
 * Fecha: 18/10/25
 */
package ejercicio13_Hecho;

import java.util.Scanner;

public class Ejercicio13_Hecho {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); // Se crea un objeto Scanner para leer datos del usuario
		
		String palabra; // Variable para almacenar la indicación del usuario
		int numUser; // Número propuesto por el ordenador
			
		numUser = (int) (Math.random() * 100); // Primer intento aleatorio del ordenador
		System.out.println("El numero en el que piensas es " + numUser + "?");
		palabra = datos.next(); // Respuesta del usuario
		
		// Bucle que continúa hasta que el usuario indique "igual"
		do {
			if (palabra.equals("mayor")) {
				// Ajusta el número para que sea mayor
				numUser = (int)(Math.random() * (100 - numUser)) + numUser + 1;
				System.out.println("El número en el que piensas es " + numUser + "?");
				palabra = datos.next();
			}else if (palabra.equals("menor")) {
				// Ajusta el número para que sea menor
				numUser = (int)(Math.random() * (numUser - 1)) + 1;
				System.out.println("El número en el que piensas es " + numUser + "?");
				palabra = datos.next();
			}else {
				System.out.println("Palabra no reconocida, escribe: mayor o menor o igual");
				palabra = datos.next(); // Solicita nuevamente la indicación
			}
		}while (!palabra.equals("igual")); // Condición de parada
			
		System.out.println("El numero en el que piensas es " + numUser); // Muestra el número acertado
	}

}
