/*
 *Descripción:
 *	A. Para cada municipio, ¿Qué día hubo más nacimientos?
	B. Para cada día, ¿Qué municipio (en texto)registró más nacimientos?
	C. ¿Qué día registró más nacimientos en el conjunto de todos los municipios?
	D. Solicita un día y un municipio (en texto) e indica si registró algún nacimiento
 *
 *Nombre: Izan Rico Blanco
 *Fecha: 14/05/2026
*/



package Ejercicio2;


public class Provincias {

	public static void main(String[] args) {
		
		int numero = 0, max = 0, min = 0;
		int indiceColumnas = 0;
		
		
		String[] municipios = {
			    "Antequera",
			    "Ardales",
			    "Benagalbón",
			    "Coín",
			    "Estepona",
			    "Marbella",
			    "Mijas",
			    "Nerja",
			    "Ronda",
			    "Torrox"
			};
		
		int[] dias = {
			    16, 17, 18, 19, 20, 21, 22, 23,
			    24, 25, 26, 27, 28, 29, 30, 31
			};
		
		int[][] nacimientosMunicipios = {
			    {0, 24, 17, 2, 0, 18, 1, 7, 3, 4},
			    {31, 56, 22, 41, 3, 8, 14, 3, 5, 33},
			    {1, 7, 5, 2, 0, 2, 0, 1, 0, 1},
			    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			    {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
			    {0, 2, 2, 0, 0, 0, 0, 5, 0, 4},
			    {7, 12, 9, 7, 6, 11, 8, 7, 15, 2},
			    {0, 2, 1, 0, 0, 1, 0, 0, 4, 0},
			    {33, 10, 13, 11, 11, 7, 17, 26, 7, 10},
			    {42, 30, 36, 13, 58, 50, 35, 23, 130, 20},
			    {22, 29, 32, 32, 3, 36, 64, 0, 43, 31}
			};
		
		
		for(int j = 0; j < municipios.length; j++) {
			for(int i = 0; i < nacimientosMunicipios[j].length; i++) {
				
				
				
				if (nacimientosMunicipios[j][i] >= 0) {
					numero = nacimientosMunicipios[j][i];
				}
				
			}
			
			indiceColumnas = encontrarDia(numero, nacimientosMunicipios, j);
			System.out.printf("Para el municipio %s, hubo más nacimientos el dia %d. \n", municipios[j], dias[indiceColumnas]);
		}
		
		for (int i = 0; i < municipios.length; i++) {
			for(int j = 0; j < nacimientosMunicipios[i].length; j++){
				
				if(nacimientosMunicipios[i][j] >= 0) {
					numero = nacimientosMunicipios[i][j];
				}
			}
			
			indiceColumnas = encontrarDia(numero, nacimientosMunicipios, i);
			System.out.printf("Para el dia %d, hubo más nacimientos en el municipio %s. \n", dias[i],municipios[indiceColumnas]);
			
		}
	}
	
	
	
	//B darle la vuelta al bucle y tener cuidado con los indices
	
	
	
	//C guardar en una variable el valor de numero e ir comparando y guardar en otra variable
	
		
	
	
	public static int encontrarDia (int numero, int [][] nacimientosMunicipios, int columna) {
		
		int resultado = 0;
		
		
		for(int j = 0; j < nacimientosMunicipios.length; j++) {
			
				if (numero == nacimientosMunicipios[j][columna]) {
					resultado = j;
				}
			}
		
		return resultado;
	}
}
