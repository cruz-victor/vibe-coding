package calculadora;

/**
 * Clase principal Calculator para operaciones matemáticas básicas.
 */
public class Calculator {
    /**
     * Suma dos números enteros.
     *
     * @param primerSumando El primer número a sumar.
     * @param segundoSumando El segundo número a sumar.
     * @return La suma de los dos números.
     */
    public int add(int firstAddend, int secondAddend) {
        return firstAddend + secondAddend;
    }

    /**
     * Resta dos números enteros.
     *
     * @param minuend El número al que se le resta.
     * @param subtrahend El número que se resta.
     * @return La diferencia entre minuend y subtrahend.
     */
    public int subtract(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    /**
     * Multiplica dos números enteros.
     *
     * @param firstFactor El primer número a multiplicar.
     * @param secondFactor El segundo número a multiplicar.
     * @return El producto de los dos números.
     */
    public int multiply(int firstFactor, int secondFactor) {
        return firstFactor * secondFactor;
    }

    /**
     * Divide dos números enteros.
     *
     * @param dividend El número a dividir.
     * @param divisor El número por el cual se divide.
     * @return El resultado de la división.
     * @throws IllegalArgumentException si el divisor es cero.
     */
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return dividend / divisor;
    }
}
