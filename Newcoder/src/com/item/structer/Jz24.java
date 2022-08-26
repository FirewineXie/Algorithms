package com.item.structer;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Jz24
 * @createTime 2022年08月24日 14:41:46
 * @Description TODO
 */
public class Jz24 {

    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pNext = head.next;
        head.next = null;

        ListNode reverseHead = ReverseList(pNext);
        pNext.next = head;
        return reverseHead;

    }

    public ListNode ReverseList2(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode tmp;
        ListNode result = null;
        while (head != null) {
            tmp = head.next;
            // 置空
            head.next = result;

            result = head;
            head = tmp;
        }
        return result;
    }

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
