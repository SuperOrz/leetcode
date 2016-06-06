package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class No1_Two_Sum {
	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
        	int key = target - nums[i];
        	if(map.get(key)==null) map.put(nums[i], i);
        	else{
        		result[0] = map.get(key);
        		result[1] = i;
        		break;
        	}
        }
        return result;
    }
}
