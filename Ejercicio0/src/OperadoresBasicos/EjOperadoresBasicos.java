package OperadoresBasicos;

public class EjOperadoresBasicos {

	public static void main(String[] args) {
		int dato1;
		double dato2;
		int dato3;
		
		dato1 = 5;
		dato2= 4;
		dato3= 4;
		
		double suma;
		suma = dato1+dato2;
		System.out.println("La suma es: " + suma);
		
		double resta;
		resta = dato1 - dato2;
		System.out.println("La resta es: " + resta);
		
		double multiplicacion;
		multiplicacion = dato1*dato2;
		System.out.println("La multiplicación es: " + multiplicacion);
		
		double division;
		division = dato1/dato2;
		System.out.println("La división es: " + division);
		
		int resto;
		resto = dato1%dato3;
		System.out.println("El resto de la división es: " + resto);
		
		int dato1mas, dato1menos;
		dato1mas = dato1++; //dato1mas = dato1 + 1
		dato1menos = dato1--; //dato1menos = dato1 - 1
		System.out.println(dato1mas);
		System.out.println(dato1menos);
		System.out.println("Incremental posterior: " + ++dato1); //<-----------------------|
		                                                         //                        |Esto es 
		dato1 = dato1 + 1;                                      //                         |lo mismo
		System.out.println("Incremental posterior: " + dato1); //<-------------------------|
		
		boolean distinto = dato1!=dato3;
		System.out.println(distinto);

	}

}
