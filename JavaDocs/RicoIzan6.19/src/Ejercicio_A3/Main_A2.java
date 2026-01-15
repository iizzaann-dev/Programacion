package Ejercicio_A3;

public class Main_A2 {

	public static void main(String[] args) {
		
		Rectangulo rec1 = new Rectangulo ();
		Rectangulo rec2 = new Rectangulo ();
		
		rec1.x1 = 0; 
		rec1.y1 = 0;
		rec1.x2 = 5; 
		rec1.y2 = 5;
		
		rec2.x1 = 7; 
		rec2.y1 = 9;
		rec2.x2 = 2; 
		rec2.y2 = 3;
		
		double perimetro1 = Perimetro(rec1.x1, rec1.y1, rec1.x2, rec1.y2);
		double perimetro2 = Perimetro(rec2.x1, rec2.y1, rec2.x2, rec2.y2);
		
		double area1 = Area(rec1.x1, rec1.y1, rec1.x2, rec1.y2);
		double area2 = Area(rec2.x1, rec2.y1, rec2.x2, rec2.y2);
		
		System.out.printf("El perímetro del rectangulo 1 es: %.1f y el área es: %.1f. \n", perimetro1, area1);
		System.out.printf("El perímetro del rectangulo 2 es: %.1f y el área es: %.1f. \n", perimetro2, area2);
		
	}

	public static double Perimetro(int x1, int y1, int x2, int y2) {
		
		double perimetro = 0; 
		double base = x1 - x2, altura = y1 - y2; 
		
		perimetro = Math.abs(2 * (base + altura));
		
		return perimetro;
	}
	
	public static double Area(int x1, int y1, int x2, int y2) {
		
		double area = 0; 
		double base = x1 - x2, altura = y1 - y2;
		
		area = Math.abs(base * altura);
		
		return area;
	}
}
