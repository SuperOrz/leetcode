package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class No51_N_Queens {
	private List<List<String>> result = new ArrayList<>();
	public List<List<String>> solveNQueens(int n) {
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
				List<String> temp = new ArrayList<>();
				char[] board = new char[q.length];
				for(int i=0;i<q.length;i++){
					board[i]='.';
				}
				for(int i=0;i<q.length;i++){
					board[q[i]]='Q';
					temp.add(new String(board));
					board[q[i]]='.';
				}
				result.add(temp);
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
