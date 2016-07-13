package com.leetcode;

public class No238_Product_of_Array_Except_Self {
	public int[] productExceptSelf(int[] nums) {
        int priduct = 0;
        int num0 = 0;
        for(Integer i:nums){
        	if(i!=0){
        		if(priduct==0)
        			priduct=1;
        		priduct *= i;
        	}else{
        		num0++;
        	}
        }
        int[] result = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
        	if(nums[i]==0){
        		if(num0>1)
        			result[i]=0;
        		else
        			result[i] = priduct;
        	}
        	else{
        		if(num0>0)
        			result[i]=0;
        		else
        			result[i] = priduct/nums[i];
        	}
        		
        }
        return result;
    }
}
