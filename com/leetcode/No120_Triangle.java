package com.leetcode;

import java.util.Arrays;
import java.util.List;

public class No120_Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
		int len = triangle.size();
		if(len==1) return triangle.get(0).get(0);
        int[] dp = new int[len];
        int[] temp = new int[len];
        for(List<Integer> list:triangle){
        	int index=0;
        	for(Integer i:list){
        		if(index==0)
        			temp[index]=dp[index]+i;
        		else if(index == list.size()-1)
        			temp[index]=dp[index-1]+i;
        		else
        			temp[index]=Math.min(dp[index],dp[index-1])+i;
        		index++;
        	}
        	for(int i=0;i<len;i++){
        		dp[i]=temp[i];
        	}
        }
        Arrays.sort(dp);
        return dp[0];
    }
}
