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
     * Método principal para probar las funciones de suma
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        // Pruebas con números enteros
        int resultado1 = sumar(5, 3);
        System.out.println("Suma de 5 + 3 = " + resultado1);
        
        // Pruebas con números decimales
        double resultado2 = sumar(2.5, 1.7);
        System.out.println("Suma de 2.5 + 1.7 = " + resultado2);
        
        // Prueba con números negativos
        int resultado3 = sumar(-10, 5);
        System.out.println("Suma de -10 + 5 = " + resultado3);
        
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
