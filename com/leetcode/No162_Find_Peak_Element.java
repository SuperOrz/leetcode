package com.leetcode;

public class No162_Find_Peak_Element {
    public int findPeakElement(int[] nums) {
        int result = 0;
        if(nums.length>=2){
            for(int index=1;index<nums.length;index++){
                if(nums[index]<nums[index-1]){
                    result = index-1;
                    break;
                }
                if(index==nums.length-1){
                    result = index;
                }
            }
        }
        return result;
    }
}
