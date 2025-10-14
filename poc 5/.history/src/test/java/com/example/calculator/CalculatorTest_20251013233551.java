package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
