package Clase_Principal;

import java.time.LocalDate;
import java.util.Scanner;
import Clase_Padre.Coche;
import Clase_Hija.Deportivo;

public class Clase_Principal_Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Coche cocheValido = new Coche("Juan Pérez", null, LocalDate.of(2022, 5, 10), 4000, 165);
            System.out.println(cocheValido);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Coche cocheInvalido = new Coche("Ana López", null, LocalDate.of(2019, 3, 15), 300, 100);
            System.out.println(cocheInvalido);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Deportivo deportivo = obtenerDeportivo(sc);
        if (deportivo != null) {
            System.out.println(deportivo);
        }

    }

    public static Deportivo obtenerDeportivo(Scanner sc) {
        try {
            System.out.print("Ingrese nombre del propietario: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese fecha de matriculación (AAAA-MM-DD): ");
            LocalDate fecha = LocalDate.parse(sc.nextLine());

            System.out.print("Ingrese cilindrada: ");
            int cilindrada = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingrese potencia: ");
            int potencia = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingrese tracción (DELANTERA/TOTAL): ");
            String traccion = sc.nextLine();

            return new Deportivo(nombre, fecha, cilindrada, potencia, traccion);
        } catch (Exception e) {
            System.out.println("Error al crear el deportivo: " + e.getMessage());
            return null;
        }
    }
}
