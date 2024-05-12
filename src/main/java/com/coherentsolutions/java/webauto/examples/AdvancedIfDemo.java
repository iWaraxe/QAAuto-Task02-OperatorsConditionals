package com.coherentsolutions.java.webauto.section01;

import java.util.Random;

/**
 * Demonstrates more complex and nested if statements including using Random class for conditions.
 */
public class AdvancedIfDemo {
    public static void main(String[] args) {
        String[] cats = {"Fluffy", "Whiskers", "Tiger", "Baldy"};
        Random random = new Random();
        String catName = cats[random.nextInt(cats.length)];

        if (catName.equals("Fluffy")) {
            System.out.println("Your kitten is fluffy.");
        } else if (catName.equals("Whiskers")) {
            System.out.println("Your kitten has whiskers.");
        } else if (catName.equals("Tiger")) {
            System.out.println("Your kitten looks like a tiger.");
        } else {
            System.out.println("Your kitten is bald and quite unique.");
        }
    }
}
