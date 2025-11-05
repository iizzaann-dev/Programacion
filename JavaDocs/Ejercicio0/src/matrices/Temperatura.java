/*
 * 
 */

package matrices;

public class Temperatura {

	public static void main(String[] args) {
		final int TOTAL_MESES = 12; 
		final int TOTAL_DIAS =30;
		int diaMasCalor = 1, tempMasAlto, diaTemp10;
		int[][] temperatura;  											//Declaramos un array bidimensional
		String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};		
		temperatura = new int[TOTAL_MESES][TOTAL_DIAS];   				//Inicialización
																		
		for(int mes=0; mes< temperatura.length; mes++) {				//Nos movemos por los meses
			for(int dia = 0; dia < temperatura[mes].length; dia++) {							//Nos movemos por los días
				temperatura[mes][dia] = (int)(Math.random() * 40);
				
			}
		}
		for(int mes=0; mes<temperatura.length; mes++) {				
			for(int dia = 0; dia < temperatura[mes].length; dia++) {		
				System.out.print(temperatura[mes][dia] +"\t");
			}
			System.out.println();
		}
		
		for(int mes = 0; mes < temperatura.length; mes++) {
			tempMasAlto = temperatura[mes][0];  						//Cada mes inicializo la temperatura más alta a la temperatura del primer dia
			for(int dia = 0; dia < temperatura[mes].length; dia++) {							//Empiezo a comparar a partir del segundo 
				if (tempMasAlto < temperatura[mes][dia]) {
					tempMasAlto = temperatura[mes][dia];
					diaMasCalor = dia;
				}
			}
			System.out.println("El día " + diaMasCalor + " hubo " + tempMasAlto + " grados.");
		}
		
		//Para cada mes, mostrar el primer dia con temperatura inferiror a los 10 grados. 
		
		for (int mes = 0; mes < temperatura.length; mes++) {
			int dia = 0;
			diaTemp10 = 0;
			do {
				diaTemp10++;
			}while(temperatura[mes][diaTemp10] > 10);
			System.out.println("Para el mes " + mes + " el primer día con menos de 10 grados es el "+ diaTemp10 + " día."); 
		}
		//Si queremos que nos muestre un contenido de un array unidimensional desde un array bidimensional seria mes[meses], siendo mes el numero del mes que queremos mostrar, y siendo meses los nombres de los meses
	}	
}

