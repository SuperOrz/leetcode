package com.leetcode;

public class No11_Container_With_Most_Water {
	public int maxArea(int[] height) {
		 int max = 0, i = 0, j = height.length - 1;
		    while(i < j)
		        max = Math.max(max, (j - i) * (height[i] < height[j] ? height[i++] : height[j--]));
		    return max;
    }
}
