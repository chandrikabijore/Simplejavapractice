package com.chandrikabijore;
import java.util.Scanner;
public class J_Basic_0004_Paisa_To_Rupees
{
    public static void main(String[] args)
    {
        int Paise;
        System.out.print("Enter the amount in paise : ");
        Scanner P = new Scanner(System.in);
        Paise = P.nextInt();

        double Rupees = Paise / 100.0;

        System.out.println(Paise + " Paise in Rupees is : " + Rupees + " Rs.");
    }
}
