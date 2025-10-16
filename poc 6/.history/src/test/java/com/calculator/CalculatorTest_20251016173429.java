package com.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Calculator service following TDD approach
 */
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void shouldAddTwoNumbersCorrectly() {
        // Given
        double firstNumber = 5.0;
        double secondNumber = 3.0;
        
        // When
        double result = calculator.add(firstNumber, secondNumber);
        
        // Then
        assertEquals(8.0, result);
    }

    @Test
    void shouldAddThreeNumbersCorrectly() {
        // Given
        double firstNumber = 2.0;
        double secondNumber = 3.0;
        double thirdNumber = 5.0;
        
        // When
        double result = calculator.addThreeNumbers(firstNumber, secondNumber, thirdNumber);
        
        // Then
        assertEquals(10.0, result);
    }

    @Test
    void shouldSubtractTwoNumbersCorrectly() {
        // Given
        double firstNumber = 10.0;
        double secondNumber = 3.0;
        
        // When
        double result = calculator.subtract(firstNumber, secondNumber);
        
        // Then
        assertEquals(7.0, result);
    }

    @Test
    void shouldMultiplyTwoNumbersCorrectly() {
        // Given
        double firstNumber = 4.0;
        double secondNumber = 5.0;
        
        // When
        double result = calculator.multiply(firstNumber, secondNumber);
        
        // Then
        assertEquals(20.0, result);
    }

    @Test
    void shouldDivideTwoNumbersCorrectly() {
        // Given
        double firstNumber = 15.0;
        double secondNumber = 3.0;
        
        // When
        double result = calculator.divide(firstNumber, secondNumber);
        
        // Then
        assertEquals(5.0, result);
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        // Given
        double firstNumber = 10.0;
        double secondNumber = 0.0;
        
        // When & Then
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> calculator.divide(firstNumber, secondNumber)
        );
        
        assertEquals("Error: Cannot divide by zero", exception.getMessage());
    }

    @Test
    void shouldCalculatePowerCorrectly() {
        // Given
        double base = 2.0;
        double exponent = 3.0;
        
        // When
        double result = calculator.power(base, exponent);
        
        // Then
        assertEquals(8.0, result);
    }

    @Test
    void shouldAddThreeNumbersWithDecimals() {
        // Given
        double firstNumber = 1.5;
        double secondNumber = 2.7;
        double thirdNumber = 3.8;
        
        // When
        double result = calculator.addThreeNumbers(firstNumber, secondNumber, thirdNumber);
        
        // Then
        assertEquals(8.0, result);
    }

    @Test
    void shouldAddThreeNumbersWithNegatives() {
        // Given
        double firstNumber = -1.0;
        double secondNumber = 2.0;
        double thirdNumber = -3.0;
        
        // When
        double result = calculator.addThreeNumbers(firstNumber, secondNumber, thirdNumber);
        
        // Then
        assertEquals(-2.0, result);
    }
}
