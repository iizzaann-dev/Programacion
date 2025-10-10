package multiplos;

import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int contador = 100;
		int inicio = 10;
		int num1, num2;
		
		do {
			System.out.println("Por favor ingresa un número, para saber sus múltiplos: ");
			num1 = teclado.nextInt();
			
			System.out.println("De acuerdo, ahora ingresa un segundo número: ");
			num2 = teclado.nextInt();

		}while(num1 != 0 && num2 != 0);
				
		
		
		
		do {
			System.out.println(contador);
			contador = contador - 10;
			inicio = inicio -1;
			
		}while(inicio != 0);
		 

	}

}


