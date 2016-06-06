package com.leetcode;

public class No2_Add_Two_Numbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		boolean flag = false;
		ListNode r1 = null;
		if(l1.val + l2.val>=10){
			 r1 = new ListNode(l1.val + l2.val-10);
			flag=true;
		}else{
			 r1 = new ListNode(l1.val + l2.val);
		}
		ListNode head = r1;
		l1 = l1.next;
		l2 = l2.next;
		while (l1 != null || l2 != null || flag) {
			ListNode next = null;
			int value;
			if (l1 == null && l2 == null && flag) {
				value = 1;
			} else if (l1 == null) {
				value = flag ? (l2.val + 1) : l2.val;
				l2 = l2.next;
			} else if (l2 == null) {
				value = flag ? (l1.val + 1) : l1.val;
				l1 = l1.next;
			} else {
				value = flag ? (l1.val + 1 + l2.val) : (l1.val + l2.val);
				l1 = l1.next;
				l2 = l2.next;
			}
			if (value >= 10) {
				value = value - 10;
				flag = true;
			} else {
				flag = false;
			}
			next = new ListNode(value);
			head.next = next;
			head = next;

		}
		return r1;

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
