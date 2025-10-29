/* Descripción:
 * Fecha:
 * Autor:
 */
package ejercicio14_conWhiles;

import java.util.Scanner;

public class Ejercicio14_conWhiles {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		/*Escribe un programa que dada una cantidad de euros que el usuario introduce por teclado 
(múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para alcanzar 
dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que indicar el 
mínimo de billetes posible.
		 * 
		 */
		
		int dinero,restante,dividendo,contador500 = 0, contador200 = 0, contador100 = 0, contador50 = 0, contador20 = 0, contador10 = 0, contador5 = 0;
		
		System.out.println("Introduce cuanto dinero tienes (multiplo de 5)");
		dinero = datos.nextInt();
		restante = dinero;
		
		while (restante >= 500) {
			dividendo = restante / 500;
			restante  = restante % 500;
			contador500 = dividendo;
		}
		while (restante >= 200) {
			dividendo = restante / 200;
			restante  = restante % 200;
			contador200 = dividendo;
			
		}
		while (restante >= 100) {
			dividendo = restante / 100;
			restante  = restante % 100;
			contador100 = dividendo;
			
		}
		while (restante >= 50) {
			dividendo = restante / 50;
			restante  = restante % 50;
			contador50 = dividendo;
			
		}
		while (restante >= 20) {
			dividendo = restante / 20;
			restante  = restante % 20;
			contador20 = dividendo;
			
		}
		while (restante >= 10) {
			dividendo = restante / 10;
			restante  = restante % 10;
			contador10 = dividendo;
			
		}
		while (restante >= 5) {
			dividendo = restante / 5;
			restante  = restante % 5;
			contador5 = dividendo;
			
		}
		System.out.println("Tu dinero se reparte en: ");
		
		if (contador500 > 0) {
			System.out.println(contador500 + " billetes de 500");
			
		}if (contador200 > 0) {
			System.out.println(contador200 + " billetes de 200");
			
		}if (contador100 > 0) {
			System.out.println(contador100 + " billetes de 100");
			
		}if (contador50 > 0) {
			System.out.println(contador50 + " billetes de 50");
			
		}if (contador20 > 0) {
			System.out.println(contador20 + " billetes de 20");
			
		}if (contador10 > 0) {
			System.out.println(contador10 + " billetes de 10");
			
		}if (contador5 > 0) {
			System.out.println(contador5 + " billetes de 5");
			
		}
	}

}
