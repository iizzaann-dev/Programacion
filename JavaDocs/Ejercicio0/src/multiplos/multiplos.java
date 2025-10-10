package multiplos;

import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int num1, num2;
		int contador1;
		
		System.out.println("Por favor, introduce el número incial: ");
		num1 = teclado.nextInt();
		int contador = num1;
		
		System.out.println("Por favor, introduce el número terminal: ");
		num2 = teclado.nextInt();
		
		
		do {
			System.out.println("Los números son iguales, se termina el programa");
		} while(num1 == num2);
		
		
		do {
			System.out.println("Secuencia de números de " + num1 + " hasta " + num2);
			System.out.print(num1 + " ");
			while (contador < num2 ) {
				contador = contador + 1;
				System.out.print(contador + " ");
			}
		}while (num1 < num2);
		
		
		do {
			System.out.println("Secuencia de números de " + num1 + " hasta " + num2);
			System.out.print(num1 + " ");
			while (contador > num2) {
				contador = contador - 1;
				System.out.print(contador + " ");
				
			}
		}while (num1 > num2);
		}
		
}
		