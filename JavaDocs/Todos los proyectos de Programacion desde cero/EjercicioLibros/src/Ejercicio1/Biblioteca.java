package Ejercicio1;

import java.util.ArrayList;

public class Biblioteca {

	private String nombre;
	private ArrayList<Libro> catalogoLibro;
	private ArrayList<Socio> socios;

	public Biblioteca(String nombre) {
		this.nombre = nombre;
		this.catalogoLibro = new ArrayList <>();
		this.socios = new ArrayList <>();
	}

	// Añadimos un libro al catalogo de libros
	public void anadirLibro(Libro lib) {
		catalogoLibro.add(lib);
	}

	// Añadimos un socio a la lista de socios
	public void anadirSocio(Socio socio) {
		socios.add(socio);
	}

	public void prestarLibro(String ISBN, int numeroSocio) throws Exception {

		for (Libro libro : catalogoLibro) { // Recorremos la lista de libros

			if (libro.getISBN().equalsIgnoreCase(ISBN) && libro.isDisponible()) { // Comparamos cual es el ISBN tanto
																					// del libro dentro de la lista como
																					// el que llega por
																					// parametros y ademas vemos si esta
																					// disponible
				for (Socio s : socios) { // Recorremos la lista de socios

					if (s.getNumeroSocio() == numeroSocio) { // Comparamos el numero de socio de la lista con el que le
																// llega por parametro

						s.getLibrosPrestamo().add(libro); // Añadimos a la lista el libro seleccionado
					}
				}

				libro.setDisponible(false); // Hacemos que el libro de la lista no este disponible para que otro usuario
											// no lo meta en su lista

			} else {
				throw new Exception("No se ha encontrado el libro o no esta disponible.");
			}
		}
	}

	
	public void devolverLibro(String ISBN, int numeroSocio) {

		for (Socio s : socios) { // Recorremos la lista de socios

			if (s.getNumeroSocio() == numeroSocio) {

				for (Libro l : s.getLibrosPrestamo()) {

					if (l.getISBN().equalsIgnoreCase(ISBN)) {

						s.getLibrosPrestamo().remove(l);
					}
				}
			}
		}

		for (Libro libro : catalogoLibro) {
			if (libro.getISBN().equalsIgnoreCase(ISBN)) {
				libro.setDisponible(true);
			}
		}
	}
	
	
	public ArrayList <Libro> buscarLibros (String titulo, ArrayList<Libro> catalogoLibro) {
		
		ArrayList <Libro> lista = new ArrayList <>();
		
		
		for(Libro i : catalogoLibro) {
			if(i.getAutor().equalsIgnoreCase(titulo)) {
				lista.add(i);
			}
		}
		
		
		return lista;
	}
	
	
	public ArrayList <Libro> listarLibrosDisponibles (ArrayList<Libro> catalogoLibro){
		
		ArrayList <Libro> lista = new ArrayList<> ();
		
		for(Libro i : catalogoLibro) {
			if(i.isDisponible() == true) {
				lista.add(i);
			}
		}
		
		return lista;
	}
	
	public void sociosPrestamosActivos (){
		
		for(Socio i : socios) {

			if(!i.getLibrosPrestamo().isEmpty()) {
				int numeroLibros = i.getLibrosPrestamo().size();
				
				System.out.printf("Nombre: {}, numero del socio: {}, cantidad de libros {}", i.getNombre(), i.getNumeroSocio(), numeroLibros);

			}else {
				System.out.println("No hay ningun socio que tenga prestados ningun libro.");

			}
		}
		
	}

	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", catalogoLibro=" + catalogoLibro + ", socios=" + socios + "]";
	}

}
