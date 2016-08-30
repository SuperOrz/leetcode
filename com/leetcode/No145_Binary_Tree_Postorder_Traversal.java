package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No145_Binary_Tree_Postorder_Traversal {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		if(root==null) return result;
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> path = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
        	TreeNode temp = stack.pop();
        	path.push(temp);
        	if(temp.left!=null) stack.push(temp.left);
        	if(temp.right!=null) stack.push(temp.right);
        }
        while(!path.empty()){
        	result.add(path.pop().val);
        }
        return result;
    }
}
