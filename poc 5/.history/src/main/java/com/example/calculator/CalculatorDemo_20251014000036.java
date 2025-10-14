package com.example.calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println("=== CALCULATOR DEMO ===");
        System.out.println();
        
        // Addition tests
        System.out.println("ADDITION:");
        System.out.println("5.0 + 3.0 = " + calculator.add(5.0, 3.0)); // Expected: 8.0
        System.out.println("2.5 + 3.7 = " + calculator.add(2.5, 3.7)); // Expected: 6.2
        System.out.println("-5.0 + (-3.0) = " + calculator.add(-5.0, -3.0)); // Expected: -8.0
        System.out.println("5.0 + (-3.0) = " + calculator.add(5.0, -3.0)); // Expected: 2.0
        System.out.println("-4.0 + (-2.0) = " + calculator.add(-4.0, -2.0)); // Expected: -6.0
        System.out.println();
        
        // Subtraction tests
        System.out.println("SUBTRACTION:");
        System.out.println("8.0 - 3.0 = " + calculator.subtract(8.0, 3.0)); // Expected: 5.0
        System.out.println("6.2 - 3.7 = " + calculator.subtract(6.2, 3.7)); // Expected: 2.5
        System.out.println("-5.0 - (-3.0) = " + calculator.subtract(-5.0, -3.0)); // Expected: -2.0
        System.out.println("5.0 - (-3.0) = " + calculator.subtract(5.0, -3.0)); // Expected: 8.0
        System.out.println("-4.0 - (-2.0) = " + calculator.subtract(-4.0, -2.0)); // Expected: -2.0
        System.out.println();
        
        // Multiplication tests
        System.out.println("MULTIPLICATION:");
        System.out.println("4.0 * 3.0 = " + calculator.multiply(4.0, 3.0)); // Expected: 12.0
        System.out.println("2.5 * 3.2 = " + calculator.multiply(2.5, 3.2)); // Expected: 8.0
        System.out.println("-4.0 * (-3.0) = " + calculator.multiply(-4.0, -3.0)); // Expected: 12.0
        System.out.println("4.0 * (-3.0) = " + calculator.multiply(4.0, -3.0)); // Expected: -12.0
        System.out.println("-4.0 * (-2.0) = " + calculator.multiply(-4.0, -2.0)); // Expected: 8.0
        System.out.println();
        
        // Division tests
        System.out.println("DIVISION:");
        System.out.println("12.0 / 3.0 = " + calculator.divide(12.0, 3.0)); // Expected: 4.0
        System.out.println("8.0 / 2.5 = " + calculator.divide(8.0, 2.5)); // Expected: 3.2
        System.out.println("-12.0 / (-3.0) = " + calculator.divide(-12.0, -3.0)); // Expected: 4.0
        System.out.println("12.0 / (-3.0) = " + calculator.divide(12.0, -3.0)); // Expected: -4.0
        System.out.println("-8.0 / (-2.0) = " + calculator.divide(-8.0, -2.0)); // Expected: 4.0
        System.out.println();
        
        // Division by zero test
        System.out.println("DIVISION BY ZERO TEST:");
        try {
            System.out.println("5.0 / 0.0 = " + calculator.divide(5.0, 0.0));
        } catch (IllegalArgumentException e) {
            System.out.println("5.0 / 0.0 = " + e.getMessage());
        }
    }
}
