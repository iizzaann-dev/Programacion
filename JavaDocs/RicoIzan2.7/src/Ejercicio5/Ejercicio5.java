/*
 * Descripción: Se va a realizar una calculadora
 * Autor: Izan Rico Blanco
 * Fecha: 08/10/2025
 */

package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
																									//Declaramos las variables
		double num1, num2, suma, resta, multiplicacion, division;
		int operacion;
																									//Le pedimos al usuario que ingrese los valores de la variable
		System.out.println("Ingresa el primer número: ");
		num1 = teclado.nextDouble();
		
		System.out.println("Ingresa el segundo número: ");
		num2 = teclado.nextDouble();
																									//Le pedimos al usuario que ingrese la opción que quiere calcular
		System.out.println("Ingresa la operación que quieras realizar (Inserte un número): ");
		System.out.println("(1)Suma");
		System.out.println(" ");
		System.out.println("(2)Resta");
		System.out.println(" ");
		System.out.println("(3)Multiplicación");
		System.out.println(" ");
		System.out.println("(4)División");
		System.out.println(" ");
		operacion = teclado.nextInt();
																									//Realizamos las condiciones
		switch(operacion) {
			case 1:
				suma = num1 + num2;
				System.out.println("Resultado: " + suma);
				break;
			case 2:
				resta = num1 - num2;
				System.out.println("Resultado: " + resta);
				break;
			case 3:
				multiplicacion = num1 * num2;
				System.out.println("Resultado: " + multiplicacion);
				break;
			case 4:
				division = num1/ num2;
				if(num2 == 0) {
					System.out.println("No se puede dividir entre 0.");
				}else {System.out.println("Resultado: " + division);
				}
				break;	
			default: 
				System.out.println("No has ingresado una opción válida.");
		}
	}

}
