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
    public int add(int primerSumando, int segundoSumando) {
        return primerSumando + segundoSumando;
    }

    /**
     * Resta dos números enteros.
     *
     * @param minuendo El número al que se le resta.
     * @param sustraendo El número que se resta.
     * @return La diferencia entre minuendo y sustraendo.
     */
    public int subtract(int minuendo, int sustraendo) {
        return minuendo - sustraendo;
    }

    /**
     * Multiplica dos números enteros.
     *
     * @param primerMultiplicando El primer número a multiplicar.
     * @param segundoMultiplicando El segundo número a multiplicar.
     * @return El producto de los dos números.
     */
    public int multiply(int primerMultiplicando, int segundoMultiplicando) {
        return primerMultiplicando * segundoMultiplicando;
    }

    /**
     * Divide dos números enteros.
     *
     * @param dividendo El número a dividir.
     * @param divisor El número por el cual se divide.
     * @return El resultado de la división.
     * @throws IllegalArgumentException si el divisor es cero.
     */
    public int divide(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return dividendo / divisor;
    }
}
