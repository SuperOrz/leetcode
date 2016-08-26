package com.leetcode;

public class No110_Balanced_Binary_Tree {
	public boolean isBalanced(TreeNode root) {
        if(count(root)==-1) return false;
        else return true;
    }
	private int count(TreeNode root){
		if(root==null) return 0;
		int left = count(root.left);
		int right = count(root.right);
		if(left==-1 || right==-1) return -1;
		if(left-right>1||left-right<-1) return -1;
		return Math.max(left,right)+1;
	}
}
