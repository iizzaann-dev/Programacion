package Clase_Hija;

import java.time.LocalDate;
import Clase_Padre.Coche;

public class Deportivo extends Coche {

    public enum Traccion {
        DELANTERA,
        TOTAL
    }

    private final Traccion traccion;

    public Deportivo(String nombre_propietario, LocalDate fecha_matriculacion, int cilindrada, int potencia, String traccionStr) {
        super(nombre_propietario, null, fecha_matriculacion, cilindrada, potencia);

        if (traccionStr == null || traccionStr.isBlank()) {
            throw new IllegalArgumentException("Error: Debe indicar la tracción (DELANTERA o TOTAL).");
        }

        try {
            this.traccion = Traccion.valueOf(traccionStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Error: Tracción inválida. Debe ser DELANTERA o TOTAL.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Tracción: " + traccion + "]";
    }
}
