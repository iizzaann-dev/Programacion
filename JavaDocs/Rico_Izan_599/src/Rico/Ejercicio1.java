package Rico;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int [][] parcial = new int [3][12];
		int [][] completo = new int [4][13];
		String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};		

		int random = 0;
		
		for (int contador = 0; contador < meses.length; contador++) {
			System.out.print("		");
			System.out.printf("  ", meses[contador]);
		}
		for (int filas = 0; filas < parcial.length; filas++) {						//Generamos un numero aleatorio que sea mayor de 1000 y legue como maximo hasta 20000
			for (int columnas = 0; columnas < parcial[filas].length ;columnas++){
				random = (int)(Math.random() * 20000);
				if (random > 1000) {
					
					parcial[filas][columnas] = random;
				}
				System.out.printf(" ", parcial[filas][columnas]);
			}
		}
		
		for (int filas = 1; filas < parcial.length; filas++) {
			for (int columnas = 1; columnas < parcial[filas].length ;columnas++){
				
			}

		}
		
		System.out.printf("Las ventas totales son: %d.\n", ventaTotal(parcial)); //Mostramos las ventas totales
		System.out.printf("La mejor sucursal es: %d", mejorSucursal(completo));
	}

	
	public static int ventaTotal (int [][] ventas) {
		int ventasTotales = 0;
		
		for (int filas = 0; filas < ventas.length; filas++) {							//Realizamos dos bucles para recorrer el array donde calculamos las ventas totales
			for (int columnas = 0; columnas < ventas[filas].length; columnas++) {
				
				ventasTotales = ventas[filas][columnas]++;
			}
		}
		
		return ventasTotales;
	}
	
	public static int mejorMes (int [][]ventas) {				//Comparamos las filas del array para ver que fila tiene mayor valor y asi poder sacar cual es el mayor mes
		int mes = 0;
		int max = 0, ventasFilas = 0, ventasFilasMax = 0; 
		
		
		for (int filas = 0; filas < ventas.length; filas++) {
			if (max < ventasFilas) {
				max = ventasFilas;
				if(ventasFilasMax < ventasFilas) {
					ventasFilasMax = ventasFilas;
				}
			}
			for (int columnas = 0; columnas < ventas[filas].length; columnas++) {
				
				ventasFilas = ventas[filas][columnas]++;
			}
		}
		
		
		return mes;
	}
	
	public static String mejorSucursal (int [][]ventas) {				//Comparamos las filas del array para ver que fila tiene mayor valor y asi poder sacar cual es el mayor mes
		String sucursal = "";
		int max = 0, ventasFilas = 0, ventasFilasMax = 0; 
		
		
		for (int filas = 0; filas < ventas.length; filas++) {
			if (max < ventasFilas) {
				max = ventasFilas;
				if(ventasFilasMax < ventasFilas) {
					ventasFilasMax = ventasFilas;
				}
			}
			for (int columnas = 0; columnas < ventas[filas].length; columnas++) {
				
				ventasFilas = ventas[filas][columnas]++;
			}
		}
		
		if (ventas[1][0] > ventas[2][0] && ventas[1][0] > ventas[3][0]) {
			sucursal = "Málaga";
		}else if (ventas[2][0] > ventas[3][0] && ventas[2][0] > ventas[1][0]) {
			sucursal = "Sevilla";
		}else {
			sucursal = "Granada";
		}
		return sucursal;
	}
}
