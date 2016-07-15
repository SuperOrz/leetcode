package com.leetcode;

public class No357_Count_Numbers_with_Unique_Digits {
	public int countNumbersWithUniqueDigits(int n) {
		if(n>10) return 0;
		int[] results = new int[n+1];
		results[0] = 1;
		for(int i=1;i<=n;i++){
			results[i]=9;
			for(int j=1;j<i;j++){
				results[i]*=(10-j);
			}
			results[i]+=results[i-1];
		}
		return results[n];
    }
}
