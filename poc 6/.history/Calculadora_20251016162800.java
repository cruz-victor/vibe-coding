import java.util.Scanner;

/**
 * Calculadora básica que permite sumar dos números enteros o decimales
 */
public class Calculadora {
    
    /**
     * Método para sumar dos números
     * @param numero1 Primer número a sumar
     * @param numero2 Segundo número a sumar
     * @return La suma de los dos números
     */
    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }
    
    /**
     * Método principal que maneja la interacción con el usuario
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        
        System.out.println("=== CALCULADORA BÁSICA ===");
        System.out.println("Esta calculadora suma dos números enteros o decimales");
        System.out.println();
        
        try {
            // Solicitar el primer número
            System.out.print("Ingresa el primer número: ");
            double numero1 = scanner.nextDouble();
            
            // Solicitar el segundo número
            System.out.print("Ingresa el segundo número: ");
            double numero2 = scanner.nextDouble();
            
            // Realizar la suma
            double resultado = calculadora.sumar(numero1, numero2);
            
            // Mostrar el resultado
            System.out.println();
            System.out.println("El resultado de " + numero1 + " + " + numero2 + " = " + resultado);
            
        } catch (Exception e) {
            System.out.println("Error: Por favor ingresa números válidos (enteros o decimales)");
        } finally {
            scanner.close();
        }
    }
}
