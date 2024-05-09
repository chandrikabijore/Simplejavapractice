package com.chandrika;

public class LEET_01_TwoSum
{
    public int[] twoSum(int[] nums, int target)
    {
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    int a[] = {i, j};
                    return a;
                }
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        // Test the twoSum method
        LEET_01_TwoSum solution = new LEET_01_TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);     //The twoSum method is retained(bnay rakhna) to find the indices of the two numbers in the array nums that add up to the target.
        if (result != null)
        {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
        else
        {
            System.out.println("No solution found.");
        }
    }
}
