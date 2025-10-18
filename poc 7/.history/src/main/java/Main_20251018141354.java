package calculadora;

/**
 * Example Main class that uses the Calculator class.
 */
public class Main {
    /**
     * Main method to run an example from the console.
     *
     * @param args Arguments passed from the console.
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(4, 5);
        System.out.println("Result of 4 + 5: " + result);
    }
}
