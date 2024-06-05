package com.chandrikabijore;

import java.util.Scanner;

public class J_Basic_0005_Rupees_To_Paisa
{
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Rupees here : " );
        float Rupees = S.nextFloat();

        System.out.print(Rupees + " Rs. in Paisa is : " + (int)(Rupees * 100));
       // System.out.println((int) (f * 100));
    }
}
