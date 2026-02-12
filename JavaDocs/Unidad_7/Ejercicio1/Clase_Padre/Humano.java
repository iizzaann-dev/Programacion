package Clase_Padre;

public class Humano {

	protected String nombre;
	protected String apellido;
	
	public Humano (String nombre, String apellido) throws IllegalArgumentException {
		
		if(nombre.isBlank()) {
			throw new IllegalArgumentException("No puedes dejar el nombre en blanco");
		}
		
		if(nombre.isEmpty()) {
			throw new IllegalArgumentException("No puedes dejar el nombre vacio");
		}
		
		if(apellido.isBlank()) {
			throw new IllegalArgumentException("No puedes dejar el apellido en blanco");
		}
		
		if(apellido.isEmpty()) {
			throw new IllegalArgumentException("No puedes dejar el apellido vacio");
		}
		
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	public Humano () {
		this("Juan", "Garcia");
	}
	
	public String getNombreCompleto () {
	    return String.format("%s, %s", apellido, nombre);
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
