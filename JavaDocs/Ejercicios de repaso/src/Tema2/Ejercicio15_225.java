/*
 *Descripción: Escribe un programa que dada una cantidad de euros que el usuario introduce por teclado
 *(múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para alcanzar
 *dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que indicar el
 *mínimo de billetes posible.
 *Nombre: Izan Rico Blanco
 *Fecha: 15/12/2025
*/



package Tema2;

import java.util.Scanner;

public class Ejercicio15_225 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int dineroIngresado = 0;
		int contador500 = 0, contador200 = 0, contador100 = 0, contador50 = 0, contador20 = 0, contador10 = 0, contador5 = 0;
		
		System.out.println("Ingresa cuanto dinero quieres que se te devuelva (en billetes de 500, 200, 100, 50, 20, 10 y 5): ");
		dineroIngresado = teclado.nextInt();
		int dineroIngresadoInicial = dineroIngresado;
		
		do {																	//Realizamos un bucle que no acaba hasta que el dineroIngresado sea 0
			if (dineroIngresado % 500 == 0) {
				dineroIngresado = dineroIngresado - 500;
				contador500++;
				
			}else if (dineroIngresado % 200 == 0) {
				dineroIngresado = dineroIngresado - 200;
				contador200++;
				
			}else if (dineroIngresado % 100 == 0) {
				dineroIngresado = dineroIngresado - 100;
				contador100++;
				
			}else if (dineroIngresado % 50 == 0) {
				dineroIngresado = dineroIngresado - 50;
				contador50++;
				
			}else if (dineroIngresado % 20 == 0) {
				dineroIngresado = dineroIngresado - 20;
				contador20++;
				
			}else if (dineroIngresado % 10 == 0){
				dineroIngresado = dineroIngresado - 10;
				contador10++;
			}else {
				dineroIngresado = dineroIngresado - 5;
				contador5++;
			}
		}while (dineroIngresado != 0);

		System.out.printf("%d€ en un mínimo de billetes son: %d billetes de 500, %d billetes de 200, %d billetes de 100, %d billetes de 50,\n %d billetes de 20, %d billetes de 10 y %d billetes de 5.",
				dineroIngresadoInicial, contador500, contador200, contador100, contador50, contador20, contador10, contador5);


	}

}
