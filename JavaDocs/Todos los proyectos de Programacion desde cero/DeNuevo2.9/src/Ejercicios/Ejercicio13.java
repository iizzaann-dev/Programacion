/*
 *Descripción: Escribe un programa Java donde el usuario "piensa" un número del 1 al 100 y el ordenador
	intenta adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta
	adivinarlo (el usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha
	pensado).
 *Nombre: Izan Rico Blanco
 *Fecha: 13/05/2026
*/


package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int nuevoValor = 0;
		boolean terminar = true;
		String entradaString = "";
		
		System.out.println("Piensa un numero del 1 al 100 e ingresa un parametro(otro numero) superior.");
		double entrada = teclado.nextDouble();
		
		do {
			double aleatorio = Math.random() * 100;
			
			if(entrada == aleatorio) {
				System.out.println("Tu numero es el: " + aleatorio);

			}else {
				System.out.println("De acuerdo, es mayor o menor al numero dado: ");
				entradaString = teclado.nextLine();
				
				if(entradaString.toLowerCase().equals("mayor")) {
					nuevoValor = (int)(aleatorio);
					aleatorio = (int)(Math.random() * (100 - nuevoValor + 1)) + nuevoValor;

				} else if(entradaString.toLowerCase().equals("menor")) {
					nuevoValor = (int)(aleatorio);
					aleatorio = (int)(Math.random()* nuevoValor - 0 + 1) + 0;
				}

			}
			
			terminar = false;
		}while(terminar);
		
		teclado.close();

	}
}
