package repetir;

import java.util.Scanner;

public class Repetir {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int suma = 0;
		int num1, num2;
		int contador1;
		
		System.out.println("Por favor, introduce el número incial (0 para terminar el programa): ");
		num1 = teclado.nextInt();
		if (num1 != 0) {
			int contador = num1;
			
			System.out.println("Por favor, introduce el número terminal (0 para terminar el programa): ");
			num2 = teclado.nextInt();
			if (num2 != 0){
				System.out.println("Programa cancelado.");
																												//Bucle infinito (mal)    Repetir en casa					
					if (num1 == num2) {
						System.out.println("Los números son iguales, se termina el programa");
					
					}else if(num1 < num2) {
						System.out.println("Secuencia de números de " + num1 + " hasta " + num2);
						System.out.print(num1 + " ");
						while (contador < num2 ) {
							contador = contador + 1;
							System.out.print(contador + " ");
						}
					}else {
						System.out.println("Secuencia de números de " + num1 + " hasta " + num2);
						System.out.print(num1 + " ");
						while (contador > num2) {
							contador = contador - 1;
							System.out.print(contador + " ");
						}
					}
					
				}while(num1 != 0 && num2 != 0);
				
				System.out.println("Has ingresado: " + suma);
				
		}else {
			System.out.println("Programa cancelado.");
			}
			
		}
			
		
		
		

	}
