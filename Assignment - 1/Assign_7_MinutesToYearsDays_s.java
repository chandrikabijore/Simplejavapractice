// 7.	Write a Java program to convert minutes into a number of years and days.
package com.chandrika;

import java.util.Scanner;

public class Assign_7_MinutesToYearsDays_s
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        // Constants for conversions
        final int MINUTES_PER_HOUR = 60;
        final int HOURS_PER_DAY = 24;
        final int DAYS_PER_YEAR = 365;

        // Calculate years and days
        long totalHours = minutes / MINUTES_PER_HOUR;
        long years = totalHours / (HOURS_PER_DAY * DAYS_PER_YEAR);
        long days = (totalHours % (HOURS_PER_DAY * DAYS_PER_YEAR)) / HOURS_PER_DAY;

        // Display the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        System.out.println("%d minutes is approximately %l years and %l days." + minutes + years + days);
    }
}


