package com.leetcode;

public class No283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int[] count0 = new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                count++;
            count0[i]=count;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 && count0[i]!=0){
                nums[i-count0[i]] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
