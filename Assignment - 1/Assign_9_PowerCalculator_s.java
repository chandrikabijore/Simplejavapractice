//9.	Write a Java program that reads a number and display the square, cube, and fourth power.

package com.chandrika;

import java.util.Scanner;

public class Assign_9_PowerCalculator_s
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Calculate square
        double square = number * number;

        // Calculate cube
        double cube = number * number * number;

        // Calculate fourth power
        double fourthPower = number * number * number * number;

        // Display results
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Fourth Power: " + fourthPower);

        scanner.close();
    }
}

//    Enter a number: 2
//        Square: 4.0
//        Cube: 8.0
//        Fourth Power: 16.0
