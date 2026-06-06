package Clases;

public class VideoJuegoFisico extends Productos{
	
	
	private int stock;
	private String plataforma;
	
	public VideoJuegoFisico(String nombre, String genero, double precio, int anio, int stock, String plataforma) {	
		super(nombre, genero, precio, anio);
		
//		tipo, nombre, genero, precio, año, stock, plataforma

		this.stock = stock;
		this.plataforma = plataforma;
	
	}
	
	

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	

	@Override
	public void mostrarInfo() {
		System.out.println("VideoJuegoFisico: stock=" + stock + ", plataforma=" + plataforma + ", nombre=" + nombre + ", genero="
				+ genero + ", precio=" + precio + ", anio=" + anio);
		
	}

	@Override
	public double calcularCosteTotal() {
		return super.precio * stock;
	}
	
	public boolean hayStock() {
		
		boolean resultado = false;
		
		if(stock > 0) {
			resultado = true;
		}else {
			resultado = false;
		}
		
		return resultado;
	}
	
}
