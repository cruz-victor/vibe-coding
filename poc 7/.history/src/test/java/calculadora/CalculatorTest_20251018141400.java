package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Calculator class.
 */
public class CalculatorTest {
    /**
     * Verifies that the add method correctly adds two positive numbers.
     */
    @Test
    public void shouldReturnSumOfTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result, "The sum of 2 and 3 should be 5");
    }

    /**
     * Verifies that the subtract method correctly subtracts two numbers.
     */
    @Test
    public void shouldReturnDifferenceOfTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(7, 4);
        assertEquals(3, result, "The difference between 7 and 4 should be 3");
    }

    /**
     * Verifies that the multiply method correctly multiplies two numbers.
     */
    @Test
    public void shouldReturnProductOfTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(6, 5);
        assertEquals(30, result, "The product of 6 and 5 should be 30");
    }

    /**
     * Verifies that the divide method performs correct division.
     */
    @Test
    public void shouldReturnQuotientOfTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(20, 4);
        assertEquals(5, result, "The quotient of 20 and 4 should be 5");
    }

    /**
     * Verifies that dividing by zero throws IllegalArgumentException.
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
