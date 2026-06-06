package Ejercicio;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		double[][] servidoresNas = new double[4][];

		for (int filas = 0; filas < servidoresNas.length; filas++) {
			int random = (int) (Math.random() * (10 - 1 + 1) + 1);
			servidoresNas[filas] = new double[random];

			for (int columnas = 0; columnas < random; columnas++) {
				double tamanio = (Math.random() * (20 - 1 + 1) + 1);

				servidoresNas[filas][columnas] = tamanio;

			}
		}
		recorrerArray(servidoresNas);

		System.out.println("");

		recorrido(servidoresNas);
	}

	public static void recorrerArray(double[][] matriz) {

		ArrayList<Double> lista1 = new ArrayList<>();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				lista1.add(matriz[i][j]);

			}
			System.out.println("NAS " + (i + 1) + ": " + lista1.toString());
			lista1.removeAll(lista1); //Este no se usaria porque se usa a si misma para borrarse 
			lista1.clear();
		}
	}
	
	
	
	
tatic void recorrido(double[][] matriz) {
		double[] lista = null;

		for (int i = 0; i < matriz.length; i++) {
			lista = new double[matriz[i].length];

			for (int j = 0; j < matriz[i].length; j++) {

				lista[j] = matriz[i][j];

			}

			System.out.println("NAS " + (i + 1) + ": " + Arrays.toString(lista));

		}
	}

}
