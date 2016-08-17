package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class No22_Generate_Parentheses {
	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		help(result,0,0,"",n);
		return result;
    }

	private void help(List<String> result, int i, int j, String string, int n) {
		if(i==n&&j==n){
			result.add(string);
		}else{
			if(i<n){
				help(result,i+1,j,string+"(",n);
			}
			if(j<i){
				help(result,i,j+1,string+")",n);
			}
		}
	}
}
