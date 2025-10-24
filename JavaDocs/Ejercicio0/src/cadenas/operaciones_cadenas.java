package cadenas;

import java.util.Scanner;

public class operaciones_cadenas {

	public static void main(String[] args) {


		Scanner teclado = new Scanner (System.in);
		
		String cadena;
		
		System.out.println("Dame una cadena de caracteres: ");
		cadena = teclado.nextLine();
		
		// Mostrar la longitud de la cadena
		int longitud = cadena.length();
		System.out.println("La longitud de la cadena es: " + cadena.length());
		
		// Mostrar el primer carácter de la cadena
		char primeraLetra = cadena.charAt(0);
		System.out.println("El primer caracter de la cadena es: " + primeraLetra);
		
		// Mostrar el último carácter de la cadena
		char ultimaLetra = cadena.charAt(longitud - 1);
		System.out.println("El último carácter de la cadena es: "+ ultimaLetra);
		// Mostrar la segunda palabra de la cadena
		String [] palabras = cadena.split(" ");
		String segundaPalabra = palabras[1];
		if(palabras[1].isEmpty()) {
			segundaPalabra = palabras[1];
			System.out.println("La segunda palabra de la cadena es: " + segundaPalabra);
		}else {
			System.out.println("La cadena de palabras no pose dos palabras.");
		}
		
		// Mostrar la cadena con la primera letra y la última en mayuscula
		
		//primeraLetra = Character.toUpperCase(cadena.charAt(0));
		//ultimaLetra = Character.toUpperCase(cadena.charAt(longitud - 1));
		
		String primLetra = cadena.substring(0,1);
		primLetra = primLetra.toUpperCase();
		
		String ultLetra = cadena.substring(longitud -2, longitud - 1);
		ultLetra = ultLetra.toUpperCase();
		
	}

}
