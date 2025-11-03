/*
 * Descripción: Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
 * 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
 * programa mostrará la nota mínima, máxima y media de cada alumno.
 * Autor: Izan Rico Blanco
 * Fecha: 03/11/2025
 */

package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String[] nombresAsignaturas = {"Lengua", "Matemáticas", "Inglés", "Filosofía", "Deporte"};
		double [][] notas;
		int contadorAlumnos = 0, contadorAsignaturas = 0;
		final int asignaturas = 5, alumnos = 4;
		double [] media, suma, maximo, minimo;
		
		
		notas = new double [alumnos][asignaturas];
		suma = new double[4];
		media = new double[4];
		minimo = new double [4];
		maximo = new double [4];
		
		for (int filas = 0; filas < notas.length; filas++) {
			System.out.println("--- Alumno " + (filas + 1) + " ---");
			for (int columnas = 0; columnas < notas[filas].length; columnas++) {
				System.out.println("Ingresa la nota del alumno " + (filas + 1) + " para la asignatura de " + nombresAsignaturas[columnas] + ": ");
				notas[filas][columnas] = teclado.nextInt();
				suma[filas] = suma[filas] + notas[filas][columnas];
				
				
				if (notas[filas][columnas] > maximo[filas]) {
					maximo[filas] = notas[filas][columnas];
				}
				if (notas[filas][columnas] < minimo[filas]) {
					minimo[filas] = notas[filas][columnas];
				}
				
				media[filas] = suma[filas] / 5;
			}
		}
		
		System.out.println("La nota media del alumno " + notas[alumnos] + " es");

	}
}