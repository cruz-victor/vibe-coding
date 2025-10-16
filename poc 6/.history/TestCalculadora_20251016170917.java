/**
 * Clase de prueba para verificar la funcionalidad de la calculadora
 */
public class TestCalculadora {
    
    /**
     * Metodo principal para probar la calculadora
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        System.out.println("=== PRUEBAS DE LA CALCULADORA ===");
        System.out.println();
        
        // Prueba del metodo sumar dos numeros
        double resultado1 = calculadora.sumar(5.0, 3.0);
        System.out.println("Suma de dos numeros: 5.0 + 3.0 = " + resultado1);
        
        // Prueba del nuevo metodo sumar tres numeros
        double resultado2 = calculadora.sumarTresNumeros(2.0, 5.0, 3.0);
        System.out.println("Suma de tres numeros: 2.0 + 5.0 + 3.0 = " + resultado2);
        
        // Prueba con numeros decimales
        double resultado3 = calculadora.sumarTresNumeros(1.5, 2.7, 3.8);
        System.out.println("Suma de tres numeros decimales: 1.5 + 2.7 + 3.8 = " + resultado3);
        
        // Prueba con numeros negativos
        double resultado4 = calculadora.sumarTresNumeros(-1.0, 2.0, -3.0);
        System.out.println("Suma con numeros negativos: -1.0 + 2.0 + (-3.0) = " + resultado4);
        
        System.out.println();
        System.out.println("Todas las pruebas completadas exitosamente!");
    }
}
