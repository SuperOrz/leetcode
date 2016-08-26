package com.leetcode;

class RandomListNode {
	int label;
	RandomListNode next, random;

	RandomListNode(int x) {
		this.label = x;
	}
};
public class No138_Copy_List_with_Random_Pointer {
	public RandomListNode copyRandomList(RandomListNode head) {
		if(head==null) return null;
		RandomListNode curr = head;
		while(curr!=null){
			RandomListNode next = new RandomListNode(curr.label);
			next.next = curr.next;
			curr.next = next;
			curr = next.next;
		}
		curr = head;
		RandomListNode next;
		while(curr!=null){
			next = curr.next;
			next.random = curr.random==null?null:curr.random.next;
			curr = next.next;
		}
		RandomListNode result = head.next;
		RandomListNode temp = result;
		curr = temp.next;
		while(curr!=null){
			head.next = curr;
			curr = curr.next;
			head = head.next;
			temp.next = curr;
			curr = curr.next;
			temp = temp.next;
		}
		head.next = curr;
		return result;
	}
}
