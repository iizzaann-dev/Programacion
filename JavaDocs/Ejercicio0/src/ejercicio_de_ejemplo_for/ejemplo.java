package ejercicio_de_ejemplo_for;

import java.util.Scanner;

public class ejemplo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Dime un número: ");
		num1 = teclado.nextInt();
		System.out.println("Dame otro número");
		num2 = teclado.nextInt();
		
		for (int contador = num1; contador <= num2; contador = contador + 1 ) {
			System.out.println("Analizamos el valor " + contador);
		if (contador % 5 == 0) {
			System.out.println(contador + " es múltiplo de 5");
		}

	}

	}
}
