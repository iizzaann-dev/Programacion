package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		short numEmpleado = 2055;
		byte edad = 35;
		float salarioHora = 15.50f;
		boolean esJornadaCompleta = true;
		byte horasTrabajadas = 40; 
		final float IRPF = 12.0f;
		boolean elegibleParaBono = false;
		
		double salarioBruto = salarioHora * horasTrabajadas;
		System.out.println("Calculo del salario bruto: " + salarioBruto);
		
		
		float IRPF_retenido = ((float)salarioBruto * IRPF) / 100;
		System.out.println("Calculo del importe de IRPF Retenido: " + IRPF_retenido);

		
		double salarioNeto = salarioBruto - IRPF_retenido;
		System.out.println("Calculo del salario neto: " + salarioNeto);
		
		
		if(esJornadaCompleta == true && horasTrabajadas >= 40) {
			elegibleParaBono = true;
		}
		
		System.out.println("El número de empleado es " + numEmpleado + " y su edad es: " + edad);
		System.out.printf("El salario por hora es de %f. \n", salarioHora);
		System.out.printf("El salario bruto semanal es %f. \n", salarioBruto);
		System.out.printf("El importe de IRPF retenido es %f. \n", IRPF_retenido);
		System.out.printf("El salario neto es %f \n", salarioNeto);
		System.out.printf("El estado para la elegibilidad del bono es %b", elegibleParaBono);
		
	}

}
