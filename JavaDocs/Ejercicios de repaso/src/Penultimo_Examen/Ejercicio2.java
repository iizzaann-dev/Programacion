package Penultimo_Examen;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int[][] nacimientos = {
			    {0, 31, 1, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 33, 42, 22},
			    {24, 56, 7, 0, 0, 0, 0, 0, 0, 0, 2, 12, 2, 10, 30, 29},
			    {17, 22, 5, 0, 0, 0, 0, 0, 0, 1, 2, 9, 1, 13, 36, 32},
			    {2, 41, 2, 0, 0, 0, 0, 0, 0, 0, 1, 7, 0, 11, 13, 32},
			    {0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 11, 58, 3},
			    {18, 8, 2, 0, 0, 0, 0, 0, 0, 0, 0, 11, 1, 7, 50, 36},
			    {1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 17, 35, 64},
			    {7, 3, 1, 0, 0, 0, 0, 0, 0, 0, 5, 7, 0, 26, 23, 0},
			    {3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 4, 7, 130, 43},
			    {4, 33, 1, 0, 0, 0, 0, 0, 0, 0, 4, 2, 0, 10, 20, 31}
			};

		 maxNacimientosMunicipio(nacimientos);
		 System.out.println("");
		 maxNacimientosMunicipioUnico(nacimientos);
	}
	
	//A. Calculamos el maximo de nacimientos de cada municipio
	
	public static void maxNacimientosMunicipio(int [][] nacimientos) {
		
		String [] municipios = {"Antequera", "Ardales", "Benagalbón", "Coín", "Estepona", "Marbella", "Mijas", "Nerja", "Ronda", "Torrox"};
		
		for (int filas = 0; filas < nacimientos.length; filas++ ) {
			int max = nacimientos [filas][0];
			int diaMax = 0;
			
			for(int columnas = 0; columnas < nacimientos[filas].length; columnas++) {
				
				if (nacimientos[filas][columnas] > max) {
					max = nacimientos[filas][columnas];
					diaMax = columnas + 16;
				}
			}
		System.out.printf("Para el municipio %s, hubo más nacimientos el día %d.\n", municipios[filas], diaMax);			
		}
	}
	
	//B. Para cada día, ¿Qué municipio (en texto)registró más nacimientos?
	
	public static void maxNacimientosMunicipioUnico (int [][] nacimientos) {
		
		String [] municipios = {"Antequera", "Ardales", "Benagalbón", "Coín", "Estepona", "Marbella", "Mijas", "Nerja", "Ronda", "Torrox"};
		
		int diaMax = 0;
		
		for (int columnas = 0; columnas < nacimientos[0].length; columnas++) {
			int max = nacimientos [0][columnas];
			
			for (int filas = 0; filas < nacimientos.length; filas++) {
				
				if (nacimientos[filas][columnas] > max) {
					max = nacimientos[filas][columnas];
					diaMax = filas;
				}
			}
			System.out.printf("Para el dia %d, hubo más nacimientos en el municipio %s \n", (columnas + 16), municipios[diaMax]);

		}

		}
	}




