package Matricula;

public class GeneradorMatriculasSecuencial {
    private static final String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int indiceLetra1 = 0;
    private int indiceLetra2 = 0;
    private int indiceLetra3 = 0;
    private int numero = 0;

    /**
     * Genera la siguiente matrícula de manera secuencial siguiendo
     * el formato LLLNNNN.
     */
    public String generarMatricula() {
        // Construir matrícula con letras actuales
        String matricula = "" 
            + LETRAS.charAt(indiceLetra1)
            + LETRAS.charAt(indiceLetra2)
            + LETRAS.charAt(indiceLetra3)
            + String.format("%04d", numero);

        // Actualizar números y letras para la siguiente matrícula
        numero++;
        if (numero > 9999) {
            numero = 0;
            indiceLetra3++;
            if (indiceLetra3 >= LETRAS.length()) {
                indiceLetra3 = 0;
                indiceLetra2++;
                if (indiceLetra2 >= LETRAS.length()) {
                    indiceLetra2 = 0;
                    indiceLetra1++;
                    if (indiceLetra1 >= LETRAS.length()) {
                        // Se han agotado todas las combinaciones posibles
                        throw new RuntimeException("Se han generado todas las matrículas disponibles.");
                    }
                }
            }
        }

        return matricula;
    }

    // Método principal de prueba
    public static void main(String[] args) {
        GeneradorMatriculasSecuencial generador = new GeneradorMatriculasSecuencial();

        // Generar y mostrar 10 matrículas de ejemplo
        for (int i = 0; i < 10; i++) {
            System.out.println("Matrícula generada: " + generador.generarMatricula());
        }
    }
}
