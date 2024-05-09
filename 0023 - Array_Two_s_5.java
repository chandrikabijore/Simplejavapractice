package com.chandrika;

import java.util.Scanner;

public class Array_Two_s_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of an array : ");
        int Row = sc.nextInt();
        System.out.println("Enter the column of an array : ");
        int Column = sc.nextInt();

        int a[][] = new int[Row][Column];
        System.out.println("Enter " + Row * Column + " Elements are stored in array : \n");

        for (int i = 0; i < Row; i ++)
        {
            for (int j = 0; j < Column; j++)
            {
                 a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements in array are : \n");
        for (int i = 0; i < Row; i++)
        {
            for (int j = 0; j < Column; j++)
            {
                System.out.println("Row ["+ i +"] : Column ["+ j +"] : " + a[i][j]);
            }
        }

    }
}
