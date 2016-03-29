package com.leetcode;

public class No141_Linked_List_Cycle {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public boolean hasCycle(ListNode head) {
        ListNode n1 = head;
        ListNode n2 = head;
        boolean flag = false;
        while(n2!=null){
        	n1 = n1.next;
        	n2 = n2.next;
        	if(n2!=null) n2=n2.next;
        	else break;
        	if(n1 == n2){
        		flag = true;
        		break;
        	}
        }
        return flag;
    }
}
