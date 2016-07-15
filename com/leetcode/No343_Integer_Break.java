package com.leetcode;

public class No343_Integer_Break {
	public int integerBreak(int n) {
		if(n==2) return 1;
		if(n==3) return 2;
		if(n==4) return 4;
		int[] result = new int[n+1];
		result[2] = 2;
		result[3] = 3;
		result[4] = 4;
		int max=0;
		for(int i=5;i<=n;i++){
			for(int j=2;j<=i/2;j++){
				int temp = result[j]*result[i-j];
				max = temp > max? temp:max;
			}
			result[i] = max;
			max = 0;
		}
		return result[n];
	}	
}
