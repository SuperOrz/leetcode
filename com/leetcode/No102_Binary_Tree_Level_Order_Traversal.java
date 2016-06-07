package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class No102_Binary_Tree_Level_Order_Traversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        TreeNode last = root;
        TreeNode nlast = last;
        List<TreeNode> queue = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode curr = queue.get(0);
            queue.remove(0);
            if(curr.left!=null){
                queue.add(curr.left);
                nlast = curr.left;
            }
            if(curr.right!=null){
                queue.add(curr.right);
                nlast = curr.right;
            }
            if(curr==last){
                last = nlast;
                temp.add(curr.val);
                result.add(temp);
                temp = new ArrayList<>();
            }else{
                temp.add(curr.val);
            }
        }
        if(!temp.isEmpty()){
            result.add(temp);
        }
        return result;
        
    }
}
