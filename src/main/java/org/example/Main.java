package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;
        boolean quit = false;

        do {
            System.out.print("Enter any character to start or 'q' to quit: ");
            operator = scanner.next().charAt(0);

            if (operator != 'q') {
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                double result;

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Error: Division by zero!");
                        }
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        continue;
                }

                // Perform calculations or other operations here
                // ...

            } else {
                quit = true;
                System.out.println("Thanks for using calculator");
            }
        } while (!quit);

        scanner.close();
    }
}
