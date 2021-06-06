/*
 *  UCF COP3330 Summer 2021 Assignment 12 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        double principle, rate, years, fianlValue;

        System.out.print("Enter the principle: ");
        principle = scanner.nextDouble();
        System.out.print("Enter the rate of interest: ");
        rate = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        years = scanner.nextDouble();

        fianlValue = principle * (1 + (rate / 100) * years);

        System.out.println("After " + (int)years + " years at " + rate + "%, the investment will be worth $" + String.format("%.2f", fianlValue));

    }
}
