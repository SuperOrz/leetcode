package com.leetcode;

import java.util.Stack;

public class No160_Intersection_of_Two_Linked_Lists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode result = null;
        if(headA==null || headB==null) return result;
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        while(headA!=null){
            s1.push(headA);
            headA = headA.next;
        }
        while(headB!=null){
            s2.push(headB);
            headB = headB.next;
        }
        while(!s1.isEmpty() && !s2.isEmpty() && s1.peek()==s2.peek()){
            result = s1.pop();
            s2.pop();
        }
        return result;
    }
}
