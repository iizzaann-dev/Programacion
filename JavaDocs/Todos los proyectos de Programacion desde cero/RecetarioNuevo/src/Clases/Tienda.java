package Clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

	private ArrayList<VideoJuegoFisico> catalogoFisico;
	private ArrayList<VideoJuegoDigital> catalogoDigital;
	private String nombreTienda;

	public Tienda(String nombreTienda) {

		this.catalogoFisico = new ArrayList<>();
		this.catalogoDigital = new ArrayList<>();
		this.nombreTienda = nombreTienda;
	}

	public void cargarCatalogo(String rutaFichero) throws FileNotFoundException {

		File archivo = new File(rutaFichero);

		Scanner teclado = new Scanner(archivo);

		while (teclado.hasNextLine()) {
			String linea = teclado.nextLine();
			convertidorJuegos(linea);

		}

		String entrada = "";

		teclado.close();

	}

	public void motrarTodosLosProductos() {

		for (VideoJuegoFisico i : catalogoFisico) {

			i.mostrarInfo();

		}

		for (VideoJuegoDigital i : catalogoDigital) {

			i.mostrarInfo();

		}
	}

	public ArrayList<Productos> buscarPorGenero(String genero) {

		ArrayList<Productos> listaCompleta = new ArrayList<>();

		for (VideoJuegoFisico i : catalogoFisico) {

			if (i.getGenero().equalsIgnoreCase(genero)) {

				listaCompleta.add(i);
			}
		}

		for (VideoJuegoDigital i : catalogoDigital) {

			if (i.getGenero().equalsIgnoreCase(genero)) {
				listaCompleta.add(i);
			}
		}

		return listaCompleta;
	}
	
	
	public double calcularPrecioMedio() {
		
		double resultadoFisicos = 0, resultadoDigitales = 0, acumuladorFisicos = 0, acumuladorDigitales = 0;
		
		
		
		for(VideoJuegoFisico i : catalogoFisico) {
			acumuladorFisicos += i.getPrecio();
			
		}
		
		resultadoFisicos = acumuladorFisicos / catalogoFisico.size();
		
		for(VideoJuegoDigital i : catalogoDigital) {
			acumuladorDigitales += i.getPrecio();
		}
		
		resultadoDigitales = acumuladorDigitales / catalogoDigital.size();
		
		
		return (resultadoFisicos + resultadoDigitales) / 2;
	}
	
	
	public Productos productoMasBarato() {
		
			Productos productoBarato = null;
		
			double precioMin = 1000;
		
		for(VideoJuegoDigital i : catalogoDigital) {
			
			
			if(i.getPrecio() < precioMin) {
				precioMin = i.getPrecio();
				productoBarato = i;
			}
		}
		
		for(VideoJuegoFisico i : catalogoFisico) {
			
			if(i.getPrecio() < precioMin) {
				precioMin = i.getPrecio();
				productoBarato = i;
			}
		}
		
		return productoBarato;
	}
	
	
	public void aplicarDescuentoAntiguos (int anioCorte, double descuento) {
		
		for(VideoJuegoDigital i : catalogoDigital) {
			if(i.getAnio() <= anioCorte) {
				i.setPrecio(i.getPrecio() * (1 - (descuento / 100)));
			}
		}
		
		for(VideoJuegoFisico i : catalogoFisico) {
			if(i.getAnio() <= anioCorte) {
				i.setPrecio(i.getPrecio() * (1 - (descuento / 100)));
			}
		}
	}
	
	
	public int contarFisicosSinStock() {
		
		int contador = 0;
		
		for(VideoJuegoFisico i : catalogoFisico) {
			if(i.getStock() == 0) {
				contador++;
			}
		}
		
		return contador; 
	}
	private void convertidorJuegos(String linea) {

		String[] partes = linea.split(";");

		if (linea.contains("FISICO")) {
			// tipo, nombre, genero, precio, año, stock, plataforma

			VideoJuegoFisico juego = new VideoJuegoFisico(partes[1], partes[2], Double.parseDouble(partes[3]),
					Integer.parseInt(partes[4]), Integer.parseInt(partes[5]), partes[6]);
			catalogoFisico.add(juego);
		}

		if (linea.contains("DIGITAL")) {
			partes = linea.split(";");
			// tipo, nombre, genero, precio, año, tamaño, requiereInternet

			VideoJuegoDigital juego = new VideoJuegoDigital(partes[1], partes[2], Double.parseDouble(partes[3]),
					Integer.parseInt(partes[4]), Integer.parseInt(partes[5]), Boolean.parseBoolean(partes[6]));
			catalogoDigital.add(juego);
		}

	}

}
