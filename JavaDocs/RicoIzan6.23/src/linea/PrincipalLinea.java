package linea;

public class PrincipalLinea {

    public static void main(String[] args) {

        Linea linea1 = new Linea();
        System.out.println("Línea 1 (constructor por defecto): " + linea1);

        linea1.moverDerecha(5);
        linea1.moverArriba(3);
        System.out.println("Línea 1 después de mover derecha y arriba: " + linea1);

        linea1.moverIzquierda(2);
        linea1.moverAbajo(1);
        System.out.println("Línea 1 después de mover izquierda y abajo: " + linea1);

        System.out.println("------------------------------------------------");

        Punto p1 = new Punto(1, 1);
        Punto p2 = new Punto(4, 4);
        Linea linea2 = new Linea(p1, p2);

        System.out.println("Línea 2 (constructor con puntos): " + linea2);

        linea2.moverDerecha(10);
        System.out.println("Línea 2 después de mover derecha: " + linea2);

        linea2.moverAbajo(5);
        System.out.println("Línea 2 después de mover abajo: " + linea2);

        System.out.println("------------------------------------------------");

        System.out.println("Punto A de línea 2: " + linea2.getPuntoA());
        System.out.println("Punto B de línea 2: " + linea2.getPuntoB());

        Punto nuevoPuntoA = new Punto(0, 0);
        Punto nuevoPuntoB = new Punto(2, 2);

        linea2.setPuntoA(nuevoPuntoA);
        linea2.setPuntoB(nuevoPuntoB);

        System.out.println("Línea 2 después de usar setters: " + linea2);

        System.out.println("Mostrar línea 2 con mostrarLinea(): " + linea2.mostrarLinea());
    }
}
