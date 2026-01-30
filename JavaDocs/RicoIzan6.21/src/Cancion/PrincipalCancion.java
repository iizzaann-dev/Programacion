package Cancion;

public class PrincipalCancion {

	public static void main(String[] args) {
		
		//1
		Cancion cancion1;
		
		try {
			 cancion1 = new Cancion("", "");
		} catch (IllegalArgumentException error1) {
			System.out.println("El objeto no puede tener un título o un autor vacio.");
			 cancion1 = new Cancion();
		}
		
		//2
		Cancion cancion2 = new Cancion();
		System.out.printf("La segunda cancion, junto con su autor es: %s. \n", cancion2.toString());
		
		//3 
		cancion1.ponTitulo("Despacito");
		cancion2.ponTitulo("CDOBLETA.RIP");
		
		//4
		System.out.printf("La cancion1 es: %s. \n", cancion1.toString());
		
		//5
		Cancion cancionClon = new Cancion(cancion1);
		
		//6
		cancionClon.ponAutor("Luis Fonsi");
		
		//7
		
		System.out.printf("El autor de la cancion1 es: %s. \n", cancion1.dameAutor());
		System.out.printf("El título de la cancion1 es: %s. \n",cancion1.dameTitulo());
		
		System.out.printf("El autor de la cancion2 es: %s. \n", cancion2.dameAutor());
		System.out.printf("El título de la cancion2 es: %s. \n",cancion2.dameTitulo());
		
		System.out.printf("El autor de la cancionClon es: %s. \n", cancionClon.dameAutor());
		System.out.printf("El título de la cancionClon es: %s.",cancionClon.dameTitulo());

	}

}
