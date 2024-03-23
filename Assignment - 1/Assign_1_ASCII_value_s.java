//1) java programs to fins ascii value of charactor
// A ---> 65

package com.chandrika;

import java.util.Scanner;

public class Assign_1_ASCII_value_s
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no to find ASCII value : ");
        char c = sc.next().charAt(0);

        int n = c;
        System.out.printf("ASCII value of %c is : %d", c, n);
    }
}
