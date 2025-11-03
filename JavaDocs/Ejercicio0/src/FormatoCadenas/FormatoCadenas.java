package FormatoCadenas;

public class FormatoCadenas {

	public static void main(String[] args) {
		
		String nombre = "Fernando";
		int edad = 34;
		double altura = 1.87;
		double peso = 75.4;
		
		String cadena = String.format("Nombre: %s || Edad: %d || Altura: %.1f || Peso: %.1f", nombre, edad, altura, peso);
		
		System.out.println(cadena);
		System.out.printf("Nombre: %s || Edad: %d || Altura: %.2f || Peso: %.1f", nombre, edad, altura, peso);


		
		
		

	}

}
