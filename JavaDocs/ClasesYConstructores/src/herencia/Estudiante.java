package herencia;

public class Estudiante extends Persona {

    String curso;

    // Constructor del hijo
    public Estudiante(String nombre, int edad, String curso) {
        super(nombre, edad); // llama al constructor del padre
        this.curso = curso;
    }

    public void mostrarEstudiante() {
        mostrarInfo();
        System.out.println("Curso: " + curso);
    }
}