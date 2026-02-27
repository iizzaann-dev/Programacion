package Excepciones;

// Excepción CHECKED (obliga a try/catch o throws)
public class Excepciones_checked extends Exception {

    public Excepciones_checked(String mensaje) {
        super(mensaje);
    }
}