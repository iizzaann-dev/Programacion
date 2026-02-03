package Cancion;

public class PrincipalCancion {

    public static void main(String[] args) {

        Cancion c1 = new Cancion("", "");

        Cancion c2 = new Cancion();

        c2.ponTitulo("Bohemian Rhapsody");
        c2.ponTitulo("");

        Cancion c3 = new Cancion(c2);

        Cancion referencia = c3;

        referencia.ponAutor("Queen");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
