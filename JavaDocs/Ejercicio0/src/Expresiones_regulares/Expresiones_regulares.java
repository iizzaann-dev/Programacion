package Expresiones_regulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expresiones_regulares {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		Pattern patron = Pattern.compile("[0-9]{8}[A-Z]");		//Generamos el patrón
		
		String dniUsuario;
		
		System.out.println("Por favor, ingresa tu DNI: ");
		dniUsuario = teclado.nextLine();
		
		Matcher texto = patron.matcher(dniUsuario);
		
		if (texto.matches()) {
			System.out.println("El DNI tiene forma correcta.");
		} else {
			System.out.println("El DNI no tiene forma correcta.");

		}

	}

}

