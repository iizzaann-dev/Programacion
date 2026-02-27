package Clase_Padre;

import java.time.LocalDate;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

abstract class Personal {
	
	//Atributo inmutable del objeto
	private final String DNI; //Entendemos que el DNI no va a cambiar
	private final LocalDate fecha_nacimiento;
	private static int ultimoNumeroDNI = 10000000;

	//Atributos mutables del objeto
	private String nombre;
	private String apellidos;
	private String genero;
	private float salario;
	private byte telefono;
	private String email;
	
	
	
	public Personal (LocalDate fecha_nacimiento, String nombre, String apellidos, String genero, float salario, byte telefono, String email) 
		throws IllegalArgumentException{
		
		if (fecha_nacimiento.isBefore(LocalDate.of(1910, 01, 01))) {
			throw new IllegalArgumentException("La fecha de nacimiento no puede ser antes del 1 de Enero de 1910");
		}
		
		if (nombre.isBlank()) {
			throw new IllegalArgumentException("No se puede dejar el campo \"nombre\" en blanco");
		}
		
		if(nombre.isEmpty()) {
			throw new IllegalArgumentException("No se puede dejar el campo \"nombre\" vacio");
		}
		
		if (apellidos.isBlank()) {
			throw new IllegalArgumentException("No se puede dejar el campo \"apellidos\" en blanco");
		}
		
		if (apellidos.isEmpty()) {
			throw new IllegalArgumentException("No se puede dejar el campo \"apellidos\" vacio");
		}
		
		if(genero.isEmpty()) {
			throw new IllegalArgumentException("No se puede dejar el campo \"género\" vacio");
		}
		
		if(salario == 0 || salario < 0) {
			throw new IllegalArgumentException("No se puede puede establecer un salario igual o menor a 0");
		}
		
		if (telefono < 100000000) {
			throw new IllegalArgumentException("No se puede ingresar un número de teléfono que no sea de 9 dígitos");
		}
		
		if (email == null || email.isEmpty()) {
		    throw new IllegalArgumentException("El email no puede ser nulo o vacío");
		}
		if (!esEmailValido(email)) {
		    throw new IllegalArgumentException("El email no tiene un formato válido");
		}
		
		
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.salario = salario;
		this.telefono = telefono;
		this.fecha_nacimiento = fecha_nacimiento;
		this.DNI = generarDNI();
	}
	

	private String generarDNI() {
	    if (ultimoNumeroDNI > 99999999) ultimoNumeroDNI = 10000000;
	    int numero = ultimoNumeroDNI++;
	    char letra = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numero % 23);
	    return numero + "" + letra;
	}
	
	private static boolean esEmailValido(String email) {
	    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(email);
	    return matcher.matches();
	}

	public void aumentoSalario (double porcentaje) {
		
	}
	
	@Override
	public String toString() {
		return "Personal [DNI=" + DNI + ", fecha_nacimiento=" + fecha_nacimiento + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", genero=" + genero + ", salario=" + salario + ", telefono=" + telefono + ", email="
				+ email + "]";
	}

	 
	

	}

	
	

