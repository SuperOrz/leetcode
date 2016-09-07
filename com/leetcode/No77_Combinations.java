package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class No77_Combinations {
	List<List<Integer>> result = new ArrayList<>();
	public List<List<Integer>> combine(int n, int k) {
		int[] temp = new int[k];
		dfs(temp,0,n);
        return result;
    }
	private void dfs(int[] temp, int index,int max) {
		if(index==temp.length){
			List<Integer> l = new ArrayList<>();
			for(int i=0;i<temp.length;i++){
				l.add(temp[i]);
			}
			result.add(l);
		}else{
			int i=index==0?1:temp[index-1]+1;
			for(;i<=max;i++){
				temp[index]=i;
				dfs(temp,index+1,max);
			}
		}
	}
}
