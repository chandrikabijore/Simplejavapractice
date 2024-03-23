// 5) Write a Java program that reads a number in inches, converts it to meters.

package com.chandrika;

import java.util.Scanner;

public class Assign_5_InchesToMeters_s
{
    public static void main(String[] args)
    {
        double inches, meters;
        Scanner In = new Scanner(System.in);
        System.out.println("Enter the number in inches : ");      // 10
        inches = In.nextDouble();

        // Convert inches to meters (1 inch = 0.0254 meters)
        meters = inches * 0.0254;

        System.out.printf("This %f inches in meters is : %f", inches, meters);     // 0.0245000..
    }
}
