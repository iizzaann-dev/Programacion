package Ejercicio_B4;

public class Main_A4 {

	public static void main(String[] args) {

		Articulo art1 = new Articulo ("Ordenador", 1100, 0.21, 7);
		System.out.printf("%s: %.0f€ - PVP: %.1f€ - Almacén: %d. \n",art1.nombre, art1.precio, precioFinal(art1.precio, art1.iva), art1.cuantosQuedan);

		
		Articulo art2 = new Articulo ("", -120, 0, 2);
		System.out.printf("%s: %.0f€ - PVP: %.1f€ - Almacén: %d. \n",art2.nombre, art2.precio, precioFinal(art2.precio, art2.iva), art2.cuantosQuedan);

		
	}


	public static double precioFinal (double precio, double iva) {
		
		double precioFinal = precio * (1 + iva);
		
		return precioFinal;
	}

	
}
