package com.leetcode;

public class No230_Kth_Smallest_Element_in_a_BST {
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	//zhongxubianli
	int temp = 0;
	public int kthSmallest(TreeNode root, int k) {
		if(root==null) return 0;
		int res = kthSmallest(root.left, k);
		if(temp == k) return res;
		else if(++temp == k) return root.val;
		return kthSmallest(root.right, k);
    }
}
