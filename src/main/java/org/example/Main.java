package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        Double no1, no2, result;
        Scanner input = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("Welcome to the calculator app");
        System.out.println("*****************************");
        System.out.println("Choose the operation");
        menu();
        option = input.nextInt();
        System.out.println("Enter the first number");
        no1 = input.nextDouble();
        System.out.println("Enter the second number");
        no2 = input.nextDouble();
        while (true) {
            switch (option) {
                case 1:
                    result = no1 + no2;
                    System.out.println(no1 + "+" + no2 + "=" + result);
                    break;
                case 2:
                    result = no1 - no2;
                    System.out.println(no1 + "-" + no2 + "=" + result);
                    break;
                case 3:
                    result = no1 * no2;
                    System.out.println(no1 + "*" + no2 + "=" + result);
                    break;
                case 4:
                    result = no1 - no2;
                    System.out.println(no1 + "/" + no2 + "=" + result);
                    break;
                default:
                    System.out.println("this"+option+"is not available , try other option");
                    break;
            }
        }

    }
        public static void menu ()
        {
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
        }
    }
