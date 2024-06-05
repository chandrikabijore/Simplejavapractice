package com.chandrika;

import java.util.Scanner;

public class J_Basic_0006_Simple_Interest
{
    public static void main(String[] args)
    {
        double p, r, t, SI;

        System.out.print("Enter the priciple here : ");                // 5000
        Scanner si = new Scanner(System.in);
        p = si.nextDouble();

        System.out.print("\nEnter the Rate of interest here : ");      // 15
        r = si.nextDouble();

        System.out.print("\nEnter the Time here : ");                  // 1
        t = si.nextDouble();

        SI = (p * r * t) / 100;

        System.out.println("\nThe Simple interest is : " + SI);       // 750.0
    }
}
