package Ejercicio1;

import libtarea3.Dado;

public class Ejercicio1 {

	public static void main(String[] args) {
			
		int aleatorio = (int)(Math.random() * 31) + 30;
		
		Dado dado1, dado2, dado3;
		try {
			dado1 = new Dado(6);
		} catch (IllegalArgumentException ex1) {
			System.out.println("El valor ingresado para la cantidad de caras posibles es incorrecto.");
			dado1 = new Dado(6);
		}
		
		try {
			dado2 = new Dado(6);
		} catch (IllegalArgumentException ex2) {
			System.out.println("El valor ingresado para la cantidad de caras posibles es incorrecto.");
			dado2 = new Dado(6);
		}
		
		try {
			dado3 = new Dado(6);
		} catch (IllegalArgumentException ex2) {
			System.out.println("El valor ingresado para la cantidad de caras posibles es incorrecto.");
			dado3 = new Dado(6);

		}
		//Hay que poner un try catch aqui porque si el usuario ingresa datos no admitidos salta un error
		
		System.out.printf("Número máximo de puntos: %d.\n\n", aleatorio);
		
		System.out.println("Dado1");
		String ganador = "", ganadorFinal = "";
		long sumaDado1 = 0; 
		long sumaDado2 = 0; 
		long sumaDado3 = 0;
		long sumaTotal;
		int ultimoLanzamiento1 = 0;
		int ultimoLanzamiento2 = 0; 
		int ultimoLanzamiento3 = 0;
		do {
			
			System.out.println("                 Dado1 Dado2 Dado3");
			System.out.printf("Lanzamiento nº%d :  %d    %d     %d \n \n",dado1.getNumeroLanzamientos() + 1, ultimoLanzamiento1 = dado1.lanzar(), ultimoLanzamiento2 = dado2.lanzar(), ultimoLanzamiento3 = dado3.lanzar());
			
			
			sumaDado1 = dado1.getSumaPuntuacionHistorica();
			sumaDado2 = dado2.getSumaPuntuacionHistorica();
			sumaDado3 = dado3.getSumaPuntuacionHistorica();
			
			
			sumaTotal = sumaDado1 + sumaDado2 + sumaDado3;
			
		}while (sumaTotal < aleatorio);		

		System.out.printf("Juego terminado. La suma total de los lanzamientos es: %d. \n\n", sumaTotal);
		
		int max1 = maximo(ultimoLanzamiento1, ultimoLanzamiento2);
		int maximo1 = maximo(max1, ultimoLanzamiento3);
		if (maximo1 == ultimoLanzamiento3) {
			ganador.equals("dado3");
		}else if (max1 == ultimoLanzamiento1) {
			ganador.equals("dado1");
		}else {
			ganador.equals("dado2");
		}
		
		if (ganador.equals("dado1")) {
			ganadorFinal = dado1.getSerieHistoricaLanzamientos();
		}else if (ganador.equals("dado2")) {
			ganadorFinal = dado2.getSerieHistoricaLanzamientos();
		}else {
			ganadorFinal = dado3.getSerieHistoricaLanzamientos();
		}
		long lanzamientosTotales = Dado.getNumeroLanzamientosGlobal(); 
		int carasTotales = Dado.getNumeroVecesCaraGlobal(maximo1);
		System.out.printf("El ganador es %s, con %d puntos en la última jugada.\n\n", ganador, maximo1);
		System.out.printf("El valor %d ha salido %d veces en todo el juego y se han realizado un total de %d lanzamientos. \n\n", maximo1, carasTotales, lanzamientosTotales);
		System.out.printf("Todos los lanzamientos del %s son: %s", ganador, ganadorFinal );
		
		

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
