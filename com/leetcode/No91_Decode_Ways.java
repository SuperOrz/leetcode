package com.leetcode;

public class No91_Decode_Ways {
	public int numDecodings(String s) {
		if(s.equals("")||s.startsWith("0")) return 0;
		int len = s.length();
		if(len==1) return 1;
		int[] dp = new int[len+1];
		dp[0] = 1;
		dp[1] = 1;
		for(int i=2;i<=len;i++){
			if(s.charAt(i-1)=='0'&&(s.charAt(i-2)=='1'||s.charAt(i-2)=='2'))
				dp[i]=dp[i-2];
			else if(s.charAt(i-1)=='0'&&(s.charAt(i-2)=='0'||s.charAt(i-2)>'2'))
				return 0;
			else if(s.charAt(i-2)=='1'||(s.charAt(i-2)=='2'&&s.charAt(i-1)<='6'))
				dp[i]=dp[i-2]+dp[i-1];
			else
				dp[i]=dp[i-1];
		}
		return dp[len];
	}
}
