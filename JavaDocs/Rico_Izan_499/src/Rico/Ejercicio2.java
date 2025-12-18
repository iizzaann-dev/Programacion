package Rico;

import java.time.DateTimeException;
import java.time.LocalDate;
import libtarea3.CuentaBancaria;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;

public class Ejercicio2 {

	public static void main(String[] args) {
		LocalDate fechaCreacion = LocalDate.now();
		int limite = 0;
		boolean correcto = false;
		double minimo1, minimo2, minimo3, minimoMedio, minimoTotal;

		
		//2 Declaramos las variables referencia a objetos instancia de la clase CuentaBancaria
		CuentaBancaria Rico_1 = null, Rico_2 = null, Rico_3 = null; 
		
		//3 Instanciamos las variables de referencia
		
		
		
        while (!correcto) {
        	try {
    			Rico_1 = new CuentaBancaria (1000, fechaCreacion, limiteAleatorio(limite));
    			System.out.println("Se ha creado la cuenta Rico_1 \n");
                correcto = true; 
         
	        } catch (DateTimeException excepcionFecha) {
				System.out.printf("Rico_1: No se puede crear una cuenta de banco en la fecha %S \n ", fechaCreacion);
				//System.out.println(excepcionFecha.getMessage());
				Rico_1 = new CuentaBancaria();
			} catch (IllegalArgumentException excepcionArgumentoIlegal) {
				System.out.printf("Rico_1: No se puede crear una cuenta de banco con el limite descubierto establecido \n");
				System.out.println("Se ha creado una cuenta vacia.");

				//System.out.println(excepcionArgumentoIlegal.getMessage());
				Rico_1 = new CuentaBancaria();
			}
        }
        
		
        correcto = false;
        
        while (!correcto) {
        	try {
    			Rico_2 = new CuentaBancaria (2000, fechaCreacion, limiteAleatorio(limite));
    			System.out.println("Se ha creado la cuenta Rico_2 \n");
                correcto = true; 
         
	        } catch (DateTimeException excepcionFecha) {
				System.out.printf("Rico_2: No se puede crear una cuenta de banco en la fecha %S \n ", fechaCreacion);
				//System.out.println(excepcionFecha.getMessage());
				Rico_2 = new CuentaBancaria();
				
			} catch (IllegalArgumentException excepcionArgumentoIlegal) {
				System.out.printf("Rico_2: No se puede crear una cuenta de banco con el limite descubierto establecido \n");
				//System.out.println(excepcionArgumentoIlegal.getMessage());
				System.out.println("Se ha creado una cuenta vacia.");
				Rico_2 = new CuentaBancaria();
			}
        }
		
        correcto = false;
        while (!correcto) {
        	try {
    			Rico_3 = new CuentaBancaria (3000, fechaCreacion, limiteAleatorio(limite));
    			System.out.println("Se ha creado la cuenta Rico_3 \n");
                correcto = true; 
         
	        } catch (DateTimeException excepcionFecha) {
				System.out.printf("Rico_3: No se puede crear una cuenta de banco en la fecha %S \n ", fechaCreacion);
				//System.out.println(excepcionFecha.getMessage());
				Rico_3 = new CuentaBancaria();
				
			} catch (IllegalArgumentException excepcionArgumentoIlegal) {
				System.out.printf("Rico_3: No se puede crear una cuenta de banco con el limite descubierto establecido \n");
				//System.out.println(excepcionArgumentoIlegal.getMessage());
				System.out.println("Se ha creado una cuenta vacia.");
				Rico_3 = new CuentaBancaria();
			}
        }
        
		System.out.printf("La información de la cuenta Rico_1: Saldo: %.0f€, Limite Descubierto: %.0f€ \n", Rico_1.getSaldo(), Rico_1.getLimiteDescubierto());
		System.out.printf("La información de la cuenta Rico_2: Saldo: %.0f€, Limite Descubierto: %.0f€ \n", Rico_2.getSaldo(), Rico_2.getLimiteDescubierto());
		System.out.printf("La información de la cuenta Rico_3: Saldo: %.0f€, Limite Descubierto: %.0f€ \n\n", Rico_3.getSaldo(), Rico_3.getLimiteDescubierto());

		
		minimo1 = Rico_1.getLimiteDescubierto();
		minimo2 = Rico_2.getLimiteDescubierto();
		minimo3 = Rico_3.getLimiteDescubierto();
		
		minimoMedio = minimo(minimo1,minimo2);
		minimoTotal = minimo(minimoMedio, minimo3);
		
		
		System.out.printf("El limite descubierto minimo es: %.0f€ \n\n", minimoTotal);

		
		for (int contador = 0; contador < 5; contador++) {
			try {
				Rico_1.transferir(300, Rico_2);
				System.out.println("Se ha hecho una transferencia de 300€ a la cuenta Rico_2.");
				
			} catch (IllegalArgumentException error1) {
				System.out.println("La cuenta de destino no es valida o la cantidad a transferir no es valida");
	
			} catch (IllegalStateException error2) {
				System.out.println("La cuenta de origen supera el límite de descubierto de la cuenta o  se supera el saldo máximo en la cuenta de destino.");
	
			}
		}
		
		
		
		System.out.printf("El saldo de la cuenta Rico_1 es: %.0f€. \n", Rico_1.getSaldo());
		System.out.printf("El saldo de la cuenta Rico_2 es: %.0f€. \n\n", Rico_2.getSaldo());
		
		Rico_3.embargar(50);
		System.out.printf("El porcentaje de embargo de la cuenta Rico_3 es: %.0f%%.\n\n", Rico_3.getPorcentajeEmbargo());
		
		System.out.printf("El saldo de la cuenta Rico_1 es: %.0f€\n", Rico_1.getSaldo());
		System.out.printf("El saldo de la cuenta Rico_2 es: %.0f€\n", Rico_2.getSaldo());
		System.out.printf("El saldo de la cuenta Rico_3 es: %.0f€\n", Rico_3.getSaldo());
		System.out.printf("El número de cuentas embargadas es: %d.", CuentaBancaria.getNumCuentasEmbargadas());

	}
	
	
	//1 Hacemos el método que crea el número entre -4000 y 0 teniendo decenas y unidades como 0
	public static int limiteAleatorio (int limite) {
		
		do {
			limite = (int) (Math.random() * 4000) * (-1);
		}while(limite % 100 != 00);

		return limite;
	}

	
	public static double minimo(double a, double b) {    //Usamos un metodo para calcular el minimo
		double min = 0;
		
		if (a > b) {
			min = b;
			
		}else {
			min = a;
		}
		return min;
	}
}
