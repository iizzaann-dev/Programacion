package uniDimensional;

public class EjemploArrayUnidimensional {
    public static void main(String[] args) {
        // Paso 1: Crear un array unidimensional con datos predefinidos
        int[] numeros = {10, 20, 30, 40, 50};

        // Paso 2: Acceder y mostrar elementos del array
        System.out.println("Primer elemento del array: " + numeros[0]);  // Accede al número 10
        System.out.println("Segundo elemento del array: " + numeros[1]); // Accede al número 20
        System.out.println("Último elemento del array: " + numeros[4]);  // Accede al número 50

        // Acceder al tercer elemento
        int tercerElemento = numeros[2];  // Accede al número 30
        System.out.println("Tercer elemento del array: " + tercerElemento);  // Imprime 30
    }
}

