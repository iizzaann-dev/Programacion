package ejercicio1;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        ArrayList <Atleta> lista = new ArrayList<>();

        for (int contador = 0; contador <= 30; contador++){
            String nombre = "atleta" + contador;
            
            while (atleta == null) {
                int edad = (int) (Math.random() * 70);
                double altura = 1.50 + Math.random() * 0.50;
                Atleta atleta = null;

                try {
                    atleta = new Atleta(nombre, edad, altura);
                } catch (IllegalArgumentException error1) {
                    System.out.println("Error: " + error1.getMessage() + " - Reintentando...");
                }
            }

            
            lista.add(atleta);

            System.out.println(atleta);
        }
    }
    
}
