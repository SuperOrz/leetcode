package com.leetcode;

public class No106_Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		int len = postorder.length;
		if(len==0) return null;
		return help(postorder, 0, len-1, inorder, 0, len-1);
	}
	private TreeNode help(int[] postorder,int pl,int pr,int[] inorder,int il,int ir){
		if(pl>pr) return null;
		TreeNode root = new TreeNode(postorder[pr]);
		if(pl<pr){
			int temp = postorder[pr];
			int length = 0;
			for(int i=il;i<=ir;i++){
				if(temp!=inorder[i]) length++;
				else break;
			}
			root.left = help(postorder, pl, pl+length-1, inorder, il, il+length-1);
			root.right = help(postorder, pl+length, pr-1, inorder, il+length+1, ir);
		}
		return root;
	}
}
