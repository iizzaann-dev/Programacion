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
		
			CuentaBancaria cuenta1; 
			
			double saldoInicial = 0;
			LocalDate fechaCreacion = LocalDate.of(2027, 9, 1);
			
			try {
				cuenta1 = new CuentaBancaria(saldoInicial, fechaCreacion);
				
			} catch (DateTimeException excepcionFecha) {
				System.out.printf("No se puede crear una cuenta de banco en la fecha %S", fechaCreacion);
			} catch (IllegalArgumentException excepcionArgumentoIlegal) {
				System.out.printf("No se puede crear una cuenta de banco en la fecha %S", fechaCreacion);
			}
			
				
			
			
			
			
			
			
			cuentaConjunta = new CuentaBancaria();
			cuentaPrivada = new CuentaBancaria();
			cuentaFamiliar = new CuentaBancaria();
		
		
	}

}
