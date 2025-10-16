package com.calculator;

import org.springframework.stereotype.Service;

/**
 * Calculator service that provides basic mathematical operations
 * Follows Spring Boot architecture and clean code principles
 */
@Service
public class Calculator {

    /**
     * Adds two numbers
     * @param firstNumber First number to add
     * @param secondNumber Second number to add
     * @return The sum of the two numbers
     */
    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * Adds three numbers
     * @param firstNumber First number to add
     * @param secondNumber Second number to add
     * @param thirdNumber Third number to add
     * @return The sum of the three numbers
     */
    public double addThreeNumbers(double firstNumber, double secondNumber, double thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    /**
     * Subtracts second number from first number
     * @param firstNumber Number to subtract from (minuend)
     * @param secondNumber Number to subtract (subtrahend)
     * @return The difference of the two numbers
     */
    public double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    /**
     * Multiplies two numbers
     * @param firstNumber First number to multiply
     * @param secondNumber Second number to multiply
     * @return The product of the two numbers
     */
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    /**
     * Divides first number by second number
     * @param firstNumber Number to divide (dividend)
     * @param secondNumber Number to divide by (divisor)
     * @return The quotient of the division
     * @throws IllegalArgumentException if divisor is zero
     */
    public double divide(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Error: Cannot divide by zero");
        }
        return firstNumber / secondNumber;
    }

    /**
     * Calculates the power of a number
     * @param base Base number
     * @param exponent Exponent to raise the base to
     * @return The result of base raised to the power of exponent
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
