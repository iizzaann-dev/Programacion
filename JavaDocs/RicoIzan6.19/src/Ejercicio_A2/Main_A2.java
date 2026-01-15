package Ejercicio_A2;

import java.util.Scanner;

public class Main_A2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		System.out.println("Iingresa los datos de la primera persona: ");
		System.out.println("DNI: ");
		persona1.dni = teclado.nextLine();
		
		System.out.println("Nombre: ");
		persona1.nombre = teclado.nextLine();
		
		System.out.println("Apellidos: ");
		persona1.apellidos = teclado.nextLine();
		
		System.out.println("Edad: ");
		persona1.edad = teclado.nextInt();

		teclado.nextLine();
		
		System.out.println("Iingresa los datos de la segunda persona: ");
		System.out.println("DNI: ");
		persona2.dni = teclado.nextLine();
		
		System.out.println("Nombre: ");
		persona2.nombre = teclado.nextLine();
		
		System.out.println("Apellidos: ");
		persona2.apellidos = teclado.nextLine();
		
		System.out.println("Edad: ");
		persona2.edad = teclado.nextInt();
		
		
		MayorEdad(persona1.nombre, persona1.apellidos, persona1.edad, persona1.dni);
		MayorEdad(persona2.nombre, persona2.apellidos, persona2.edad, persona2.dni);
	}

	public static void MayorEdad (String nombre, String apellidos, int edad, String dni) {
		
		if (edad < 18) {
			System.out.printf("%s %s con DNI \"%s\" no es mayor de edad.\n",nombre, apellidos, dni);

		}else {
			System.out.printf("%s %s con DNI \"%s\" es mayor de edad. ",nombre, apellidos, dni);
		}
	}
	
}
