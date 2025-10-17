package vectores;

public class array1 {

	public static void main(String[] args) {
		final int TAMANIO = 20;
		
		int [] numeros; //Declaramos el array
		numeros = new int[TAMANIO];  //Instanciamos el array
		
		for (int posicion = 0; posicion < 20; posicion++) {
			numeros[posicion] = (int)(Math.random() * 50);  //Inicializamos a números aleatorios entre 0 y 50 todas las posiciones
		}
		
		for (int posicion = 0; posicion < 20; posicion++) {
			System.out.println("El valor de la posición " + posicion + " es: " + numeros[posicion]);
		}
	}

}
