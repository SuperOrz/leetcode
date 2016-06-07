package com.leetcode;

public class No21_Merge_Two_Sorted_Lists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head,curr;
        if(l1.val>l2.val){
            head = curr = l2;
            l2 = l2.next;
        }else{
            head = curr = l1;
            l1 = l1.next;
        }
        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                curr.next = l2;
                l2 = l2.next;
            }else{
                curr.next = l1;
                l1 = l1.next;
            }
            curr=curr.next;
        }
        if(l1!=null){
            curr.next = l1;
        }else{
            curr.next = l2;
        }
        return head;
    }
}
