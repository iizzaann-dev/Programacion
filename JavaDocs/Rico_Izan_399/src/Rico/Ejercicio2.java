/*
 *Descripción: Hay que calcular que días hubo más nacimientos para cada municipio, que municipio registro más nacimientos segun el día, que municipio registró
 *más nacimientos y que se solicite un día y se indiqe si ubo algun nacimiento
 *Nombre: Izan Rico Blanco
 *Fecha: 26/11/2025
*/


package Rico;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int [][] natalidad = {};	
																	//Creamos dos arrays, uno para señalar los municipios y otro en donde metemos todos los valores
		String [] municipio = {"MIJAS", "JUBRIQUE", "PUJERRA", "OJEN", "MÁLAGA", "RONDA", "COÍN", "TORROX", "ARDALES", "MARBELLA"};
		
		for (int contador = 0; contador < municipio.length; contador++) {						//Creamos un bucle en donde enseñamos el numero del municipio con su nombre
			System.out.print("(" + contador + ")" + municipio[contador] + " ");

		}
				

	}

	
	public static void diaMunicipioNacimientos(int [][] natalidad) {
																													//Realizamos un metodo para medir el dia con mas nacimientos
		int max = 0;																								//para cada municipio
			
		for (int municipios = 0; municipios < natalidad.length;municipios++) {
			for (int dias = 0; dias < natalidad[municipios].length; dias++) {
				
				if (natalidad[municipios][dias] > natalidad[0][0]) {
					max = natalidad[municipios][dias];
				}
				System.out.println("Para el municipio" + municipios + " el dia con más nacimientos fue: " + max);
			}
		}
	}
}
