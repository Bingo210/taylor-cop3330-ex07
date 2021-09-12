/*
 * UCF COP3330 Fall 2021 Assignment 7 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;

public class App {
    public static double MetricDimensions(double squareFeet){

        return squareFeet * 0.09290304;
    }

    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println( "What is the length of the room in feet?" );
        double feetLength = input.nextDouble();

        System.out.println( "What is the width of the room in feet?" );
        double feetWidth = input.nextDouble();

        System.out.println( "You entered dimensions of " + feetLength +
                " feet by " + feetWidth + " feet.");

        double squareFeet = feetLength * feetWidth;
        double squareMeters = MetricDimensions(squareFeet);

        System.out.println("The area is" + "\n" + squareFeet + " square feet " +
                "\n" + squareMeters + " square meters");
    }
}
