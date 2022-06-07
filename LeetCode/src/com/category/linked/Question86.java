package com.category.linked;

import java.util.List;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question86
 * @createTime 2022年06月07日 19:17:53
 * @Description 如果出现复制 case ，应该考虑虚拟头结点，来解决问题。
 */
public class Question86 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode partition(ListNode head, int x) {

        if (head == null || head.next == null) {
            return head;
        }


        ListNode small = new ListNode();
        ListNode smallN = small;
        ListNode large = new ListNode();
        ListNode largeN = large;


        while (head != null) {

            if (head.val < x) {
                smallN.next = head;
                smallN = smallN.next;
            } else {
                largeN.next = head;
                largeN = largeN.next;
            }
            head = head.next;
        }
        largeN.next = null;
        smallN.next = large.next;
        return small.next;
    }


}
