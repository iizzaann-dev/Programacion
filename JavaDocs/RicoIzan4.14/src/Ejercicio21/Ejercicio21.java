/*
 * Descripción: Escribir un programa que tenga un menu para realizar un las cuentas gracias a el radio que da el usuario
 * Autor: Izan Rico Blanco
 * Fecha: 24/11/2025 
 */

package Ejercicio21;

import biblioteca.*;
import java.util.Scanner;


public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String opcion = "";
		double radio = 0; 
		
		do {

			System.out.println("Que quieres hacer: ");
			System.out.println("Calcular");
			System.out.println("Salir");
			
			opcion = teclado.nextLine();

			if (opcion.equalsIgnoreCase("calcular")) {
				System.out.println("Ingresa el valor del radio: ");
				radio = teclado.nextDouble();
				teclado.nextLine();
				System.out.println("Que quieres calcular: ");
				System.out.println("Circunferencia");
				System.out.println("Área");
				System.out.println("Volumen");

				opcion = teclado.nextLine();
				
				if (opcion.equalsIgnoreCase("circunferencia")) {
					System.out.println("La circunferencia del círculo con el radio " + radio + " es: " + matematicas.calcularCircunferencia(radio));
					
				}else if (opcion.equalsIgnoreCase("area")) {
					System.out.println("El área del círculo con el radio " + radio + " es: " + matematicas.calcularAreaRadio(radio));

				}else if (opcion.equalsIgnoreCase("volumen")){
					System.out.println("El volumen del círculo con el radio " + radio + " es: " + matematicas.calcularVolumenRadio(radio));
				}
			}
		}while (!opcion.equalsIgnoreCase("salir"));
	}
}