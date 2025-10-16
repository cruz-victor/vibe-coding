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
     * Método para restar dos números
     * @param numero1 Primer número (minuendo)
     * @param numero2 Segundo número (sustraendo)
     * @return La diferencia de los dos números
     */
    public double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }
    
    /**
     * Método para multiplicar dos números
     * @param numero1 Primer número a multiplicar
     * @param numero2 Segundo número a multiplicar
     * @return El producto de los dos números
     */
    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }
    
    /**
     * Método para dividir dos números
     * @param numero1 Primer número (dividendo)
     * @param numero2 Segundo número (divisor)
     * @return El cociente de los dos números
     * @throws IllegalArgumentException si el divisor es cero
     */
    public double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new IllegalArgumentException("Error: No se puede dividir por cero");
        }
        return numero1 / numero2;
    }
    
    /**
     * Método principal que maneja la interacción con el usuario
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        
        System.out.println("=== CALCULADORA BÁSICA ===");
        System.out.println("Esta calculadora puede sumar, restar, multiplicar y dividir dos números enteros o decimales");
        System.out.println();
        
        try {
            // Solicitar el primer número
            System.out.print("Ingresa el primer número: ");
            double numero1 = scanner.nextDouble();
            
            // Solicitar el segundo número
            System.out.print("Ingresa el segundo número: ");
            double numero2 = scanner.nextDouble();
            
            // Solicitar la operación
            System.out.println();
            System.out.println("Selecciona la operación:");
            System.out.println("1. Sumar (+)");
            System.out.println("2. Restar (-)");
            System.out.println("3. Multiplicar (*)");
            System.out.println("4. Dividir (/)");
            System.out.print("Ingresa tu opción (1, 2, 3 o 4): ");
            
            int opcion = scanner.nextInt();
            double resultado = 0;
            String operacion = "";
            
            // Realizar la operación seleccionada
            switch (opcion) {
                case 1:
                    resultado = calculadora.sumar(numero1, numero2);
                    operacion = "+";
                    break;
                case 2:
                    resultado = calculadora.restar(numero1, numero2);
                    operacion = "-";
                    break;
                case 3:
                    resultado = calculadora.multiplicar(numero1, numero2);
                    operacion = "*";
                    break;
                default:
                    System.out.println("Opción inválida. Se realizará la suma por defecto.");
                    resultado = calculadora.sumar(numero1, numero2);
                    operacion = "+";
                    break;
            }
            
            // Mostrar el resultado
            System.out.println();
            System.out.println("El resultado de " + numero1 + " " + operacion + " " + numero2 + " = " + resultado);
            
        } catch (Exception e) {
            System.out.println("Error: Por favor ingresa números válidos (enteros o decimales)");
        } finally {
            scanner.close();
        }
    }
}
