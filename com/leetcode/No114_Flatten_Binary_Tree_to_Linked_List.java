package com.leetcode;

public class No114_Flatten_Binary_Tree_to_Linked_List {
	private TreeNode prev = null;
    public void flatten(TreeNode root) {
        if (root == null) return;
        if (prev != null) {
            prev.right = root;
        }
        
        prev = root;
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        
        flatten(left);
        flatten(right);
    }
}
