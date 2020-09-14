package com.structure.第4章_链表和递归;

class Solution5 {

    public ListNode removeElements(ListNode head, int val) {

        if(head == null) {
            return head;
        }

        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }


}