package ClaseBombilla;

public class Bombilla {

	//Atributos de clase constantes
	public static final boolean ESTADO_INICIAL = false;
	
	//Atributos de clase
	
	public static int bombillasCreadas;
	public static int bombillasEncendidas;
	
	//Atributos de objeto
	private boolean estado;
	private int vecesEncendidas;
	
	
	public Bombilla (boolean estado) throws IllegalArgumentException {
		
		this.estado = estado;
		
		if(estado == true) {
			this.vecesEncendidas = 1;
		}else {
			this.vecesEncendidas = 0;
		}
		
		Bombilla.bombillasCreadas++;
		
		if (this.estado == true) {
		    Bombilla.bombillasEncendidas++;
		}
	}
		
	public Bombilla () {
		this(Bombilla.ESTADO_INICIAL);
	}
	
	//Getters
	public boolean getEstado() {
		return this.estado;
	}
	
	public boolean isEncendida() {
		return this.estado;
	}
	
	public boolean isApagada() {
		return !this.estado;
	}
	
	public int getVecesEncendida() {
		return this.vecesEncendidas;
	}
	
	public static int getBombillasCreadas() {
		return Bombilla.bombillasCreadas;
	}

	public static int getBombillasEncendidas() {
		return Bombilla.bombillasEncendidas;
	}
	
	//ToString
	@Override
	public String toString() {
		String textoEstado = "", textoVeces = "";
			
		if (this.estado == true) {
			  textoEstado = "encendida";
		}else {
			textoEstado = "apagada";
		}
		  
	  if (this.vecesEncendidas == 1) {
		  textoVeces = "vez";
	  }else {
		  textoVeces = "veces";
	  }
	  
	  
	  String resultado = String.format("Bombilla %s. Se ha encendido %d %s", textoEstado, this.vecesEncendidas, textoVeces);

	  return resultado;
	}
	
	
	//Acciones
	public void encender () throws IllegalStateException{
		
		if (this.estado == false) {
			this.estado = true;
			this.vecesEncendidas++;
			Bombilla.bombillasEncendidas++;
			
		}else {
			throw new IllegalStateException("Se ha intentado encender una bombilla ya encendida.");
		}
	}
	
	public void apagar ()throws IllegalStateException{
		
		if (this.estado == false) {
			throw new IllegalStateException("Se ha intentado apagar una bombilla ya apagada.");
			
		}else {
			this.estado = false;
			Bombilla.bombillasEncendidas--;
		}
	}
	
	public void conmutar() {
		
		if (this.estado == true) {
			apagar();
			
		}else {
			encender();
		}
	}
}
