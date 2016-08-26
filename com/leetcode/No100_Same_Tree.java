package com.leetcode;

public class No100_Same_Tree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p!=null && q!=null){
			if(p.val==q.val){
				return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
			}else{
				return false;
			}
		}else if(p==null&&q==null){
			return true;
		}else{
			return false;
		}
    }
}
