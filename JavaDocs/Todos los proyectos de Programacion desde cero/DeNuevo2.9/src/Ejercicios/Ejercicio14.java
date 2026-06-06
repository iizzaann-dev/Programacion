/*
 *Descripción:
 *Nombre: Izan Rico Blanco
 *Fecha: 05/05/2026
*/


package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		int dinero = 0;
		boolean condicion = false;
		int b500 = 0, b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0;
		
		
		System.out.println("Ingresa tu dinero: ");
		dinero = teclado.nextInt();
		while (!condicion) {
			
			if (dinero >= 500) {
				b500++;
				dinero -= 500;
				
			}else if (dinero >= 200) {
				b200++;
				dinero -= 200;
				
			}else if (dinero >= 100) {
				b100++;
				dinero -= 100;
				
			}else if (dinero >= 50) {
				b50++;
				dinero -= 50;
				
			}else if (dinero >= 20) {
				b20++;
				dinero -= 20;
				
			}else if (dinero >= 10) {
				b10++;
				dinero -= 10;
				
			}else if (dinero >= 5) {
				b5++;
				dinero -= 5;
				
			}
			
			if (dinero == 0){
				condicion = true;
			}
			
		}
		
		System.out.printf("Se han usado %d billetes de 500€, %d billetes de 200€, %d billedes de 100€, %d billetes de 50€, "
				+ "%d billetes de 20€, %d billetes de 10€ y %d billetes de 5€.", b500, b200, b100, b50, b20, b10, b5);
		
		teclado.close();
				
	}

}
