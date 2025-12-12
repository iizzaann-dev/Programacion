package Ejercicio3;

import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
		LocalTime horaInicial = LocalTime.of(8,00);
		
		int horas = 0, minutos = 0; 
        boolean valido;
        

        do {
            valido = false;
            while (!valido) {
                System.out.print("Introduce la hora a la que deseas averiguar que asignatura estarás cursando: ");
                try {
                    horas = teclado.nextInt();
                    valido = true;
                } catch (InputMismatchException exep1) {
                    System.out.println("Error: Debes ingresar un número entero.");
                    teclado.next(); 
                }
                if (horas <= 0 || horas >= 23) {
                	System.out.println("La hora debe de estar entre 0 y 23 \n");

                }
            }
        } while (horas <= 0 || horas >= 23);	        
		
        
        
        do {
            valido = false;
            while (!valido) {
                System.out.print("De acuerdo, ahora ingresa los minutos correspondientes: ");
                try {
                    minutos = teclado.nextInt();
                    valido = true;
                } catch (InputMismatchException exep1) {
                    System.out.println("Error: Debes ingresar un número entero.");
                    teclado.next(); 
                }
                if (minutos <= 0 || minutos >= 59) {
                	System.out.println("Los minutos deben de estar entre 0 y 59");

                }
            }
        } while (minutos <= 0 || minutos >= 59);
		
        LocalTime horaIngresada = LocalTime.of(horas, minutos);
        
        
        
	}
	
}
