/*
 * Descripción: Se pide un programa para saber los desembolsos de los clientes de un supermercado y otorgarles un descuento en función de si cumplen o no una condición
 * Autor: Izan Rico Blanco
 * Fecha: 08/10/2025
 */

package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre, apellidos;															//Declaramos las variables
		double ImporteGastado1, ImporteGastado2, ImporteGastado3, ImporteGastado4;
		double suma, media;
		
		
		
		
		System.out.println("Buenas, ingresa tu nombre: ");									//Pedimos los datos
		nombre = teclado.nextLine();
		
		System.out.println("De acuerdo " + nombre + ", ahora ingresa tus apellidos: ");
		apellidos = teclado.nextLine();
		
		System.out.println("Buenas, ingresa la cantidad de dinero gastada el primer día que viniste al supermercado: ");
		ImporteGastado1 = teclado.nextDouble();
		
		System.out.println("De acuerdo, ingresa la cantidad de dinero gastada el segundo día que viniste al supermercado: ");
		ImporteGastado2 = teclado.nextDouble();
		
		System.out.println("De acuerdo, ingresa la cantidad de dinero gastada el tercer día que viniste al supermercado: ");
		ImporteGastado3 = teclado.nextDouble();

		System.out.println("De acuerdo, ingresa la cantidad de dinero gastada el cuarto día que viniste al supermercado: ");
		ImporteGastado4 = teclado.nextDouble();
		
		suma = ImporteGastado1 + ImporteGastado2 + ImporteGastado3 + ImporteGastado4;
		media = (ImporteGastado1 + ImporteGastado2 + ImporteGastado3 + ImporteGastado4)/4; 
		
		if (suma >= 300) {
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Importe Gastado1: " + ImporteGastado1 + " euros.");
			System.out.println("Importe Gastado2: " + ImporteGastado2 + " euros.");
			System.out.println("Importe Gastado3: " + ImporteGastado3 + " euros.");
			System.out.println("Importe Gastado4: " + ImporteGastado4 + " euros.");
			System.out.println("Importe medio: " + media + " euros.");
			System.out.println("¡Felicidades, usted tiene un vale descuento de 50 euros!");
		}else {
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Importe Gastado1: " + ImporteGastado1 + " euros.");
			System.out.println("Importe Gastado2: " + ImporteGastado2 + " euros.");
			System.out.println("Importe Gastado3: " + ImporteGastado3 + " euros.");
			System.out.println("Importe Gastado4: " + ImporteGastado4 + " euros.");
			System.out.println("Importe medio: " + media + " euros.");
			System.out.println("Lo siento, no ha gastado lo suficiente como para que le demos un vale descuento de 50 euros.");
		}
	}

}
