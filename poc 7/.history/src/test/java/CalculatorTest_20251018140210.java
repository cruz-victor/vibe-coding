package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Calculator.
 */
public class CalculatorTest {
    /**
     * Verifica que el método add suma correctamente dos números positivos.
     */
    @Test
    public void shouldReturnSumOfTwoNumbers() {
        Calculator calculator = new Calculator();
        int resultado = calculator.add(2, 3);
        assertEquals(5, resultado, "La suma de 2 y 3 debe ser 5");
    }
}
