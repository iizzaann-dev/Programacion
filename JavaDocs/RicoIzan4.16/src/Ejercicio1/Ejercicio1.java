package Ejercicio1;

import java.time.DateTimeException;
import java.time.LocalDate;

import libtarea3.CuentaBancaria;


public class Ejercicio1 {

	public static void main(String[] args) {
		
		//1
		CuentaBancaria cuentaConjunta, cuentaPrivada, cuentaFamiliar;
		
		//2
		
			//2.1
			
			double saldoInicial = 0;
			LocalDate fechaCreacion = LocalDate.of(2027, 9, 1);
			
			try {
				cuentaConjunta = new CuentaBancaria(saldoInicial, fechaCreacion);
				
			} catch (DateTimeException excepcionFecha) {
				System.out.printf("No se puede crear una cuenta de banco en la fecha %S", fechaCreacion);
			} catch (IllegalArgumentException excepcionArgumentoIlegal) {
				System.out.printf("No se puede crear una cuenta de banco en la fecha %S", fechaCreacion);
			}
			
			System.out.println("");

			//2.2
			
			LocalDate fecha2 = LocalDate.now();
			saldoInicial = -200;
			try {
				cuentaConjunta = new CuentaBancaria(saldoInicial, fecha2);
			} catch (java.lang.IllegalArgumentException excepcionArgumentoIlegal) {
				System.out.printf("No se puede crear una cuenta de banco con un saldo inicial de %.0f.", saldoInicial );
			}
			
			System.out.println("");

			
			//2.3

			LocalDate fecha3 = LocalDate.of(2021, 7, 1);
			saldoInicial = 1000;
			double limiteDescubierto= -200;
			
			cuentaPrivada = new CuentaBancaria(saldoInicial, fecha3, limiteDescubierto);
			

			System.out.println("");
			
			
			//2.4
			LocalDate fecha4 = LocalDate.of(2021, 7, 1);
			saldoInicial = 200;

			cuentaConjunta = new CuentaBancaria(saldoInicial, fecha4);
		
			
			//2.5
			
			cuentaFamiliar = new CuentaBancaria();
			
			
			//3
			
			System.out.printf("El identificador de la cuenta privada es: %s \n", cuentaPrivada.getId());
			System.out.printf("La fecha de creación de la cuenta privada es: %s \n", cuentaPrivada.getFechaCreacion());
			System.out.printf("El limite descubierto de la cuenta privada es: %.2f \n", cuentaPrivada.getLimiteDescubierto());
			System.out.printf("Estado de la cuenta (embargada o no): %b \n", cuentaPrivada.isEmbargada());
			System.out.printf("Estado de la cuenta (descubierta o no): %b \n", cuentaPrivada.isDescubierta());
			System.out.printf("Antigüedad de la cuenta: %d días \n", cuentaPrivada.getDiasCuenta());
			
			
			//4
			
			
	}

}
