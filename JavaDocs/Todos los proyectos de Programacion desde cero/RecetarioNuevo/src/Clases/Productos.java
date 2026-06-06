package Clases;

abstract class Productos {
	
	protected String nombre;
	protected String genero;
	protected double precio;
	protected int anio;
	
	public Productos(String nombre, String genero, double precio, int anio) {
		
		this.nombre = nombre;
		this.genero = genero;
		this.precio = precio;
		this.anio = anio;
		
	}

	//Getters y Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public abstract void mostrarInfo();
	
	public abstract double calcularCosteTotal();
	
	public double aplicarDescuento(double porcentaje) {
		
		double nuevoPrecio = 0;
		
		nuevoPrecio = precio * (porcentaje / 100);
		
		return nuevoPrecio;
	}

	@Override
	public String toString() {
		return "Productos: nombre=" + nombre + ", genero=" + genero + ", precio=" + precio + ", anio=" + anio;
	}
	
	
	
}
