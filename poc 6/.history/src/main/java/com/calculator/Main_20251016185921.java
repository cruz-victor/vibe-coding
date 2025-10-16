package com.calculator;

import java.util.Scanner;

/**
 * Main application for command line calculator.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULATOR APPLICATION ===");
        System.out.println("This calculator can add two or three numbers, subtract, multiply, divide and calculate powers.\n");

        try {
            System.out.print("Enter first number: ");
            double firstNumber = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double secondNumber = scanner.nextDouble();

            System.out.println("\nSelect operation:");
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

            double result = 0;
            switch (option) {
                case 1:
                    result = calculator.add(firstNumber, secondNumber);
                    System.out.println("\nResult: " + firstNumber + " + " + secondNumber + " = " + result);
                    break;
                case 2:
                    result = calculator.addThreeNumbers(firstNumber, secondNumber, thirdNumber);
                    System.out.println("\nResult: " + firstNumber + " + " + secondNumber + " + " + thirdNumber + " = " + result);
                    break;
                case 3:
                    result = calculator.subtract(firstNumber, secondNumber);
                    System.out.println("\nResult: " + firstNumber + " - " + secondNumber + " = " + result);
                    break;
                case 4:
                    result = calculator.multiply(firstNumber, secondNumber);
                    System.out.println("\nResult: " + firstNumber + " * " + secondNumber + " = " + result);
                    break;
                case 5:
                    result = calculator.divide(firstNumber, secondNumber);
                    System.out.println("\nResult: " + firstNumber + " / " + secondNumber + " = " + result);
                    break;
                case 6:
                    result = calculator.power(firstNumber, secondNumber);
                    System.out.println("\nResult: " + firstNumber + " ^ " + secondNumber + " = " + result);
                    break;
                default:
                    System.out.println("Invalid option.");
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
