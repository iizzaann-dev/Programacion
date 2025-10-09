/*
 * Descripción: Se le pide a un usuario ciertos datos, y si se cumplen unas condiciones, se le enseña un mensaje por pantalla.
 * Autor: Izan Rico Blanco
 * Fecha: 03/10/2025
 */

package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		  Scanner teclado = new Scanner(System.in);
		  
		  String nombre;
		  int edad;
		  double nota;
		  
		  System.out.println("Por favor, ingresa tu nombre: ");
		  nombre = teclado.nextLine();
		  System.out.println("Por favor, ingresa tu edad: ");
		  edad= teclado.nextInt();
		  System.out.println("Por favor ingresa tu nota: ");
		  nota = teclado.nextDouble();
		  
		  if(edad < 18) {
			  System.out.println(nombre + ", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimo.");
		  }
			  else if (nota <= 7) {
				  System.out.println(nombre + ", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimo");
				  
			  }else {
					  System.out.println(nombre + ", usted ha sido admitido en el curso, cumple las condiciones requeridas.");
				  }
			  }
		  }
		  
		  
		  
	


