package com.leetcode;

public class No42_Trapping_Rain_Water {
	public int trap(int[] height) {
		int len = height.length;
        if(len<=2) return 0;
        int[] left = new int[len];
        int[] right = new int[len];
        int max = height[0];
        for(int i=0;i<len;i++){
        	max = max<height[i]?height[i]:max;
        	left[i] = max;
        }
        max = height[len-1];
        for(int i=len-1;i>=0;i--){
        	max = max<height[i]?height[i]:max;
        	right[i] = max;
        }
        int count=0;
        for(int i=1;i<len-1;i++){
        	int maxleft = left[i-1];
        	int maxright = right[i+1];
        	max = Math.min(maxleft,maxright);
        	count+=max>height[i]?max-height[i]:0;
        }
        return count;
    }
}
