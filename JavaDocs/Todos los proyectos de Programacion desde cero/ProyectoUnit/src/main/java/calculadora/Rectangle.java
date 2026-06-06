package calculadora;


/**
 * Clase Rectangulo/Rectangle
 * @author Izan Rico Blanco
 * @version 1.0
 * Clase que representa un rectángulo y nos permite calcular su superficie y perímetro.
 * Incluye validaciones para los valores negativos y cero.
 */


public class Rectangle {
	
	private static final int FACTOR_PERIMETER = 2;
    private int base;
    private int altura;
    
    
    /**
     * Crea un rectángulo con una base y una altura especificados por el usuario.
     *
     * @param base base del rectángulo
     * @param altura altura del rectángulo
     */
    
    
    public Rectangle(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    private int checkValues(int base, int altura) {
        if (base < 0 || altura < 0) return -1;
        if (base == 0 || altura == 0) return 0;
        return 1; // Esto sería válido 
    }
    
    
    /**
     * Calcula la superficie del rectángulo.
     * Devuelve -1 si los valores son negativos, y 0 si alguno es cero.
     *
     * @return superficie del rectángulo
     */

    
    public int surface() {
        int check = checkValues(base, altura);

        if (check != 1) {
            return check;
        }

        return base * altura;
    }

    /**
     * Calcula el perímetro del rectángulo.
     * Devuelve -1 si los valores son negativos, y 0 si alguno es cero.
     *
     * @return perímetro del rectángulo
     */
    
    public int perimeter() {
    	int check = checkValues(base, altura);

        if (check != 1) {
            return check;
        }

        return FACTOR_PERIMETER * (base + altura);
    }
}