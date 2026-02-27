package Excepciones;

// Excepción UNCHECKED (NO obliga a try/catch)
class Excepciones_unchecked extends RuntimeException {

    public Excepciones_unchecked(String mensaje) {
        super(mensaje);
    }
}
