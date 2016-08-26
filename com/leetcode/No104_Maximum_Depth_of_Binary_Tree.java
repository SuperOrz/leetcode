package com.leetcode;

public class No104_Maximum_Depth_of_Binary_Tree {
	int max = 0;
	public int maxDepth(TreeNode root) {
        help(root,0);
        return max;
    }
	public void help(TreeNode root,int temp){
		if(root==null) return;
		temp++;
		max = temp>max?temp:max;
		help(root.left,temp);
		help(root.right,temp);
	}
}
