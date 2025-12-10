package EjercicioFechas;

import java.util.Scanner;

public class EjercicioFechas {
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		String fechaNacimiento = "";
		
		
		System.out.println("Dime tu fecha de nacimiento (aaaa-mm-dd): ");
		fechaNacimiento = teclado.nextLine();
		
		String dia = fechaNacimiento.substring(8,9);
		String mes = fechaNacimiento.substring(5,6);
		String anio = fechaNacimiento.substring(0,3);
		
		LocalDate fecha = LocalDate(dia, mes, anio);

		
	}
}
