package com.category.linked;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question206
 * @createTime 2022年06月09日 21:19:00
 * @Description TODO
 */
public class Question206 {

    public class ListNode {
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

    //     递归
    public ListNode reverseListDfs(ListNode head) {

        if (head.next == null) {
            return head;
        }

        ListNode listNode = reverseListDfs(head.next);
        head.next.next = head.next;
        head.next = null;
        return listNode;
    }


    //     非递归
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}
