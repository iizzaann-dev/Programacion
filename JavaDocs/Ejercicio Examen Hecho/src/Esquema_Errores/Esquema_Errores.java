package Esquema_Errores;

public class Esquema_Errores {

	public static void main(String[] args) {
		/*
						        Throwable
						            |
						---------------------------------
						|                               |
						Error                         Exception
						|                               |
						AssertionError            -------------------------
						               |                       |
						        RuntimeException            IOException
						               |                       |
						---------------------------------        EOFException
						|               |               |
						ArithmeticException  NullPointerException  (otras RuntimeException)
						
						
						
						Hay que tener en cuenta este error tambien: 
						InputMismatchException
						
						
						
						
						Bucle que siempre funciona: 
						
						Scanner teclado = new Scanner(System.in);
				        int numero = 0;
				        boolean correcto = false;
				
				        while (!correcto) {
				            try {
				                System.out.print("Introduce un número entero: ");
				                numero = teclado.nextInt();
				                correcto = true; // si llega aquí, todo está bien
				            } catch (InputMismatchException e) {
				                System.out.println("Error: debes introducir un número válido");
				                Teclado.nextLine(); // limpiar el buffer
				            }
				        }
*/


	}

}
