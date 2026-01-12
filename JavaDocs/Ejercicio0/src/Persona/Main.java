package Persona;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        
        // -------- Caso 1: Datos válidos --------
        try {
            Persona p1 = new Persona(
                "12345678Z",               // DNI válido
                "Juan",                    // Nombre
                "Pérez",                   // Apellido1
                "García",                  // Apellido2
                LocalDate.of(2000, 5, 10), // Fecha nacimiento válida
                (byte)70,                  // Peso
                (byte)175,                 // Altura
                true,                      // Mayor de edad
                (byte)2,                   // Número de hermanos
                (short)100,                // Número alumnos
                LocalTime.of(20, 0)        // Hora máxima alumno centro
            );
            System.out.println("Persona creada correctamente: " + p1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear Persona: " + e.getMessage());
        }
        
        // -------- Caso 2: DNI inválido --------
        try {
            Persona p2 = new Persona(
                "1234Z",                   // DNI inválido
                "Ana",
                "López",
                "Martínez",
                LocalDate.of(2010, 1, 1),
                (byte)60,
                (byte)160,
                false,
                (byte)1,
                (short)50,
                LocalTime.of(19, 0)
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Error esperado (DNI inválido): " + e.getMessage());
        }
        
        // -------- Caso 3: Fecha de nacimiento inválida --------
        try {
            Persona p3 = new Persona(
                "87654321X",
                "Luis",
                "Sánchez",
                "Gómez",
                LocalDate.of(1995, 6, 15), // Fecha anterior al 2000
                (byte)80,
                (byte)180,
                true,
                (byte)3,
                (short)200,
                LocalTime.of(21, 0)
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Error esperado (fecha inválida): " + e.getMessage());
        }
    }
}
