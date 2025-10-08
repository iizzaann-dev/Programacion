package estructuraSi;

import java.util.Scanner;

public class SentenciaSwitch {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime la nota: ");
		int nota = teclado.nextInt();
		
		String notaTexto;
		
		switch (nota) {
			case 0,1,2,3,4:{
				notaTexto = "Insuficiente";
				break;
			}
			case 5:{
				notaTexto = "Suficiente";
				break;
			}
			case 6:{
				notaTexto = "Bien";
				break;
			}
			case 7,8:{
				notaTexto = "Notable";
				break;
			}
			case 9,10:{
				notaTexto = "Sobresaliente";
				break;
			}
			default:{
				notaTexto = "Valor no válido";
			}
		}
		if (notaTexto.equals("Valor no válido")) {
			System.out.println("Valor erróneo.");
		}else {
				System.out.println("La nota es: " + notaTexto);
			}
		
		
	}	

}
