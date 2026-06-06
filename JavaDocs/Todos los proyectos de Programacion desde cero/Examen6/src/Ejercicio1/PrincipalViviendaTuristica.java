package Ejercicio1;


import java.util.Scanner;

import Clases.Apartamento;
import Clases.CasaRural;
import Clases.Hotel;

public class PrincipalViviendaTuristica {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		// 1. Crea un apartamento con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos
		System.out.println (" 1 ============");
		Apartamento apartamento1 = new Apartamento();
		System.out.println("Apartamento 1: " + apartamento1);


		
		//2. Calcula el precio para una estancia de 3 días.
		// Evidencia: el precio de la estancia.
		System.out.println (" 2 ============");		
		
		System.out.println("El precio del departamento 1 para una estancia de 3 dias es: " + apartamento1.calcularPrecio(3)); //Revisar que la salida sale mal
		
		
		//3. Crea un apartamento con precio por noche (valor solicitado al usuario) y distancia al centro (solicitado al usuario). Resto de valores por defecto.
		// Evidencia. El valor de cada uno de los atributos
		System.out.println (" 3 ============");		
		double precioNoche = 0, distanciaCentro = 0;
		
		System.out.println("Ingresa el precio por noche del apartamento: ");
		precioNoche = teclado.nextDouble();
		
		System.out.println("Ingresa la distancia al centro de la ciudad: ");
		distanciaCentro = teclado.nextDouble();
		
		Apartamento apartamento2 = new Apartamento(precioNoche, distanciaCentro);
		
		System.out.println("Apartamento 2: " + apartamento2);

		
		//4. Calcula el precio para una estancia de 5 días.
		// Evidencia: el precio de la estancia.
		System.out.println (" 4 ============");	
		
		
		System.out.println("El precio de la estancia de 5 dias en el apartamento 2 es: "+ apartamento2.calcularPrecio(5));
		
		
		
		//5. Crea una casa rural con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 5 ============");	

		CasaRural casaRural1 = new CasaRural ();
		
		System.out.println("Los valores de la casa rural 1 son: " + casaRural1);

		
		//6. Crea una casa rural con precio por noche (valor solicitado al usuario) y el resto por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 6 ============");	

		System.out.println("Ingresa el precio por noche de la casa rural 2: ");
		double precioCasRural = teclado.nextDouble();
		
		CasaRural casaRural2 = new CasaRural(precioCasRural);
		
		
		System.out.println("Los valores de la casa rural 2 son: " + casaRural2);

		
		
		// 7. Calcula el precio de una estancia de 10 días.
		// Evidencia: el precio de la estancia.
		System.out.println (" 7 ============");	

		
		System.out.println("Para una estancia de 10 dias en la casa rural 2, el precio por noche es: " + casaRural2.calcularPrecio(10));

		
		// 8. Modifica la fecha de construcción a 1/1/2023.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 8 ============");	

		if(casaRural2.esPetFriendly() == true) {
			System.out.println("La cara rural 2 es pet friendly");

		}else {
			System.out.println("La casa rural 2 no es pet friendly ");

		}

		// 9. Indica si la casa es pet friendly.
		// Evidencia. Indica si es "pet friendly".
		System.out.println (" 9 ============");	

		
		// 10. Crea un hotel con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 10 ============");

		
		// 11. Crea un hotel con todos los valores solicitados al usuario. (el objeto debe ser creado por un método)
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 11 ============");	

		
		//12. Calcula el precio de una estancia de 1 día.
		// Evidencia: el precio de la estancia.
		System.out.println (" 12 ============");	

		
		// 13. Modifica el valor de Spa a sí.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 13 ============");	

		
		// 14. Calcula el precio de una estancia de 1 día.
		// Evidencia: el precio de la estancia.
		System.out.println (" 14 ============");	

		
	
		// 15. Calcula el número de viviendas creadas.
		// Evidencia. El número de viviendas creadas.
		System.out.println (" 15 ============");	
		
		
	}

}
