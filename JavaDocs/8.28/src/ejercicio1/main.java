package ejercicio1;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        ArrayList<Atleta> lista = new ArrayList<>(30);

<<<<<<< HEAD
        for (int contador = 0; contador <= 30; contador++) {
        String nombre = "atleta" + contador;

        Atleta atleta = null; 

        while (atleta == null) {
            int edad = (int) (Math.random() * 70);
            double altura = 1.50 + Math.random() * 0.50;

            try {
                atleta = new Atleta(nombre, edad, altura);
            } catch (IllegalArgumentException error1) {
                System.out.println("Error: " + error1.getMessage() + " - Reintentando...");
            }
        }

        lista.add(atleta);
        System.out.println(atleta);
        
=======
        int sumaEdades = 0;
        double sumaEstaturas = 0;
        int acumuladorMenores = 0, acumuladorMayores = 0;
        int mediaEdades = 0;
        double mediaEstaturas = 0;


        // Apartado A
        for (int i = 0; i < 30; i++){
            lista.add(generarAtleta());
        }

        for(Atleta i : lista){
            System.out.println("Se ha creado el atleta: " + i);
            sumaEdades += i.getEdad();
            sumaEstaturas += i.getAltura();
        }

        mediaEdades = sumaEdades / lista.size();
        mediaEstaturas = sumaEstaturas / lista.size();
        System.out.println("La media de las edades es: " + mediaEdades + " años");
        System.out.println("La media de las estaturas es: " + String.format("%.2fcm", mediaEstaturas));

        // Apartado B

        for (Atleta i : lista){
            if (i.getEdad() < 18){
                acumuladorMenores++;
            }else{
                acumuladorMayores++;
            }
        }

        System.out.printf("La cantidad de atletas menores de edad son: %d y la cantidad de atletas mayores de edad son : %d. \n", acumuladorMenores, acumuladorMayores);

        //Apartado C

        System.out.print("Los nombres de los atletas que tienen una estatura mayor a la media son: ");

        for (Atleta i : lista){
            if (i.getAltura() > mediaEstaturas){
                System.out.print(i.getNombre() + ", ");
            }
>>>>>>> 852d4c4c31bb43e16157231e2411d691c4f51263
        }
    }


    public static Atleta generarAtleta() {
        String nombres[] = {"Carlos", "David", "Daniel", "Iván", "José Manuel", "Pablo", "Joaquín"};
        int aleatorio = (int)(Math.random() * nombres.length);
        String nombre = nombres[aleatorio];

        Atleta atleta = null;

        while (atleta == null) {
            int edad = 1 + (int) (Math.random() * 53); // edad entre 18 y 70
            double altura = 1.50 + Math.random() * 0.50; // altura entre 1.50 y 2.00

            try {
                atleta = new Atleta(nombre, edad, altura);
            } catch (IllegalArgumentException error1) {
                System.out.println("Error: " + error1.getMessage() + " - Reintentando...");
            }
        }

        return atleta;
    }
}