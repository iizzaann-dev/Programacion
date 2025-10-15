/*
 * Descripción: Se le piden ciertos datos al usuario para ver si mediante una serie de condiciones, obtiene o no el trabajo
 * Autor: Izan Rico Blanco
 * Fecha: 08/10/2025
 */

package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
																		//Declaramos las variables
		String nombre,apellidos;
		int edad, tiempoExp, proyectos;
		double salarioDeseado;
		
																		//Pedimos la información al usuario
		System.out.println("Buenas, ingrese tu nombre: ");
		nombre = teclado.nextLine();
		
		System.out.println("De acuerdo Sr/Sra " + nombre + ", ingrese sus apellidos:  ");
		apellidos = teclado.nextLine();
		
		System.out.println("De acuerdo Sr/Sra " + nombre + " " + apellidos + ", ingrese su edad: ");
		edad = teclado.nextInt();
		
		System.out.println("De acuerdo, por útlimo, ingrese su salario deseado en un año: ");
		salarioDeseado = teclado.nextDouble();
																		//Realizamos las condiciones
		if(salarioDeseado < 30000 || edad < 45) {
			System.out.println("Por favor Sr/Sra " + nombre + " " + apellidos + " ingrese sus años de experiencia: ");
			tiempoExp = teclado.nextInt();
			System.out.println("De acuerdo, ahora ingrese la cantidad de proyectos trabajados con anterioridad: ");
			proyectos = teclado.nextInt();
		
			if(tiempoExp > 2 && proyectos > 3) {
				System.out.println("Enhorabuena. Ha sido contradado");
				if(tiempoExp > 5 || proyectos > 5) {
					System.out.println("Tu salario anual es de 30000 €.");
				}else {
				System.out.println("Tu salario anual es de 25000 €.");
			}}
			else {
				System.out.println("Lo sentimos pero no cumple nuestro perfil.");
			}
		
		}else {
		System.out.println("Lo sentimos pero no cumple nuestro perfil");
		}

	}

}


