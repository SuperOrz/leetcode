package com.leetcode;

public class No203_Remove_Linked_List_Elements {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	 public ListNode removeElements(ListNode head, int val) {
			if(head==null) return null;
			if(head.val == val) return removeElements(head.next, val);
			if(head.next!=null){
				if(head.next.val!=val)
					head.next = removeElements(head.next, val);
				else{
					if(head.next.next!=null){
						head.next = removeElements(head.next.next, val);
					}else{
						head.next = null;
					}
				}
				return head;
			}
			else
				return head;
		}
}
