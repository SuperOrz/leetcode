package com.leetcode;

public class No19_Remove_Nth_Node_From_End_of_List {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode fast = head;
		ListNode slow = head;
		for(int i=1;i<=n;i++){
			fast = fast.next;
			if(fast==null) return head.next;
		}
		while(fast.next!=null){
			fast=fast.next;
			slow=slow.next;
		}
		slow.next = slow.next.next;
		return head;
    }
}
