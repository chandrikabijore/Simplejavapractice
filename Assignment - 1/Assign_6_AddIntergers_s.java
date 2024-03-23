package com.chandrika;

import java.util.Scanner;

public class Assign_6_AddIntergers_s
{
    public static void main(String[] args) 
    {
        Scanner Add = new Scanner(System.in);
        System.out.println("Enter an integer between 0 and 1000 : ");
        int number = Add.nextInt();

        if (number < 0 || number > 1000)
        {
            System.out.println("Invalid input, please enter an integer between 0 and 1000");
            return;
        }

        int sum = 0;
        int originalNumber = number;
        while (number > 0)
        {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("The sum of digits in " + originalNumber + " is : " + sum);
    }
}

