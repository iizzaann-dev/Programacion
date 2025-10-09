package AprobadooSuspenso;

import java.util.Scanner;

public class AprobadooSuspenso {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Buenas, dime tu nota");
		
		int notaAlumno = teclado.nextInt();
		if(notaAlumno >= 0 && notaAlumno <=10){
			if(notaAlumno < 5) {
				System.out.println("El examen esta suspenso");
			}
			else {
				System.out.print("El examen esta aprobado");
			}
			
		}
		else {
			System.out.println("Error");
		}
			
				
		
	
		

	}

}
