/*
 * Descripción: Se piden los datos al usuario y se calcula su salario neto
 * Autor: Izan Rico Blanco
 * Fecha: 06/10/2025
 */

package Ejercicio1;


import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);	
																			//Declaramos variables
	String nombre;
	String apellidos;
	String fechaNacimiento;
	double salarioBruto;
	double salarioNeto;
	double salarioTotal;
	int cantidadTrabajada;
	double aumento; 
	
																			//Pedimos los datos al usuario
	
	System.out.println("Por favor, ingresa tu nombre: ");
	nombre = teclado.nextLine();
	System.out.println("Por favor, ingresa tus apellidos: ");	
	apellidos = teclado.nextLine();
	System.out.println("Por favor, ingresa tu fecha de nacimiento: ");
	fechaNacimiento = teclado.nextLine();
	System.out.println("Por favor, ingresa la cantidad años trabajados (no se tendrán en cuenta años que no se hayan completado): ");
	cantidadTrabajada = teclado.nextInt();
	System.out.println("Por favor, ingresa tu salario bruto: ");
	salarioBruto = teclado.nextDouble();
	
	salarioNeto = salarioBruto - (0.15 * salarioBruto);						//Realizamos los cálculos necesarios
	aumento = 0.02 * cantidadTrabajada;
	salarioTotal = salarioBruto + (aumento * salarioBruto);
	
	System.out.println("Estamad@ " + nombre + " " + apellidos + ", su salario bruto es " + salarioBruto + "€"+ ", teniendo en cuenta que un IRPF del 15% su salario neto es "+ salarioNeto + " €");
	System.out.println("Debido a sus " + cantidadTrabajada + " años trabajando en la empresa, su salario se incrementará en un 2% por cada año. El aumento es de " + aumento + " y el salario total es " + salarioTotal + ".");
	
	}

}
//Fin del programa