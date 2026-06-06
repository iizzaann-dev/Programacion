/*
 *Descripción:Realizar un programa en Java que solicite al usuario los siguientes datos:
 Nombre
 Edad
 Nota académica
 *Nombre: Izan Rico Blanco
 *Fecha: 05/05/2026
*/


package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		String nombre = "";
		int edad = 0; 
		double nota = 0;
		
		
		System.out.println("Ingresa tu nombre: ");
		nombre = teclado.nextLine();
		
		System.out.println("Ingresa tu edad: ");
		edad = teclado.nextInt();
		
		System.out.println("Ingresa tu nota: ");
		nota = teclado.nextDouble();
		
		if (edad >= 18 && nota > 7) {
			System.out.printf("%s, usted ha sido admitido en el curso, cumple las condiciones requeridas.", nombre);
			
		}else {
			System.out.printf("%s, lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos.", nombre);
		}



	}
}
