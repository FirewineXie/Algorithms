package com.item.bm.linked;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Bm1
 * @createTime 2022年09月08日 10:16:55
 * @Description TODO
 */
public class Bm1 {

    public ListNode ReverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode pNext = head.next;

        head.next = null;

        ListNode reversHead = ReverseList(pNext.next);
        pNext.next = head;

        return reversHead;

    }


    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
