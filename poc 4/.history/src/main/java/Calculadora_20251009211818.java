/**
 * Clase Calculadora que contiene métodos para operaciones matemáticas básicas
 */
public class Calculadora {
    
    /**
     * Función que suma dos números enteros
     * @param a Primer número a sumar
     * @param b Segundo número a sumar
     * @return La suma de los dos números
     */
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    /**
     * Función que suma dos números decimales
     * @param a Primer número a sumar
     * @param b Segundo número a sumar
     * @return La suma de los dos números
     */
    public static double sumar(double a, double b) {
        return a + b;
    }
    
    /**
     * Función que resta dos números enteros
     * @param a Primer número (minuendo)
     * @param b Segundo número (sustraendo)
     * @return La resta de los dos números (a - b)
     */
    public static int restar(int a, int b) {
        return a - b;
    }
    
    /**
     * Función que resta dos números decimales
     * @param a Primer número (minuendo)
     * @param b Segundo número (sustraendo)
     * @return La resta de los dos números (a - b)
     */
    public static double restar(double a, double b) {
        return a - b;
    }
    
    /**
     * Función que multiplica dos números enteros
     * @param a Primer número a multiplicar
     * @param b Segundo número a multiplicar
     * @return El producto de los dos números
     */
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    
    /**
     * Función que multiplica dos números decimales
     * @param a Primer número a multiplicar
     * @param b Segundo número a multiplicar
     * @return El producto de los dos números
     */
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    /**
     * Función que divide dos números enteros
     * @param a Primer número (dividendo)
     * @param b Segundo número (divisor)
     * @return El cociente de la división (a / b)
     * @throws ArithmeticException si el divisor es cero
     */
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error: No se puede dividir por cero");
        }
        return a / b;
    }
    
    /**
     * Función que divide dos números decimales
     * @param a Primer número (dividendo)
     * @param b Segundo número (divisor)
     * @return El cociente de la división (a / b)
     * @throws ArithmeticException si el divisor es cero
     */
    public static double dividir(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Error: No se puede dividir por cero");
        }
        return a / b;
    }
    
    /**
     * Método principal para probar las funciones de suma, resta, multiplicación y división
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS DE SUMA ===");
        // Pruebas con números enteros
        int resultado1 = sumar(5, 3);
        System.out.println("Suma de 5 + 3 = " + resultado1);
        
        // Pruebas con números decimales
        double resultado2 = sumar(2.5, 1.7);
        System.out.println("Suma de 2.5 + 1.7 = " + resultado2);
        
        // Prueba con números negativos
        int resultado3 = sumar(-10, 5);
        System.out.println("Suma de -10 + 5 = " + resultado3);
        
        System.out.println("\n=== PRUEBAS DE RESTA ===");
        // Pruebas de resta con números enteros
        int resultado4 = restar(10, 3);
        System.out.println("Resta de 10 - 3 = " + resultado4);
        
        // Pruebas de resta con números decimales
        double resultado5 = restar(5.8, 2.3);
        System.out.println("Resta de 5.8 - 2.3 = " + resultado5);
        
        // Prueba de resta con resultado negativo
        int resultado6 = restar(3, 8);
        System.out.println("Resta de 3 - 8 = " + resultado6);
        
        // Prueba interactiva
        if (args.length >= 2) {
            try {
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                int resultado = sumar(num1, num2);
                System.out.println("La suma de " + num1 + " + " + num2 + " = " + resultado);
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingresa números válidos como argumentos.");
            }
        }
    }
}
