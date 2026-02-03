package Cancion;

public class Cancion {

    private String titulo;
    private String autor;

    public Cancion(String titulo, String autor) {
        this.titulo = validarCadena(titulo);
        this.autor = validarCadena(autor);
    }

    public Cancion() {
        this("Sin título", "Sin autor");
    }

    public Cancion(Cancion otra) {
        this(otra.titulo, otra.autor);
    }

    public String dameTitulo() {
        return titulo;
    }

    public String dameAutor() {
        return autor;
    }

    public void ponTitulo(String titulo) {
        this.titulo = validarCadena(titulo);
    }

    public void ponAutor(String autor) {
        this.autor = validarCadena(autor);
    }

    private String validarCadena(String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            return "No definido";
        }
        return valor;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | Autor: " + autor;
    }
}
