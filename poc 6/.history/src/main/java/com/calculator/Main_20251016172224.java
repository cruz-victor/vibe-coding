package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.Scanner;

/**
 * Main application class that demonstrates calculator functionality
 * Executes simple examples from console following Spring Boot architecture
 */
@SpringBootApplication
public class Main {

    /**
     * Main method that starts the Spring Boot application and runs calculator examples
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Start Spring Boot application
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        
        // Get Calculator service from Spring context
        Calculator calculator = context.getBean(Calculator.class);
        
        // Run calculator examples
        runCalculatorExamples(calculator);
        
        // Close Spring context
        context.close();
    }

    /**
     * Runs interactive calculator examples from console
     * @param calculator Calculator service instance
     */
    private static void runCalculatorExamples(Calculator calculator) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SPRING BOOT CALCULATOR ===");
        System.out.println("This calculator can add two numbers, add three numbers, subtract, multiply, divide and calculate powers");
        System.out.println();
        
        try {
            // Request first number
            System.out.print("Enter first number: ");
            double firstNumber = scanner.nextDouble();
            
            // Request second number
            System.out.print("Enter second number: ");
            double secondNumber = scanner.nextDouble();
            
            // Request operation
            System.out.println();
            System.out.println("Select operation:");
            System.out.println("1. Add two numbers (+)");
            System.out.println("2. Add three numbers (+++)");
            System.out.println("3. Subtract (-)");
            System.out.println("4. Multiply (*)");
            System.out.println("5. Divide (/)");
            System.out.println("6. Power (^)");
            System.out.print("Enter your option (1, 2, 3, 4, 5 or 6): ");
            
            int option = scanner.nextInt();
            double thirdNumber = 0;
            
            // If option is add three numbers, request third number
            if (option == 2) {
                System.out.print("Enter third number: ");
                thirdNumber = scanner.nextDouble();
            }
            
            // Perform selected operation
            double result = performOperation(calculator, option, firstNumber, secondNumber, thirdNumber);
            String operation = getOperationSymbol(option);
            
            // Show result
            System.out.println();
            if (option == 2) {
                System.out.println("Result: " + firstNumber + " + " + secondNumber + " + " + thirdNumber + " = " + result);
            } else {
                System.out.println("Result: " + firstNumber + " " + operation + " " + secondNumber + " = " + result);
            }
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Please enter valid numbers (integers or decimals)");
        } finally {
            scanner.close();
        }
    }

    /**
     * Performs the selected mathematical operation
     * @param calculator Calculator service instance
     * @param option Selected operation option
     * @param firstNumber First number
     * @param secondNumber Second number
     * @param thirdNumber Third number (for three-number operations)
     * @return Result of the operation
     */
    private static double performOperation(Calculator calculator, int option, double firstNumber, double secondNumber, double thirdNumber) {
        return switch (option) {
            case 1 -> calculator.add(firstNumber, secondNumber);
            case 2 -> calculator.addThreeNumbers(firstNumber, secondNumber, thirdNumber);
            case 3 -> calculator.subtract(firstNumber, secondNumber);
            case 4 -> calculator.multiply(firstNumber, secondNumber);
            case 5 -> calculator.divide(firstNumber, secondNumber);
            case 6 -> calculator.power(firstNumber, secondNumber);
            default -> {
                System.out.println("Invalid option. Performing addition by default.");
                yield calculator.add(firstNumber, secondNumber);
            }
        };
    }

    /**
     * Gets the operation symbol for display
     * @param option Selected operation option
     * @return Operation symbol string
     */
    private static String getOperationSymbol(int option) {
        return switch (option) {
            case 1 -> "+";
            case 2 -> "+++";
            case 3 -> "-";
            case 4 -> "*";
            case 5 -> "/";
            case 6 -> "^";
            default -> "+";
        };
    }
}
