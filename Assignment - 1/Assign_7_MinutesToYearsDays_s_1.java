package com.chandrika;

import java.util.Scanner;

public class Assign_7_MinutesToYearsDays_s_1
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Minutes : ");
        int m = sc.nextInt();

        int H = m / 60;
        int M = m % 60;

        System.out.println("Hours : " + H);
        System.out.println("Minutes : " + M);
    }
}

