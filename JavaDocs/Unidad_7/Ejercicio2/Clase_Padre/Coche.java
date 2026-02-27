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
	
	private static final String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static int indiceLetra1 = 0;
	private static int indiceLetra2 = 0;
	private static int indiceLetra3 = 0;
	private static int numero = 0;
	
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
		
		if (cilindrada < 0) {
			throw new IllegalArgumentException("La cilindrada no puede ser negativa");
		}
				
		if (potencia < 0) {
			throw new IllegalArgumentException("La potencia no puede ser negativa");
		}
		
		if (matricula == null || matricula.isBlank()) {
	        this.matricula = generarMatricula(); 
	        
	    } else {
	        this.matricula = matricula;
	    }
		
		this.nombre_propietario = nombre_propietario;
		this.fecha_matriculacion = fecha_matriculacion;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		
	}
	
	public Coche () {
		this("Desconocido", generarMatricula(), LocalDate.now(), 2000, 150);
	}
	
	private static String generarMatricula () {
		 
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

	public String getMatricula() {
		return matricula;
	}

	public LocalDate getFecha_matriculacion() {
		return fecha_matriculacion;
	}

	public String getNombre_propietario() {
		return nombre_propietario;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setNombre_propietario(String nombre_propietario) {
		this.nombre_propietario = nombre_propietario;
	}

	public void setCilindrada(int cilindrada) throws IllegalArgumentException {
		
		if (cilindrada < 0) {
			throw new IllegalArgumentException ("La cilindrada no puede ser negativa");
		}else {
			this.cilindrada = cilindrada;
		}
	}

	public void setPotencia(int potencia) throws IllegalArgumentException {
		if(potencia < 0) {
			throw new IllegalArgumentException("La potencia no puede ser negativa");
		}else {
			this.potencia = potencia;

		}
	}

	@Override
	public String toString() {
		return "Coche [matricula = " + matricula + ", fecha_matriculacion = " + fecha_matriculacion
				+ ", nombre_propietario = " + nombre_propietario + ", cilindrada = " + cilindrada + ", potencia = " + potencia;
	}
	
	
}
