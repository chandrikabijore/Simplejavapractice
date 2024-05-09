//1) To print the elements of two-dimensional string array for i=0 to i<3 for j=0 to j<2 prints the string element which is at the index str[i][j].
//2) Here i indicates row number and j indicates column number

package com.chandrika;

public class Array_Two_s_6
{
    public static void main(String[] args)
    {
        String[][] str = {{"One, Two"}, {"Three", "Four"}};
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.println("str["+i+"]["+j+"]" + str[i][j]);
                break;
            }
           // break;
        }
    }
}
