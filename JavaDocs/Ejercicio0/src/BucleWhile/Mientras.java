package BucleWhile;

import java.util.Scanner;

public class Mientras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, suma = 0;
		int contador = 0;
		//suma = num;
		
		System.out.println("Por favor, ingresa un número: ");
		num = teclado.nextInt();
		
		while (num!= 0) {						
			suma = suma + num;					
			contador = contador + 1;
			if (contador == 8){
				break;
			}else {
				num = teclado.nextInt();
			};
			
		}
		System.out.println("El valor total de la suma es: " + suma);
		
	}

}



/*También se puede hacer con un 
while (num !=0 && contador <= 0){
System.out.println("Dame un número:");
num = teclado.nextInt();
contador = contador + 1;
suma = suma + num;
} */