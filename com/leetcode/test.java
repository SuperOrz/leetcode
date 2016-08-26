package com.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class test {
	
	public static void main(String[] args) {
		No124_Binary_Tree_Maximum_Path_Sum no = new No124_Binary_Tree_Maximum_Path_Sum();
		TreeNode n0 = new TreeNode(-1);
		TreeNode n1 = new TreeNode(0);
		TreeNode n2 = new TreeNode(1);
		n0.left=n1;
		n0.right=n2;
		System.out.println(no.maxPathSum(n0));
	}
	
}
