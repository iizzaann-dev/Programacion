package Rico;

public class Main {

	public static void main(String[] args) {

		int [][] temperaturas = new int [8][7];
		
		String [] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		
		String [] franjas = {"00h", "03h", "06h", "09h", "12h", "15h", "18h", "21h"};
		
		rellenarArray(temperaturas);

		mostrarArray(temperaturas);
		
		System.out.println("");

		System.out.println("");
		
		
		//Apartado 1
		System.out.println("Apartado 1:");

		maxFranjaHoraria(temperaturas, dias, franjas);
		
		System.out.println("");

		
		//Apartado 2
		System.out.println("Apartado 2: ");
		minTempFranjaHoraria(temperaturas, franjas);
		
		System.out.println("");
		
		//Apartado 3
		System.out.println("Apartado 3: ");
		temperaturaMediaDiaria(temperaturas, dias);

		System.out.println("");
		
		//Apartado 4
		System.out.println("Apartado 4: ");
		checkTemperaturaSuperiorA20(temperaturas, franjas, dias);

		System.out.println("");

		//Apartado 5
		System.out.println("Apartado 5: ");
		
		ampliudTermica(temperaturas, dias);



	}
	
	
	//Rellenamos el array
	public static void rellenarArray(int [][] temperaturas) {
		
		for(int i = 0; i < temperaturas.length; i++) {
			for(int j = 0; j < temperaturas[i].length; j++) {
				
				//(Maximo - Minimo + 1 ) + Minimo
				temperaturas[i][j] = (int)(Math.random() * (((35 - 1) + 1)) + 1);
			}
		}
	}
	
	
	//Mostramos el array
	public static void mostrarArray(int [][] temperaturas) {
		
		for(int i = 0; i < temperaturas.length; i++) {
			System.out.println("");

			for(int j = 0; j < temperaturas[i].length; j++) {
				
				System.out.print(temperaturas[i][j] + " ");

			}
		}
	}
	
	//Buscamos el dia con la temperatura mas alta de cada franja horaria
	public static void maxFranjaHoraria(int [][] temperaturas, String [] dias, String [] franjas) {
		
		int indiceJ = 0, max = 0;
		
		
		for(int i = 0; i < temperaturas.length; i++) {
			
			//Antes pusimos el println aqui, pero sin embargo no puede estar aqui porque sino los valores siempre van a ser erroneos
			
			max = temperaturas[i][0];
			
			indiceJ = 0; //Lo reiniciamos para limpiar
			
			for(int j = 0; j < temperaturas[i].length; j++) {
				
				if(temperaturas[i][j] > max) {
					max = temperaturas[i][j];
					indiceJ = j;
				}
				
			}
			
			System.out.println("Para la franja horaria " + franjas[i] + " la temperatura máxima fue el " + dias[indiceJ]);
		}
	}
	
	//Calcular la temperatura minima de cada franja, compararla entre ellas y encontrar la minima de entre estas
	public static void minTempFranjaHoraria(int [][] temperaturas, String [] franjas) {
		
		int min = 10000000;
		int indiceI = 0;
		
		for(int i = 0; i < temperaturas.length; i++) {
			
			for(int j = 0; j < temperaturas[i].length; j++) {
				
				if(temperaturas[i][j] < min) {
					min = temperaturas[i][j];
					indiceI = i;
				}
			}
		}
		
		System.out.println("La hora mínima de entre toda la semana es " + min + " y se encuentra en la franja de las " + franjas[indiceI]);

	}
	
	public static void temperaturaMediaDiaria(int [][] temperaturas, String [] dias) {
		
 		int media = 0;
		
		for(int j = 0; j < temperaturas[0].length; j++) {
			
			for(int i = 0; i < temperaturas.length; i++) {
				
				 media += temperaturas[i][j];
				  
				 
			}
			
			int mediaCompleta = media / temperaturas.length;
			
			System.out.println("Para el día " + dias[j] + ", la temperatura media es de " + mediaCompleta);
			media = 0;
		}
	}
	
	public static void checkTemperaturaSuperiorA20 (int [][] temperaturas, String [] franjas, String [] dias) {
		
		boolean encontrado = false;
		
		for(int i = 0; i < temperaturas.length; i++) {
			for(int j = 0; j < temperaturas[i].length; j++) {
				
				if(temperaturas[i][j] > 20 && encontrado == false) {
					System.out.println("El primer dia con una temperatura superior a 20 grados en la franja horaria " + franjas[i] + "es: " + dias[j]);
					encontrado = true;
				}
			}
			
			if(encontrado == false) {
				System.out.println("Ninguno");

			}else {
				encontrado = false;
			}
			
		}
	}
	
	public static void ampliudTermica(int [][] temperaturas, String [] dias) {
		
		int [] temperaturasAuxiliaresMax = new int [7];
		int [] temperaturasAuxiliaresMin = new int [7];
		
		int [] temperaturasAuxiliares = new int [7];
		
		int diferenciaMax = 0; 
		int min = 1000;
		int max = 0;
		int indiceI = 0;
		
		
		for(int j = 0; j < temperaturas[0].length; j++) {
			for(int i = 0; i < temperaturas.length; i++) {
				
				if(temperaturas[i][j] > max) {
					max = temperaturas[i][j];
				}
				
				if(temperaturas[i][j] < min) {
					min = temperaturas[i][j];
				}
				
			}
			
			temperaturasAuxiliaresMax[j] = max;
			temperaturasAuxiliaresMin[j] = min;
		}
		
		for(int i = 0; i < temperaturasAuxiliares.length; i++) {
			temperaturasAuxiliares[i] = temperaturasAuxiliaresMax[i] - temperaturasAuxiliaresMin[i];
			
			if(temperaturasAuxiliares[i] > diferenciaMax) {
				diferenciaMax = temperaturasAuxiliares[i];
				indiceI = i;
			}
		}
		
		System.out.println("El dia con la mayor diferencia termica fue " + dias[indiceI] + " con una temperatura de " + diferenciaMax + "ºC.");

	}
}
