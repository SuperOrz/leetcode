package com.leetcode;

public class No153_Find_Minimum_in_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(nums[left]>nums[right]){
            if(left == (left+right)/2)
                left++;
            else
                left = (left+right)/2;
        }
        int result = nums[left];
        while(left>0){
            if(nums[--left]<result)
                result = nums[left];
            else
                break;
        }
        return result;
    }
}
