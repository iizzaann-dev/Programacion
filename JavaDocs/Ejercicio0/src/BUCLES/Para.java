package BUCLES;

import java.util.Scanner;

public class Para {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número: ");
		int numero = teclado.nextInt();
		
		for (int contador = 10; contador >= 1; contador = contador - 1) {
		System.out.println(numero + " multiplicado por " + contador + " = " + numero * contador);
		}
	}

}
