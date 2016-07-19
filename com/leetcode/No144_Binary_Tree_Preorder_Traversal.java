package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No144_Binary_Tree_Preorder_Traversal {
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp!=null){
        	while(temp!=null){
        		result.add(temp.val);
        		if(temp.right!=null) stack.push(temp.right);
        		if(temp.left!=null) stack.push(temp.left);
        		temp = null;
        	}
        	if(!stack.empty())
        		temp = stack.pop();
        }
        return result;
    }
}
