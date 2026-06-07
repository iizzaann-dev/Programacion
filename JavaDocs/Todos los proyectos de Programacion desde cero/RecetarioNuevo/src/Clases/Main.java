package Clases;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {

		//Ejercicio 1
		Tienda tienda1 = new Tienda ("GameStore S.L");
		
		//Ejercicio 2
		try {
			tienda1.cargarCatalogo("./Documentos/Videojuegos.txt"); 
		} catch (FileNotFoundException e1) {
			System.out.println("No se ha encontrado el archivo.");

		}
		
		//Ejercicio 3
		tienda1.motrarTodosLosProductos();
		
		
		//Ejercicio 4
		System.out.println("Los juegos con género RPG SON: " + tienda1.buscarPorGenero("RPG"));
		
		
		//Ejercicio 5
		System.out.println("El precio medio del catálogo completo es: " + tienda1.calcularPrecioMedio());
		
		//Ejercicio 6
		System.out.println("El nombre del producto más barato es: " + tienda1.productoMasBarato().getNombre() + " y su precio es: " + tienda1.productoMasBarato().getPrecio());

		//Ejercicio 7
		tienda1.aplicarDescuentoAntiguos(2020, 15);
		
		//Ejercicio 8
		System.out.println("La cantidad de juegos físicos que no tienen stock son: " + tienda1.contarFisicosSinStock());
		
		//Ejercicio 9
		tienda1.motrarTodosLosProductos();
	}

}
