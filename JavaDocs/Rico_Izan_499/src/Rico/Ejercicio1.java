package Rico;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int [][] tabla = {
			{21,26,40,32,32,15,27,15,31,3,20,32,2,18,27,2,40,31,24,37,15,24,10,36},
			{5,25,28,5,10,30,14,6,35,33,29,9,32,15,8,37,15,39,19,30,40,14,18,2},
			{39,7,17,14,2,12,34,21,3,40,29,31,1,18,14,9,31,1,6,37,11,5,37,30},
			{1,12,37,6,7,30,31,3,15,35,2,38,6,30,32,31,2,32,6,14,14,21,21,38},
			{8,23,37,16,0,28,5,13,35,10,22,18,28,6,12,21,12,38,26,15,39,24,37,4},
			{28,7,27,5,21,27,37,17,39,8,29,30,22,10,6,32,39,18,34,0,25,35,4,29},
			{2,16,16,36,33,9,34,23,4,26,14,26,10,11,12,31,27,17,20,12,24,32,11,33}
			};

		
		System.out.printf("El consumo total de toda la semana es: %d.\n", consumoTotal(tabla));
		consumoMinimoHoras(tabla);
		consumoMinimoTotalHora(tabla);
		DiaInferiorA10(tabla);
	}
	
	// Apartado A: Consumo mínimo cada hora
	public static void consumoMinimoHoras(int[][] tabla) {
	    String[] dias = {
	        "Lunes", "Martes", "Miércoles",
	        "Jueves", "Viernes", "Sábado", "Domingo"
	    };

	    for (int hora = 0; hora < tabla[0].length; hora++) {
	        int min = tabla[0][hora];
	        int diaMin = 0;

	        for (int dia = 1; dia < tabla.length; dia++) {
	            if (tabla[dia][hora] < min) {
	                min = tabla[dia][hora];
	                diaMin = dia;
	            }
	        }

	        System.out.println(
	            "Hora " + (hora + 1)  +
	            ": consumo mínimo = " + min +
	            " (" + dias[diaMin] + ")"
	        );
	    }
	}
	
	//Apartado B: Hora con consumo minimo total a lo largo de la semana
	public static void consumoMinimoTotalHora (int [][] tabla) {
			
			int horaMin = 0;  
			double media = 0, mediaMinima = 2000000;
			
			for (int i = 0; i < tabla[0].length; i++) {
				int sumaFila = 0; 
				
				for (int j = 0; j < tabla.length; j++) {
					sumaFila = sumaFila + tabla[j][i];
					
				}
				media = sumaFila / (double)(7);
				
				if (media < mediaMinima) {
					mediaMinima = media;
					horaMin = i + 1;
				}
			}
			
			System.out.printf("A lo largo de la semana, la hora que tiene un consumo mínimo son las %d, con una media de: %.2f.\n", horaMin, media);
		
		}
	
	//Apartado C: Consumo Total
	public static int consumoTotal (int [][] tabla) {
		
		int suma = 0;  
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				suma = suma + tabla[i][j];
			}
		}
		
		return suma; 
	
	}
	
	//Apartado D: Para cada hora, encontrar el primer día con consumo inferiror a 10
	public static void DiaInferiorA10 (int [][] tabla) {
		
		int minimo = 0;
		
		String[] dias = {
		        "Lunes", "Martes", "Miércoles",
		        "Jueves", "Viernes", "Sábado", "Domingo"
		    };

		 for (int hora = 0; hora < tabla[0].length; hora++) {
		        boolean bandera = false;

		        for (int dia = 0; dia < tabla.length && bandera == false; dia++) {
		        	if (tabla[dia][hora] <10) {
		        		bandera = true;
			        	minimo = tabla[dia][hora];
			        	System.out.printf("Para la hora %d, el primer dia con un consumo inferior a 10 es %s (%d).\n", hora, dias[dia], minimo);
			        }
		        }

		       
		    }
	}
	
}
