package Matricula;

public class Main {

	public static void main(String[] args) {
        GeneradorMatriculasSecuencial generador = new GeneradorMatriculasSecuencial();

        // Generar y mostrar 20 matrículas consecutivas como ejemplo
        for (int i = 0; i < 20; i++) {
            System.out.println("Matrícula generada: " + generador.generarMatricula());
        }
        
        // Ejemplo adicional: Generar muchas matrículas hasta cierto límite
        /*
        try {
            for (int i = 0; i < 50000; i++) {
                System.out.println(generador.generarMatricula());
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        */
    }
}


