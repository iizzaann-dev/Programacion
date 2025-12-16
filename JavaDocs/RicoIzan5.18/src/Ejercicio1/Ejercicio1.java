/*
 *Descripción: Ejercicio de las bombillas
 *Nombre: Izan Rico Blanco
 *Fecha: 15/12/2025
*/

package Ejercicio1;

import java.time.format.DateTimeFormatter;
import libtarea3.Bombilla;
import libtarea3.Utilidades;

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
		
		for (int contador = 0; contador <= 5; contador++) {
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
		
		System.out.printf("La potencia de la primera bombilla es: %.2fW \n", luz1.getPotencia());
		
		//5.2
		if (luz1.getEstado() == true) {
			System.out.println("La bombilla esta encendida.");
		}
		
		//5.3
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.printf("La ultima vez que se encendio la bombilla fue %s \n", luz1.getUltimaVezEncendida().format(formato));
		
		/*
		 *  Solo fecha:

			DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			→ 16-12-2025
			
			Solo hora:
			
			DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
			→ 20:07
			
			Formato textual:
			
			DateTimeFormatter formatoTexto = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm");
			→ martes, 16 diciembre 2025 20:07
		*/
	
		
		//5.4
		
		System.out.printf("La cantidad de veces que se ha encendido la luz 1 es: %d \n", luz1.getVecesEncendida());
		
		//5.5
		
		System.out.printf("La bombilla lleva encendida %.2fs.", luz1.getTiempoEncendida());
	}

}
