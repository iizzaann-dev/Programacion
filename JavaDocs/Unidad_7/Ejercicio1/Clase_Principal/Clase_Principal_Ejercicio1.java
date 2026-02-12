package Clase_Principal;

import java.util.Scanner;

import Clase_Hija.Ciudadano;
import Clase_Padre.Humano;

public class Clase_Principal_Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Humano hum1 = new Humano("Josema", "AKA Lolete");
		Ciudadano hum2 = new Ciudadano("Javier", "Calvo", "Julay");
		Ciudadano hum3 = new Ciudadano("Cristian", "Máscalvo", "MenosJulay");
		
		hum1.getNombreCompleto();
		hum2.getNombreCompleto();
		hum3.getNombreCompleto();
		
		Humano hum4 = new Humano();
	
		String entrada1 = "";
		String entrada2 = "";
		
		System.out.println("Ingresa un nombre para hum4: ");
		entrada1 = teclado.nextLine();
		
		System.out.println("Ingresa un apellido para hum4");
		entrada2 = teclado.nextLine();
		
		hum4.setNombre(entrada1);
		hum4.setApellido(entrada2);
		
		hum4.setNombre("Pepe");
		hum4.setApellido("Gómez");
		
		System.out.println(hum1.getNombreCompleto());
		System.out.println(hum2.getNombreCompleto());
		System.out.println(hum3.getNombreCompleto());
		System.out.println(hum2.getIdentificacion());
		System.out.println(hum3.getIdentificacion());
		System.out.println(hum4.getNombreCompleto());



	}

}
