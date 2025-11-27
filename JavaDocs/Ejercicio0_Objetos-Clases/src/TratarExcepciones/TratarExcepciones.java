package TratarExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratarExcepciones {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un entero: ");
		int entero;
		boolean error = false; 
		
		do {
			try {
				teclado.close();		//<---- Se hace para ver otra excepcion, si se quita el programa funciona		No se hace nunca, es solo un ejemplo
				entero = teclado.nextInt();
				error = false;
			}catch (InputMismatchException exTipoDiferente) {
				error = true;
				System.out.println("Te has equivocado. Dame un entero: ");
				teclado.nextLine();
				entero = 0; 
			}catch (IllegalStateException exErrorTeclado) {
				error = true;
				
				System.out.println("No se puede acceder a la consola.");
				entero = 0; 
			}
			
		}while (error == true);	
		
		System.out.println("El numero introducido es: " + entero);

		}
	}