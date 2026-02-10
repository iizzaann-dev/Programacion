package clase_padre;

import java.time.LocalDate;

public abstract class Productos {
		
	//Atributos mutables de la clase
	protected static int contador = 1;
	
	//Atributos inmutables del objeto
	protected final int numeroLote;
	protected final int codigo;
	
	//Atributos mutables del objeto
	protected String nombre;
	protected LocalDate fecha_caducidad;
	
	
	protected Productos (String nombre, LocalDate fecha_caducidad, int codigo, int numeroLote) {
		
		this.nombre = nombre;
		this.fecha_caducidad = fecha_caducidad;
		this.numeroLote = numeroLote;
		
		
		
		this.codigo = codigo;
	}
	
	protected int generarCodigo () {
		
		return contador++;
	}
}
