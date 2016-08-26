package com.leetcode;

public class No105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(preorder.length==0) return null;
		return help(preorder, 0, preorder.length-1, inorder, 0, preorder.length-1);
	}
	private TreeNode help(int[] preorder,int pl,int pr,int[] inorder,int il,int ir){
		if(pl>pr) return null;
		TreeNode root = new TreeNode(preorder[pl]);
		if(pl<pr){
			int temp = preorder[pl];
			int length = 0;
			for(int i=il;i<=ir;i++){
				if(temp!=inorder[i]) length++;
				else break;
			}
			root.left = help(preorder, pl+1, pl+length, inorder, il, il+length-1);
			root.right = help(preorder, pl+length+1, pr, inorder, il+length+1, ir);
		}
		return root;
	}
}
