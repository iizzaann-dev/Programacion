package Ejerciciocontador10en10;

import java.util.Scanner;

public class contador10en10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int contador = 100;
		int inicio = 10;
		
		System.out.println("La cuenta atras desde 100 hasta 0, de 10 en 10: ");
		
		do {
			System.out.println(contador);
			contador = contador - 10;
			inicio = inicio -1;
			
		}while(inicio != 0);
		 

	}

}
