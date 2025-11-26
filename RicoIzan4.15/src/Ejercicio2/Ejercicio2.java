/*
*Descripción: Crea un método llamado productosDescuento que devolverá un valor double. Recibirá como
*parámetros tres valores (double precio, int cantidad, int descuento).
*El método calculará el precio a pagar, multiplicando la cantidad de productos por el precio, y
*aplicando el descuento (en porcentaje) correspondiente.
*Nombre: Izan Rico Blanco
*Fecha: 26/11/2025
*/

package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String producto = "";
		int cantidad = 0, descuento = 15; 
		double precio = 20, precioPagarSin = 0; 
		
		
		System.out.println("Buenas, ingresa el producto que quiere comprar: ");
		producto = teclado.nextLine();
		teclado.nextLine();
		
		System.out.println("Buenas, ingresa la cantidad de " + producto + " que quiere comprar.");
		cantidad = teclado.nextInt();
		
		System.out.println("Usted ha adquirido " + cantidad + " de " + producto + ", a un precio de " + precio + " euros la unidad.");
		
		precioPagarSin = productosDescuento(precio, cantidad, descuento);
		System.out.println("El precio a pagar es ");
	}

	
	public static double productosDescuento (double precio, int cantidad, int descuento) {
		
		double precioPagar = 0; 
		double descuentoDecimal = descuento / 100; 
		precioPagar = (precio * cantidad) * descuento;
		
		return precioPagar; 
	}
}
