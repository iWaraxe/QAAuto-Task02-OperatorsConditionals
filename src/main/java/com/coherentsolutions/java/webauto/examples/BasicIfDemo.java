package com.coherentsolutions.java.webauto.section01;

/**
 * Demonstrates the basic usage of if statements.
 */
public class BasicIfDemo {
    public static void main(String[] args) {
        int number = 5;

        // Single line if statement without curly braces
        if (number % 2 != 0)
            System.out.println(number + " is odd");

        // Using curly braces for a single statement for better readability
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        // Nested if statement to show conditional blocks
        if (number < 10) {
            System.out.println(number + " is less than 10");
            if (number % 2 == 0) {
                System.out.println("It is also even");
            } else {
                System.out.println("It is also odd");
            }
        }
    }
}
