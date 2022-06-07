package com.category.linked;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question83
 * @createTime: 2022年06月07日 09:15:52
 * @Description TODO
 */
public class Question83 {
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

    // 与82 的question 不同的是，这里要保证重复元素留下一个

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;

        // 如果相等，则跳过当前next
        if (head.val == next.val) {
            head = deleteDuplicates(next);
        } else {
            head.next= deleteDuplicates(next);
        }


        return head;
    }
}
