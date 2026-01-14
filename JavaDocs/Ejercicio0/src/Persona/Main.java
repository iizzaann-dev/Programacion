package Persona;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== PRUEBA 1: Constructor por defecto ===");
        Persona p1 = new Persona("12233445F", "Raquel", "González", "Díaz Ropero", LocalDate.of(2005, 5, 10), 55.4f, 1.62f, true, (byte) 2, LocalTime.of(20, 45));
        mostrarPersona(p1);

        System.out.println("\n=== PRUEBA 2: Constructor con 4 parámetros ===");
        Persona p2 = new Persona("12345678Z", "Carlos", "López", "Martín");
        mostrarPersona(p2);

        System.out.println("\n=== PRUEBA 3: Constructor completo ===");
        Persona p3 = new Persona("87654321X", "María", "Gómez", "Ruiz", LocalDate.of(2005, 5, 10), 55.4f, 1.62f, true, (byte) 2, LocalTime.of(20, 45));
        mostrarPersona(p3);
    }

    public static void mostrarPersona(Persona p) {
        System.out.println("DNI: " + p.getDni());
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Apellido1: " + p.getApellido1());
        System.out.println("Apellido2: " + p.getApellido2());
        System.out.println("Fecha nacimiento: " + p.getFechaNacimiento());
        System.out.println("Peso: " + p.getPeso());
        System.out.println("Altura: " + p.getAltura());
        System.out.println("Mayor de edad: " + p.isMayorEdad());
        System.out.println("Número de hermanos: " + p.getNumHermanos());
        System.out.println("Hora máxima centro: " + p.getHoraMaxAlumnoCentro());
    }
}
