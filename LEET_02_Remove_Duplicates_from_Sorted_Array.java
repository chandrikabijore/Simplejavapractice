package com.chandrika;

public class LEET_02_Remove_Duplicates_from_Sorted_Array
{
    public int removeDuplicates(int[] nums)
    {
        int j = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[j] != nums[i]){
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args)
    {
        LEET_02_Remove_Duplicates_from_Sorted_Array solution = new LEET_02_Remove_Duplicates_from_Sorted_Array();

        int[] nums = {1, 1, 2, 2, 2, 3, 4, 5, 5, 6};
        int length = solution.removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + length);
        System.out.println("Updated array:");

        for (int i = 0; i < length; i++)
        {
            System.out.print(nums[i] + " ");
        }
    }
}


