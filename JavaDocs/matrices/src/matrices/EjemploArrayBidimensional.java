package matrices;

import java.util.Scanner;

public class EjemploArrayBidimensional {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Paso 1: Pedir al usuario las dimensiones del array
	        System.out.print("Introduce el número de filas: ");
	        int filas = scanner.nextInt();

	        System.out.print("Introduce el número de columnas: ");
	        int columnas = scanner.nextInt();

	        // Paso 2: Declarar e inicializar el array bidimensional
	        int[][] matriz = new int[filas][columnas];

	        // Paso 3: Pedir los valores al usuario para llenar la matriz
	        System.out.println("Introduce los valores para llenar la matriz:");
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                System.out.print("Valor para la posición [" + i + "][" + j + "]: ");
	                matriz[i][j] = scanner.nextInt();
	            }
	        }

	        // Paso 4: Imprimir los valores de la matriz
	        System.out.println("\nMatriz ingresada:");
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println(); // Salto de línea después de cada fila
	        }

	       	    }
	}


