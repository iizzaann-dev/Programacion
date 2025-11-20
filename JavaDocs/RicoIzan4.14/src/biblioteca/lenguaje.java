package biblioteca;

public class lenguaje {

	public static void trianguloLetras (char letra,int tamanio) {								//Hace un triangulo con letras
		
		for(int contador = 1; contador <= tamanio; contador++) {
			for(int contador2 = 1; contador2 <= contador; contador2++) {
				System.out.print(letra);
			}
			System.out.println("");
		}
	}
	
/*-----------------------------------------------------------------------------------------------------*/

}
