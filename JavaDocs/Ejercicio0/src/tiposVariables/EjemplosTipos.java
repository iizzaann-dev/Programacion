/*
 * Descripción: ejemplos de tipos de variables
 * Autor: Izan Rico Blanco
 * Fecha: 22/09/2025
 */
package tiposVariables;

public class EjemplosTipos {

	public static void main(String[] args) {
		int numAlumnos; //Declaramos la variable numAlumnos
		numAlumnos = 0; //Asignamos la cantidad de alumnos a la variable numAlumnos
		System.out.println("Valor de la variable: " + numAlumnos); //Demostramos lo que hay asignado en la variable numAlumnos

		numAlumnos = 12;
		System.out.println("Valor de la variable: " + numAlumnos); // Le asignamos una cantidad a la cantidad de alumnos
		
		double alturaAlumno = 1.75;
		System.out.println("La altura del alumno es:\n " + alturaAlumno + " cms"); //Le otorgamos una altura al alumno
		
		char letraDni = 'a';
		System.out.println("La letra del DNI del alumno es: " + letraDni); //Decimos cual es la primera letra del DNI
		
		String nombreAlumno = "\"Alberto\"";
		System.out.println("El nombre del alumno es: " + nombreAlumno); //Aclaramos cual es el nombre del alumno
		
		final int NUMERO_MAXIMO_ALUMNOS = 25;
		System.out.println("El número máximo de alumnos es: " + NUMERO_MAXIMO_ALUMNOS); //Aclaramos cual es la cantidad máxima de alumnos que puede ha
		
		final String GRUPO = "DAW1";
		System.out.println("El nombre del grupo es: " + GRUPO); //Aclaramos el nombre del grupo en el que nos encontramos
		
			
		
	}

}
