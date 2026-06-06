package Clases;

public class VideoJuegoDigital extends Productos{
	
	
	private int tamanoMB;
	private boolean requiereInternet;
	
	
	public VideoJuegoDigital(String nombre, String genero, double precio, int anio, int tamanoMB, boolean requiereInternet) {
		super(nombre, genero, precio, anio);
		
		//tipo, nombre, genero, precio, año, tamaño, requiereInternet
		
		this.tamanoMB = tamanoMB;
		this.requiereInternet = requiereInternet;
	}
	
	
	//Getters y Setters
	
	public int getTamanoMB() {
		return tamanoMB;
	}


	public void setTamanoMB(int tamanoMB) {
		this.tamanoMB = tamanoMB;
	}


	public boolean isRequiereInternet() {
		return requiereInternet;
	}


	public void setRequiereInternet(boolean requiereInternet) {
		this.requiereInternet = requiereInternet;
	}
	
	
	@Override
	public void mostrarInfo() {
		System.out.println("VideoJuegoFisico: tamañoMB=" + tamanoMB + ", requiere internet=" + requiereInternet + ", nombre=" + nombre + ", genero="
				+ genero + ", precio=" + precio + ", anio=" + anio);

	}

	@Override
	public double calcularCosteTotal() {
		return super.precio;
	}
	
	
	public double obtenerTamanoGB() {
		
		String resultado = String.format("%.2f", (tamanoMB / 1024));
		
		return Double.parseDouble(resultado);
	}
}
