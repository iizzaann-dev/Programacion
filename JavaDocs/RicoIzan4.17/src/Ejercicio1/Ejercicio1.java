package Ejercicio1;

import libtarea3.Dado;

public class Ejercicio1 {

	public static void main(String[] args) {
			
		int aleatorio = (int)(Math.random() * 31) + 30;
		
		Dado dado1, dado2, dado3;
		
		dado1 = new Dado(6);
		dado2 = new Dado(6);
		dado3 = new Dado(6);
		
		System.out.printf("Número máximo de puntos: %d.\n\n", aleatorio);
		
		System.out.println("Dado1");
		
		long sumaTotal;
		
		do {
			
			System.out.println("                 Dado1 Dado2 Dado3");
			System.out.printf("Lanzamiento nº%d :  %d    %d     %d \n \n",dado1.getNumeroLanzamientos() + 1, dado1.lanzar(), dado2.lanzar(),dado3.lanzar());
			
			
			long sumaDado1 = dado1.getSumaPuntuacionHistorica();
			long sumaDado2 = dado2.getSumaPuntuacionHistorica();
			long sumaDado3 = dado3.getSumaPuntuacionHistorica();
			
			
			sumaTotal = sumaDado1 + sumaDado2 + sumaDado3;
			
		}while (sumaTotal < aleatorio);		

		System.out.printf("Juego terminado. La suma total de los lanzamientos es: %d", sumaTotal);
		
		System.out.printf("El ganador es");
		

	}

	public static int maximo(int a, int b) {    //Usamos un metodo para calcular el maximo
		int max = 0;
		
		if (a > b) {
			max = a;
			
		}else {
			max = b;
		}
		return max;
	}
	
}
