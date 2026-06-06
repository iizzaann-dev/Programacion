package calculadora;


/**
 * Clase Calculadora
 * @author Izan Rico Blanco
 * @version 1.0
 * Clase que implementa operaciones básicas de una calculadora.
 * Incluye las siguientes operaciones: suma, resta, multiplicación y división de enteros.
 */
public class Calculadora {

	
	/**
	 * Suma dos números enteros.
	 *
	 * @param a primer número
	 * @param b segundo número
	 * @return resultado de la suma
	 */

	public int sumar(int a, int b) {
        return a + b;
    }

	/**
	 * Resta dos números enteros.
	 *
	 * @param a primer número
	 * @param b segundo número
	 * @return resultado de la resta
	 */
	
	public int restar(int a, int b) {
		return a - b;
    }
	
	/**
	 * Multiplica dos números enteros.
	 *
	 * @param a primer número
	 * @param b segundo número
	 * @return resultado de la multiplicación
	 */

    public int multiplicar(int a, int b) {
        return a * b;
    }

    
    /**
     * Divide dos números enteros.
     *
     * @param a dividendo
     * @param b divisor
     * @return resultado de la división
     * @throws ArithmeticException si el divisor es 0
     */

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}