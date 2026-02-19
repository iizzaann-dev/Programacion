package Mobiliario;

public abstract class Mueble {
	
	//Atributos inmutables de la clase
	public static double precio_minimo = 0.01;
	public static double precio_maximo = 10000.00;
	
	//Atributos mutables de la clase
	private static int contador = 0;
		
	//Atributos inmutables del objeto
	private int identificador;
	private String descripcion;
	
	//Atributos mutables del objeto
	protected double precio;
	
	public Mueble (String descripcion, double precio) throws IllegalArgumentException {
		
		if (precio < precio_minimo && precio > precio_maximo) {
			throw new IllegalArgumentException("El precio no está en el rango permitido: " + String.format("%.2f", precio));
		}
		
		this.identificador = generarId();
		this.descripcion = descripcion;
		this.precio = precio;
		
	}
	
	private int generarId() {
		contador++;
		return contador;
	}
	
	public String getId() {
		return String.format("%03d", contador);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return String.format("Tipo: %s, Id: %s, Precio: %s, Descripción: %s", this.getClass().getSimpleName(),this.getId(), getPrecio(), getDescripcion());
	}

	
	
}
