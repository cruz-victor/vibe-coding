package calculadora;

/**
 * Clase Main de ejemplo que utiliza la clase Calculator.
 */
public class Main {
    /**
     * Método principal para ejecutar un ejemplo en consola.
     *
     * @param args Argumentos pasados desde la consola.
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(4, 5);
        System.out.println("Result of 4 + 5: " + result);
    }
}
