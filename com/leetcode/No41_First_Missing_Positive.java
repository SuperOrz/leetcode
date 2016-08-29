package com.leetcode;

public class No41_First_Missing_Positive {
	public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;){
        	int num = nums[i];
        	if(num<=0) i++;
        	else if(num>nums.length) i++;
        	else{
        		if(num!=i+1 && nums[i] != nums[num-1]){
        			nums[i] = nums[num-1];
        			nums[num-1] = num;
        		}else{
        			i++;
        		}
        		
        	}
        }
        int result=0;
        for(int i=0;i<nums.length;i++){
        	if(i+1!=nums[i]){
        		result = i+1;
        		break;
        	}
        }
        if(result==0) result = nums.length+1;
        return result;
    }
}
