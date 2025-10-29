/*
 * Descripción: Diseñar un programa para calcular la nomina básica de un empleado, verificando ciertos requisitos y 
 * realizando cálculos de ingresos y retenciones
 * Autor: Izan Rico Blanco
 * Fecha: 29/10/2025
 */

package RicoIzan;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		double numeroEmpleado = 2055;				//Declaramos las variables en sus correspondientes tipos de datos 
		int edad = 35, horasTrabajadas = 40;				
		float salarioHora = 15.50f, salarioBruto, IRPF_Retenido, salarioNeto;
		final float IRPF = 0.12f;	
		boolean EsJornadaCompleta = true;
		String elegibleParaBono = "";							
		
		salarioBruto = salarioHora * horasTrabajadas; 										//Calculamos las cuentas que debemos mostrar más tarde en pantalla
		IRPF_Retenido = IRPF * salarioBruto;
		salarioNeto = salarioBruto - IRPF;
		
		
		if (EsJornadaCompleta == true && horasTrabajadas == 40) {
			elegibleParaBono = "Sí";
		}
		
		
		System.out.println("El número de empleado es: " + numeroEmpleado + " y su edad es: " + edad + " años.");	//Mostramos por pantalla tanto datos como 
		System.out.println("El salario que recibe el empleado cada hora es: " + salarioHora + "€");					//calculos ya hechos
		System.out.println("El salario bruto que recibe el empleado cada semana es: " + salarioBruto + "€");
		System.out.println("El IRPF retenido del empleado es: " + IRPF_Retenido + "€");
		System.out.println("El salario neto del empleado es: " + salarioNeto + "€");
		System.out.println("El estado de elegibilidad para el bono es: " + elegibleParaBono);
		
		

	}

}
