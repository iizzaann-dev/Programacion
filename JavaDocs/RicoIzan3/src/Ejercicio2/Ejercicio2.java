/*
 * Descripción: Se pide realizar un cambio de euros a pesetas y viceversa mediante la pedida de datos al usuario
 * Autor: Izan Rico Blanco
 * Fecha: 01/10/2025
 */

package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
																//Declaramos las variables
		Scanner teclado = new Scanner(System.in);
		double pesetas = 166.386;
		double eurosUsuario;
		double pesetasUsuario; 
		double calculoEuros;
		double calculoPesetas;
		
																												//Pedimos los datos al usuario y hacemos las cuentas
		System.out.println("Buenas, ingresa la cantidad en euros que quieras pasar a pesetas: ");
		eurosUsuario = teclado.nextDouble();
		calculoEuros = eurosUsuario * pesetas;
		System.out.println("Los " + eurosUsuario + " € que has ingresado son " + calculoEuros + " pts.");
		
		System.out.print("De acuerdo, ahora ingresa la cantidad de pesetas que quieras pasar a euros: ");
		pesetasUsuario = teclado.nextDouble();
		calculoPesetas = pesetasUsuario / pesetas;
		System.out.println("Las " + pesetasUsuario + " pts que has ingresado son " + calculoPesetas + " €.");

	}

<<<<<<< HEAD
}
=======
}
>>>>>>> 368c4e56bb8fda01b7c7a356ef795d005c3c1598
