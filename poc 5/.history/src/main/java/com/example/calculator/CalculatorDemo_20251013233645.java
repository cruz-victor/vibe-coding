package com.example.calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        // Test cases que coinciden con nuestros tests
        System.out.println("Testing Calculator:");
        System.out.println("5.0 + 3.0 = " + calculator.add(5.0, 3.0)); // Expected: 8.0
        System.out.println("2.5 + 3.7 = " + calculator.add(2.5, 3.7)); // Expected: 6.2
        System.out.println("-5.0 + (-3.0) = " + calculator.add(-5.0, -3.0)); // Expected: -8.0
        System.out.println("5.0 + (-3.0) = " + calculator.add(5.0, -3.0)); // Expected: 2.0
        System.out.println("-4.0 + (-2.0) = " + calculator.add(-4.0, -2.0)); // Expected: -6.0
    }
}
