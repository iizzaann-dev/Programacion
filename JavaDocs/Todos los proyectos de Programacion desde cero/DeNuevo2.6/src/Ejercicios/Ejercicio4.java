package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String nombre = "", apellidos = "";
		double importeGastado1 = 0, importeGastado2 = 0, importeGastado3 = 0, importeGastado4 = 0;
		
		
		System.out.println("Ingresa tu nombre: ");
		nombre = teclado.nextLine();
		
		System.out.println("Ingresa tus apellidos: ");
		apellidos = teclado.nextLine();

		
		for(int i = 1; i < 5; i++) {
			System.out.println("Ingresa el importe gastado numero " + i);
			
			if(i == 1) {
				importeGastado1 = teclado.nextDouble();
			}else if (i == 2) {
				importeGastado2 = teclado.nextDouble();

			}else if (i == 3) {
				importeGastado3 = teclado.nextDouble();

			}else {
				importeGastado4 = teclado.nextDouble();

			}
			
		}
		
		double suma = importeGastado1 + importeGastado2 + importeGastado3 + importeGastado4;
		double media = suma / 4;
		
		if (suma >= 300) {
			System.out.println("Usted ha ganado un vale descuento de 50 euros.");

		}else {
			System.out.println("Debido a su gasto mensual, usted no ha ganado un vale descuento de 50 euros.");

		}
		
		
		
		teclado.close();
		
	}

}
