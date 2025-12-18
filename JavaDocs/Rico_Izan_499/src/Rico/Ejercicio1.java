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

		
		System.out.printf("El consumo total de toda la semana es: %d", consumoTotal(tabla));
	}
	
	public static String apartado1(int [][] tabla) {
		int resultado = 0;
		String dia = "";
		int dias = 7, horas = 23; 
		tabla = new int [dias][horas];
		
		for (int contador = 0; contador < tabla.length; contador++) {
			for (int contador1 = 0; contador1 < tabla[dias].length; contador1++) {
				//if (tabla[contador] < tabla[1]) {
					
				//}
			}
		}
		
		if (resultado == 1) {
			dia = "Lunes";
		}else if (resultado == 2) {
			dia = "Martes";
		}else if (resultado == 3) {
			dia = "Miercoles";
		}else if (resultado == 4) {
			dia = "Jueves";
		}else if (resultado == 5) {
			dia = "Viernes";
		}else if (resultado == 6) {
			dia = "Sabado";
		}else {
			dia = "Domingo";
		}
		
		return dia;
	}
	
	public static int consumoTotal (int [][] tabla) {
		
		int suma = 0; 
		int dias = 7, horas = 23; 
		
		
		for (int contador = 0; contador < tabla.length; contador++) {
			for (int contador1 = 0; contador1 < tabla[0].length; contador1++) {
				suma = suma + tabla[contador][contador1];
			}
		}
		
		return suma; 
	}

}
