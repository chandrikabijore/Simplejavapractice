package com.chandrikabijore;

import java.util.Scanner;

public class J_Basic_0002_AreaOfCircle
{
    public static void main(String[] args)
    {
        int Radius;
        System.out.print("Enter radius here : ");
        Scanner a = new Scanner(System.in);
        Radius = a.nextInt();

        double PI = 3.142, area;

        area = PI * Radius * Radius;

        System.out.println("The area of circle is  : " + area);
    }
}
