package com.leetcode;

public class No108_Convert_Sorted_Array_to_Binary_Search_Tree {
	public TreeNode sortedArrayToBST(int[] nums) {
        return help(nums,0,nums.length-1);
    }
	private TreeNode help(int[] nums,int left,int right){
		if(left>right) return null;
		if(left==right) return new TreeNode(nums[left]);
		int mid = (left+right)>>1;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = help(nums,left,mid-1);
		root.right = help(nums,mid+1,right);
		return root;
	}
}
