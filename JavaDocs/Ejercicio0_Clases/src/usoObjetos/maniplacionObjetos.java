package usoObjetos;

import java.awt.Rectangle;

public class maniplacionObjetos {

	public static void main(String[] args) {
		
		Rectangle r1;  //Declaracion de objeto
		
		r1 = new Rectangle();
		
		System.out.println(r1.toString());  //Instanciacion de un objeto
		
		r1.height = 10;
		System.out.println(r1.toString());
		




	}

}
