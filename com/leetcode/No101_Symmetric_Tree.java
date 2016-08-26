package com.leetcode;

public class No101_Symmetric_Tree {
	public boolean isSymmetric(TreeNode root) {
		if(root==null) return true;
        return help(root.left,root.right);
    }
	private boolean help(TreeNode left,TreeNode right){
		if(left!=null&&right!=null){
			if(left.val==right.val){
				return help(left.left,right.right)&&help(left.right,right.left);
			}else{
				return false;
			}
		}else if(left==null&&right==null){
			return true;
		}else{
			return false;
		}
	}
}
