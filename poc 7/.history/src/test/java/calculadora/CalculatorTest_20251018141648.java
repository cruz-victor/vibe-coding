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
        int result = calculator.add(2, 3);
        assertEquals(5, result, "La suma de 2 y 3 debe ser 5");
    }

    /**
     * Verifica que el método subtract resta correctamente dos números.
     */
    @Test
    public void shouldReturnDifferenceOfTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(7, 4);
        assertEquals(3, result, "La diferencia de 7 y 4 debe ser 3");
    }

    /**
     * Verifica que el método multiply multiplica correctamente dos números.
     */
    @Test
    public void shouldReturnProductOfTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(6, 5);
        assertEquals(30, result, "El producto de 6 y 5 debe ser 30");
    }

    /**
     * Verifica que el método divide realiza una división correcta.
     */
    @Test
    public void shouldReturnQuotientOfTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(20, 4);
        assertEquals(5, result, "El cociente de 20 y 4 debe ser 5");
    }

    /**
     * Verifica que dividir por cero lanza IllegalArgumentException.
     */
    @Test
    public void shouldThrowExceptionWhenDivideByZero() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }
}
