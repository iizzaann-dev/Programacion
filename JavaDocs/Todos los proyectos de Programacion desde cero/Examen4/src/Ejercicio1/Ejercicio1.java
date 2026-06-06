package Ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int min;
		int sumaHora = 0;
		String dia = "";
		
		int[][] consumo = {
	            {21,26,40,32,32,15,27,15,31,3,20,32,2,18,27,2,40,31,24,37,15,24,10,36},		//Lunes
	            {5,25,28,5,10,30,14,6,35,33,29,9,32,15,8,37,15,39,19,30,40,14,18,2},		//Martes
	            {39,7,17,14,2,12,34,21,3,40,29,31,1,18,14,9,31,1,6,37,11,5,37,30},			//Miercoles
	            {1,12,37,6,7,30,31,3,15,35,2,38,6,30,32,31,2,32,6,14,14,21,21,38},			//Jueves
	            {8,23,37,16,0,28,5,13,35,10,22,18,28,6,12,21,12,38,26,15,39,24,37,4},		//Viernes
	            {28,7,27,5,21,27,37,17,39,8,29,30,22,10,6,32,39,18,34,0,25,35,4,29},		//Sabado
	            {2,16,16,36,33,9,34,23,4,26,14,26,10,11,12,31,27,17,20,12,24,32,11,33}		//Domingo
	        };
		
		String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		
		int [] arrayAuxiliar = new int[consumo[0].length];
		
		int acumulador = 0;
		
		//A Para cada hora, qué día (en texto) se produjo el consumo mínimo
		
		// Dias = filas
		// Horas = columnas
	
		int filas = consumo.length;
		int columnas = consumo[0].length;
		
		
		for(int colum = 0; colum < consumo[0].length; colum++) {
			
			min = consumo[0][colum];

			for(int fill = 0; fill < consumo.length; fill++) {
				
				
				if(consumo[fill][colum] < min) {
					min = consumo[fill][colum];
					dia = diasSemana[fill];
					
				}
			}
			
			System.out.printf("Para la hora %d, el consumo minimo fue %s. \n", colum, dia);
		}
		
		//Apartado B
		
		for (int i = 0; i < consumo[0].length; i++) {
			
			for(int j = 0; j < consumo.length; j++) {
				
				acumulador += consumo[j][i];
				
			}
			arrayAuxiliar[i] = acumulador;
			acumulador = 0;
		}


		int horaMin = arrayAuxiliar[0];
		int indice = 0;
		
		for (int i = 0; i < arrayAuxiliar.length; i++) {
			//System.out.println(arrayAuxiliar[i]);
			
			if(horaMin > arrayAuxiliar[i]) {
				horaMin = arrayAuxiliar[i];
				indice = i;
			}
		}
		
		System.out.printf("La hora que tuvo el consumo minimo fue: %d. \n", indice);
		
		//Apartado C
		
		int suma = 0;
		
		for(int i = 0; i < consumo.length; i++) {
			for(int j = 0; j < consumo[0].length; j++) {
				
				suma += consumo[i][j];
				
			}
		}
		
		System.out.println("El consumo total de la semana es: " + suma);
		
		
		//Apartado D
		
		
		
		for(int colum = 0; colum < consumo[0].length; colum++) {
			String menorDiez = "";
		
			for(int fill = 0; fill < consumo.length; fill++) {
						
							
					if(consumo[fill][colum] < 10 && menorDiez.isEmpty()) {
						menorDiez = diasSemana[fill];
					}
							
				}
			
			if (menorDiez != null) {
				System.out.printf("Para la hora %d, el primer día con consumo menor a 10 fue %s.\n", colum, menorDiez);
			}else {
				System.out.printf("Para la hora %d, no hubo consumo menor a 10.\n", colum);
			}
		}
		
	}
}

