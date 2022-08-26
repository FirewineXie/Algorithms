package com.item.structer;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Jz23
 * @createTime 2022年08月25日 10:04:27
 * @Description TODO
 */
public class Jz23 {
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return pHead;
        }

        ListNode fast = pHead;
        ListNode slow = pHead;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        fast = pHead;

        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

}
