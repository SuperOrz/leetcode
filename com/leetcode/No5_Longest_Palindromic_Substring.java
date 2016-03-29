package com.leetcode;

public class No5_Longest_Palindromic_Substring {
	
	public String longestPalindrome(String s) {
		char[] str = s.toCharArray();
		int[] result = new int[3];
		for (int index = 0; index < s.length(); index++) {
			int count = 1;
			int i=1,j=1;
			while (i<=index &&str[index - i] == str[index]) {
				i++;
				count++;
			}
			while (j<s.length()-index && str[index + j] == str[index]) {
				j++;
				count++;
			}
			for(i=i,j=j;i<=index&&j<s.length()-index;){
				if(str[index-i]==str[index+j]){
					count +=2;
					i++;
					j++;
				}else break;
			}
			if(count>result[0]){
				result[0]=count;
				result[1]=index-i+1;
				result[2]=index+j-1;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=result[1];i<=result[2];i++){
			sb.append(str[i]);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		No5_Longest_Palindromic_Substring cl = new No5_Longest_Palindromic_Substring();
		cl.longestPalindrome("a");
	}
}
