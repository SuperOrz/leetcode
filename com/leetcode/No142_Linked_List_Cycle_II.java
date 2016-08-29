package com.leetcode;
public class No142_Linked_List_Cycle_II {
	public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        do{
            if(fast!=null){
                fast = fast.next;
                if(fast!=null)
                    fast = fast.next;
                else 
                    return null;
            }
            else
                return null;
            slow = slow.next;
        }while(fast!=slow);
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
        }
}
