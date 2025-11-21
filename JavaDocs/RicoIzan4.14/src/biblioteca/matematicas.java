package biblioteca;

public class matematicas {

	public static double multiplica(double a, double b) {		//Multiplicacion de dos numeros
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
	
	public static int dimeSigno (int a) {				//Detectar el signo de un numero
		
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
	
	public static double millas_a_kilometros (int millas) {		//De millas a kilometros
		double kilometros = 1.60934;
		
		return millas * kilometros; 
	}
	
/*-----------------------------------------------------------------------------------------------------*/

	public static double precioConIva (double precio) {				//Precio de un producto añadiendole el 21 por ciento de IVA
		
		//Suponemos que el IVA es de 21%
		
		double resultado = precio + (precio * 0.21);
		
		return resultado;
	}
	
/*-----------------------------------------------------------------------------------------------------*/
	
	public static double perimetro (double ancho, double alto) {	//Perimetro de un rectangulo
		return 2 * (ancho + alto);
	}
	
/*-----------------------------------------------------------------------------------------------------*/
	
	public static double area (double ancho, double alto) {		//Area de un rectangulo
		return ancho * alto;
	}
	
/*-----------------------------------------------------------------------------------------------------*/

	public static double intermedio1aN (int n) {				//Intermedio entre dos numeros
		return (n / (double)(2));
	}
	
/*-----------------------------------------------------------------------------------------------------*/

	public static double suma1aN (int n) {						//Sumatorio de un numero
		double sumatorio = 0;
		
		for (int contador = 0; contador <= n; contador++) {
			sumatorio = sumatorio + contador;
		}
		return sumatorio;
	}
	
/*-----------------------------------------------------------------------------------------------------*/

	
	public static double producto1aN (int n) {					//Productorio de un numero
		double productorio = 1;
		
		for (int contador = 1; contador <= n; contador++) {
			productorio = productorio * contador;
		}
		return productorio;
	}
/*-----------------------------------------------------------------------------------------------------*/
	
	public static boolean comprobacionFecha (int dia, int mes, int anio) {			//Mirar si la fecha introducida es correcta
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
	
	public static void tablaMultiplicar (int n) {				//Tabla de multiplicar del numero introducido
		int multiplicacion;
		multiplicacion = 0;
		
		for(int contador = 0; contador <= 10; contador++) {
			multiplicacion = n * contador;
			System.out.print(multiplicacion + " ");
		}
		
	}
	
/*-----------------------------------------------------------------------------------------------------*/
	
	public static double kilometros_a_millas (double kilometros) {				//Pasar de kilometros a millas
		double millas = 1.60934;
		
		return kilometros / millas; 
	}
	
/*-----------------------------------------------------------------------------------------------------*/
	
	public static double averiguarDescuento (double sin_desc, double con_desc) {				//Averigua el descuento en porcentaje
		
		return 100 * ((sin_desc - con_desc)/sin_desc);
	}

	
/*-----------------------------------------------------------------------------------------------------*/
	
	
	public static int sumaValoresArray (int vector[]) {											//Suma todos los valores de un array
			
		int suma = 0;
		
		for (int contador = 0; contador < vector.length; contador++) {
			suma = suma + vector[contador];
			
		}
		return suma;
	}
	
/*-----------------------------------------------------------------------------------------------------*/
	
	public static double mediaValoresArray (int vector [], int acumulador) {					//Hace una media de todos los valores de un array
		
		return (double)sumaValoresArray(vector) / acumulador; 
	}
	
/*-----------------------------------------------------------------------------------------------------*/
	
	public static void vectorConAleatorios (int vector[]) {
		
		for (int contador = 0; contador < vector.length; contador++) {
			vector[contador] = (int)Math.random();
			System.out.println(vector[contador]);

		}
	}
	
/*-----------------------------------------------------------------------------------------------------*/

	public static void verificadorPrimo (int num) {
		
		boolean comprobacion = false;
		
		
		do {
			// for (int contador = 2; contador <= num; contador++) { 
				
			while (num % )
				if (num % contador == 1) {
					comprobacion = true;
					System.out.println("El numero " + num + " es primo.");

				}else {
					comprobacion = false;
					System.out.println("El numero " + num + " no es primo.");
				}
			//}
		}while (comprobacion == false);
		
		
	}
}


	