/*
 * Descripción: Se debe de pedir una serie de datos al usuario y mostrarlos en pantalla
 * Autor: Izan Rico Blanco
 * Fecha: 01/10/2025
 */

package Ejercicio1;

import java.util.Scanner; 
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombreUsuario;
		System.out.println("Ingresa tu nombre: ");
		nombreUsuario = teclado.nextLine();
		
		String apellidosUsuario;
		System.out.println("Ingresa tus apellidos: ");
		apellidosUsuario = teclado.nextLine();
		
		int edadUsuario;
		System.out.println("Ingresa tu edad: ");
		edadUsuario= teclado.nextInt();
		
		teclado.nextLine();
		String direccionUsuario; 
		System.out.println("Ingresa tu dirección: ");
		direccionUsuario = teclado.nextLine();
		
		double alturaUsuario; 
		System.out.print("Ingresa tu alura: ");
		alturaUsuario = teclado.nextDouble();
		
		double pesoUsuario;
		System.out.println("Ingresa tu peso: ");
		pesoUsuario = teclado.nextDouble();
		
		System.out.println("Gracias, tus datos son: ");
		
		System.out.println("Nombre: " + nombreUsuario);
		
		System.out.println("Apellidos: " + apellidosUsuario);
		
		System.out.println("Edad: " + edadUsuario);
		
		System.out.println("Direccón: " + direccionUsuario);
		
		System.out.println("Altura: " + alturaUsuario + "m");
		
		System.out.println("Peso: " + pesoUsuario + "Kg");
		
		
		
		

	}

}
