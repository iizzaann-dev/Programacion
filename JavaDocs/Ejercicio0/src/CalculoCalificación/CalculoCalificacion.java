package CalculoCalificación;

import java.util.Scanner;

public class CalculoCalificacion {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 
		 int preguntasAcertadas;
		 int preguntasFalladas;
		 double valorFallos = 0.25;
		 double valorAciertos = 0.5;
		 double notaCuantitativa;
		 String notaCualitativa;
		 
		 System.out.println("Ingresa la cantidad de preguntas acertadas en tu examen: ");
		 preguntasAcertadas = teclado.nextInt();
		 System.out.println("Ingresa la cantidad de preguntas falladas en tu examen: ");
		 preguntasFalladas = teclado.nextInt();
		 
		 if (preguntasAcertadas + preguntasFalladas >20 ) {
			 System.out.println("Datos erróneos");
		 }
		 
		 else {
			 notaCuantitativa = ((valorAciertos * preguntasAcertadas) - (valorFallos * preguntasFalladas) );
			 
			 if (notaCuantitativa < 5) {
				 notaCualitativa = "Insuficiente";
			 }else if (notaCuantitativa < 6) {
				 notaCualitativa = "Suficiente";
			 }else if (notaCuantitativa < 7) {
				 notaCualitativa ="Bien";
			 }else if (notaCuantitativa < 9) {
				 notaCualitativa ="Notable";
			 }else  {
				 notaCualitativa = "Sobresaliente";
			 }
			 
			 System.out.println("Tu nota es: " + notaCuantitativa + ", es decir, tienes un " + notaCualitativa);
			 
			 };
			 
		 

	}
}