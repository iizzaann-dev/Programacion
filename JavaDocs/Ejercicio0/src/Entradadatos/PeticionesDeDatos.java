package Entradadatos;

import java.util.Scanner;

public class PeticionesDeDatos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int edadAlumno;
		System.out.println("Dime tu edad: ");
		edadAlumno = teclado.nextInt();
		System.out.println("Tu edad es: " + edadAlumno);
		
		teclado.nextLine();			//Después de pedir valor numérico y antes de pedir cadena de caracteres
		String nombreAlumno;
		System.out.println("Dime tu nombre: ");
		nombreAlumno = teclado.nextLine();
		System.out.println("Tu nombre es: " + nombreAlumno);
		
		System.out.println("Dime tu peso: ");
		double pesoAlumno;
		pesoAlumno = teclado.nextDouble();
		System.out.println("Tu peso son: " + pesoAlumno + " KG.");
	}
}
