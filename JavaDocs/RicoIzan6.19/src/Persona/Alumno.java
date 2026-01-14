package Persona;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Alumno  {
		
	public static final short MaxAlumnosInstituto = 1500;
	public static final LocalTime horaMaxGeneral = LocalTime.of(21,18);
	public static final short numMaxAlumnos = 30; 
	public static final short numMinAlumnos = 10; 
	
	private String DNI;
	private String Nombre;
	private LocalDate fechaNacimiento;
	private double peso;
	private double altura;
	private byte numHermanos;		
	private short numHoras;
	private static short numAlumnosMatriculados;
	private byte mayorEdad;
	private LocalTime horaMaxAlumno;
	

	
	public Alumno (String DNI, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, double peso, double altura, byte numHermanos, short numHoras, short numAlumnosMatriculados, 
			byte mayorEdad, LocalTime horaMaxAlumno) throws IllegalArgumentException {
		
		if (DNIreal(DNI) == false ) {
			throw new IllegalArgumentException ("No se han ingrasdo valores correctos de un DNI.");
		}else if (DNI.isEmpty()) {
			throw new IllegalArgumentException ("No se ha ingresado ningún valor para el DNI.");
		}
		
		if (nombre == null) {
			throw new IllegalArgumentException ("No se ha ingrasdo un tipo de dato correcto.");
		}else if (nombre.isEmpty()) {
			throw new IllegalArgumentException ("No se ha ingresado un nombre para el alumno.");
		}
		
		
		
	}
	
	public static boolean DNIreal(String DNI) {
		
		boolean resultado = false;
		
		if (!DNI.matches("^[0-9]{8}[A-Z]$")) {
			resultado = false;
			
		}else if (DNI.isEmpty()) {
			resultado = true;
		}
		return resultado;
	}
	
	public static boolean fechaNacimientoReal
}

	