package Ejercicio_B3;

public class Main_A3 {

	public static void main(String[] args) {
		
		Rectangulo rec1 = new Rectangulo (0, 0, 5, 5);
		Rectangulo rec2 = new Rectangulo (7, 9, 2, 3);
		
		
		double perimetro1 = Perimetro(rec1);
		double perimetro2 = Perimetro(rec2);
		
		double area1 = Area(rec1);
		double area2 = Area(rec2);
		
		System.out.printf("El perímetro del rectangulo 1 es: %.1f y el área es: %.1f. \n", perimetro1, area1);
		System.out.printf("El perímetro del rectangulo 2 es: %.1f y el área es: %.1f. \n", perimetro2, area2);
		
	}

	public static double Perimetro(Rectangulo rec) {
		
		double perimetro = 0; 
		double base = rec.x1  - rec.x2, altura = rec.y1 - rec.y2; 
		
		perimetro = Math.abs(2 * (base + altura));
		
		return perimetro;
	}
	
	public static double Area(Rectangulo rec) {
		
		double area = 0; 
		double base = rec.x1 - rec.x2, altura = rec.y1 - rec.y2;
		
		area = Math.abs(base * altura);
		
		return area;
	}
}
