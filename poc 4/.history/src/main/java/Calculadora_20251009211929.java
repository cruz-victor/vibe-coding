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
        
        System.out.println("\n=== PRUEBAS DE MULTIPLICACIÓN ===");
        // Pruebas de multiplicación con números enteros
        int resultado7 = multiplicar(4, 6);
        System.out.println("Multiplicación de 4 * 6 = " + resultado7);
        
        // Pruebas de multiplicación con números decimales
        double resultado8 = multiplicar(2.5, 3.2);
        System.out.println("Multiplicación de 2.5 * 3.2 = " + resultado8);
        
        // Prueba de multiplicación con números negativos
        int resultado9 = multiplicar(-5, 3);
        System.out.println("Multiplicación de -5 * 3 = " + resultado9);
        
        System.out.println("\n=== PRUEBAS DE DIVISIÓN ===");
        // Pruebas de división con números enteros
        int resultado10 = dividir(15, 3);
        System.out.println("División de 15 / 3 = " + resultado10);
        
        // Pruebas de división con números decimales
        double resultado11 = dividir(7.5, 2.5);
        System.out.println("División de 7.5 / 2.5 = " + resultado11);
        
        // Prueba de división con números negativos
        double resultado12 = dividir(-12.0, 4.0);
        System.out.println("División de -12.0 / 4.0 = " + resultado12);
        
        // Prueba de manejo de división por cero
        try {
            int resultado13 = dividir(10, 0);
            System.out.println("División de 10 / 0 = " + resultado13);
        } catch (ArithmeticException e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
        
        System.out.println("\n=== PRUEBA INTERACTIVA ===");
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
