package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import java.util.Scanner;

/**
 * Main application for command line calculator with Spring Boot support.
 */
@SpringBootApplication
public class Main {

    /**
     * Entry point of the app, shows simple interactive menu.
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);
        Calculator calculator = context.getBean(Calculator.class);
        runCalculatorExamples(calculator);
    }

    /**
     * Runs interactive calculator examples via console.
     * @param calculator Calculator service.
     */
    private static void runCalculatorExamples(Calculator calculator) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== SPRING BOOT CALCULATOR ===");
        System.out.println("This calculator can add two or three numbers, subtract, multiply, divide and calculate powers.");
        System.out.println();
        try {
            System.out.print("Enter first number: ");
            double firstNumber = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double secondNumber = scanner.nextDouble();
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
            double thirdNumber = 0.0;
            if (option == 2) {
                System.out.print("Enter third number: ");
                thirdNumber = scanner.nextDouble();
            }
            double result = switch (option) {
                case 1 -> calculator.add(firstNumber, secondNumber);
                case 2 -> calculator.addThreeNumbers(firstNumber, secondNumber, thirdNumber);
                case 3 -> calculator.subtract(firstNumber, secondNumber);
                case 4 -> calculator.multiply(firstNumber, secondNumber);
                case 5 -> calculator.divide(firstNumber, secondNumber);
                case 6 -> calculator.power(firstNumber, secondNumber);
                default -> calculator.add(firstNumber, secondNumber);
            };
            System.out.println();
            if (option == 2) {
                System.out.println("Result: " + firstNumber + " + " + secondNumber + " + " + thirdNumber + " = " + result);
            } else {
                String[] symbols = {"+", "+", "-", "*", "/", "^"};
                String op = (option >= 1 && option <= 6) ? symbols[option-1] : "+";
                System.out.println("Result: " + firstNumber + " " + op + " " + secondNumber + " = " + result);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Please enter valid numbers (integers or decimals)");
        } finally {
            scanner.close();
        }
    }
}
