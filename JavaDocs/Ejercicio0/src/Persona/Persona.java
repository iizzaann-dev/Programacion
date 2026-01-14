package Persona;

import java.time.LocalDate;
import java.time.LocalTime;

public class Persona {
	
	// Constantes
    public static final short MAX_ALUMNOS_CENTRO = 1500;
    public static final short MAX_ALUMNOS_CLASE = 30;
    public static final short MIN_ALUMNOS_CLASE = 10;
    public static final LocalTime horaMaxCentro = LocalTime.of(21, 30);
    
    //Atributos para constructores por omisión
    public static final String DNI_ESTABLECIDO = "00000000Ts";
    public static final String NOMBRE_ESTABLECIDO = "Anónimo";
    public static final String APELLIDO1_ESTABLECIDO = "Primer apellido anónimo";
    public static final String APELLIDO2_ESTABLECIDO = "Segundo apellido2 anónimo";
    public static final LocalDate FECHA_NACIMIENTO = LocalDate.of(2000, 01, 01);
    public static final float PESO = 65; 
    public static final float ALTURA = 1.75f;
    public static final boolean MAYOR_EDAD = false;
    public static final byte NUM_HERMANOS = 1; 
    public static final LocalTime HORA_MAX_ALUMNO_CENTRO = LocalTime.of (21, 30);
    
    
	// Atributos
    private static short numAlumnos;
  
    private LocalTime horaMaxAlumnoCentro;
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;
    private float peso;
    private float altura;
    private boolean mayorEdad;
    private byte numHermanos;
    
    
    //Throws IllegalArgumentException
    public Persona (String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, float peso, float altura, boolean mayorEdad, byte numHermanos,
    		LocalTime horaMaxAlumnoCentro) throws IllegalArgumentException {
    	
    	
    	
    	//Lanzamos excepciones en caso de que el DNI este vacio o no se hayan ingresado ningun valor valido
    	if (DNIvalido(dni) == false ) {
    		throw new IllegalArgumentException ("No se han ingresado valores validos para un DNI.");
    	}else if (dni.isEmpty()) {
    		throw new IllegalArgumentException ("No se ha ingresado ningún DNI.");
    	}
    	this.dni = dni;
    	
    	//Lanzamos excepciones en caso de que el nombre ese vacio o no se hayan ingresado ningun valor valido
    	if (validarString(nombre) == false) {
    		throw new IllegalArgumentException("No se ha ingresado el tipo correcto (String).");
    	}else if (nombre.isEmpty()) {
    		throw new IllegalArgumentException("No se ha ingresado ningún carácter.");
    	}
    	this.nombre = nombre;
    	
    	//Lanzamos excepciones en caso de que el apellido1 ese vacio o no se hayan ingresado ningun valor valido
    	if (validarString(apellido1) == false) {
    		throw new IllegalArgumentException("No se ha ingresado el tipo correcto (String).");
    	}else if (apellido1.isEmpty()) {
    		throw new IllegalArgumentException("No se ha ingresado ningún carácter.");
    	}
    	this.apellido1 = apellido1; 
    	
    	//Lanzamos excepciones en caso de que el apellido2 ese vacio o no se hayan ingresado ningun valor valido

    	if (validarString(apellido2) == false) {
    		throw new IllegalArgumentException("No se ha ingresado el tipo correcto (String).");
    	}else if (apellido2.isEmpty()) {
    		throw new IllegalArgumentException("No se ha ingresado ningún carácter.");
    	}
    	this.apellido2 = apellido2;
    	
    	//Lanzamos excepciones en el caso de que la fecha introducia sea anterior a 01/01/2000 o que no este permitida
    	if (validarFechaNacimiento(fechaNacimiento) == false) {
    		throw new IllegalArgumentException("La fecha ingresada es anterior a la permitida.");
    	}else if (fechaNacimiento == null) {
    		throw new IllegalArgumentException("La fecha ingresada no esta permitida.");
    	}
    	this.fechaNacimiento = fechaNacimiento;
    	
    	this.peso = peso; 
    	this.altura = altura;
    	this.mayorEdad = mayorEdad;
    	this.numHermanos = numHermanos; 
    	this.horaMaxAlumnoCentro = horaMaxAlumnoCentro;
    }

    public Persona () {
    	this(DNI_ESTABLECIDO, NOMBRE_ESTABLECIDO, APELLIDO1_ESTABLECIDO, APELLIDO2_ESTABLECIDO, FECHA_NACIMIENTO, PESO, ALTURA, MAYOR_EDAD, NUM_HERMANOS, HORA_MAX_ALUMNO_CENTRO);
    }
    
    public Persona (String dni, String nombre, String apellido1, String apellido2) {
    	this(dni, nombre, apellido1, apellido2, FECHA_NACIMIENTO, PESO, ALTURA, MAYOR_EDAD, NUM_HERMANOS, HORA_MAX_ALUMNO_CENTRO);	
    }
    
 // GETTERS
    public String getDni() { 
    	return dni; 
    	} 
    public String getNombre() { 
    	return nombre; 
    	} 
    public String getApellido1() { 
    	return apellido1; 
    	} 
    public String getApellido2() { 
    	return apellido2; 
    	} 
    public LocalDate getFechaNacimiento() { 
    	return fechaNacimiento; 
    	} 
    public float getPeso() { 
    	return peso; 
    	}
    public float getAltura() { 
    	return altura; 
    	} 
    public boolean isMayorEdad() { 
    	return mayorEdad; 
    	} 
    public byte getNumHermanos() { 
    	return numHermanos; 
    	} 
    public LocalTime getHoraMaxAlumnoCentro() { 
    	return horaMaxAlumnoCentro; 
    	}
    
    //Métodos
    public static boolean DNIvalido (String DNI) {
    	if (DNI == null) return false;

    	boolean resultado = false;
    	
    	if (!DNI.matches("^[0-9]{8}[A-HJ-NP-TV-Z]$")) {
    		resultado = false; 
    	}else {
    		resultado = true;
    	}
    	
    	return resultado;
    }
    
    public static boolean validarString (String cadena) {
    	boolean resultado = false; 
    	
    	if ( cadena == null) {
    		resultado = false; 
    	}else {
    		resultado = true;
    	}
    	
    	return resultado; 
    }
    
    public static boolean validarFechaNacimiento (LocalDate anio) {
    	boolean resultado = false; 
    	
    	if (anio.isBefore(LocalDate.of(2000, 1, 1))) {
    		resultado = false;
    	}else {
    		resultado = true;
    	}
    	
    	return resultado; 
    }
    
    
    
}
