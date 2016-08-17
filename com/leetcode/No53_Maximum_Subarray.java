package com.leetcode;

public class No53_Maximum_Subarray {
	public int maxSubArray(int[] nums) {
        int result = nums[0];
        int curr = nums[0];
        for(int i=1;i<nums.length;i++){
        	curr = Math.max(curr+nums[i],nums[i]);
        	result = Math.max(curr,result);
        }
        return result;
    }
}
