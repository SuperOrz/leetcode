package com.leetcode;

public class No26_Remove_Duplicates_from_Sorted_Array {
	public int removeDuplicates(int[] nums) {
		if(nums.length==0) return 0;
        int index = 1;
        for(int i=1;i<nums.length;i++){
        	if(nums[i]!=nums[i-1]){
        		nums[index++] = nums[i];
        	}
        }
        return index;
    }
}
