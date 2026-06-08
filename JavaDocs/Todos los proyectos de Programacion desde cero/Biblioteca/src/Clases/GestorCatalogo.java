package Clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorCatalogo {
	
	ArrayList <Publicacion> catalogo;
	
	
	public GestorCatalogo(){
		
		this.catalogo = new ArrayList <> ();
	}
	
	
	public void cargarCatalogo(String ruta) throws FileNotFoundException {
		
		
		
		try {
			File archivo = new File (ruta);	
			Scanner teclado = new Scanner(archivo);
			
			while(teclado.hasNext()) {
				String linea = teclado.nextLine();

				catalogo.add(formateador(linea));
				
			}
			
			teclado.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo.");

		}
		
	}
	
	public Publicacion formateador(String linea) {
		
		Publicacion p = null;
		
		String [] partes = linea.split(";");
		
		if(partes[0].equalsIgnoreCase("Libro")) {
			return p = new Libro(partes[1], partes[2], partes[3], Integer.parseInt(partes[4]), Genero.convertidorGenero(partes[5]), Double.parseDouble(partes[6]), partes[7]);
			//String, String, String, int, Genero, double, String

		}else {
			return p = new Revista(partes[1], partes[2], partes[3], Integer.parseInt(partes[4]), Genero.convertidorGenero(partes[5]), Double.parseDouble(partes[6]), partes[7]);
			//String, String, String, int, Genero, double, String

		}
		
		
	}
	
	public void ordenarCatalogo(ArrayList <Publicacion> catalogo) {
		
		
			
			/*
			 * lista1.sort((a, b) -> b.getDni().compareTo(a.getDni())); // Expresion lambda Ascendente: .sort((a,b)-> a-b)
																	// Descendente: .sort((a,b)-> b-a) Comparamos
																	// mediante el identificador
		// En las expresiones lambda se usa el operador menos cuando son numeros, y
		// comprateTo(el otro elemento) para los Strings
			 */
			
		catalogo.sort((a, b) -> Integer.compare(b.getAnio(), a.getAnio()));
		
		
	}
}
