package com.chandrika;

public class J_Basic_0009_Swapping_Without_3rd_Var
{
    public static void main(String[] args)
    {
        int a = 20, b = 70;

        System.out.println("Before swapping value of a is : " + a);
        System.out.println("Before swapping value of b is : " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping value of a is : " + a);
        System.out.println("After swapping value of b is : " + b);
    }
}

