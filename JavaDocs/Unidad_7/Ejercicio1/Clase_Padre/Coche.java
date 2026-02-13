package Clase_Padre;

import java.time.LocalDate;

public class Coche {
	
	//Atributos inmutables del objeto
	protected final String matricula;
	protected final LocalDate fecha_matriculacion;
	
	//Atributos mutables del objeto
	protected String nombre_propietario;
	protected int cilindrada;
	protected int potencia;
	
	public Coche (String nombre_propietario, String matricula, LocalDate fecha_matriculacion, int cilindrada, int potencia) throws IllegalArgumentException {
		
		if (nombre_propietario.isBlank()) {
			throw new IllegalArgumentException("No se puede dejar el nombre del propietario en blanco");
		}
		
		if(nombre_propietario.isEmpty()) {
			throw new IllegalArgumentException("No se puede dejar el nombre del propietario vacío");
		}
		
		if (fecha_matriculacion.isBefore(LocalDate.of(2000, 1, 1))) {
			throw new IllegalArgumentException("La fecha de matriculación de un coche no puede ser anterior al año 2000 debido a la ley de la UE");
		}
		
		if (cilindrada < 400) {
			throw new IllegalArgumentException("La cilindrada es demasiado baja");
		}
		
		if (cilindrada < 0) {
			throw new IllegalArgumentException("La cilindrada no puede ser negativa");
		}
		
		if (potencia < 50) {
			throw new IllegalArgumentException("La potencia es demasiado baja");
		}
		
		if (potencia < 0) {
			throw new IllegalArgumentException("La potencia no puede ser negativa");
		}
		
		this.nombre_propietario = nombre_propietario;
		this.matricula = matricula; 
		this.fecha_matriculacion = fecha_matriculacion;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		
	}
	
	public Coche () {
		this("Desconocido", generarMatricula(), LocalDate.now(), 600, 75);
	}
	
	private static String generarMatricula () {
		
		String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 int indiceLetra1 = 0;
		 int indiceLetra2 = 0;
		 int indiceLetra3 = 0;
		 int numero = 0;
		 
		 String matricula = "" + LETRAS.charAt(indiceLetra1) + LETRAS.charAt(indiceLetra2) + LETRAS.charAt(indiceLetra3) + String.format("%04d", numero);
		 
		 numero++;
		 
		 if (numero > 9999) {
			 numero = 0;
			 indiceLetra3++;
			 
			 if (indiceLetra3 >= LETRAS.length()) {
				 indiceLetra3 = 0;
				 indiceLetra2++;
				 
				 if (indiceLetra2 >= LETRAS.length()) {
					 indiceLetra2 = 0;
					 indiceLetra1++;
					 
					 if (indiceLetra1 >= LETRAS.length()) {
	                        throw new RuntimeException("Se han generado todas las matrículas disponibles.");
	                        
	                    }
				 }
			 }
		 }
		
		return matricula; 
	}
}
