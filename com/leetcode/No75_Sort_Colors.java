package com.leetcode;

public class No75_Sort_Colors {
	public void sortColors(int[] nums) {
        int len = nums.length;
        if(len==1) return;
        for(int i=0,p=0,q=len-1;i<=q;i++){
        	if(nums[i]==0){
        		swap(nums,p++,i);
        	}else if(nums[i]==2){
        		swap(nums,q--,i--);
        	}
        }
    }
	private void swap(int[] nums,int i,int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
