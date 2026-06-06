package calculadora;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test terminado");
    }

    @Test
    void testSuma() {
        assertEquals(5, calculadora.sumar(2, 3));
    }

    @Test
    void testResta() {
        assertEquals(2, calculadora.restar(5, 3));
    }

    @Test
    void testMultiplicacion() {
        assertEquals(6, calculadora.multiplicar(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculadora.dividir(6, 3));
    }

    @Test
    void testDivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(5, 0);
        });
    }
}