// 2) java programs to compute quotient and remainder

// 4|25|6
//   24
//    1

package com.chandrika;

import java.util.Scanner;

public class Assign_2_QuotientRemainder_s
{
    public static void main(String args[])
    {
        int Divident, Divisor;

        Scanner QR = new Scanner(System.in);
        System.out.println("Enter the divident : ");
        Divident = QR.nextInt();

        System.out.println("Enter the divisor : ");
        Divisor = QR.nextInt();

        int Quotient = Divident / Divisor;
        int Remainder = Divident % Divisor;

        System.out.printf("The Quotient of %d is : %d", Divident, Quotient);
        System.out.printf("\nThe Remainder of %d is : %d", Divident, Remainder);
    }
}
