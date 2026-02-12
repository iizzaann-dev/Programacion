package Clase_Hija;

import Clase_Padre.Humano;

public class Ciudadano extends Humano {

	protected String documento;
	
	
	public Ciudadano (String nombre, String apellido, String documento) throws IllegalArgumentException{
		
		super(nombre, apellido);
		
		if(documento.isEmpty()) {
			throw new IllegalArgumentException("No se puede dejar vacio el campo \"documento\"");
		}
		
		if (documento.isBlank()) {
			throw new IllegalArgumentException("No se puede dejar en blanco el campo \"documento\"");
		}
		
		this.documento = documento;
	}
	
	public String getIdentificacion () {
	    return String.format("%s, %s", getNombreCompleto(), documento);
	}

}
