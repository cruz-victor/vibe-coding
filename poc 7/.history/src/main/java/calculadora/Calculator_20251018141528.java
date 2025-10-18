package calculadora;

/**
 * Main Calculator class for basic mathematical operations.
 */
public class Calculator {
    /**
     * Adds two integers.
     *
     * @param firstAddend The first number to add.
     * @param secondAddend The second number to add.
     * @return The sum of both numbers.
     */
    public int add(int firstAddend, int secondAddend) {
        return firstAddend + secondAddend;
    }

    /**
     * Subtracts two integers.
     *
     * @param minuend The number from which another number is subtracted.
     * @param subtrahend The number to subtract.
     * @return The difference between minuend and subtrahend.
     */
    public int subtract(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    /**
     * Multiplies two integers.
     *
     * @param firstFactor The first number to multiply.
     * @param secondFactor The second number to multiply.
     * @return The product of both numbers.
     */
    public int multiply(int firstFactor, int secondFactor) {
        return firstFactor * secondFactor;
    }

    /**
     * Divides two integers.
     *
     * @param dividend The number to be divided.
     * @param divisor The number by which the dividend is to be divided.
     * @return The result of the division.
     * @throws IllegalArgumentException if the divisor is zero.
     */
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return dividend / divisor;
    }
}
