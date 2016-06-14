package com.leetcode;

public class No34_Search_for_a_Range {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int temp = bSearch(nums, target, 0, nums.length-1);
        if(temp!=-1){
            while(temp>=0){
                if(nums[temp]==target){
                    temp--;
                }else break;
            }
            result[0] = ++temp;
            while(temp<nums.length){
                if(nums[temp]==target){
                    temp++;
                }else break;
            }
            result[1] = --temp;
        }
        return result;
    }
    private int bSearch(int[] nums, int target,int left,int right){
        int result = -1;
        if(nums[left]==target) result = left;
        else if(nums[right]==target) result = right;
        else if(left < right){
            if(target>nums[(left+right)/2])
                result =  bSearch(nums, target, (left+right)/2+1, right);
            else
                result =  bSearch(nums, target, left, (left+right)/2);
            
        }
        return result;
    }
}
