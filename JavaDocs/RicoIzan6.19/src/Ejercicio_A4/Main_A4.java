package Ejercicio_A4;

public class Main_A4 {

	public static void main(String[] args) {

		Articulo art1 = new Articulo ();
		
		art1.nombre = "Ordenador";
		art1.precio = 1100;
		art1.iva = 0.21;
		art1.cuantosQuedan = 7;
		System.out.printf("%s: %.0f€ - PVP: %.1f€ - Almacén: %d. \n",art1.nombre, art1.precio, precioFinal(art1.precio, art1.iva), art1.cuantosQuedan);
		
		art1.nombre = "Monitor";
		art1.precio = 140;
		art1.iva = 0.21;
		art1.cuantosQuedan = 2;
		
		System.out.printf("%s: %.0f€ - PVP: %.1f€ - Almacén: %d. \n",art1.nombre, art1.precio, precioFinal(art1.precio, art1.iva), art1.cuantosQuedan);

		
	}


	public static double precioFinal (double precio, double iva) {
		
		double precioFinal = precio * (1 + iva);
		
		return precioFinal;
	}

	
}
