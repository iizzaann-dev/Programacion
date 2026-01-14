
package Ejercicio_A1;

public class Main_A1 {

	public static void main(String[] args) {
		
		Punto punto1 = new Punto();
		System.out.println("(" + punto1.x + ", " + punto1.y + ")");
		punto1.x = 4;
		punto1.y = 8;
		System.out.println("(" + punto1.x + ", " + punto1.y + ")");

		Punto punto2 = new Punto();
		System.out.println("(" + punto2.x + ", " + punto2.y + ")");
		punto2.x = 5;
		punto2.y = 10;
		System.out.println("(" + punto2.x + ", " + punto2.y + ")");
		
		Punto punto3 = new Punto();
		System.out.println("(" + punto3.x + ", " + punto3.y + ")");
		punto3.x = 18;
		punto3.y = 32;
		System.out.println("(" + punto3.x + ", " + punto3.y + ")");
		
		Punto punto4 = punto1;
		
	}

}
