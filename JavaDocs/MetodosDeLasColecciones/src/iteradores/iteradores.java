package iteradores;

import java.util.ArrayList;
import java.util.Iterator;

public class iteradores {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList();
		boolean algo = false;
		
		lista.add("Hola");
        lista.add("Mundo");
        lista.add("Java");
        lista.add("Iteradores");
        
		Iterator<String> nuevoIterador = lista.iterator();

		while (nuevoIterador.hasNext() && !algo) {
			String patata = nuevoIterador.next();
			if (patata.equals("Mundo")) {
				algo = true;
				nuevoIterador.remove();
				
			}
		}
		
		System.out.println("La lista contiene" + lista);

	}

}
