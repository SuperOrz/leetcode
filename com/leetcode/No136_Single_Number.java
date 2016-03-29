package com.leetcode;

public class No136_Single_Number {
	public int singleNumber(int[] nums) {
		int result = 0;
		for(int i=0;i<nums.length;i++){
			result = result^nums[i];
		}
        return result;
    }
}
