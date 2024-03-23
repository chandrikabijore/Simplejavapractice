// 10.	Write a Java program that accepts four integer from the user and prints equal if all four are equal, and
//      not equal otherwise

package com.chandrika;

import java.util.Scanner;

public class Assign_10_EqualityChecker_s
{
    public static void main(String[] args)
        {
        Scanner scanner = new Scanner(System.in);

        // Input four integers
        System.out.println("Enter four integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        // Check for equality
        if (num1 == num2 && num2 == num3 && num3 == num4)
        {
            System.out.println("equal");
        } else
        {
            System.out.println("not equal");
        }

        scanner.close();
    }
}

// Enter four integers:
//5
//5
//5
//5
//equal
