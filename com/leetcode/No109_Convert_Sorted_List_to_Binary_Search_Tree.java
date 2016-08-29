package com.leetcode;

public class No109_Convert_Sorted_List_to_Binary_Search_Tree {
	 public TreeNode sortedListToBST(ListNode head) {
	        if (head == null) return null;
	        //快慢指针模拟数组二分法
	        ListNode pre = null, i1 = head, i2 = head;
	        for (; i2 != null && i2.next != null; pre = i1, i1 = i1.next, i2 = i2.next.next);
	        
	        TreeNode r = new TreeNode(i1.val);
	        if (pre != null) {
	            pre.next = null;
	            r.left = sortedListToBST(head);
	        }
	        r.right = sortedListToBST(i1.next);
	        return r;
	    }
}
