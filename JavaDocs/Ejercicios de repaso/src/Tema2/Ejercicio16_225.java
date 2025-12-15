/*
 *Descripción:
 *Nombre: Izan Rico Blanco
 *Fecha: 15/12/2025
*/


package Tema2;

import java.util.Scanner;

public class Ejercicio16_225 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int numero = 0, suma = 0, numeroInicial = 0, resultado = 0;
		
		System.out.println("Ingresa el número que quieras para saber la suma de todas sus cifras");
		numero = teclado.nextInt();
		numeroInicial = numero;
		
		do {
			suma = suma + (numero % 10); 
			numero = numero / 10;
			resultado = suma + numero;
			
		}while (numero != 0);
		
		System.out.printf("El resultado de la suma de todas las cifras de %d es: %s.", numeroInicial, resultado);
	}

}
