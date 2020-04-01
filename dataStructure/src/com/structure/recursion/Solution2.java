package com.structure.recursion;


class Solution2 {

    public ListNode removeElements(ListNode head, int val) {

        while(head != null && head.val == val) {
            head = head.next;
        }

        if(head == null) {
            return head;
        }

        ListNode prev = head;
        while(prev.next != null){
            if(prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }

        return head;
    }


}class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}