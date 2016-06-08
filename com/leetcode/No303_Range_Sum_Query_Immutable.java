package com.leetcode;

public class No303_Range_Sum_Query_Immutable {
    public class NumArray {
        private int[] nums;
        private int[] sums;
        public NumArray(int[] nums) {
            this.nums = nums;
            this.sums = new int[nums.length];
            for(int i=0;i<nums.length;i++){
                if(i!=0)
                    this.sums[i]=this.nums[i]+this.sums[i-1];
                else 
                    this.sums[i] = this.nums[i];
            }
        }

        public int sumRange(int i, int j) {
            return sums[j]-sums[i]+nums[i];
        }
    }
}
