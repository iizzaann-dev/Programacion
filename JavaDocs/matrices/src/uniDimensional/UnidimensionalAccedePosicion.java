package uniDimensional;

import java.util.Scanner;

public class UnidimensionalAccedePosicion {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Pedir al usuario cuántos números va a ingresar
        System.out.print("¿Cuántos números quieres ingresar en el array? ");
        int n = scanner.nextInt();  // Número de elementos del array

        // Paso 2: Crear el array con el tamaño especificado por el usuario
        int[] numeros = new int[n];

        // Paso 3: Pedir al usuario que ingrese los valores para llenar el array
        System.out.println("Introduce " + n + " números para el array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();  // Leer el número y almacenarlo en el array
        }

        // Paso 4: Pedir al usuario la posición que quiere consultar
        System.out.print("\n¿A qué posición del array deseas acceder? (0 a " + (n - 1) + "): ");
        int posicion = scanner.nextInt();

        // Validar que la posición esté dentro del rango
        if (posicion >= 0 && posicion < n) {
            // Acceder al valor de la posición solicitada
            System.out.println("El valor en la posición " + posicion + " es: " + numeros[posicion]);
        } else {
            System.out.println("¡Error! La posición " + posicion + " está fuera de rango.");
        }

       
    }
}

