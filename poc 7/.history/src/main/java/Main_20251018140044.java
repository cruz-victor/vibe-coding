package calculadora;

/**
 * Clase Main de ejemplo que utiliza la clase Calculator.
 */
public class Main {
    /**
     * Método principal para ejecutar un ejemplo en consola.
     *
     * @param argumentos Argumentos pasados desde la consola.
     */
    public static void main(String[] argumentos) {
        Calculator calculadora = new Calculator();
        int resultado = calculadora.add(4, 5);
        System.out.println("Resultado de 4 + 5: " + resultado);
    }
}
