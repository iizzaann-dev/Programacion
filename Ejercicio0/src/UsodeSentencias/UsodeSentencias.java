package UsodeSentencias;

import java.util.Scanner;
public class UsodeSentencias {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Buenas, por favor ingresa un número para saber si es positivo o negativo");
		int numeroEntrada = teclado.nextInt();
		
		if (numeroEntrada > 0) {
			System.out.println("Positivo");
		} if (numeroEntrada > 50) {
			System.out.println("El número es mayor de 50");
		} else {
				if (numeroEntrada == 0) {
					System.out.println("Cero");
				} else {
					System.out.println("Negativo");
			}
		}
		
		}
		
	}


