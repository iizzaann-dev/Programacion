package matrices;

public class AccesoArrayBidimensional {
    public static void main(String[] args) {
        // Array bidimensional con datos predefinidos
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Acceder a varios elementos
        int valor1 = matriz[0][0];  // Fila 0, Columna 0
        int valor2 = matriz[1][2];  // Fila 1, Columna 2
        int valor3 = matriz[2][1];  // Fila 2, Columna 1

        // Imprimir los valores accedidos
        System.out.println("Elemento en [0][0]: " + valor1); // Imprime 1
        System.out.println("Elemento en [1][2]: " + valor2); // Imprime 6
        System.out.println("Elemento en [2][1]: " + valor3); // Imprime 8
    }
}

