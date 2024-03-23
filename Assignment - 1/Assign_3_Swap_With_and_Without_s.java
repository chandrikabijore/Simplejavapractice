// 3) java programs to swap to no with or without third variable

package com.chandrika;
public class Assign_3_Swap_With_and_Without_s
{
    public static void main(String[] args)
    {
        System.out.println("with third variable");
        int a = 100, b = 200, temp;
        System.out.printf("Before swapping a = %d, b = %d" , a, b);
        temp = a;
        a = b;
        b = temp;
        System.out.printf("\nAfter swapping a = %d, b = %d" , a, b);

        
        System.out.println("\n\nwithout third variable");
        int x = 15, y = 25;
        System.out.printf("Before swapping x = %d, y = %d" , x, y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.printf("\nBefore swapping x = %d, y = %d" , x, y);
    }
}
