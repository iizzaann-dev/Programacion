package Rico2;

import java.util.LinkedList;
import Rico2.Empleado;

public class coleccion_de_empleados {

	public static void main(String[] args) {
		
		LinkedList<Empleado> lista1 = new LinkedList<> ();
		int contador = 0;
		System.out.println("Apartado 1");
		
		Empleado empleado1 = new Empleado(generarAleatorio());
		Empleado empleado2 = new Empleado();
		Empleado empleado3 = new Empleado();
		Empleado empleado4 = new Empleado();
		Empleado empleado5 = new Empleado();
		Empleado empleado6 = new Empleado();
		Empleado empleado7 = new Empleado();
		Empleado empleado8 = new Empleado();
		Empleado empleado9 = new Empleado();
		Empleado empleado10 = new Empleado();
		
		empleado1.generarAleatorio();
		empleado2.generarAleatorio();
		empleado3.generarAleatorio();
		empleado4.generarAleatorio();
		empleado5.generarAleatorio();
		empleado6.generarAleatorio();
		empleado7.generarAleatorio();
		empleado8.generarAleatorio();
		empleado9.generarAleatorio();
		empleado10.generarAleatorio();
		
		lista1.add(empleado1);
		lista1.add(empleado2);
		lista1.add(empleado3);
		lista1.add(empleado4);
		lista1.add(empleado5);
		lista1.add(empleado6);
		lista1.add(empleado7);
		lista1.add(empleado8);
		lista1.add(empleado9);
		lista1.add(empleado10);
	
		System.out.println(lista1);

		System.out.println("El tamaño de la lista es: " + lista1.size());

		
		
	}

}
