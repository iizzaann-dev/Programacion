package ClaseString;

public class ClaseString {

	public static void main(String[] args) {
		String texto = "Hola Mundo";

        // 1. length() — Longitud del texto
        int longitud = texto.length();
        System.out.println("Longitud: " + longitud);

        // 2. charAt(int index) — Carácter en una posición
        char letra = texto.charAt(1);
        System.out.println("Carácter en índice 1: " + letra);

        // 3. substring() — Extraer parte del texto
        System.out.println("Desde 3: " + texto.substring(3));
        System.out.println("De 0 a 4: " + texto.substring(0, 4));

        // 4. equals() — Comparar textos (sensible a mayúsculas)
        String a = "Java";
        String b = "java";
        System.out.println("¿Son iguales?: " + a.equals(b));

        // 5. equalsIgnoreCase() — Comparar sin distinguir mayúsculas/minúsculas
        System.out.println("¿Son iguales (ignorando mayúsculas)?: " + a.equalsIgnoreCase(b));

        // 6. toUpperCase() — Convertir a mayúsculas
        System.out.println("Mayúsculas: " + texto.toUpperCase());

        // 7. toLowerCase() — Convertir a minúsculas
        System.out.println("Minúsculas: " + texto.toLowerCase());

        // 8. contains() — Verifica si contiene una subcadena
        System.out.println("¿Contiene 'Mundo'?: " + texto.contains("Mundo"));

        // 9. replace() — Reemplaza texto
        System.out.println("Reemplazado: " + texto.replace("Mundo", "Java"));

	}

}
