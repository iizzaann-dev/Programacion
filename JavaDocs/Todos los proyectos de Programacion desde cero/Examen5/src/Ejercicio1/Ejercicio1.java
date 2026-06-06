package Ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {

		int [][] ventas = new int[3][12];
		ventas = rellenarArrayAleatorios(ventas);
		
		String[] meses = {
			    "Ene", "Feb", "Mar", "Abr", "May", "Jun",
			    "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"
			};
		
		String [] sucursales = {"Malaga", "Sevilla", "Granada"};
		
		
		
		imprimirArray(ventas, meses, sucursales);

		System.out.println("Las ventas totales son: " + calcularVentaTotal(ventas));
		
		System.out.println("El mejor mes es: " +  mejorMes(ventas, meses));

		
	}
	
	
	public static int [][] rellenarArrayAleatorios (int [][] ventas) {
		
		for(int filas = 0; filas < ventas.length; filas++) {
			for(int columnas = 0; columnas < ventas[filas].length; columnas++) {					//Siempre ponemos como indice las filas cuando recorremos el array de forma normal
				
				/*
				 * Otra forma es:
				 * se mete dentro de un while en la que la condicion es esta: aleatorio%500 = 0
				 * Random rd = new Random();
					int aleatorio = rd.nextInt(1000,20000);
					
					
				 */
				int aleatorio = ((int)(Math.random() * 39) + 2) * 500;								//Para sacar los numeros de entre 1000 y 20000 (el 1000 es para llegar al 20000
				ventas[filas][columnas] = aleatorio;
			}																						//y completar los multiplos)
		}
		
		return ventas;
	}
	
	public static void imprimirArray(int [][] ventas, String [] meses, String [] sucursales){
		
		String [][] arrayAuxiliar = new String[4][13];
		arrayAuxiliar[0][0] = "";

		
		for (int filas = 0; filas < arrayAuxiliar.length; filas++) {
		
			
			if (filas < 3) {
				arrayAuxiliar[filas + 1][0] = sucursales[filas];
			}
			
			
			for(int columnas = 1; columnas < 13; columnas++) {
				
				if(filas == 0) {
					arrayAuxiliar[0][columnas] = meses[columnas - 1];
					
				}
			}
		}
		
		for(int i = 1; i < arrayAuxiliar.length;i++ ) {
			for(int j = 1; j < arrayAuxiliar[i].length; j++) {
				
				arrayAuxiliar[i][j] = String.valueOf(ventas[i - 1][j - 1]);

			}
		}
		
		
		for(int i = 0; i < arrayAuxiliar.length;i++ ) {
			for(int j = 0; j < arrayAuxiliar[i].length; j++) {
				
				
				System.out.print(arrayAuxiliar[i][j]+ "		");

			}
			System.out.println();

		}
		
	}
	
	
	//Calcular la venta total
	
	public static double calcularVentaTotal (int [][] ventas) {
		
		double resultado = 0;
		
		for(int i = 0; i < ventas.length; i++) {
			for(int j = 0; j < ventas[i].length; j++) {
				
				resultado += ventas[i][j]; 
			}
		}
		
		return resultado;
	}
	
	
	//Calcula qué mes (en texto) tuvo la mayor venta acumulada de las 3 sucursales.
	
	public static String mejorMes(int [][] ventas, String [] meses) {
		
		String resultado = "";
				
		int acumulador = 0, max = 0, indice = 0;
		
		int [] arrayAuxiliar = new int [12];
		
		for(int columnas = 0; columnas < ventas[0].length; columnas++) {
						
			for(int filas = 0; filas < ventas.length; filas++) {

				acumulador += ventas[filas][columnas];
								
			}
			
			arrayAuxiliar[columnas] = acumulador;
			acumulador = 0;
		}
		
		for(int i = 0; i < arrayAuxiliar.length; i++) {
			System.out.println(meses[i]+ ": " + arrayAuxiliar[i]);

			if(arrayAuxiliar[i] > max) {
				max = arrayAuxiliar[i];
				indice = i;
			}
		}
		
		resultado = meses[indice];
		
		return resultado;
	}
}




