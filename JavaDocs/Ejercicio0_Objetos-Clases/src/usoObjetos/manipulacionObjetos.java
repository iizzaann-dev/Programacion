package usoObjetos;

import java.awt.Rectangle;

public class manipulacionObjetos {

	public static void main(String[] args) {
		
		Rectangle r1, r2;  //Declaracion de objeto
		
		r1 = new Rectangle();
		
		System.out.println(r1.toString());  //Instanciacion de un objeto
		
		r1.height = 10;
		System.out.println(r1.toString());
		
		
		
		r2 = r1;
		r2.x = 20;
		System.out.println("El contenido de r1 es: " + r1.toString());
		
		r1.setLocation(50, 50);
		r1.setSize(10, 10);
		System.out.println(r2.toString());
		
		double coordenadaX = r1.getX();
		System.out.println(coordenadaX);

		


		



	}

}
