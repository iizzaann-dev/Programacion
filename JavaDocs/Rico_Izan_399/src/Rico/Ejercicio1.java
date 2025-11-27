/*
 *Descripción: Crear un programa que le pida al usuario un producto, la cantidad que desea comprar y el precio. Además de eso, el preio final varia dependiendo de la 
 *cantidad de productos que compre (debido a diferentes descuentos). Hay que añadir una opcion que sea para terminar.
 *Nombre: Izan Rico Blanco
 *Fecha: 26/11/2025
*/


package Rico;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String opcion = "", producto = "";																	//Declaramos las variables que vamos a usar
		short cantidad = 0, contador = 0; 
		double precio = 0, descuento = 0, descuentoPeque = 5, descuentoMediano = 10, descuentoGrande = 15;
		
		do {																								//Hacemos un bucle que nos permite terminar el programa
																											//si ingresamos "terminar" sin importar las mayúsculas
			System.out.println("Buenas, que desea hacer: ");
			System.out.println("Comprar");
			System.out.println("Terminar");
			opcion = teclado.nextLine();
			
			if (opcion.equalsIgnoreCase("comprar")) {														//Realizamos una condición que nos obliga a empezar a 
																											//comprar o a terminar el programa
				System.out.println("De acuerdo, ingresa el producto que deseas comprar: ");
				producto = teclado.nextLine();
				
				while (cantidad < 1 || cantidad > 100) {													//Realizamos un bucle que nos permite pedir al usuario
					System.out.println("De acuerdo, ahora ingresa la cantidad de " + producto + " que deseas comprar (recuerda que deben de estar entre 1 y 100): ");
					cantidad = teclado.nextShort();															//la cantidad de productos que desea comprar en caso 
				}																							// de qie sea menor a 1 o mayor a 100
				
				teclado.nextLine();
				
				System.out.println("Por último, ingresa el precio del producto (" + producto + "): ");
				precio = teclado.nextDouble();
				
				if (cantidad >= 1 && cantidad <= 10) {														//Hacemos una serie de condiciones para averiguar cual es 
					descuento = descuentoPeque; 															//el descuento que le corresponde a la comprar en relacion 
				}else if (cantidad >= 11 & cantidad <= 50) {												//a la cantidad de productos comprados
					descuento = descuentoMediano;
				}else if (cantidad >=51 & cantidad <= 100) {
					descuento = descuentoGrande; 
				}
				
				System.out.println("A continución le mostramos la información recopilada: ");				//Mostramos la información recopilada y calculamos el pago
				
				System.out.println("El producto que desea comprar es: " + producto);
				System.out.println("La cantidad de " + producto + " que desea comprar es: " + cantidad);
				System.out.println("El descuento que se le aplica a su compra es de: " + descuento + "%");
				System.out.println("El precio total a pagar es: " + (cantidad * precio) * (1 - (descuento/100)) + "€");

				contador++;																					//Contador que registra la cantidad de productos que se van
			}																								//a comprar
			
		}while (!opcion.equals("terminar"));

		
		System.out.println("La cantidad total de productos procesados es: " + contador);				

	}

}
