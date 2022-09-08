package com.item.bm.linked;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Bm3
 * @createTime 2022年09月08日 11:20:01
 * @Description TODO
 */
public class Bm3 {
    class ListNode {
        int val;
        ListNode next = null;


        public ListNode(int i) {
            val = i;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k < 2) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, cur = head, temp;
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        for (int i = 0; i < len / k; i++) {
            for (int j = 1; j < k; j++) {
                temp = cur.next;
                cur.next = temp.next;
                temp.next = pre.next;
                pre.next = temp;
            }
            pre = cur;
            cur = cur.next;
        }
        return dummy.next;

    }

    private void reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;

            cur = tmp;
        }
    }
}


