package com.leetcode;

public class No98_Validate_Binary_Search_Tree {
	public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        return validateLeft(root.left, root.val,Long.MIN_VALUE)&&validateRight(root.right, root.val,Long.MAX_VALUE);
    }
	private boolean validateLeft(TreeNode root,int max,long minValue){
		if(root==null) return true;
		if(root.val<max && root.val>minValue){
			return validateLeft(root.left, root.val,minValue)&&validateRight(root.right, root.val,max);
		}else{
			return false;
		}
	}
	private boolean validateRight(TreeNode root,int min,long maxValue){
		if(root==null) return true;
		if(root.val<maxValue && root.val>min){
			return validateLeft(root.left, root.val,min)&&validateRight(root.right, root.val,maxValue);
		}else{
			return false;
		}
	}
}
