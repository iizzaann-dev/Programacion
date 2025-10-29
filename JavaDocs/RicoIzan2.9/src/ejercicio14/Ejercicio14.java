/* Descripción:
 * Programa que solicita una cantidad de euros (múltiplo de 5) y calcula la distribución mínima 
 * de billetes de 500, 200, 100, 50, 20, 10 y 5 euros para esa cantidad.
 * Autor: Cristian González Mateo
 * Fecha: 18/10/25
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
    	
    	int billetes500, billetes200, billetes100, billetes50, billetes20, billetes10, billetes5; // Variables para cada tipo de billete
        Scanner scanner = new Scanner(System.in); // Scanner para leer la cantidad introducida

        System.out.print("Introduce una cantidad de euros (múltiplo de 5): ");
        int cantidad = scanner.nextInt(); // Cantidad introducida por el usuario

        System.out.println("Distribución de billetes:");

        // Calcula billetes de 500
        billetes500 = cantidad / 500;
        cantidad %= 500;
        if (billetes500 > 0) {
            System.out.println(billetes500 + " billetes de 500 €");
        }

        // Calcula billetes de 200
        billetes200 = cantidad / 200;
        cantidad %= 200;
        if (billetes200 > 0) {
            System.out.println(billetes200 + " billetes de 200 €");
        }

        // Calcula billetes de 100
        billetes100 = cantidad / 100;
        cantidad %= 100;
        if (billetes100 > 0) {
            System.out.println(billetes100 + " billetes de 100 €");
        }

        // Calcula billetes de 50
        billetes50 = cantidad / 50;
        cantidad %= 50;
        if (billetes50 > 0) {
            System.out.println(billetes50 + " billetes de 50 €");
        }

        // Calcula billetes de 20
        billetes20 = cantidad / 20;
        cantidad %= 20;
        if (billetes20 > 0) {
            System.out.println(billetes20 + " billetes de 20 €");
        }

        // Calcula billetes de 10
        billetes10 = cantidad / 10;
        cantidad %= 10;
        if (billetes10 > 0) {
            System.out.println(billetes10 + " billetes de 10 €");
        }

        // Calcula billetes de 5
        billetes5 = cantidad / 5;
        cantidad %= 5;
        if (billetes5 > 0) {
            System.out.println(billetes5 + " billetes de 5 €");
        }

    }
}
