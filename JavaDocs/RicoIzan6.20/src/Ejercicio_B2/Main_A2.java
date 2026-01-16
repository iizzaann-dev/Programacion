package Ejercicio_B2;

import java.util.Scanner;

public class Main_A2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		Persona persona1 = new Persona("12345678A", "Rubén", "Remedius Remedius", 18);
		Persona persona2 = new Persona("23456700X", "Carlos", "Garcia ", 34);
		
		
		
		
		MayorEdad(persona1);
		System.out.println("");
		MayorEdad(persona2);
	}

	public static void MayorEdad (Persona persona) {
		
		if (persona.edad < 18) {
			System.out.printf("%s %s con DNI \"%s\" no es mayor de edad.\n",persona.nombre, persona.apellidos, persona.dni);

		}else {
			System.out.printf("%s %s con DNI \"%s\" es mayor de edad. ",persona.nombre, persona.apellidos, persona.dni);
		}
	}
	
}
