/*
 *Descripción:Descripción: Crea un método llamado productosDescuento que devolverá un valor double. Recibirá como
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
		double precio = 20;
		
		
		System.out.println("Buenas, ingresa el producto que quiere comprar: ");
		producto = teclado.nextLine();
		
		
		System.out.println("Ahora ingresa la cantidad de " + producto + " que quiere comprar.");
		cantidad = teclado.nextInt();
		
		System.out.println("Usted ha adquirido " + cantidad + " " + producto + ", a un precio de " + precio + " euros la unidad.");
		
		
		System.out.println("El precio a pagar es " + (precio * cantidad) + ", pero al aplicarle el descuento del " + 15 + "% el \n"
				+ "precio final a pagar es: " + productosDescuento (precio, cantidad, descuento));
	}

	
	public static double productosDescuento (double precio, int cantidad, int descuento) {
		
		double descuentoDecimal = (double)descuento / 100; 
		 
		return (precio * cantidad) * (1 - descuentoDecimal);
	}
}
