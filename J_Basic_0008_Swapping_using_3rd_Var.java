package com.chandrika;

public class J_Basic_0008_Swapping_using_3rd_Var
{
    public static void main(String[] args)
    {
        int a=10, b=20, t;

        System.out.println("Before Swapping Value of a is : " + a);
        System.out.println("Before Swapping Value of b is : " + b);

        t = a;
        a = b;
        b = t;

        System.out.println("After Swapping Value of a is : " + a);
        System.out.println("After Swapping Value of b is : " + b);
    }
}
