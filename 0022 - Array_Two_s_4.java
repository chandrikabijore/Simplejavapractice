// To print the two-dimensional array, for loop iterates from o to i<3 for loop iterates from j=0 to j<2 print
// the element which is at the index a[i][j].
package com.chandrika;

public class Array_Two_s_4
{
    public static void main(String[] args)
    {
        int[][] x = {{10,20}, {30,40}};
        for(int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.println(x[i][j]);
            }
        }
    }
}

