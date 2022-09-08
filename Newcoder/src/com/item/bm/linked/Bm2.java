package com.item.bm.linked;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Bm2
 * @createTime 2022年09月08日 10:33:24
 * @Description TODO
 */
public class Bm2 {

    class ListNode {
        int val;
        ListNode next = null;
    }

    /**
     * @param head ListNode类
     * @param m    int整型
     * @param n    int整型
     * @return ListNode类
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode pre = dummyNode;

        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
        }

        ListNode rightNode = pre;
        for (int i = 0; i < n - m + 1; i++) {
            rightNode = rightNode.next;
        }

        // 截取一个子链表
        ListNode leftNode = pre.next;
        ListNode cur = rightNode.next;

        // 切断链接
        pre.next = null;
        rightNode.next = null;

        reverseLinkedList(leftNode);

        pre.next = rightNode;
        leftNode.next = cur;

        return dummyNode.next;
    }


    private void reverseLinkedList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {

            ListNode Cur_new = cur.next;
            cur.next = pre;
            pre = cur;
            cur = Cur_new;
        }
    }
}
