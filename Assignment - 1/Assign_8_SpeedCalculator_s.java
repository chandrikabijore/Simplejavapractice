// 8.	Write a Java program to takes the user for a distance (in meters) and the time was taken
//      (as three numbers: hours, minutes, seconds), and display the speed, in meters per second,
//      km per hour

package com.chandrika;

import java.util.Scanner;

public class Assign_8_SpeedCalculator_s
{
    public static void main(String[] args)
    {
        // Input distance in meters
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in meters: ");
        double distance = scanner.nextDouble();

        // Input time taken in hours, minutes, and seconds
        System.out.print("Enter the time taken (hours): ");
        int hours = scanner.nextInt();
        System.out.print("Enter the time taken (minutes): ");
        int minutes = scanner.nextInt();
        System.out.print("Enter the time taken (seconds): ");
        int seconds = scanner.nextInt();

        // Convert time to seconds
        double totalTimeInSeconds = hours * 3600 + minutes * 60 + seconds;

        // Calculate speed in meters per second
        double speedInMetersPerSecond = distance / totalTimeInSeconds;

        // Calculate speed in kilometers per hour
        double speedInKmPerHour = (distance / 1000) / (totalTimeInSeconds / 3600);

        // Display the results
        System.out.println("Speed in meters per second: " + speedInMetersPerSecond);
        System.out.println("Speed in kilometers per hour: " + speedInKmPerHour);

        scanner.close();
    }
}
