package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {

    // positivos
    @Test
    void testPositivos() {
        Rectangle r = new Rectangle(4, 5);
        assertEquals(20, r.surface());
        assertEquals(18, r.perimeter());
    }

    // negativos
    @Test
    void testNegativos() {
        Rectangle r = new Rectangle(-4, 5);
        assertEquals(-1, r.surface());
        assertEquals(-1, r.perimeter());
    }

    // ceros
    @Test
    void testCeros() {
        Rectangle r = new Rectangle(0, 5);
        assertEquals(0, r.surface());
        assertEquals(0, r.perimeter());
    }

    // aserciones erróneas (intencional)
    @Test
    void testFallosIntencionales() {
        Rectangle r = new Rectangle(4, 5);

        assertEquals(999, r.surface());
        assertEquals(999, r.perimeter());
    }
}