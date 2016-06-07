package com.leetcode;

public class No55_Jump_Game {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int maxArrive = 0;
        for(int i=0;i<len;i++){
            if(i<=maxArrive){
                int tempArrive = i+nums[i];
                if(maxArrive<tempArrive)
                    maxArrive = tempArrive;
            }
        }
        return maxArrive>=len-1;
    }
}
