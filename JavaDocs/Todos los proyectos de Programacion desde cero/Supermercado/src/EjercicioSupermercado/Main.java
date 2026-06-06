 package EjercicioSupermercado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int contador = 0;
		
		Map <String, Double>diccionario = new HashMap();
		
		String [] productos = {"Avena", "Garbanzos", "Tomate", "Jengibre", "Quinoa", "Guisantes"};
		double [] precios = {2.21, 2.39, 1.59, 3.13, 4.50, 1.60};
		
		ArrayList <String> productosComprados = new ArrayList ();
		ArrayList <Integer> cantidadProductosComprados = new ArrayList ();
		
		Scanner teclado = new Scanner(System.in);
		
		String entrada = "", cantidadString = "";
		int cantidad = 0;
		
		rellenarDiccionario(diccionario, productos, precios);
		
		System.out.println("A continuación se muestra una tabla de los productos con sus respectivos precios: ");
		System.out.println(diccionario);


		
		while(!entrada.equalsIgnoreCase("fin")) {
			
			System.out.println("Ingresa que es lo que quieres comprar: ");
			entrada = teclado.nextLine().trim().toLowerCase();
			
			
			if(!entrada.equalsIgnoreCase("fin")) {		//Hacemos esta condicion para no añadir fin a la lista 
														//y para que se termine el bucle una vez se ingrese la plabra fin, y que no se complete la iteracion
				productosComprados.add(entrada);
				
				System.out.println("Ingresa cual es la cantidad de " + entrada + " que quieres comprar: ");
				cantidadString = teclado.nextLine().trim();
				cantidad = Integer.parseInt(cantidadString);
				cantidadProductosComprados.add(cantidad);
				
				contador++;
				
				
			}
			
		}
		
		imprimirResultado(diccionario, contador, productosComprados, cantidadProductosComprados, precios);

		
	}
	
	public static void rellenarDiccionario (Map <String, Double>diccionario, String [] productos , double [] precios) {
		
		for(int i = 0; i < productos.length; i++) {
			diccionario.put(productos[i].toLowerCase(), precios[i]);
		}
		
	}
	
	public static void imprimirResultado (Map <String, Double>diccionario, int contador, ArrayList <String> productosComprados, 
			ArrayList <Integer> cantidadProductosComprados, double [] precios) {
		
		double total = 0;
		
		String [][] tabla = new String [contador][4]; 
		
		System.out.printf("%-13s %-12s %-12s %-12s%n", "Producto", "Precio", "Cantidad", "Subtotal");
		System.out.println("-------------------------------------------------");
	
		
		for(int i = 0; i < tabla.length; i++) {		
				
				tabla[i][0] = productosComprados.get(i);
				tabla[i][1] = String.valueOf(diccionario.get(productosComprados.get(i)));
				tabla[i][2] = String.valueOf(cantidadProductosComprados.get(i));
				tabla[i][3] = String.valueOf(diccionario.get(productosComprados.get(i)) * cantidadProductosComprados.get(i));
				
				total += Double.parseDouble(tabla[i][3]); 

			
				System.out.printf("%-14s %-14.2f %-10d %-10.2f \n", productosComprados.get(i), diccionario.get(productosComprados.get(i)), 
						cantidadProductosComprados.get(i), diccionario.get(productosComprados.get(i)) * cantidadProductosComprados.get(i));
				
			//El %-12s es alineado con 12 espacios, asi con todos los -numero
		}
		
		System.out.println("");

		
		System.out.printf("El total es: %.02f€ \n", total);

	}
	
}
