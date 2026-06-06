package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int edad = 0;
		String nombre = "", apellidos = "";
		
		
		System.out.println("Ingresa tu edad: ");
		edad = teclado.nextInt();
		teclado.nextLine();
		
		if (edad < 18) {
			System.out.println("No tiene la edad requerida para realizar estos estudios.");

		}else {
			System.out.println("Ingresa tu nombre: ");
			nombre = teclado.nextLine();
			
			System.out.println("Ingresa tus apellidos: ");
			apellidos = teclado.nextLine();
			
			System.out.println("Nombre: " + nombre);
			
			System.out.println("Apellidos: " + apellidos);

			System.out.println("Edad: " + edad);
			
			System.out.println("Usted ha sido admitido.");


		}
		
		teclado.close();
		
	}

}
