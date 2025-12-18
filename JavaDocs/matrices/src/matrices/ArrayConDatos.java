package matrices;

public class ArrayConDatos {
    public static void main(String[] args) {
        // Paso 1: Crear e inicializar el array bidimensional con valores predefinidos
        int[][] matriz = {
            {1, 2, 3},       // Fila 0
            {4, 5, 6},       // Fila 1
            {7, 8, 9}        // Fila 2
        };

        // Paso 2: Imprimir los valores de la matriz
        System.out.println("Matriz con datos predefinidos:");
        for (int i = 0; i < matriz.length; i++) { // Iterar por filas
            for (int j = 0; j < matriz[i].length; j++) { // Iterar por columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}
