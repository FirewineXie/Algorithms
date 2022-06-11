package com.category.linked;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question143
 * @createTime 2022年06月11日 11:25:43
 * @Description TODO
 */
public class Question143 {

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

    // 链表中间切分，第二部分反转，，，然后依次组起来

    public void reorderList(ListNode head) {


        if (head.next == null) {
            return;
        }

        ListNode next = head;

        int length = 0;

        while (next != null) {
            length++;
            next = next.next;
        }
        int middle = (int) Math.floor(length / 2);
        ListNode right = new ListNode();
        ListNode left = head;
        for (int i = 1; i < middle; i++) {
            left = left.next;
        }
        right = left.next;
        left.next = null;
        left = head;
        ListNode listNode = reverseList(right);
        ListNode result = new ListNode();
        ListNode resultN = result;
        Boolean leftB = true;
        while (left != null && listNode != null) {

            if (leftB) {
                resultN.next = left;
                left = left.next;
                resultN = resultN.next;
                leftB = false;
            } else {
                resultN.next = listNode;
                listNode = listNode.next;
                resultN = resultN.next;
                leftB = true;
            }
        }
        if (left != null){
            resultN.next = left;
        }
        if (listNode != null){
            resultN.next = listNode;
        }
        head = result.next;
    }

    private ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;

        }
        return pre;
    }

}
