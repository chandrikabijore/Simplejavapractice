package com.chandrika;

public class J_Basic_0010_Sum_Using_CMD
{
    public static void main(String[] args)
    {
        int num1, num2, sum;

        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);

        sum = num1 + num2;

        System.out.printf(" Sum = " + sum);
    }
}
