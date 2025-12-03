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
				System.out.printf("No se puede crear una cuenta de banco en la fecha %S \n ", fechaCreacion);
				System.out.println(excepcionFecha.getMessage());
				cuentaConjunta = new CuentaBancaria();
			} catch (IllegalArgumentException excepcionArgumentoIlegal) {
				System.out.printf("No se puede crear una cuenta de banco en la fecha %S \n", fechaCreacion);
				System.out.println(excepcionArgumentoIlegal.getMessage());
				cuentaConjunta = new CuentaBancaria();
			}
			
			System.out.println("");

			//2.2
			
			saldoInicial = -200;
			try {
				cuentaConjunta = new CuentaBancaria(saldoInicial);
			} catch (java.lang.IllegalArgumentException excepcionArgumentoIlegal) {
				System.out.printf("No se puede crear una cuenta de banco con un saldo inicial de %.0f.", saldoInicial );
			}
			
			System.out.println("");

			
			//2.3

			
			saldoInicial = 1000;
			double limiteDescubierto= -200;
			try {
				LocalDate fecha3 = LocalDate.of(2021, 7, 1);
				cuentaPrivada = new CuentaBancaria(saldoInicial, fecha3, limiteDescubierto);
			} catch (IllegalArgumentException exNose) {
				System.out.println(exNose.getMessage());
				cuentaPrivada = new CuentaBancaria();
			}	catch (Exception ex231) {
				System.out.println("Error desconocido");
				cuentaPrivada = new CuentaBancaria();
			}
			
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
			
			
			System.out.println("");

			
			//4
			
			try {
				cuentaFamiliar.ingresar(100);
				cuentaFamiliar.getSaldo();
			} catch (IllegalArgumentException ex41) {
				System.out.println(ex41.getMessage());
			} catch (IllegalStateException ex42) {
				System.out.println(ex42.getMessage());
			}
			
			try {
				cuentaConjunta.extraer(100);
				cuentaConjunta.getSaldo();
			} catch (IllegalArgumentException ex43) {
				System.out.println(ex43.getMessage());
			} catch (IllegalStateException ex44) {
				System.out.println(ex44.getMessage());
			}
			
			try {
				cuentaPrivada.transferir(1100, cuentaFamiliar);
				cuentaFamiliar.getSaldo();
			} catch (IllegalArgumentException ex45) {
				System.out.println(ex45.getMessage());
			} catch (IllegalStateException ex46) {
				System.out.println(ex46.getMessage());
			}
			
			System.out.println("");
			
			
			//5
			
			System.out.printf("Cuenta Conjunta: %s \n",  cuentaConjunta.toString());
			System.out.printf("Cuenta Familiar: %s \n", cuentaFamiliar.toString());
			System.out.printf("Cuenta Privada: %s \n", cuentaPrivada.toString());


	} 

}
