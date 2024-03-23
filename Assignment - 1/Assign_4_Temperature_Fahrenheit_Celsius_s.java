//4) Java Program to Convert Fahrenheit into Celsius

package com.chandrika;

import java.util.Scanner;

public class Assign_4_Temperature_Fahrenheit_Celsius_s
{
    public static void main(String[] args)
    {
        float Fahrenheit, Celsius;
        Scanner Tempreture = new Scanner(System.in);
        System.out.println("Enter the tempreture in Fahrenhiet: ");  // 98.6
        Fahrenheit = Tempreture.nextFloat();

        Celsius = ((Fahrenheit - 32) * 5 / 9);

        System.out.printf("The tempterture in celsius is : %f Celsius" , Celsius);    // 37.000..
    }
}
