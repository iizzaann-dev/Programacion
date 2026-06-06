package Ejercicio2;

import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class main {

	public static void main(String[] args) {
		
		boolean condicion = false;	
		double limite1 = 0, limite2 = 0;
		int contador1 = 0, contador2 = 0, contador3 = 0;
		
		//Apartado 1
		CuentaBancaria cuenta1 = null;
		CuentaBancaria cuenta2 = null;
		CuentaBancaria cuenta3 = null;
		
		
		//Apartado 2
		
		while (!condicion) {
			
			try {
				cuenta1 = new CuentaBancaria( 1000, LocalDate.now() ,limiteAleatorio());
				System.out.println("Se ha creado la cuenta 1 correctamente.");

				cuenta2 = new CuentaBancaria( 2000, LocalDate.now() ,limiteAleatorio());
				System.out.println("Se ha creado la cuenta 2 correctamente.");
				
				cuenta3 = new CuentaBancaria( 3000, LocalDate.now() ,limiteAleatorio());
				System.out.println("Se ha creado la cuenta 3 correctamente.");
				
				condicion = true;

			} catch (Exception e) {
				System.out.println("No se puede. " + e);
			}
			

		}
		
		/*
		if(cuenta1.getLimiteDescubierto() < cuenta2.getLimiteDescubierto()) {
			limite1 = cuenta1.getLimiteDescubierto();
		}else {
			limite1 = cuenta2.getLimiteDescubierto();
		}
		
		if(limite1 < cuenta3.getLimiteDescubierto()) {
			limite2 =limite1;
		}else {
			limite2 = cuenta3.getLimiteDescubierto();
		}
		
		System.out.println("La cuenta con el menor limite descubierto es : " + limite2);
		*/
		
		CuentaBancaria [] limitesDescubiertos = {
			cuenta1, cuenta2, cuenta3};
		
		double min = cuenta1.getLimiteDescubierto();
		
		for (int i = 0; i < limitesDescubiertos.length; i++) {
			
			if(min > limitesDescubiertos[i].getLimiteDescubierto()) {
				min =limitesDescubiertos[i].getLimiteDescubierto();
			}
		}
		
		System.out.println("La cuenta con el menor limite descubierto es : " + min);

		
		//Apartado 5
		
		for (int i = 0; i < 5; i++) {
			cuenta1.transferir(300, cuenta2);	
		}
		
		System.out.println("Los datos de la cuenta 1 son: " + cuenta1.getSaldo());
		System.out.println("Los datos de la cuenta 2 son: " + cuenta2.getSaldo());
		
		
		//Apartado 6
		
		double media = cuenta3.getSaldo() / 2;
		
		cuenta3.embargar(media);
		
		System.out.println("Los datos de la cuenta 3 son: " + cuenta3.getSaldo());

		
	}
	
	public static int limiteAleatorio () {
		
		int aleatorio = 0;
		
		aleatorio = (int)(Math.random() * 41);
		
		return -4000 + (aleatorio * 100);
	}
	
	
	
}
