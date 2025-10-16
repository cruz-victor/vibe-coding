package com.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Calculator class, TDD style.
 */
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    /**
     * Tests that two numbers are added correctly.
     */
    @Test
    void shouldAddTwoNumbersCorrectly() {
        double result = calculator.add(5.0, 3.0);
        assertEquals(8.0, result);
    }

    /**
     * Tests that three numbers are added correctly.
     */
    @Test
    void shouldAddThreeNumbersCorrectly() {
        double result = calculator.addThreeNumbers(2.0, 3.0, 5.0);
        assertEquals(10.0, result);
    }

    /**
     * Tests subtraction of two numbers.
     */
    @Test
    void shouldSubtractTwoNumbersCorrectly() {
        double result = calculator.subtract(10.0, 3.0);
        assertEquals(7.0, result);
    }

    /**
     * Tests multiplication of two numbers.
     */
    @Test
    void shouldMultiplyTwoNumbersCorrectly() {
        double result = calculator.multiply(4.0, 5.0);
        assertEquals(20.0, result);
    }

    /**
     * Tests division of two numbers.
     */
    @Test
    void shouldDivideTwoNumbersCorrectly() {
        double result = calculator.divide(15.0, 3.0);
        assertEquals(5.0, result);
    }

    /**
     * Tests division by zero throws exception.
     */
    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> calculator.divide(10.0, 0.0)
        );
        assertEquals("Error: Cannot divide by zero", exception.getMessage());
    }

    /**
     * Tests that power calculation is correct.
     */
    @Test
    void shouldCalculatePowerCorrectly() {
        double result = calculator.power(2.0, 3.0);
        assertEquals(8.0, result);
    }
}
