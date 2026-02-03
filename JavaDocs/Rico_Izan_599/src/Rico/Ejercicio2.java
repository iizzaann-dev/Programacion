package Rico;

import libtarea3.CuentaBancaria;


public class Ejercicio2 {

	public static void main(String[] args) {
		
		System.out.printf("El año es: %d", anyoAleatorio());
		
		CuentaBancaria cuenta1(double saldo(), LocalDate anyoAleatorio()), cuenta2, cuenta3, cuenta4, cuenta5, cuenta6, cuenta7, cuenta8, cuenta9, cuenta10;
		CuentaBancaria [] vector = {cuenta1, cuenta2, cuenta3, cuenta4, cuenta5, cuenta6, cuenta7, cuenta8, cuenta9, cuenta10};
		
	}

	public static int anyoAleatorio() {
		int anyo = (int)(Math.random() * 2100);
		
		if (anyo < 1800) {
			do {
				anyo = (int)(Math.random() * 2100);
				
			}while (anyo < 1800 && anyo % 10 !=0);
			
		}
		
		
		return anyo;
	}
	
	public static double Saldo() {		
		return 1000;
	}
}
