package biblioteca;

public class matematicas {

	public static double multiplica(double a, double b) {
		return a * b;
	}
	
/*-----------------------------------------------------------------------------------------------------*/
	
	public static boolean esMayorEdad(int a) {	//Realizamos un método en el que verificamos si es mayor o menor de edad
			
			boolean verdad = false;
			if (a >= 18) {
				verdad = true;
			}else {
				verdad = false;
			}
			return verdad;
		}
	
/*-----------------------------------------------------------------------------------------------------*/
	
	public static int minimo(int a, int b) {    //Usamos un metodo para calcular el minimo
		int min = 0;
		
		if (a > b) {
			min = b;
			
		}else {
			min = a;
		}
		return min;
	}
	
/*-----------------------------------------------------------------------------------------------------*/
	
	public static int maximo(int a, int b) {    //Usamos un metodo para calcular el maximo
		int max = 0;
		
		if (a > b) {
			max = a;
			
		}else {
			max = b;
		}
		return max;
	}
	
/*-----------------------------------------------------------------------------------------------------*/
	
	public static int dimeSigno (int a) {
		
		int respuesta = 0; 
		
		if (a == 0) {
			respuesta = 0;
		}else if (a > 0){
			respuesta = 1;
		}else {
			respuesta = -1;
		}
		return respuesta;
	}
	
/*-----------------------------------------------------------------------------------------------------*/
	
	public static double millas_a_kilometros (int millas) {
		double kilometros = 1.60934;
		
		return millas * kilometros; 
	}
	
/*-----------------------------------------------------------------------------------------------------*/

	public static double precioConIva (double precio) {
		
		//Suponemos que el IVA es de 21%
		
		double resultado = precio + (precio * 0.21);
		
		return resultado;
	}
	
/*-----------------------------------------------------------------------------------------------------*/
	
	public static double perimetro (double ancho, double alto) {
		return 2 * (ancho + alto);
	}
	
/*-----------------------------------------------------------------------------------------------------*/
	
	public static double area (double ancho, double alto) {
		return ancho * alto;
	}
	
/*-----------------------------------------------------------------------------------------------------*/

	public static double intermedio1aN (int n) {
		return (n / (double)(2));
	}
	
/*-----------------------------------------------------------------------------------------------------*/

	public static double suma1aN (int n) {
		double sumatorio = 0;
		
		for (int contador = 0; contador <= n; contador++) {
			sumatorio = sumatorio + contador;
		}
		return sumatorio;
	}
	
/*-----------------------------------------------------------------------------------------------------*/

	
	public static double producto1aN (int n) {
		double productorio = 1;
		
		for (int contador = 1; contador <= n; contador++) {
			productorio = productorio * contador;
		}
		return productorio;
	}
/*-----------------------------------------------------------------------------------------------------*/
	
	public static boolean comprobacionFecha (int dia, int mes, int anio) {
		boolean veridico = false;
		
		if (anio < 0) {
			veridico = false;
			
		}else if (mes < 0 || mes > 12) {
			veridico = false;
		}else if (dia == 30 && mes != 4 && mes != 6 && mes != 9 && mes != 11) {
			veridico = false;
		}else if (dia < 0 || dia > 31) {
			veridico = false;
		}else if (dia > 28 && mes != 2) {
			veridico = false;
		}else {
			veridico = true;
		}

		return veridico;
	}
	
/*-----------------------------------------------------------------------------------------------------*/
	
	public static void tablaMultiplicar (int n) {
		int multiplicacion;
		multiplicacion = 0;
		
		for(int contador = 0; contador <= 10; contador++) {
			multiplicacion = n * contador;
			System.out.print(multiplicacion + " ");
		}
		
	}
	
/*-----------------------------------------------------------------------------------------------------*/
	
	public static double kilometros_a_millas (double kilometros) {
		double millas = 1.60934;
		
		return kilometros / millas; 
	}
}


	