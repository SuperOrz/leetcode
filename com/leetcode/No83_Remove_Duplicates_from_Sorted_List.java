package com.leetcode;

public class No83_Remove_Duplicates_from_Sorted_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode curr = head;
        while(curr!=null){
            if(curr.next!=null){
                if(curr.val==curr.next.val){
                    curr.next = curr.next.next;
                }else{
                    curr = curr.next;
                }
            }else{
                curr = curr.next;
            }
        }
        return head;
    }
}
