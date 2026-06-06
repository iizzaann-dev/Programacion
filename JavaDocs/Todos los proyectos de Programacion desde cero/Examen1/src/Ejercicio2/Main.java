package Ejercicio2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String entrada = "", siglo = "";
		int contadorErrores = 0;
		LocalDate nuevaFecha;
		System.out.println("");

		
		do {
			
			System.out.println("Ingresa un año que se encuentre entre el año 1801 y el 2100: ");
			entrada = teclado.nextLine();
			LocalDate fecha = LocalDate.parse(entrada);
			
			if(fecha.isBefore(LocalDate.of(1801, 1, 1)) || fecha.isAfter(LocalDate.of(2100, 1, 1))) {
				contadorErrores++;
				System.out.println("El año introducido no es valido.");
				
			}else {
				if(fecha.getYear() >= 1801 && fecha.getYear() <= 1900 ) {
					siglo = "Siglo XIX";
					System.out.println(siglo);

					 
				}else if(fecha.getYear() >= 1901 && fecha.getYear() <= 2000) {
					siglo = "Siglo XX";
					System.out.println(siglo);

					siglo = "Siglo XXI";
					System.out.println(siglo);

				}
				
				if(fecha.isBefore(LocalDate.now())) {
					nuevaFecha = LocalDate.now().minusYears(fecha.getYear());
					
					System.out.printf("Han pasado %d años.\n", nuevaFecha.getYear());

				}else {
					nuevaFecha = fecha.minusYears(LocalDate.now().getYear());
					System.out.printf("Quedan %d años. \n", nuevaFecha.getYear());

				}
				
			}
			
			
		}while (!entrada.equals("-1")|| contadorErrores < 3);
		
		
		if(contadorErrores >= 3) {
			System.out.println("Se ha terminado el programa debido a que se ha introducido un año inválido 3 veces consecutivas.");

		}
		
		teclado.close();
	}
}