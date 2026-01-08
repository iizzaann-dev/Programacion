package Persona;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Alumno {
		
	public static final short MaxAlumnosClase = 0;
	public enum NivelIngles { A1, A2, B1, B2, C1, C2 };

	
	private String DNI;
	private String Nombre;
	private LocalDate fechaNacimiento;
	private byte numHermanos;
	private short anioComienzo;
	private short numHoras;
	private static short numAlumnosMatriculados;
	private LocalDateTime horaInicioContactar;
	private LocalDateTime horaFinalContarcar;
	private boolean hijos;
	
	private NivelIngles nivelIng;
	
	
	

}
