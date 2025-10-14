package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator Tests")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Should add two positive integers")
    void shouldAddTwoPositiveIntegers() {
        // Given
        double firstNumber = 5.0;
        double secondNumber = 3.0;
        double expectedResult = 8.0;

        // When
        double actualResult = calculator.add(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should add two decimal numbers")
    void shouldAddTwoDecimalNumbers() {
        // Given
        double firstNumber = 2.5;
        double secondNumber = 3.7;
        double expectedResult = 6.2;

        // When
        double actualResult = calculator.add(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should add two negative numbers")
    void shouldAddTwoNegativeNumbers() {
        // Given
        double firstNumber = -5.0;
        double secondNumber = -3.0;
        double expectedResult = -8.0;

        // When
        double actualResult = calculator.add(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should add numbers with different signs")
    void shouldAddNumbersWithDifferentSigns() {
        // Given
        double firstNumber = 5.0;
        double secondNumber = -3.0;
        double expectedResult = 2.0;

        // When
        double actualResult = calculator.add(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should add numbers with same signs")
    void shouldAddNumbersWithSameSigns() {
        // Given
        double firstNumber = -4.0;
        double secondNumber = -2.0;
        double expectedResult = -6.0;

        // When
        double actualResult = calculator.add(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    // SUBTRACTION TESTS
    @Test
    @DisplayName("Should subtract two positive integers")
    void shouldSubtractTwoPositiveIntegers() {
        // Given
        double firstNumber = 8.0;
        double secondNumber = 3.0;
        double expectedResult = 5.0;

        // When
        double actualResult = calculator.subtract(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should subtract two decimal numbers")
    void shouldSubtractTwoDecimalNumbers() {
        // Given
        double firstNumber = 6.2;
        double secondNumber = 3.7;
        double expectedResult = 2.5;

        // When
        double actualResult = calculator.subtract(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should subtract two negative numbers")
    void shouldSubtractTwoNegativeNumbers() {
        // Given
        double firstNumber = -5.0;
        double secondNumber = -3.0;
        double expectedResult = -2.0;

        // When
        double actualResult = calculator.subtract(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should subtract numbers with different signs")
    void shouldSubtractNumbersWithDifferentSigns() {
        // Given
        double firstNumber = 5.0;
        double secondNumber = -3.0;
        double expectedResult = 8.0;

        // When
        double actualResult = calculator.subtract(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should subtract numbers with same signs")
    void shouldSubtractNumbersWithSameSigns() {
        // Given
        double firstNumber = -4.0;
        double secondNumber = -2.0;
        double expectedResult = -2.0;

        // When
        double actualResult = calculator.subtract(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    // MULTIPLICATION TESTS
    @Test
    @DisplayName("Should multiply two positive integers")
    void shouldMultiplyTwoPositiveIntegers() {
        // Given
        double firstNumber = 4.0;
        double secondNumber = 3.0;
        double expectedResult = 12.0;

        // When
        double actualResult = calculator.multiply(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should multiply two decimal numbers")
    void shouldMultiplyTwoDecimalNumbers() {
        // Given
        double firstNumber = 2.5;
        double secondNumber = 3.2;
        double expectedResult = 8.0;

        // When
        double actualResult = calculator.multiply(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should multiply two negative numbers")
    void shouldMultiplyTwoNegativeNumbers() {
        // Given
        double firstNumber = -4.0;
        double secondNumber = -3.0;
        double expectedResult = 12.0;

        // When
        double actualResult = calculator.multiply(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should multiply numbers with different signs")
    void shouldMultiplyNumbersWithDifferentSigns() {
        // Given
        double firstNumber = 4.0;
        double secondNumber = -3.0;
        double expectedResult = -12.0;

        // When
        double actualResult = calculator.multiply(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should multiply numbers with same signs")
    void shouldMultiplyNumbersWithSameSigns() {
        // Given
        double firstNumber = -4.0;
        double secondNumber = -2.0;
        double expectedResult = 8.0;

        // When
        double actualResult = calculator.multiply(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    // DIVISION TESTS
    @Test
    @DisplayName("Should divide two positive integers")
    void shouldDivideTwoPositiveIntegers() {
        // Given
        double firstNumber = 12.0;
        double secondNumber = 3.0;
        double expectedResult = 4.0;

        // When
        double actualResult = calculator.divide(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should divide two decimal numbers")
    void shouldDivideTwoDecimalNumbers() {
        // Given
        double firstNumber = 8.0;
        double secondNumber = 2.5;
        double expectedResult = 3.2;

        // When
        double actualResult = calculator.divide(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should divide two negative numbers")
    void shouldDivideTwoNegativeNumbers() {
        // Given
        double firstNumber = -12.0;
        double secondNumber = -3.0;
        double expectedResult = 4.0;

        // When
        double actualResult = calculator.divide(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should divide numbers with different signs")
    void shouldDivideNumbersWithDifferentSigns() {
        // Given
        double firstNumber = 12.0;
        double secondNumber = -3.0;
        double expectedResult = -4.0;

        // When
        double actualResult = calculator.divide(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should divide numbers with same signs")
    void shouldDivideNumbersWithSameSigns() {
        // Given
        double firstNumber = -8.0;
        double secondNumber = -2.0;
        double expectedResult = 4.0;

        // When
        double actualResult = calculator.divide(firstNumber, secondNumber);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should throw exception when dividing by zero")
    void shouldThrowExceptionWhenDividingByZero() {
        // Given
        double firstNumber = 5.0;
        double secondNumber = 0.0;

        // When & Then
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(firstNumber, secondNumber);
        });
    }
}

