package Ejercicio_B4;

public class Articulo {
	
	String nombre; 
	double precio; 
	double iva;
	int cuantosQuedan;
	
	public Articulo (String nombre,double precio, double iva, int cuantosQuedan) throws IllegalArgumentException{
		
		if (nombre == null) {
			throw new IllegalArgumentException ("No se ha ingresado ningún valor válido.");
			
		}else if (nombre.isEmpty()) {
			throw new IllegalArgumentException("No se ha ingresado nungún valor");
		}
		
		if (precio < 0) {
			throw new IllegalArgumentException("No se puede ingresar un precio negativo");
		}
		
		if (iva < 0) {
			throw new IllegalArgumentException("No se puede ingresar un impuesto negativo");
		}
		
		if (cuantosQuedan < 0) {
			throw new IllegalArgumentException("No se puede ingresar un valor negativo");
		}
		this.nombre = nombre;
		this.precio = precio;
		this.iva = iva;
		this.cuantosQuedan = cuantosQuedan;
	}
}
