package Clases;

public enum Periocidad {
	
	SEMANAL(52), 
	MENSUAL(12), 
	TRIMESTRAL(4);
	
	private int numerosAnuales;
	
	Periocidad(int numerosAnuales){
		this.numerosAnuales = numerosAnuales;
	}

	public int getNumerosAnuales() {
		return numerosAnuales;
	}
	
	
}
