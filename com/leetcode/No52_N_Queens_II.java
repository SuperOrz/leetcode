package com.leetcode;


public class No52_N_Queens_II {
	int result;
	public int totalNQueens(int n) {
		int[] q = new int[n];
		for(int i=0;i<n;i++){
			q[0]=i;
			dfs(q,0);
		}
		return result;
    }
	private void dfs(int[] q,int index) {
		if(legal(q,index)){
			if(index==q.length-1){
				result++;
			}else{
				index++;
				for(int i=0;i<q.length;i++){
					q[index]=i;
					dfs(q,index);
				}
			}
		}
	}
	private boolean legal(int[] q, int index) {
		boolean flag = true;
		if(index==0) return true;
		
		for(int i=0;i<index && flag;i++){
			for(int j=i+1;j<=index && flag;j++){
				if(q[i]==q[j] || Math.abs(q[i]-q[j])==Math.abs(i-j)){
					flag = false;
				}
			}
		}
		return flag;
	}
}
