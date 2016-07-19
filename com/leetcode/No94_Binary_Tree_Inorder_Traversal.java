package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No94_Binary_Tree_Inorder_Traversal {
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	//ÖÐÐò±éÀú
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while(temp!=null || !stack.isEmpty()){
			while(temp!=null){
				stack.push(temp);
				temp = temp.left;
			}
			temp = stack.pop();
			result.add(temp.val);
			temp = temp.right;
		}
		return result;
    }
}
