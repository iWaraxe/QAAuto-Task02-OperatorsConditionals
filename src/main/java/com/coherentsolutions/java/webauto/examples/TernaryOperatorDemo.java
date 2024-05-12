package com.coherentsolutions.java.webauto.examples;

/**
 * Demonstrates the use of the ternary operator as a shortcut for if-else statements.
 */
public class TernaryOperatorDemo {
    public static void main(String[] args) {
        int lowNum = 9;
        int highNum = 27;
        int largerNum = lowNum < highNum ? highNum : lowNum;

        System.out.println("The larger number is " + largerNum);
    }
}
