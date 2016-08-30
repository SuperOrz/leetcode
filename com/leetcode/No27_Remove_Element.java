package com.leetcode;

public class No27_Remove_Element {
	public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int index = nums.length-1;
        for(int i=0;i<=index;i++){
        	while(index>=0 && nums[index]==val){
        		index--;
        	}
        	if(nums[i]==val && i<index){
        		nums[i]=nums[index--];
        	}
        }
        if(index==0 && nums[0]==val) return 0;
        else return index+1;
    }
}
