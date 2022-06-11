package com.category.linked;

import java.util.List;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question148
 * @createTime 2022年06月11日 10:29:53
 * @Description TODO
 */
public class Question148 {

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

    public ListNode sortList(ListNode head) {

        if ( head == null || head.next == null ) {
            return head;
        }
        int length = 0;
        ListNode pre = head;
        while (pre != null) {
            length++;
            pre = pre.next;
        }
        int middle = (int) Math.floor(length / 2);
        ListNode left = head;
        ListNode right = new ListNode();
        for (int i = 1; i < middle; i++) {
            left = left.next;
        }
        right = left.next;
        left.next = null;
        ListNode merge = merge(sortList(head), sortList(right));
        return merge;
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode result = new ListNode();
        ListNode resultN = result;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                resultN.next = left;
                left = left.next;
            } else {
                resultN.next = right;
                right = right.next;
            }
            resultN = resultN.next;
        }
        if (left != null) {
            resultN.next = left;
        }
        if (right != null) {
            resultN.next = right;
        }
        return result.next;
    }


}
