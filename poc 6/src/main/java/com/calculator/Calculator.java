package com.calculator;

/**
 * Provides basic mathematical operations.
 */
public class Calculator {
    /**
     * Adds two numbers.
     * @param firstNumber First number to add.
     * @param secondNumber Second number to add.
     * @return Sum of both numbers.
     */
    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
    /**
     * Adds three numbers.
     * @param firstNumber First number to add.
     * @param secondNumber Second number to add.
     * @param thirdNumber Third number to add.
     * @return Sum of the three numbers.
     */
    public double addThreeNumbers(double firstNumber, double secondNumber, double thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }
    /**
     * Subtracts one number from another.
     * @param minuend Value to subtract from.
     * @param subtrahend Value to subtract.
     * @return Difference between minuend and subtrahend.
     */
    public double subtract(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }
    /**
     * Multiplies two numbers.
     * @param firstNumber First number to multiply.
     * @param secondNumber Second number to multiply.
     * @return Product of both numbers.
     */
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
    /**
     * Divides one number by another.
     * @param dividend Numerator.
     * @param divisor Denominator.
     * @return Result of the division.
     * @throws IllegalArgumentException If divisor is zero.
     */
    public double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Error: Cannot divide by zero");
        }
        return dividend / divisor;
    }
    /**
     * Raises base to the exponent.
     * @param base Base number.
     * @param exponent Exponent.
     * @return Result of base powered by exponent.
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
