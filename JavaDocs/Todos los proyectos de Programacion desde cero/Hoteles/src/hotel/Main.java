package hotel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[][] hotel;

		int plantas = 0;
		int habitaciones = 0;

		System.out.println("Ingrese la cantidad de plantas del hotel : ");
		plantas = teclado.nextInt();

		System.out.println("Ingrese la cantidad de habitaciones de cada planta del hotel: ");
		habitaciones = teclado.nextInt();

		hotel = new int[plantas][habitaciones];

		for (plantas = 0; plantas < hotel.length; plantas++) {
			for (habitaciones = 0; habitaciones < hotel[plantas].length; habitaciones++) {

				hotel[plantas][habitaciones] = (int) (Math.random() * 501);

			}
		}

		mostrarIngresos(hotel);

		System.out.println("");

		totalesPorPlanta(hotel);

		System.out.println("");

		System.out.println("El ingreso total del hotel es: " + ingresoTotal(hotel));

		System.out.println("");

		System.out.println("El ingreso medio del hotel es: " + ingresoMedio(hotel));
		
		System.out.println("");
		
		habitacionesVacias(hotel);

	}

	public static void mostrarIngresos(int[][] hotel) {

		for (int plantas = 0; plantas < hotel.length; plantas++) {
			for (int habitaciones = 0; habitaciones < hotel[plantas].length; habitaciones++) {

				System.out.print(hotel[plantas][habitaciones] + " ");

			}
			System.out.println();

		}
	}

	public static void totalesPorPlanta(int[][] hotel) {

		int acumulador = 0;

		for (int plantas = 0; plantas < hotel.length; plantas++) {

			for (int habitaciones = 0; habitaciones < hotel[plantas].length; habitaciones++) {
				acumulador += hotel[plantas][habitaciones];

				System.out.print(hotel[plantas][habitaciones] + " ");

			}
			System.out.print("		" + "Total de planta: " + acumulador);
			acumulador = 0;
			System.out.println();

		}
	}

	public static int ingresoTotal(int[][] hotel) {

		int total = 0;

		for (int plantas = 0; plantas < hotel.length; plantas++) {
			for (int habitaciones = 0; habitaciones < hotel[plantas].length; habitaciones++) {

				total += hotel[plantas][habitaciones];

			}
		}
		return total;
	}

	public static int ingresoMedio(int[][] hotel) {

		int ingresoMedio = 0, plantas = 0, habitaciones = 0;

		for (plantas = 0; plantas < hotel.length; plantas++) {

			for (habitaciones = 0; habitaciones < hotel[plantas].length; habitaciones++) {

				ingresoMedio += hotel[plantas][habitaciones];

			}
		}

		ingresoMedio /= (plantas * habitaciones);

		return ingresoMedio;
	}

	public static void mejorHabitacion(int[][] hotel) {

		int mejorHab = 0;
		int max = 0;
		int plant = 0, hab = 0;
		
		
		for (int plantas = 0; plantas < hotel.length; plantas++) {
			for (int habitaciones = 0; habitaciones < hotel[plantas].length; habitaciones++) {

				
				mejorHab = hotel[plantas][habitaciones];
				
				if(max < mejorHab) {
					max = mejorHab;
					plant = plantas;
					hab = habitaciones;
				}
				
			}
		}
		
		System.out.println("La habitacion con las cordenadas " + plant + "-" + hab + ", ha generado " + max + " y se ha convertido en la habitacion estrella.");

		/*for (int plantas = 0; plantas < hotel.length; plantas++) {
			
			for (int habitaciones = 0; habitaciones < hotel[plantas].length; habitaciones++) {
				
				if (max == hotel[plantas][habitaciones]) {
					
				}
			}
		}*/
		
	}
	
	public static void habitacionesVacias (int [][] hotel) {
		
		int acumulador = 0;
		
		for (int plantas = 0; plantas < hotel.length; plantas++) {

			for (int habitaciones = 0; habitaciones < hotel[plantas].length; habitaciones++) {
				
				if(hotel[plantas][habitaciones] == 0) {
					acumulador++;
					System.out.println("La habitacion con las cordeenadas " + plantas + "-" + habitaciones + " ha estado vacia.");

				}
			}	
		} 
		
		if(acumulador == 0) {
			System.out.println("No ha habido ninguna habitacion vacia.");

		}
		
	}
}
