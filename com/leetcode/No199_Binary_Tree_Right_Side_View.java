package com.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class No199_Binary_Tree_Right_Side_View {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		Queue<TreeNode> q = new ArrayDeque<>();
		if(root==null) return result;
		TreeNode last = root;
		TreeNode nlast = root;
		q.add(root);
		while(!q.isEmpty()){
			TreeNode thisOne = q.poll();
			if(thisOne==last){
				result.add(thisOne.val);
				if(thisOne.left!=null){
					nlast = thisOne.left;
					q.add(thisOne.left);
				}
				if(thisOne.right!=null){
					nlast = thisOne.right;
					q.add(thisOne.right);
				}
				last = nlast;
			}else{
				if(thisOne.left!=null){
					nlast = thisOne.left;
					q.add(thisOne.left);
				}
				if(thisOne.right!=null){
					nlast = thisOne.right;
					q.add(thisOne.right);
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		No199_Binary_Tree_Right_Side_View cl = new No199_Binary_Tree_Right_Side_View();
		TreeNode root = cl.new TreeNode(1);
		TreeNode node1 = cl.new TreeNode(2);
		TreeNode node2 = cl.new TreeNode(3);
		root.left = node1;
		root.right = node2;
		cl.rightSideView(root);
	}
}
