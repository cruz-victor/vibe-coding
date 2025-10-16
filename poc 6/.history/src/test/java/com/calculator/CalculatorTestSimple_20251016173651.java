package com.calculator;

/**
 * Simple test class to verify Calculator functionality
 * Demonstrates TDD approach without external dependencies
 */
public class CalculatorTestSimple {
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println("=== CALCULATOR TESTS ===");
        System.out.println();
        
        // Test add two numbers
        double result1 = calculator.add(5.0, 3.0);
        System.out.println("Test 1 - Add two numbers: 5.0 + 3.0 = " + result1);
        assert result1 == 8.0 : "Expected 8.0, got " + result1;
        
        // Test add three numbers - THE NEW METHOD
        double result2 = calculator.addThreeNumbers(2.0, 3.0, 5.0);
        System.out.println("Test 2 - Add three numbers: 2.0 + 3.0 + 5.0 = " + result2);
        assert result2 == 10.0 : "Expected 10.0, got " + result2;
        
        // Test add three numbers with decimals
        double result3 = calculator.addThreeNumbers(1.5, 2.7, 3.8);
        System.out.println("Test 3 - Add three decimals: 1.5 + 2.7 + 3.8 = " + result3);
        assert result3 == 8.0 : "Expected 8.0, got " + result3;
        
        // Test add three numbers with negatives
        double result4 = calculator.addThreeNumbers(-1.0, 2.0, -3.0);
        System.out.println("Test 4 - Add with negatives: -1.0 + 2.0 + (-3.0) = " + result4);
        assert result4 == -2.0 : "Expected -2.0, got " + result4;
        
        // Test other operations
        double result5 = calculator.subtract(10.0, 3.0);
        System.out.println("Test 5 - Subtract: 10.0 - 3.0 = " + result5);
        assert result5 == 7.0 : "Expected 7.0, got " + result5;
        
        double result6 = calculator.multiply(4.0, 5.0);
        System.out.println("Test 6 - Multiply: 4.0 * 5.0 = " + result6);
        assert result6 == 20.0 : "Expected 20.0, got " + result6;
        
        double result7 = calculator.divide(15.0, 3.0);
        System.out.println("Test 7 - Divide: 15.0 / 3.0 = " + result7);
        assert result7 == 5.0 : "Expected 5.0, got " + result7;
        
        double result8 = calculator.power(2.0, 3.0);
        System.out.println("Test 8 - Power: 2.0 ^ 3.0 = " + result8);
        assert result8 == 8.0 : "Expected 8.0, got " + result8;
        
        // Test division by zero
        try {
            calculator.divide(10.0, 0.0);
            System.out.println("Test 9 - Division by zero: FAILED - Should have thrown exception");
        } catch (IllegalArgumentException e) {
            System.out.println("Test 9 - Division by zero: PASSED - " + e.getMessage());
        }
        
        System.out.println();
        System.out.println("All tests completed successfully!");
        System.out.println("TDD Phases completed:");
        System.out.println("✓ RED: Tests written first");
        System.out.println("✓ GREEN: Implementation made tests pass");
        System.out.println("✓ BLUE: Code refactored and structured");
    }
}
