package clase_padre;

import java.time.LocalDate;

public abstract class Productos {
		
	//Atributos mutables de la clase
	private static int contador = 0;	 //Se puede poner protected
	private static int contadorLote = 0; //Se puede poner protected
	
	//Atributos inmutables del objeto
	protected final String numeroLote;
	protected final String codigo;
	
	//Atributos mutables del objeto
	protected String nombre;
	protected LocalDate fecha_caducidad;
	
	
	protected Productos (String nombre, LocalDate fecha_caducidad) throws IllegalArgumentException {
		
		if (nombre.isBlank()) {
			throw new IllegalArgumentException("No se puede crear un producto sin nombre");
		}
		
		if (nombre.isEmpty()) {
			throw new IllegalArgumentException("No se puede dejar un producto vacio");
		}
		
		if(fecha_caducidad == null) {
			throw new IllegalArgumentException("No se puede crear un objeto con una fecha de caducidad vacia");
		}
		
		if (fecha_caducidad.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de caducidad no puede ser anterior a la acutal");
		}
		
		this.nombre = nombre;
		this.fecha_caducidad = fecha_caducidad;
		this.numeroLote = generarNumeroLote();
		this.codigo = generarCodigo();
	}
	
	protected String generarCodigo() {
		
		if (contador > 9999) { 
			throw new IllegalStateException("Se ha alcanzado el número máximo de códigos (9999)"); 
			}
		
	    String codigoGenerado = String.format("%04d", contador);
	    contador++;
	    return codigoGenerado;
	}

	
	protected String generarNumeroLote() {

	    int loteActual = contador / 10;

	    if (loteActual > 1000) {
	        throw new IllegalStateException("Se ha alcanzado el número máximo de lotes (1000)");
	    }

	    return String.format("%04dL", loteActual);
	}

	public String getNumeroLote() {
		return numeroLote;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFecha_caducidad(LocalDate fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	@Override
	public String toString() {
		return "Productos [numeroLote=" + numeroLote + ", codigo=" + codigo + ", nombre=" + nombre
				+ ", fecha_caducidad=" + fecha_caducidad + "]";
	}
	
	
	
}
