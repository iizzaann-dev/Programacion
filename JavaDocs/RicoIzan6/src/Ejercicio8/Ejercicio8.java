/*
 * Descripción:
 * Autor: Izan Rico Blanco
 * Fecha: 20/10/2025
 */

package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int edad, numRutas, numParticipantes, contadorCaminata = 0;
		String nombre, apellidos, ciudad,  ciudadMax = "";
		double distanciaUltRuta, distancia, distanciaMax = 0, distanciaMedia, sumaDistancia = 0;
		
		 System.out.println("Por favor, ingresa tu nombre: ");
		 nombre = teclado.nextLine();
		 System.out.println("Por favor, ingresa tus apellidos: ");
		 apellidos = teclado.nextLine();
		 System.out.println("Por favor, ingresa tu edad: ");
		 edad = teclado.nextInt();
		 
		 while (edad < 17 || edad > 45) {
			 System.out.println("Esa edad no es correcta, por favor, ingresa otra edad: ");
			 edad = teclado.nextInt();
		 }
		 	
		 System.out.println("Por favor, ingresa el número de rutas realizadas: ");
		 numRutas = teclado.nextInt();
		 
		 System.out.println("Por favor, ingresa la distancia de la última ruta: ");
		 distanciaUltRuta= teclado.nextDouble();
		 
		 for (int contador = 5; contador != 0; contador--) {
			 contadorCaminata++;
			 System.out.println("Por favor, ingresa la distancia de la caminata " + contadorCaminata + ": ");
			 distancia = teclado.nextDouble();
			 sumaDistancia = sumaDistancia + distancia;
			 System.out.println("Por favor, ingresa el número de participantes de la última caminata " + contadorCaminata + ": ");
			 numParticipantes = teclado.nextInt();
			 System.out.println("Por favor, ingresa la ciudad en donde realizaste tu última caminata " + contadorCaminata + ": ");
			 teclado.nextLine();
			 ciudad = teclado.nextLine();
			 
			 if (distancia > distanciaMax) {
				 distanciaMax = distancia;
				 ciudadMax = ciudad;
			 }
			 
		 }
		 distanciaMedia = sumaDistancia / 5;
		 
		 System.out.println("-----------------------------------------------------------------");
		 System.out.println("Nombre: " + nombre);
		 System.out.println("Edad: " + edad);
		 System.out.println("Número de rutas realizadas: " + numRutas);
		 System.out.println("");
		 System.out.println("Distancia media (5 últimas rutas): " + distanciaMedia);
		 System.out.println("Distancia más larga de las últimas 5 rutas: " + distanciaMax);
		 System.out.println("Ciudad de la ruta más larga: " + ciudadMax);
		 System.out.println("-----------------------------------------------------------------");
		 
	}

}
