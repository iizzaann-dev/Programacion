/*
 *Descripción: Ejercicio de las bombillas
 *Nombre: Izan Rico Blanco
 *Fecha: 15/12/2025
*/

package Ejercicio1;

import libtarea3.Bombilla;
import libtarea3.Utilidades;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//1
		Bombilla luz1 = null, luz2 = null, luz3 = null;
		
		//2
		
		//2.1
		System.out.printf("Hay creadas %s bombillas.\n", Bombilla.getBombillasCreadas());
		
		//2.2
		System.out.printf("Hay encendidas %s bombillas.\n", Bombilla.getBombillasEncendidas());
		
		//3
		
		//3.1
		
		try {
			Bombilla intento1 = new Bombilla(true, 250);
		} catch (IllegalArgumentException error1) {
			System.out.printf("Error, %s. \n", error1.getMessage());
		}
		
		//3.2
		
		try {
			Bombilla intento2 = new Bombilla(5);
		} catch (IllegalArgumentException error2) {
			System.out.printf("Error, %s. \n", error2.getMessage());
		}
	
		//3.3
		
		try {
			luz1 = new Bombilla(true, 100);
		} catch (IllegalArgumentException error3) {
			System.out.printf("Error, %s \n", error3.getMessage());
		}
		
		//3.4
		
		try {
			luz2 = new Bombilla (true);
		} catch (IllegalArgumentException error4) {
			System.out.printf("Error, %s \n", error4.getMessage());
		}
		
		//3.5
		
		try {
			luz3 = new Bombilla();
		} catch (IllegalArgumentException error5) {
			System.out.printf("Error, %s \n", error5.getMessage());
		}		
		
		//4
		
		//4.1
		
		try {
			luz1.encender();
		} catch ( IllegalStateException error6) {
			System.out.printf("Error: %s. \n", error6.getMessage());

		}
		
		//4.2
		
		for (int contador = 0; contador <= 6; contador++) {
			luz1.conmutar();
			System.out.printf("%dª conmutación. \n", (contador + 1));
			System.out.println("Espera de 1s.");
			Utilidades.esperar(1);
		}
		
		//4.3
		
		try {
			luz2.apagar();
		} catch (IllegalStateException error7) {
			System.out.printf("Error: %s. \n", error7.getMessage());
		}
		
		
		//4.4
		
		try {
			luz3.encender();
		} catch (IllegalStateException error8) {
			System.out.printf("Error: %s. \n", error8.getMessage());
		}
		
		//5
		
		//5.1
		
		
	}

}
