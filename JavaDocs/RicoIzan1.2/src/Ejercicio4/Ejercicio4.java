/*
 * Descripción: Uso de tipos numericos y creación de variables
 * Autor: Izan Rico Blanco
 * Fecha: 06/10/2025
 */

package Ejercicio4;

public class Ejercicio4 {
	
	enum talla { PEQUEÑA, MEDIANA, GRANDE, EXTRAGRANDE} 
	
	public static void main(String[] args) {
		talla talla1 = talla.PEQUEÑA;
		talla talla2 = talla.MEDIANA;
		talla talla3 = talla.GRANDE;
		talla talla4 = talla.EXTRAGRANDE;
		
		System.out.println ("La talla 1: " + talla1 + " es una talla perfecta para personas delgadas.");
		System.out.println ("La talla 2: " + talla2 + " es una talla adecuada para adultos.");
		System.out.println ("La talla 3: " + talla3 + " es una talla adecuada para personas altas.");
		System.out.println ("La talla 4: " + talla4 + " es una talla perfecta para personas grandes.");
		
		
		};
		
	
	
}
