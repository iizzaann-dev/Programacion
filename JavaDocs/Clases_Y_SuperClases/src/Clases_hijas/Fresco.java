package Clases_hijas;

import java.time.LocalDate;

import clase_padre.Productos;

public class Fresco extends Productos {
	
	//Atributos inmutables del objeto
	public final LocalDate fecha_envasado;
	
	//Atributos mutables del objeto
	public String paisOrigen;
	
	public Fresco (String nombre, LocalDate fecha_caducidad, LocalDate fecha_envasado, String paisOrigen) 
			throws IllegalArgumentException {
		
		super(nombre, fecha_caducidad);
		
		if (fecha_envasado == null) {
			throw new IllegalArgumentException("No se puede crear un producto fresco con una fecha de envasado vacía");
		}
		
		if(fecha_envasado.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("No se puede crear un producto fresco con una fecha de envasado anterior a hoy");
		}
		
		if(paisOrigen.isBlank()) {
			throw new IllegalArgumentException("No se puede crear un producto fresco que no tenga país de origen");
		}
		
		
		this.fecha_envasado = fecha_envasado;
		this.paisOrigen = paisOrigen;
	}

	public LocalDate getFecha_envasado() {
		return fecha_envasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "Fresco [fecha_envasado= " + fecha_envasado + ", paisOrigen= " + paisOrigen + ", numeroLote= " + numeroLote
				+ ", codigo= " + codigo + ", nombre= " + nombre + ", fecha_caducidad= " + fecha_caducidad + "]";
	}
	
	
}
